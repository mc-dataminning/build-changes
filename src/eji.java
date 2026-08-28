import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;

public class eji extends ejq {
   private static final Logger d = LogUtils.getLogger();
   protected final eku a;
   protected jd b;
   private final int h;
   protected final dmk c;
   private final List<ekp> i = Lists.newArrayList();
   private final eno j;

   public eji(eno $$0, eku $$1, jd $$2, int $$3, dmk $$4, eje $$5) {
      super(ekd.ad, 0, $$5);
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.h = $$3;
      this.c = $$4;
   }

   public eji(ekc $$0, ua $$1) {
      super(ekd.ad, $$1);
      this.j = $$0.c();
      this.b = new jd($$1.h("PosX"), $$1.h("PosY"), $$1.h("PosZ"));
      this.h = $$1.h("ground_level_delta");
      DynamicOps<ux> $$2 = $$0.b().a(uo.a);
      this.a = (eku)eku.e.parse($$2, $$1.p("pool_element")).getPartialOrThrow($$0x -> new IllegalStateException("Invalid pool element found: " + $$0x));
      this.c = dmk.valueOf($$1.l("rotation"));
      this.f = this.a.a(this.j, this.b, this.c);
      ug $$3 = $$1.c("junctions", 10);
      this.i.clear();
      $$3.forEach($$1x -> this.i.add(ekp.a(new Dynamic($$2, $$1x))));
   }

   @Override
   protected void a(ekc $$0, ua $$1) {
      $$1.a("PosX", this.b.u());
      $$1.a("PosY", this.b.v());
      $$1.a("PosZ", this.b.w());
      $$1.a("ground_level_delta", this.h);
      DynamicOps<ux> $$2 = $$0.b().a(uo.a);
      eku.e.encodeStart($$2, this.a).resultOrPartial(d::error).ifPresent($$1x -> $$1.a("pool_element", $$1x));
      $$1.a("rotation", this.c.name());
      ug $$3 = new ug();

      for (ekp $$4 : this.i) {
         $$3.add((ux)$$4.a($$2).getValue());
      }

      $$1.a("junctions", $$3);
   }

   @Override
   public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
   }

   public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, jd $$5, boolean $$6) {
      this.a.a(this.j, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, $$6);
   }

   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.b = this.b.b($$0, $$1, $$2);
   }

   @Override
   public dmk a() {
      return this.c;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
   }

   public eku b() {
      return this.a;
   }

   public jd c() {
      return this.b;
   }

   public int d() {
      return this.h;
   }

   public void a(ekp $$0) {
      this.i.add($$0);
   }

   public List<ekp> e() {
      return this.i;
   }
}
