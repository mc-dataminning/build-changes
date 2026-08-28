import com.mojang.serialization.MapCodec;

public class dnb extends deu {
   public static final MapCodec<dnb> a = b(dnb::new);
   private static final dsx b = dsn.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   public dnb(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dbt $$0, drx $$1, evi $$2, cnk $$3) {
      int $$4 = a((dbu)$$0, $$1, $$2, (bsp)$$3);
      if ($$3.s() instanceof arc $$6) {
         $$6.a(awg.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(dbu $$0, drx $$1, evi $$2, bsp $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cmy ? 20 : 8;
      if (!$$0.P().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(evi $$0, evm $$1) {
      je $$2 = $$0.b();
      double $$3 = Math.abs(ayu.e($$1.c) - 0.5);
      double $$4 = Math.abs(ayu.e($$1.d) - 0.5);
      double $$5 = Math.abs(ayu.e($$1.e) - 0.5);
      je.a $$6 = $$2.o();
      double $$7;
      if ($$6 == je.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == je.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ayu.c(15.0 * ayu.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dbu $$0, drx $$1, int $$2, iz $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
