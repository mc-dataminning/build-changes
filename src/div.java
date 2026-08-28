import com.mojang.serialization.MapCodec;

public class div extends dij {
   public static final MapCodec<div> a = b(div::new);
   public static final int b = 6;
   public static final dwn c = dwe.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final fal[] g = new fal[]{
      dij.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dij.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dij.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dij.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dij.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dij.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dij.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<div> a() {
      return a;
   }

   protected div(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      cwb $$7 = $$0.h();
      if ($$0.a(axm.aO) && $$1.c(c) == 0 && dij.a($$7) instanceof diy $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awo.ds, awp.e, 1.0F, 1.0F);
         $$2.b($$3, diz.a($$8));
         $$2.a($$4, eak.c, $$3);
         $$4.b(awy.c.b($$7));
         return bsh.a;
      } else {
         return bsh.f;
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bsh.a;
         }

         if ($$3.b(bsg.a).f()) {
            return bsh.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bsh a(dfg $$0, jh $$1, dvo $$2, cor $$3) {
      if (!$$3.u(false)) {
         return bsh.e;
      } else {
         $$3.a(awy.U);
         $$3.gw().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, eak.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, eak.f, $$1);
         }

         return bsh.a;
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
