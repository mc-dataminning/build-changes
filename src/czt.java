import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class czt extends cwp {
   public static final MapCodec<czt> a = b(czt::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final eml b = cwp.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<czt> a() {
      return a;
   }

   public czt(djf.d $$0) {
      super($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.F_()));
   }

   private static int a(auu $$0) {
      return $$0.b(g, h);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return !this.a($$0, $$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cto)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if ($$3.ai().equals(bly.M)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(csu $$0, hx $$1) {
      eeq $$2 = $$0.b_($$1);
      eeq $$3 = $$0.b_($$1.c());
      return $$2.a() == eer.c && $$3.a() == eer.a;
   }

   private void a(and $$0, hx $$1, auu $$2) {
      this.a((cto)$$0, $$1);
      $$0.a(null, $$1, arr.je, ars.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cto $$0, hx $$1) {
      $$0.b($$1, false);
   }

   private void b(and $$0, hx $$1, auu $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         bzp $$5 = bly.aX.a((cto)$$0);
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

   private double b(auu $$0) {
      double $$1 = (double)(bzp.c / 2.0F);
      return aun.a($$0.j(), $$1, 1.0 - $$1);
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
