import com.mojang.serialization.MapCodec;

public class dmx extends dnj {
   public static final MapCodec<dmx> a = b(dmx::new);
   protected static final fcs b = dkm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      this.e($$0, $$1, $$2);
      return btj.a;
   }

   @Override
   protected void a_(dxv $$0, dhi $$1, jh $$2, cpx $$3) {
      this.e($$0, $$1, $$2);
   }

   private void e(dxv $$0, dhi $$1, jh $$2) {
      dzl $$3 = $$1.F_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         jh $$5 = $$2.b($$1.A.a(16) - $$1.A.a(16), $$1.A.a(8) - $$1.A.a(8), $$1.A.a(16) - $$1.A.a(16));
         if ($$1.a_($$5).l() && $$3.a($$5)) {
            if ($$1.C) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.A.j();
                  float $$8 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.A.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.A.i() - 0.5F) * 0.2F;
                  double $$11 = bae.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.A.j() - 0.5) + 0.5;
                  double $$12 = bae.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.A.j() - 0.5;
                  double $$13 = bae.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.A.j() - 0.5) + 0.5;
                  $$1.a(ls.ad, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
               }
            } else {
               $$1.a($$5, $$0, 2);
               $$1.a($$2, false);
            }

            return;
         }
      }
   }

   @Override
   protected int b() {
      return 5;
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
