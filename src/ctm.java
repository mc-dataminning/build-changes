public class ctm extends cpn implements csb, csr {
   public static final dcz<hc> a = dcr.T;

   protected ctm(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.k));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dcb a(cih $$0) {
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
   public czn a(gu $$0, dcb $$1) {
      return new dam($$0, $$1);
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      czn $$6 = $$1.c_($$2);
      if ($$6 instanceof dam && $$3.gk()) {
         $$3.a((dam)$$6);
         return bdx.a($$1.B);
      } else {
         return bdx.d;
      }
   }

   public static boolean a(dvt.c $$0, dvt.c $$1) {
      ha $$2 = h($$0.b());
      ha $$3 = h($$1.b());
      ha $$4 = n($$0.b());
      ha $$5 = n($$1.b());
      dam.a $$6 = dam.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dam.a.b : dam.a.a);
      boolean $$7 = $$6 == dam.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ha h(dcb $$0) {
      return $$0.c(a).a();
   }

   public static ha n(dcb $$0) {
      return $$0.c(a).b();
   }
}
