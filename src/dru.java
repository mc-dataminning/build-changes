import com.mojang.serialization.MapCodec;

public class dru extends djw implements djp {
   public static final MapCodec<dru> a = b(dru::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dxw c = dxn.av;
   private static final fbu e = djm.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final fbu f = djm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dru> a() {
      return a;
   }

   public dru(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp(cwt.xv);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dwx $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dwx $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(ebt.c, $$2, ebt.a.a($$5));
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, bul $$3) {
      if ($$3 instanceof bvh && $$3.aq() != bus.aa && $$3.aq() != bus.l) {
         $$3.a($$0, new fba(0.8F, 0.75, 0.8F));
         if ($$1 instanceof ard $$4 && $$0.c(c) != 0) {
            fba $$6 = $$3.di() ? $$3.ah() : $$3.bC().d($$3.dt());
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
   protected bsk a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsj $$5, faw $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bsk)(!$$8 && $$0.a(cwt.sv) ? bsk.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cwp(cwt.xv, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awa.Ag, awb.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dwx $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(ebt.c, $$2, ebt.a.a($$3, $$8));
         return bsk.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
