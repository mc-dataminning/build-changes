import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dkq extends dhm {
   public static final MapCodec<dkq> a = b(dkq::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final ezq b = dhm.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   public dkq(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.D_()));
   }

   private static int a(azn $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return !this.a($$0, $$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dej)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if ($$3.ao().equals(bty.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(ddo $$0, jf $$1) {
      eqt $$2 = $$0.b_($$1);
      eqt $$3 = $$0.b_($$1.d());
      return $$2.a() == equ.c && $$3.a() == equ.a;
   }

   private void a(arj $$0, jf $$1, azn $$2) {
      this.a((dej)$$0, $$1);
      $$0.a(null, $$1, awg.jJ, awh.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dej $$0, jf $$1) {
      $$0.b($$1, false);
   }

   private void b(arj $$0, jf $$1, azn $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cia $$5 = bty.ba.a($$0, btx.e);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fW();
            $$0.b($$5);
         }
      }
   }

   private double b(azn $$0) {
      double $$1 = 0.2F;
      return azf.a($$0.j(), 0.2F, 0.7999999970197678);
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
