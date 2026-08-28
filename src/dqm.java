import com.mojang.serialization.MapCodec;

public class dqm extends dis implements dim {
   public static final MapCodec<dqm> a = b(dqm::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dwn c = dwe.as;
   private static final fal e = dij.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final fal f = dij.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dqm> a() {
      return a;
   }

   public dqm(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return new cwf(cwj.wN);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dvo $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dvo $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(eak.c, $$2, eak.a.a($$5));
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if ($$3 instanceof bve && $$3.ar() != bup.Q && $$3.ar() != bup.h) {
         $$3.a($$0, new ezr(0.8F, 0.75, 0.8F));
         if (!$$1.C && $$0.c(c) != 0) {
            ezr $$4 = $$3 instanceof arr ? $$3.ai() : $$3.bE().d($$3.dw());
            if ($$4.j() > 0.0) {
               double $$5 = Math.abs($$4.a());
               double $$6 = Math.abs($$4.c());
               if ($$5 >= 0.003F || $$6 >= 0.003F) {
                  $$3.a($$1.ai().u(), 1.0F);
               }
            }
         }
      }
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bsh)(!$$8 && $$0.a(cwj.rP) ? bsh.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cwf(cwj.wN, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awo.zw, awp.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dvo $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(eak.c, $$2, eak.a.a($$3, $$8));
         return bsh.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
