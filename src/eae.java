import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eae extends dzz {
   public static final float e = 0.44444445F;

   @Override
   public eaa d() {
      return eac.d;
   }

   @Override
   public eaa e() {
      return eac.e;
   }

   @Override
   public cir a() {
      return ciz.pM;
   }

   @Override
   public void a(cpk $$0, gv $$1, eab $$2, art $$3) {
      gv $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(iw.T, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, aou.mp, aov.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), aou.mn, aov.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(cpk $$0, gv $$1, eab $$2, art $$3) {
      if ($$0.X().b(cpg.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            gv $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.o($$5)) {
                  return;
               }

               dey $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cpn)$$0, $$5)) {
                     $$0.b($$5, cry.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               gv $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.o($$9)) {
                  return;
               }

               if ($$0.t($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), cry.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cpn $$0, gv $$1) {
      for (hb $$2 : hb.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cpn $$0, gv $$1) {
      return $$1.v() >= $$0.C_() && $$1.v() < $$0.aj() && !$$0.A($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public iu h() {
      return iw.j;
   }

   @Override
   protected void a(cpl $$0, gv $$1, dey $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cpn $$0) {
      return $$0.x_().i() ? 4 : 2;
   }

   @Override
   public dey b(eab $$0) {
      return csl.H.n().a(cwx.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eaa $$0) {
      return $$0 == eac.e || $$0 == eac.d;
   }

   @Override
   public int c(cpn $$0) {
      return $$0.x_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eab $$0, coq $$1, gv $$2, eaa $$3, hb $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(apo.a);
   }

   @Override
   public int a(cpn $$0) {
      return $$0.x_().i() ? 10 : 30;
   }

   @Override
   public int a(cpk $$0, gv $$1, eab $$2, eab $$3) {
      int $$4 = this.a((cpn)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((coq)$$0, $$1) > $$2.a((coq)$$0, $$1) && $$0.y_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cpl $$0, gv $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(cpk $$0) {
      return $$0.X().b(cpg.R);
   }

   @Override
   protected void a(cpl $$0, gv $$1, dey $$2, hb $$3, eab $$4) {
      if ($$3 == hb.a) {
         eab $$5 = $$0.b_($$1);
         if (this.a(apo.b) && $$5.a(apo.a)) {
            if ($$2.b() instanceof cwx) {
               $$0.a($$1, csl.b.n(), 3);
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
   public Optional<aot> j() {
      return Optional.of(aou.cE);
   }

   public static class a extends eae {
      @Override
      protected void a(dez.a<eaa, eab> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eab $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eab $$0) {
         return false;
      }
   }

   public static class b extends eae {
      @Override
      public int d(eab $$0) {
         return 8;
      }

      @Override
      public boolean c(eab $$0) {
         return true;
      }
   }
}
