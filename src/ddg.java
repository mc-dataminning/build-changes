import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class ddg extends dac {
   public static final MapCodec<ddg> a = b(ddg::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final eqm b = dac.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   public ddg(dna.d $$0) {
      super($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(axd $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return !this.a($$0, $$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cxb)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if ($$3.ai().equals(bpd.P)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cwh $$0, ib $$1) {
      eip $$2 = $$0.b_($$1);
      eip $$3 = $$0.b_($$1.c());
      return $$2.a() == eiq.c && $$3.a() == eiq.a;
   }

   private void a(apf $$0, ib $$1, axd $$2) {
      this.a((cxb)$$0, $$1);
      $$0.a(null, $$1, aty.jB, atz.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cxb $$0, ib $$1) {
      $$0.b($$1, false);
   }

   private void b(apf $$0, ib $$1, axd $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         ccz $$5 = bpd.ba.a((cxb)$$0);
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
      double $$1 = (double)(ccz.c / 2.0F);
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
