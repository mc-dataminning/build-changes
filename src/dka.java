import com.mojang.serialization.MapCodec;

public class dka extends dfy implements diq, djg {
   public static final MapCodec<dka> a = b(dka::new);
   public static final dua<jk> b = dts.T;

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   protected dka(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jk.k));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dtc a(cyd $$0) {
      ji $$1 = $$0.k();
      ji $$2;
      if ($$1.o() == ji.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ji.b;
      }

      return this.o().a(b, jk.a($$1, $$2));
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dri($$0, $$1);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      dqh $$5 = $$1.c_($$2);
      if ($$5 instanceof dri && $$3.gw()) {
         $$3.a((dri)$$5);
         return bqr.a($$1.B);
      } else {
         return bqr.e;
      }
   }

   public static boolean a(enr.c $$0, enr.c $$1) {
      ji $$2 = m($$0.b());
      ji $$3 = m($$1.b());
      ji $$4 = n($$0.b());
      ji $$5 = n($$1.b());
      dri.a $$6 = dri.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dri.a.b : dri.a.a);
      boolean $$7 = $$6 == dri.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ji m(dtc $$0) {
      return $$0.c(b).a();
   }

   public static ji n(dtc $$0) {
      return $$0.c(b).b();
   }
}
