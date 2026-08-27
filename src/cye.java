import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class cye extends cva {
   public static final MapCodec<cye> a = b(cye::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final ekn b = cva.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<cye> a() {
      return a;
   }

   public cye(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(ats $$0) {
      return $$0.b(g, h);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return !this.a($$0, $$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((csa)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if ($$3.ai().equals(bku.L)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(crg $$0, ht $$1) {
      ecs $$2 = $$0.b_($$1);
      ecs $$3 = $$0.b_($$1.c());
      return $$2.a() == ect.c && $$3.a() == ect.a;
   }

   private void a(ame $$0, ht $$1, ats $$2) {
      this.a((csa)$$0, $$1);
      $$0.a(null, $$1, aqr.iV, aqs.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(csa $$0, ht $$1) {
      $$0.b($$1, false);
   }

   private void b(ame $$0, ht $$1, ats $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         byj $$5 = bku.aW.a((csa)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fK();
            $$0.b($$5);
         }
      }
   }

   private double b(ats $$0) {
      double $$1 = (double)(byj.c / 2.0F);
      return atm.a($$0.j(), $$1, 1.0 - $$1);
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
