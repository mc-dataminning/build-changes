import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dbw extends cys {
   public static final MapCodec<dbw> a = b(dbw::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final eos b = cys.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   public dbw(dli.d $$0) {
      super($$0);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.F_()));
   }

   private static int a(awp $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return !this.a($$0, $$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cvr)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if ($$3.ai().equals(bnw.N)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cux $$0, hz $$1) {
      egw $$2 = $$0.b_($$1);
      egw $$3 = $$0.b_($$1.c());
      return $$2.a() == egx.c && $$3.a() == egx.a;
   }

   private void a(aow $$0, hz $$1, awp $$2) {
      this.a((cvr)$$0, $$1);
      $$0.a(null, $$1, atl.ju, atm.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cvr $$0, hz $$1) {
      $$0.b($$1, false);
   }

   private void b(aow $$0, hz $$1, awp $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cbs $$5 = bnw.aY.a((cvr)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fL();
            $$0.b($$5);
         }
      }
   }

   private double b(awp $$0) {
      double $$1 = (double)(cbs.c / 2.0F);
      return awi.a($$0.j(), $$1, 1.0 - $$1);
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
