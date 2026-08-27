public class cwj extends csk implements cuy, cvo {
   public static final dfw<hd> a = dfo.T;

   protected cwj(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hd.k));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a(a, $$1.a().a($$0.c(a)));
   }

   @Override
   public dey a(cle $$0) {
      hb $$1 = $$0.k();
      hb $$2;
      if ($$1.o() == hb.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = hb.b;
      }

      return this.n().a(a, hd.a($$1, $$2));
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddj($$0, $$1);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      dck $$6 = $$1.c_($$2);
      if ($$6 instanceof ddj && $$3.gn()) {
         $$3.a((ddj)$$6);
         return bgo.a($$1.B);
      } else {
         return bgo.d;
      }
   }

   public static boolean a(dyq.c $$0, dyq.c $$1) {
      hb $$2 = h($$0.b());
      hb $$3 = h($$1.b());
      hb $$4 = n($$0.b());
      hb $$5 = n($$1.b());
      ddj.a $$6 = ddj.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? ddj.a.b : ddj.a.a);
      boolean $$7 = $$6 == ddj.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static hb h(dey $$0) {
      return $$0.c(a).a();
   }

   public static hb n(dey $$0) {
      return $$0.c(a).b();
   }
}
