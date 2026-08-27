import com.mojang.serialization.MapCodec;

public class ddg extends cva {
   public static final MapCodec<ddg> a = b(ddg::new);
   private static final dii b = dhy.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   public ddg(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(csa $$0, dhi $$1, ejq $$2, cem $$3) {
      int $$4 = a((csb)$$0, $$1, $$2, (bkq)$$3);
      if ($$3.w() instanceof amf $$6) {
         $$6.a(arb.aE);
         al.L.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(csb $$0, dhi $$1, ejq $$2, bkq $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cea ? 20 : 8;
      if (!$$0.M().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(ejq $$0, eju $$1) {
      hx $$2 = $$0.b();
      double $$3 = Math.abs(atm.e($$1.c) - 0.5);
      double $$4 = Math.abs(atm.e($$1.d) - 0.5);
      double $$5 = Math.abs(atm.e($$1.e) - 0.5);
      hx.a $$6 = $$2.o();
      double $$7;
      if ($$6 == hx.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == hx.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, atm.c(15.0 * atm.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(csb $$0, dhi $$1, int $$2, ht $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(b);
   }

   @Override
   public boolean f_(dhi $$0) {
      return true;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.M().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
