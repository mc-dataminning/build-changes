import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dqw extends dno {
   public static final MapCodec<dqw> a = b(dqw::new);
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   private static final fgw f = dno.b(16.0, 0.0, 1.5);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dqw> a() {
      return a;
   }

   public dqw(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return f;
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.G_()));
   }

   private static int a(bai $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return !this.a($$0, $$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dkj)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if ($$3.an().equals(bxn.Y)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(djn $$0, iw $$1) {
      eya $$2 = $$0.b_($$1);
      eya $$3 = $$0.b_($$1.d());
      return $$2.a() == eyb.c && $$3.a() == eyb.a;
   }

   private void a(asb $$0, iw $$1, bai $$2) {
      this.a((dkj)$$0, $$1);
      $$0.a(null, $$1, awy.km, awz.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dkj $$0, iw $$1) {
      $$0.b($$1, false);
   }

   private void b(asb $$0, iw $$1, bai $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         clx $$5 = bxn.bv.a($$0, bxm.e);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.gc();
            $$0.b($$5);
         }
      }
   }

   private double b(bai $$0) {
      double $$1 = 0.2F;
      return azz.a($$0.j(), 0.2F, 0.7999999970197678);
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
