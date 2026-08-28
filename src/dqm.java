import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dqm extends dne {
   public static final MapCodec<dqm> a = b(dqm::new);
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   private static final fgm f = dne.b(16.0, 0.0, 1.5);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dqm> a() {
      return a;
   }

   public dqm(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return f;
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.G_()));
   }

   private static int a(azz $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return !this.a($$0, $$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((djz)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if ($$3.an().equals(bxe.Y)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(djd $$0, iw $$1) {
      exq $$2 = $$0.b_($$1);
      exq $$3 = $$0.b_($$1.d());
      return $$2.a() == exr.c && $$3.a() == exr.a;
   }

   private void a(aru $$0, iw $$1, azz $$2) {
      this.a((djz)$$0, $$1);
      $$0.a(null, $$1, awr.km, aws.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(djz $$0, iw $$1) {
      $$0.b($$1, false);
   }

   private void b(aru $$0, iw $$1, azz $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         clo $$5 = bxe.bv.a($$0, bxd.e);
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

   private double b(azz $$0) {
      double $$1 = 0.2F;
      return azq.a($$0.j(), 0.2F, 0.7999999970197678);
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
