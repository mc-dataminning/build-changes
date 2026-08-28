import com.mojang.serialization.MapCodec;

public class drt extends djv implements djo {
   public static final MapCodec<drt> a = b(drt::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dxv c = dxm.av;
   private static final fbt e = djl.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final fbt f = djl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<drt> a() {
      return a;
   }

   public drt(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo(cws.xv);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dww $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dww $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(ebs.c, $$2, ebs.a.a($$5));
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if ($$3 instanceof bvg && $$3.aq() != bur.aa && $$3.aq() != bur.l) {
         $$3.a($$0, new faz(0.8F, 0.75, 0.8F));
         if ($$1 instanceof ard $$4 && $$0.c(c) != 0) {
            faz $$6 = $$3.di() ? $$3.ah() : $$3.bC().d($$3.dt());
            if ($$6.j() > 0.0) {
               double $$7 = Math.abs($$6.a());
               double $$8 = Math.abs($$6.c());
               if ($$7 >= 0.003F || $$8 >= 0.003F) {
                  $$3.a($$4, $$1.ak().u(), 1.0F);
               }
            }

            return;
         }
      }
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bsj)(!$$8 && $$0.a(cws.sv) ? bsj.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cwo(cws.xv, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awa.Ag, awb.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dww $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(ebs.c, $$2, ebs.a.a($$3, $$8));
         return bsj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
