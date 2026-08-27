public class cxh extends czd implements czw {
   public static final dga b = dfz.C;
   public static final dga c = dfz.w;
   private static final int j = 8;
   public static final int d = 128;
   private static final int k = 200;

   public cxh(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.b).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dfj a(cln $$0) {
      eam $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ean.c;
      return this.n().a(a, $$0.k()).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(b) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dfj $$0, cpb $$1, gw $$2, hc $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dfj $$0, cpb $$1, gw $$2, hc $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dfj $$0, cpv $$1, gw $$2) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dfj $$0, cpv $$1, gw $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if ($$1.Y() && (long)$$1.z.a(200) <= $$1.V() % 200L && $$2.v() == $$1.a(dks.a.b, $$2.u(), $$2.w()) - 1) {
         asa.a($$0.c(a).o(), $$1, $$2, 0.125, ix.aN, bgj.a(1, 2));
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c) && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(cpv $$0, dfj $$1, ehj $$2, ccm $$3) {
      if ($$0.Y() && $$3 instanceof ccy && ((ccy)$$3).I()) {
         gw $$4 = $$2.a();
         if ($$0.g($$4)) {
            bjf $$5 = biu.ai.a($$0);
            if ($$5 != null) {
               $$5.d(ehn.c($$4.c()));
               biq $$6 = $$3.v();
               $$5.b($$6 instanceof aks ? (aks)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, ape.xU, apf.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, c, b);
   }

   @Override
   public boolean f_(dfj $$0) {
      return true;
   }
}
