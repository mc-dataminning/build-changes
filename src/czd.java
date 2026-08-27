import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class czd extends cvz {
   public static final MapCodec<czd> a = b(czd::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final elu b = cvz.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<czd> a() {
      return a;
   }

   public czd(dio.d $$0) {
      super($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.F_()));
   }

   private static int a(auf $$0) {
      return $$0.b(g, h);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return !this.a($$0, $$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((csy)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if ($$3.ai().equals(blj.M)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cse $$0, hv $$1) {
      edz $$2 = $$0.b_($$1);
      edz $$3 = $$0.b_($$1.c());
      return $$2.a() == eea.c && $$3.a() == eea.a;
   }

   private void a(amp $$0, hv $$1, auf $$2) {
      this.a((csy)$$0, $$1);
      $$0.a(null, $$1, arc.je, ard.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(csy $$0, hv $$1) {
      $$0.b($$1, false);
   }

   private void b(amp $$0, hv $$1, auf $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         bza $$5 = blj.aX.a((csy)$$0);
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

   private double b(auf $$0) {
      double $$1 = (double)(bza.c / 2.0F);
      return aty.a($$0.j(), $$1, 1.0 - $$1);
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
