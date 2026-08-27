public class cwu extends csv implements cvj, cvz {
   public static final dgh<hc> a = dfz.T;

   protected cwu(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.k));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dfj a(cln $$0) {
      ha $$1 = $$0.k();
      ha $$2;
      if ($$1.o() == ha.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ha.b;
      }

      return this.n().a(a, hc.a($$1, $$2));
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddu($$0, $$1);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      dcv $$6 = $$1.c_($$2);
      if ($$6 instanceof ddu && $$3.go()) {
         $$3.a((ddu)$$6);
         return bgy.a($$1.B);
      } else {
         return bgy.d;
      }
   }

   public static boolean a(dzb.c $$0, dzb.c $$1) {
      ha $$2 = h($$0.b());
      ha $$3 = h($$1.b());
      ha $$4 = n($$0.b());
      ha $$5 = n($$1.b());
      ddu.a $$6 = ddu.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? ddu.a.b : ddu.a.a);
      boolean $$7 = $$6 == ddu.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ha h(dfj $$0) {
      return $$0.c(a).a();
   }

   public static ha n(dfj $$0) {
      return $$0.c(a).b();
   }
}
