public class cwl extends csm implements cva, cvq {
   public static final dfy<hc> a = dfq.T;

   protected cwl(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.k));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dfa a(clg $$0) {
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
   public dcm a(gu $$0, dfa $$1) {
      return new ddl($$0, $$1);
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      dcm $$6 = $$1.c_($$2);
      if ($$6 instanceof ddl && $$3.gn()) {
         $$3.a((ddl)$$6);
         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   public static boolean a(dys.c $$0, dys.c $$1) {
      ha $$2 = h($$0.b());
      ha $$3 = h($$1.b());
      ha $$4 = n($$0.b());
      ha $$5 = n($$1.b());
      ddl.a $$6 = ddl.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? ddl.a.b : ddl.a.a);
      boolean $$7 = $$6 == ddl.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ha h(dfa $$0) {
      return $$0.c(a).a();
   }

   public static ha n(dfa $$0) {
      return $$0.c(a).b();
   }
}
