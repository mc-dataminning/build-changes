public class cwp extends csq implements cve, cvu {
   public static final dgc<he> a = dfu.T;

   protected cwp(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, he.k));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dfe a(cli $$0) {
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
   public dcq a(gw $$0, dfe $$1) {
      return new ddp($$0, $$1);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      dcq $$6 = $$1.c_($$2);
      if ($$6 instanceof ddp && $$3.gn()) {
         $$3.a((ddp)$$6);
         return bgt.a($$1.B);
      } else {
         return bgt.d;
      }
   }

   public static boolean a(dyw.c $$0, dyw.c $$1) {
      hc $$2 = h($$0.b());
      hc $$3 = h($$1.b());
      hc $$4 = n($$0.b());
      hc $$5 = n($$1.b());
      ddp.a $$6 = ddp.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? ddp.a.b : ddp.a.a);
      boolean $$7 = $$6 == ddp.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static hc h(dfe $$0) {
      return $$0.c(a).a();
   }

   public static hc n(dfe $$0) {
      return $$0.c(a).b();
   }
}
