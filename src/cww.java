public class cww extends csx implements cvl, cwb {
   public static final dgj<he> a = dgb.T;

   protected cww(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, he.k));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dfl a(clp $$0) {
      hc $$1 = $$0.k();
      hc $$2;
      if ($$1.o() == hc.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = hc.b;
      }

      return this.n().a(a, he.a($$1, $$2));
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddw($$0, $$1);
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      dcx $$6 = $$1.c_($$2);
      if ($$6 instanceof ddw && $$3.go()) {
         $$3.a((ddw)$$6);
         return bha.a($$1.B);
      } else {
         return bha.d;
      }
   }

   public static boolean a(dzd.c $$0, dzd.c $$1) {
      hc $$2 = h($$0.b());
      hc $$3 = h($$1.b());
      hc $$4 = n($$0.b());
      hc $$5 = n($$1.b());
      ddw.a $$6 = ddw.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? ddw.a.b : ddw.a.a);
      boolean $$7 = $$6 == ddw.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static hc h(dfl $$0) {
      return $$0.c(a).a();
   }

   public static hc n(dfl $$0) {
      return $$0.c(a).b();
   }
}
