public class cwk extends csl implements cuz, cvp {
   public static final dfx<hc> a = dfp.T;

   protected cwk(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.k));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dez a(clf $$0) {
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
   public dcl a(gu $$0, dez $$1) {
      return new ddk($$0, $$1);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      dcl $$6 = $$1.c_($$2);
      if ($$6 instanceof ddk && $$3.gn()) {
         $$3.a((ddk)$$6);
         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   public static boolean a(dyr.c $$0, dyr.c $$1) {
      ha $$2 = h($$0.b());
      ha $$3 = h($$1.b());
      ha $$4 = n($$0.b());
      ha $$5 = n($$1.b());
      ddk.a $$6 = ddk.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? ddk.a.b : ddk.a.a);
      boolean $$7 = $$6 == ddk.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ha h(dez $$0) {
      return $$0.c(a).a();
   }

   public static ha n(dez $$0) {
      return $$0.c(a).b();
   }
}
