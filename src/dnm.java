import com.mojang.serialization.MapCodec;

public class dnm extends dff {
   public static final MapCodec<dnm> a = b(dnm::new);
   private static final dth b = dsx.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   public dnm(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dcd $$0, dsh $$1, evv $$2, cmz $$3) {
      int $$4 = a((dce)$$0, $$1, $$2, (bsd)$$3);
      if ($$3.s() instanceof aql $$6) {
         $$6.a(avp.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(dce $$0, dsh $$1, evv $$2, bsd $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cmn ? 20 : 8;
      if (!$$0.P().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(evv $$0, evz $$1) {
      jf $$2 = $$0.b();
      double $$3 = Math.abs(aye.e($$1.c) - 0.5);
      double $$4 = Math.abs(aye.e($$1.d) - 0.5);
      double $$5 = Math.abs(aye.e($$1.e) - 0.5);
      jf.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jf.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jf.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, aye.c(15.0 * aye.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dce $$0, dsh $$1, int $$2, ja $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean e_(dsh $$0) {
      return true;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
