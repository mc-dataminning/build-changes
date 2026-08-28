import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class eqe extends eqm {
   private static final Logger d = LogUtils.getLogger();
   protected final erq a;
   protected iu b;
   private final int h;
   protected final dsm c;
   private final List<erl> i = Lists.newArrayList();
   private final eul j;
   private final etu k;

   public eqe(eul $$0, erq $$1, iu $$2, int $$3, dsm $$4, eqa $$5, etu $$6) {
      super(eqz.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
      this.k = $$6;
   }

   public eqe(eqy $$0, tx $$1) {
      super(eqz.ad, $$1);
      this.j = $$0.c();
      this.b = new iu($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<uu> $$2 = $$0.b().a(ul.a);
      this.a = (erq)erq.f.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = dsm.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      ud $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(erl.a(new Dynamic($$2, $$1x))));
      this.k = etu.c.parse(ul.a, $$1.c("liquid_settings")).result().orElse(esj.e);
   }

   @Override
   protected void a(eqy $$0, tx $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<uu> $$2 = $$0.b().a(ul.a);
      erq.f.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      ud $$3 = new ud();

      for (erl $$4 : this.i) {
         $$3.add((uu)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
      if (this.k != esj.e) {
         $$1.a("liquid_settings", (uu)etu.c.encodeStart(ul.a, this.k).getOrThrow());
      }
   }

   @Override
   public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, dhw $$5, iu $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, iu $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.k, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dsm a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public erq b() {
      return this.a;
   }

   public iu c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(erl $$0) {
      this.i.add($$0);
   }

   public List<erl> e() {
      return this.i;
   }
}
