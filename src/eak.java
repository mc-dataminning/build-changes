import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eak extends eaf {
   public static final float e = 0.44444445F;

   @Override
   public eag d() {
      return eai.d;
   }

   @Override
   public eag e() {
      return eai.e;
   }

   @Override
   public civ a() {
      return cjd.pM;
   }

   @Override
   public void a(cpq $$0, gw $$1, eah $$2, arx $$3) {
      gw $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(ix.T, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, aoz.mp, apa.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), aoz.mn, apa.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(cpq $$0, gw $$1, eah $$2, arx $$3) {
      if ($$0.X().b(cpm.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            gw $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.o($$5)) {
                  return;
               }

               dfe $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cpt)$$0, $$5)) {
                     $$0.b($$5, cse.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               gw $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.o($$9)) {
                  return;
               }

               if ($$0.t($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), cse.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cpt $$0, gw $$1) {
      for (hc $$2 : hc.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cpt $$0, gw $$1) {
      return $$1.v() >= $$0.C_() && $$1.v() < $$0.aj() && !$$0.A($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public iv h() {
      return ix.j;
   }

   @Override
   protected void a(cpr $$0, gw $$1, dfe $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cpt $$0) {
      return $$0.x_().i() ? 4 : 2;
   }

   @Override
   public dfe b(eah $$0) {
      return csr.H.n().a(cxd.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eag $$0) {
      return $$0 == eai.e || $$0 == eai.d;
   }

   @Override
   public int c(cpt $$0) {
      return $$0.x_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eah $$0, cow $$1, gw $$2, eag $$3, hc $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(apt.a);
   }

   @Override
   public int a(cpt $$0) {
      return $$0.x_().i() ? 10 : 30;
   }

   @Override
   public int a(cpq $$0, gw $$1, eah $$2, eah $$3) {
      int $$4 = this.a((cpt)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cow)$$0, $$1) > $$2.a((cow)$$0, $$1) && $$0.y_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cpr $$0, gw $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(cpq $$0) {
      return $$0.X().b(cpm.R);
   }

   @Override
   protected void a(cpr $$0, gw $$1, dfe $$2, hc $$3, eah $$4) {
      if ($$3 == hc.a) {
         eah $$5 = $$0.b_($$1);
         if (this.a(apt.b) && $$5.a(apt.a)) {
            if ($$2.b() instanceof cxd) {
               $$0.a($$1, csr.b.n(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<aoy> j() {
      return Optional.of(aoz.cE);
   }

   public static class a extends eak {
      @Override
      protected void a(dff.a<eag, eah> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eah $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eah $$0) {
         return false;
      }
   }

   public static class b extends eak {
      @Override
      public int d(eah $$0) {
         return 8;
      }

      @Override
      public boolean c(eah $$0) {
         return true;
      }
   }
}
