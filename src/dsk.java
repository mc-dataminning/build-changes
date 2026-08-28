import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsk extends djn {
   public static final MapCodec<dsk> a = b(dsk::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final fbv g = djn.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fbv h = djn.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dxx e = dxo.aH;
   public static final dxx f = dxo.aG;

   @Override
   public MapCodec<dsk> a() {
      return a;
   }

   public dsk(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bum $$3) {
      if (!$$3.ce()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgj $$0, dwy $$1, ji $$2, bum $$3, float $$4) {
      if (!($$3 instanceof cms)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dgj $$0, dwy $$1, ji $$2, bum $$3, int $$4) {
      if ($$1.a(djp.mH) && $$0 instanceof ard $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(dgj $$0, ji $$1, dwy $$2) {
      $$0.a(null, $$1, awa.AW, awb.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(ebu.f, $$1, ebu.a.a($$2));
         $$0.c(2001, $$1, djn.j($$2));
      }
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, awa.AX, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(ebu.c, $$2, ebu.a.a($$0));
         } else {
            $$1.a(null, $$2, awa.AY, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(ebu.f, $$2, ebu.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, djn.j($$0));
               cia $$6 = but.bA.a($$1, bus.e);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.h($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(dfo $$0, ji $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dfo $$0, ji $$1) {
      return $$0.a_($$1).a(awp.J);
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dgj $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dgj $$0, coy $$1, ji $$2, dwy $$3, @Nullable dua $$4, cwq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dwy $$0, dah $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(e, f);
   }

   private boolean a(ard $$0, bum $$1) {
      if ($$1 instanceof cia || $$1 instanceof cgt) {
         return false;
      } else {
         return !($$1 instanceof bvi) ? false : $$1 instanceof coy || $$0.O().b(dgf.c);
      }
   }
}
