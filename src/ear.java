import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ear extends eam {
   public static final float e = 0.44444445F;

   @Override
   public ean d() {
      return eap.d;
   }

   @Override
   public ean e() {
      return eap.e;
   }

   @Override
   public cjc a() {
      return cjk.pM;
   }

   @Override
   public void a(cpx $$0, gw $$1, eao $$2, ase $$3) {
      gw $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(ix.T, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, apf.mp, apg.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), apf.mn, apg.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(cpx $$0, gw $$1, eao $$2, ase $$3) {
      if ($$0.X().b(cpt.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            gw $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.o($$5)) {
                  return;
               }

               dfl $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cqa)$$0, $$5)) {
                     $$0.b($$5, csl.a($$0, $$5));
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
                  $$0.b($$9.c(), csl.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cqa $$0, gw $$1) {
      for (hc $$2 : hc.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cqa $$0, gw $$1) {
      return $$1.v() >= $$0.H_() && $$1.v() < $$0.aj() && !$$0.A($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public iv h() {
      return ix.j;
   }

   @Override
   protected void a(cpy $$0, gw $$1, dfl $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cqa $$0) {
      return $$0.C_().i() ? 4 : 2;
   }

   @Override
   public dfl b(eao $$0) {
      return csy.H.n().a(cxk.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ean $$0) {
      return $$0 == eap.e || $$0 == eap.d;
   }

   @Override
   public int c(cqa $$0) {
      return $$0.C_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eao $$0, cpd $$1, gw $$2, ean $$3, hc $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(apz.a);
   }

   @Override
   public int a(cqa $$0) {
      return $$0.C_().i() ? 10 : 30;
   }

   @Override
   public int a(cpx $$0, gw $$1, eao $$2, eao $$3) {
      int $$4 = this.a((cqa)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cpd)$$0, $$1) > $$2.a((cpd)$$0, $$1) && $$0.D_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cpy $$0, gw $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(cpx $$0) {
      return $$0.X().b(cpt.R);
   }

   @Override
   protected void a(cpy $$0, gw $$1, dfl $$2, hc $$3, eao $$4) {
      if ($$3 == hc.a) {
         eao $$5 = $$0.b_($$1);
         if (this.a(apz.b) && $$5.a(apz.a)) {
            if ($$2.b() instanceof cxk) {
               $$0.a($$1, csy.b.n(), 3);
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
   public Optional<ape> j() {
      return Optional.of(apf.cE);
   }

   public static class a extends ear {
      @Override
      protected void a(dfm.a<ean, eao> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eao $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eao $$0) {
         return false;
      }
   }

   public static class b extends ear {
      @Override
      public int d(eao $$0) {
         return 8;
      }

      @Override
      public boolean c(eao $$0) {
         return true;
      }
   }
}
