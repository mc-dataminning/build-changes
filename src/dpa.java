import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dpa extends dlu {
   public static final MapCodec<dpa> a = b(dpa::new);
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   private static final feq f = dlu.b(16.0, 0.0, 1.5);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   public dpa(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return f;
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.C_()));
   }

   private static int a(azt $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return !this.a($$0, $$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dip)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if ($$3.aq().equals(bwj.X)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dhv $$0, iu $$1) {
      evv $$2 = $$0.b_($$1);
      evv $$3 = $$0.b_($$1.d());
      return $$2.a() == evw.c && $$3.a() == evw.a;
   }

   private void a(aro $$0, iu $$1, azt $$2) {
      this.a((dip)$$0, $$1);
      $$0.a(null, $$1, awl.ki, awm.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dip $$0, iu $$1) {
      $$0.b($$1, false);
   }

   private void b(aro $$0, iu $$1, azt $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         ckq $$5 = bwj.bu.a($$0, bwi.e);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fY();
            $$0.b($$5);
         }
      }
   }

   private double b(azt $$0) {
      double $$1 = 0.2F;
      return azk.a($$0.j(), 0.2F, 0.7999999970197678);
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
