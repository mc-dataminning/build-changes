import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dmp extends djk {
   public static final MapCodec<dmp> a = b(dmp::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final fbs b = djk.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.H_()));
   }

   private static int a(azg $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return !this.a($$0, $$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dgg)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if ($$3.aq().equals(buq.X)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dfl $$0, ji $$1) {
      esx $$2 = $$0.b_($$1);
      esx $$3 = $$0.b_($$1.d());
      return $$2.a() == esy.c && $$3.a() == esy.a;
   }

   private void a(arc $$0, ji $$1, azg $$2) {
      this.a((dgg)$$0, $$1);
      $$0.a(null, $$1, avz.ki, awa.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dgg $$0, ji $$1) {
      $$0.b($$1, false);
   }

   private void b(arc $$0, ji $$1, azg $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cit $$5 = buq.bt.a($$0, bup.e);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.aj();
            $$0.b($$5);
         }
      }
   }

   private double b(azg $$0) {
      double $$1 = 0.2F;
      return ayy.a($$0.j(), 0.2F, 0.7999999970197678);
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
