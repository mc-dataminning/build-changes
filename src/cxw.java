import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class cxw extends cut {
   public static final MapCodec<cxw> a = b(cxw::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final ekb b = cut.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<cxw> a() {
      return a;
   }

   public cxw(dgv.d $$0) {
      super($$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(ato $$0) {
      return $$0.b(g, h);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return !this.a($$0, $$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((crs)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if ($$3.ag().equals(bkm.L)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cqy $$0, ht $$1) {
      ecg $$2 = $$0.b_($$1);
      ecg $$3 = $$0.b_($$1.c());
      return $$2.a() == ech.c && $$3.a() == ech.a;
   }

   private void a(ama $$0, ht $$1, ato $$2) {
      this.a((crs)$$0, $$1);
      $$0.a(null, $$1, aqn.iF, aqo.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(crs $$0, ht $$1) {
      $$0.b($$1, false);
   }

   private void b(ama $$0, ht $$1, ato $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         byb $$5 = bkm.aW.a((crs)$$0);
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

   private double b(ato $$0) {
      double $$1 = (double)(byb.c / 2.0F);
      return ati.a($$0.j(), $$1, 1.0 - $$1);
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
