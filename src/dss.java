import com.mojang.serialization.MapCodec;

public class dss extends dkw implements dkp {
   public static final MapCodec<dss> a = b(dss::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dyu c = dyl.at;
   private static final fcs e = dkm.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final fcs f = dkm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dss> a() {
      return a;
   }

   public dss(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return new cxp(cxt.xl);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dxv $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dxv $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(ecr.c, $$2, ecr.a.a($$5));
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if ($$3 instanceof bwg && $$3.aq() != bvr.ab && $$3.aq() != bvr.l) {
         $$3.a($$0, new fby(0.8F, 0.75, 0.8F));
         if ($$1 instanceof ash $$4 && $$0.c(c) != 0) {
            fby $$6 = $$3.dj() ? $$3.ah() : $$3.bC().d($$3.du());
            if ($$6.j() > 0.0) {
               double $$7 = Math.abs($$6.a());
               double $$8 = Math.abs($$6.c());
               if ($$7 >= 0.003F || $$8 >= 0.003F) {
                  $$3.a($$4, $$1.aj().u(), 1.0F);
               }
            }

            return;
         }
      }
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (btj)(!$$8 && $$0.a(cxt.sm) ? btj.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cxp(cxt.xl, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, axf.zR, axg.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dxv $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(ecr.c, $$2, ecr.a.a($$3, $$8));
         return btj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
