import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class eis extends eja {
   private static final Logger d = LogUtils.getLogger();
   protected final ekd a;
   protected ja b;
   private final int h;
   protected final dlu c;
   private final List<ejy> i = Lists.newArrayList();
   private final emx j;

   public eis(emx $$0, ekd $$1, ja $$2, int $$3, dlu $$4, eio $$5) {
      super(ejn.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public eis(ejm $$0, tx $$1) {
      super(ejn.ad, $$1);
      this.j = $$0.c();
      this.b = new ja($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<uu> $$2 = $$0.b().a(ul.a);
      this.a = (ekd)ekd.e.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = dlu.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      ud $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(ejy.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(ejm $$0, tx $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<uu> $$2 = $$0.b().a(ul.a);
      ekd.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      ud $$3 = new ud();

      for (ejy $$4 : this.i) {
         $$3.add((uu)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, dbm $$5, ja $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, ja $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dlu a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public ekd b() {
      return this.a;
   }

   public ja c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(ejy $$0) {
      this.i.add($$0);
   }

   public List<ejy> e() {
      return this.i;
   }
}
