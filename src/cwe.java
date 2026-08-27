import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class cwe extends ctc {
   public static final MapCodec<cwe> a = b(cwe::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final eia b = ctc.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<cwe> a() {
      return a;
   }

   public cwe(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.D_()));
   }

   private static int a(ash $$0) {
      return $$0.b(g, h);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return !this.a($$0, $$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cqb)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if ($$3.ag().equals(bja.L)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cph $$0, gw $$1) {
      eag $$2 = $$0.b_($$1);
      eag $$3 = $$0.b_($$1.c());
      return $$2.a() == eah.c && $$3.a() == eah.a;
   }

   private void a(akt $$0, gw $$1, ash $$2) {
      this.a((cqb)$$0, $$1);
      $$0.a(null, $$1, apg.iB, aph.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cqb $$0, gw $$1) {
      $$0.b($$1, false);
   }

   private void b(akt $$0, gw $$1, ash $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         bwp $$5 = bja.aW.a((cqb)$$0);
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

   private double b(ash $$0) {
      double $$1 = (double)(bwp.c / 2.0F);
      return asb.a($$0.j(), $$1, 1.0 - $$1);
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
