import com.mojang.serialization.MapCodec;

public class dkz extends dkm {
   public static final MapCodec<dkz> a = b(dkz::new);
   public static final int b = 6;
   public static final dyu c = dyl.az;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final fcs[] g = new fcs[]{
      dkm.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkm.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkm.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkm.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkm.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkm.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkm.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dkz> a() {
      return a;
   }

   protected dkz(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      cxl $$7 = $$0.h();
      if ($$0.a(ayd.aP) && $$1.c(c) == 0 && dkm.a($$7) instanceof dlc $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, axf.dt, axg.e, 1.0F, 1.0F);
         $$2.b($$3, dld.a($$8));
         $$2.a($$4, ecr.c, $$3);
         $$4.b(axp.c.b($$7));
         return btj.a;
      } else {
         return btj.f;
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return btj.a;
         }

         if ($$3.b(bti.a).f()) {
            return btj.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static btj a(dhj $$0, jh $$1, dxv $$2, cpx $$3) {
      if (!$$3.u(false)) {
         return btj.e;
      } else {
         $$3.a(axp.U);
         $$3.gt().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, ecr.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, ecr.f, $$1);
         }

         return btj.a;
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
