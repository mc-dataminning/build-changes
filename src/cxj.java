public class cxj extends czf implements czy {
   public static final dgc b = dgb.C;
   public static final dgc c = dgb.w;
   private static final int j = 8;
   public static final int d = 128;
   private static final int k = 200;

   public cxj(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.b).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dfl a(clp $$0) {
      eao $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eap.c;
      return this.n().a(a, $$0.k()).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(b) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dfl $$0, cpx $$1, gw $$2) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dfl $$0, cpx $$1, gw $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$1.Y() && (long)$$1.z.a(200) <= $$1.V() % 200L && $$2.v() == $$1.a(dku.a.b, $$2.u(), $$2.w()) - 1) {
         asb.a($$0.c(a).o(), $$1, $$2, 0.125, ix.aN, bgl.a(1, 2));
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c) && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(cpx $$0, dfl $$1, ehl $$2, cco $$3) {
      if ($$0.Y() && $$3 instanceof cda && ((cda)$$3).I()) {
         gw $$4 = $$2.a();
         if ($$0.g($$4)) {
            bjh $$5 = biw.ai.a($$0);
            if ($$5 != null) {
               $$5.d(ehp.c($$4.c()));
               bis $$6 = $$3.v();
               $$5.b($$6 instanceof akt ? (akt)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, apf.xU, apg.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, c, b);
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }
}
