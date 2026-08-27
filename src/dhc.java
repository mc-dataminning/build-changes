import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dhc extends ddy {
   public static final MapCodec<dhc> a = b(dhc::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final evd b = ddy.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   public dhc(dra.d $$0) {
      super($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(ayk $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return !this.a($$0, $$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dax)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if ($$3.ak().equals(bsa.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dad $$0, io $$1) {
      emu $$2 = $$0.b_($$1);
      emu $$3 = $$0.b_($$1.c());
      return $$2.a() == emv.c && $$3.a() == emv.a;
   }

   private void a(aqm $$0, io $$1, ayk $$2) {
      this.a((dax)$$0, $$1);
      $$0.a(null, $$1, avh.jI, avi.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dax $$0, io $$1) {
      $$0.b($$1, false);
   }

   private void b(aqm $$0, io $$1, ayk $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cgb $$5 = bsa.ba.a((dax)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fT();
            $$0.b($$5);
         }
      }
   }

   private double b(ayk $$0) {
      double $$1 = (double)(cgb.c / 2.0F);
      return ayd.a($$0.j(), $$1, 1.0 - $$1);
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
