import com.mojang.serialization.MapCodec;

public class dqb extends dih implements dib {
   public static final MapCodec<dqb> a = b(dqb::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dwd c = dvt.as;
   private static final fab e = dhy.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final fab f = dhy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   public dqb(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx(cwb.wx);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dvd $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dvd $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(eaa.c, $$2, eaa.a.a($$5));
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if ($$3 instanceof buv && $$3.aq() != bug.Q && $$3.aq() != bug.h) {
         $$3.a($$0, new ezh(0.8F, 0.75, 0.8F));
         ezh $$4 = $$3.ai();
         if (!$$1.C && $$0.c(c) > 0 && $$4.j() > 0.0) {
            double $$5 = Math.abs($$4.a());
            double $$6 = Math.abs($$4.c());
            if ($$5 >= 0.003F || $$6 >= 0.003F) {
               $$3.a($$1.ak().u(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bry)(!$$8 && $$0.a(cwb.rz) ? bry.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cvx(cwb.wx, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awk.zw, awl.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dvd $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(eaa.c, $$2, eaa.a.a($$3, $$8));
         return bry.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
