import com.mojang.serialization.MapCodec;

public class dkr extends dke {
   public static final MapCodec<dkr> a = b(dkr::new);
   public static final int b = 6;
   public static final dym c = dyd.az;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final fcm[] g = new fcm[]{
      dke.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dke.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dke.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dke.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dke.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dke.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dke.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   protected dkr(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      cxg $$7 = $$0.h();
      if ($$0.a(ayd.aP) && $$1.c(c) == 0 && dke.a($$7) instanceof dku $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, axf.ds, axg.e, 1.0F, 1.0F);
         $$2.b($$3, dkv.a($$8));
         $$2.a($$4, ecj.c, $$3);
         $$4.b(axp.c.b($$7));
         return bte.a;
      } else {
         return bte.f;
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bte.a;
         }

         if ($$3.b(btd.a).f()) {
            return bte.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bte a(dhb $$0, jh $$1, dxn $$2, cps $$3) {
      if (!$$3.u(false)) {
         return bte.e;
      } else {
         $$3.a(axp.U);
         $$3.gr().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, ecj.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, ecj.f, $$1);
         }

         return bte.a;
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
