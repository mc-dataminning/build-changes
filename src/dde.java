import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dde extends daa {
   public static final MapCodec<dde> a = b(dde::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final eqk b = daa.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dde> a() {
      return a;
   }

   public dde(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(axd $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return !this.a($$0, $$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cwz)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if ($$3.ai().equals(bpc.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cwf $$0, ib $$1) {
      ein $$2 = $$0.b_($$1);
      ein $$3 = $$0.b_($$1.c());
      return $$2.a() == eio.c && $$3.a() == eio.a;
   }

   private void a(apf $$0, ib $$1, axd $$2) {
      this.a((cwz)$$0, $$1);
      $$0.a(null, $$1, aty.jx, atz.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cwz $$0, ib $$1) {
      $$0.b($$1, false);
   }

   private void b(apf $$0, ib $$1, axd $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         ccy $$5 = bpc.aZ.a((cwz)$$0);
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

   private double b(axd $$0) {
      double $$1 = (double)(ccy.c / 2.0F);
      return aww.a($$0.j(), $$1, 1.0 - $$1);
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
