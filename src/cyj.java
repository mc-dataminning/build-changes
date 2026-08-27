import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class cyj extends cvf {
   public static final MapCodec<cyj> a = b(cyj::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final eks b = cvf.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<cyj> a() {
      return a;
   }

   public cyj(dhm.d $$0) {
      super($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.F_()));
   }

   private static int a(atw $$0) {
      return $$0.b(g, h);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return !this.a($$0, $$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((csf)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if ($$3.ai().equals(bkz.L)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(crl $$0, hx $$1) {
      ecx $$2 = $$0.b_($$1);
      ecx $$3 = $$0.b_($$1.c());
      return $$2.a() == ecy.c && $$3.a() == ecy.a;
   }

   private void a(ami $$0, hx $$1, atw $$2) {
      this.a((csf)$$0, $$1);
      $$0.a(null, $$1, aqv.iV, aqw.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(csf $$0, hx $$1) {
      $$0.b($$1, false);
   }

   private void b(ami $$0, hx $$1, atw $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         byo $$5 = bkz.aW.a((csf)$$0);
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

   private double b(atw $$0) {
      double $$1 = (double)(byo.c / 2.0F);
      return atq.a($$0.j(), $$1, 1.0 - $$1);
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
