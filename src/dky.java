import com.mojang.serialization.MapCodec;

public class dky extends dkl {
   public static final MapCodec<dky> a = b(dky::new);
   public static final int b = 6;
   public static final dyt c = dyk.az;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final fcr[] g = new fcr[]{
      dkl.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkl.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkl.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkl.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkl.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkl.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkl.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   protected dky(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      cxk $$7 = $$0.h();
      if ($$0.a(ayd.aP) && $$1.c(c) == 0 && dkl.a($$7) instanceof dlb $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, axf.dt, axg.e, 1.0F, 1.0F);
         $$2.b($$3, dlc.a($$8));
         $$2.a($$4, ecq.c, $$3);
         $$4.b(axp.c.b($$7));
         return bti.a;
      } else {
         return bti.f;
      }
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bti.a;
         }

         if ($$3.b(bth.a).f()) {
            return bti.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bti a(dhi $$0, jh $$1, dxu $$2, cpw $$3) {
      if (!$$3.u(false)) {
         return bti.e;
      } else {
         $$3.a(axp.U);
         $$3.gr().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, ecq.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, ecq.f, $$1);
         }

         return bti.a;
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
