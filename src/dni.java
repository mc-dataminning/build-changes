import com.mojang.serialization.MapCodec;

public class dni extends dfb {
   public static final MapCodec<dni> a = b(dni::new);
   private static final dte b = dsu.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dca $$0, dse $$1, evp $$2, cnr $$3) {
      int $$4 = a((dcb)$$0, $$1, $$2, (bsw)$$3);
      if ($$3.s() instanceof arg $$6) {
         $$6.a(awk.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(dcb $$0, dse $$1, evp $$2, bsw $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cnf ? 20 : 8;
      if (!$$0.P().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(evp $$0, evt $$1) {
      je $$2 = $$0.b();
      double $$3 = Math.abs(ayz.e($$1.c) - 0.5);
      double $$4 = Math.abs(ayz.e($$1.d) - 0.5);
      double $$5 = Math.abs(ayz.e($$1.e) - 0.5);
      je.a $$6 = $$2.o();
      double $$7;
      if ($$6 == je.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == je.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ayz.c(15.0 * ayz.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dcb $$0, dse $$1, int $$2, iz $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean e_(dse $$0) {
      return true;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
