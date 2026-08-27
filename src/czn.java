import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class czn extends cwj {
   public static final MapCodec<czn> a = b(czn::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final emf b = cwj.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<czn> a() {
      return a;
   }

   public czn(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.F_()));
   }

   private static int a(aup $$0) {
      return $$0.b(g, h);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return !this.a($$0, $$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cti)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if ($$3.ai().equals(blt.M)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cso $$0, hx $$1) {
      eek $$2 = $$0.b_($$1);
      eek $$3 = $$0.b_($$1.c());
      return $$2.a() == eel.c && $$3.a() == eel.a;
   }

   private void a(amz $$0, hx $$1, aup $$2) {
      this.a((cti)$$0, $$1);
      $$0.a(null, $$1, arm.je, arn.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cti $$0, hx $$1) {
      $$0.b($$1, false);
   }

   private void b(amz $$0, hx $$1, aup $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         bzk $$5 = blt.aX.a((cti)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fJ();
            $$0.b($$5);
         }
      }
   }

   private double b(aup $$0) {
      double $$1 = (double)(bzk.c / 2.0F);
      return aui.a($$0.j(), $$1, 1.0 - $$1);
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
