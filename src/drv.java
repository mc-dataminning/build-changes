import com.mojang.serialization.MapCodec;

public class drv extends djx implements djq {
   public static final MapCodec<drv> a = b(drv::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dxx c = dxo.av;
   private static final fbv e = djn.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final fbv f = djn.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<drv> a() {
      return a;
   }

   public drv(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq(cwu.xv);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dwy $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dwy $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(ebu.c, $$2, ebu.a.a($$5));
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if ($$3 instanceof bvi && $$3.aq() != but.aa && $$3.aq() != but.l) {
         $$3.a($$0, new fbb(0.8F, 0.75, 0.8F));
         if ($$1 instanceof ard $$4 && $$0.c(c) != 0) {
            fbb $$6 = $$3.di() ? $$3.ah() : $$3.bC().d($$3.dt());
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
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bsl)(!$$8 && $$0.a(cwu.sv) ? bsl.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cwq(cwu.xv, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awa.Ag, awb.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dwy $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(ebu.c, $$2, ebu.a.a($$3, $$8));
         return bsl.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
