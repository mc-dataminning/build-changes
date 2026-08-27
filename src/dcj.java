import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dcj extends czf {
   public static final MapCodec<dcj> a = b(dcj::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final epo b = czf.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   public dcj(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.F_()));
   }

   private static int a(awt $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return !this.a($$0, $$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cwe)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if ($$3.ai().equals(bol.N)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cvk $$0, ib $$1) {
      ehr $$2 = $$0.b_($$1);
      ehr $$3 = $$0.b_($$1.c());
      return $$2.a() == ehs.c && $$3.a() == ehs.a;
   }

   private void a(apa $$0, ib $$1, awt $$2) {
      this.a((cwe)$$0, $$1);
      $$0.a(null, $$1, atp.ju, atq.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cwe $$0, ib $$1) {
      $$0.b($$1, false);
   }

   private void b(apa $$0, ib $$1, awt $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cch $$5 = bol.aY.a((cwe)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fQ();
            $$0.b($$5);
         }
      }
   }

   private double b(awt $$0) {
      double $$1 = (double)(cch.c / 2.0F);
      return awm.a($$0.j(), $$1, 1.0 - $$1);
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
