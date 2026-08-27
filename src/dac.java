import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dac extends cwy {
   public static final MapCodec<dac> a = b(dac::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final emv b = cwy.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dac> a() {
      return a;
   }

   public dac(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.F_()));
   }

   private static int a(auw $$0) {
      return $$0.b(g, h);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return !this.a($$0, $$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((ctx)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if ($$3.ai().equals(bmc.N)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(ctd $$0, hx $$1) {
      eez $$2 = $$0.b_($$1);
      eez $$3 = $$0.b_($$1.c());
      return $$2.a() == efa.c && $$3.a() == efa.a;
   }

   private void a(ane $$0, hx $$1, auw $$2) {
      this.a((ctx)$$0, $$1);
      $$0.a(null, $$1, art.jt, aru.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(ctx $$0, hx $$1) {
      $$0.b($$1, false);
   }

   private void b(ane $$0, hx $$1, auw $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         bzx $$5 = bmc.aY.a((ctx)$$0);
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

   private double b(auw $$0) {
      double $$1 = (double)(bzx.c / 2.0F);
      return aup.a($$0.j(), $$1, 1.0 - $$1);
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
