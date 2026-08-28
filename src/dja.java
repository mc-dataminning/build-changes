import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dja extends dfw {
   public static final MapCodec<dja> a = b(dja::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final exp b = dfw.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   public dja(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(ayv $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return !this.a($$0, $$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dcu)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if ($$3.am().equals(bsw.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dca $$0, jd $$1) {
      eoy $$2 = $$0.b_($$1);
      eoy $$3 = $$0.b_($$1.c());
      return $$2.a() == eoz.c && $$3.a() == eoz.a;
   }

   private void a(aqt $$0, jd $$1, ayv $$2) {
      this.a((dcu)$$0, $$1);
      $$0.a(null, $$1, avo.jI, avp.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dcu $$0, jd $$1) {
      $$0.b($$1, false);
   }

   private void b(aqt $$0, jd $$1, ayv $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cgz $$5 = bsw.ba.a((dcu)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fP();
            $$0.b($$5);
         }
      }
   }

   private double b(ayv $$0) {
      double $$1 = 0.2F;
      return ayn.a($$0.j(), 0.2F, 0.7999999970197678);
   }

   @VisibleForTesting
   public static void a(int $$0, int $$1) {
      g = $$0;
      h = $$1;
   }

   @VisibleForTesting
   public static void b() {
      g = 3600;
      h = 12000;
   }
}
