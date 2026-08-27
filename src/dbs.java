import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dbs extends cyo {
   public static final MapCodec<dbs> a = b(dbs::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final eol b = cyo.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dbs> a() {
      return a;
   }

   public dbs(dle.d $$0) {
      super($$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.F_()));
   }

   private static int a(awo $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return !this.a($$0, $$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cvn)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if ($$3.ai().equals(bnu.N)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cut $$0, hz $$1) {
      egp $$2 = $$0.b_($$1);
      egp $$3 = $$0.b_($$1.c());
      return $$2.a() == egq.c && $$3.a() == egq.a;
   }

   private void a(aov $$0, hz $$1, awo $$2) {
      this.a((cvn)$$0, $$1);
      $$0.a(null, $$1, atk.jt, atl.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cvn $$0, hz $$1) {
      $$0.b($$1, false);
   }

   private void b(aov $$0, hz $$1, awo $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cbo $$5 = bnu.aY.a((cvn)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fL();
            $$0.b($$5);
         }
      }
   }

   private double b(awo $$0) {
      double $$1 = (double)(cbo.c / 2.0F);
      return awh.a($$0.j(), $$1, 1.0 - $$1);
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
