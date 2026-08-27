public class daf extends csx {
   public static final int a = 2;
   public static final dgl b = dgb.aE;
   private static final int c = 24000;
   private static final int d = 12000;
   private static final int e = 300;
   private static final eii f = csx.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   public daf(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return f;
   }

   public int h(dfl $$0) {
      return $$0.c(b);
   }

   private boolean n(dfl $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, apf.wL, apg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(b, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, apf.wM, apg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         bxf $$4 = biw.aN.a((cpx)$$1);
         if ($$4 != null) {
            ehp $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ary.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.w_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(djv.i, $$2, djv.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   public static boolean a(cpd $$0, gw $$1) {
      return $$0.a_($$1.d()).a(apu.ck);
   }
}
