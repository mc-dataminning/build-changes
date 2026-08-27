import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dfl extends dch {
   public static final MapCodec<dfl> a = b(dfl::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final etc b = dch.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   public dfl(dph.d $$0) {
      super($$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(axt $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return !this.a($$0, $$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((czg)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if ($$3.ai().equals(bqg.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cym $$0, id $$1) {
      elb $$2 = $$0.b_($$1);
      elb $$3 = $$0.b_($$1.c());
      return $$2.a() == elc.c && $$3.a() == elc.a;
   }

   private void a(apu $$0, id $$1, axt $$2) {
      this.a((czg)$$0, $$1);
      $$0.a(null, $$1, auo.jD, aup.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(czg $$0, id $$1) {
      $$0.b($$1, false);
   }

   private void b(apu $$0, id $$1, axt $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cef $$5 = bqg.aZ.a((czg)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fS();
            $$0.b($$5);
         }
      }
   }

   private double b(axt $$0) {
      double $$1 = (double)(cef.c / 2.0F);
      return axm.a($$0.j(), $$1, 1.0 - $$1);
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
