import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eaj extends eae {
   public static final float e = 0.44444445F;

   @Override
   public eaf d() {
      return eah.d;
   }

   @Override
   public eaf e() {
      return eah.e;
   }

   @Override
   public cjg a() {
      return cjo.pM;
   }

   @Override
   public void a(cqb $$0, gw $$1, eag $$2, ash $$3) {
      gw $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(iv.T, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, apg.mp, aph.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), apg.mn, aph.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(cqb $$0, gw $$1, eag $$2, ash $$3) {
      if ($$0.X().b(cpx.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            gw $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.o($$5)) {
                  return;
               }

               dfd $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cqe)$$0, $$5)) {
                     $$0.b($$5, csp.a($$0, $$5));
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
                  $$0.b($$9.c(), csp.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cqe $$0, gw $$1) {
      for (ha $$2 : ha.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cqe $$0, gw $$1) {
      return $$1.v() >= $$0.H_() && $$1.v() < $$0.aj() && !$$0.A($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public it h() {
      return iv.j;
   }

   @Override
   protected void a(cqc $$0, gw $$1, dfd $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cqe $$0) {
      return $$0.C_().i() ? 4 : 2;
   }

   @Override
   public dfd b(eag $$0) {
      return cte.H.o().a(cxq.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eaf $$0) {
      return $$0 == eah.e || $$0 == eah.d;
   }

   @Override
   public int c(cqe $$0) {
      return $$0.C_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eag $$0, cph $$1, gw $$2, eaf $$3, ha $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(aqa.a);
   }

   @Override
   public int a(cqe $$0) {
      return $$0.C_().i() ? 10 : 30;
   }

   @Override
   public int a(cqb $$0, gw $$1, eag $$2, eag $$3) {
      int $$4 = this.a((cqe)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cph)$$0, $$1) > $$2.a((cph)$$0, $$1) && $$0.D_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cqc $$0, gw $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(cqb $$0) {
      return $$0.X().b(cpx.R);
   }

   @Override
   protected void a(cqc $$0, gw $$1, dfd $$2, ha $$3, eag $$4) {
      if ($$3 == ha.a) {
         eag $$5 = $$0.b_($$1);
         if (this.a(aqa.b) && $$5.a(aqa.a)) {
            if ($$2.b() instanceof cxq) {
               $$0.a($$1, cte.b.o(), 3);
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
   public Optional<apf> j() {
      return Optional.of(apg.cE);
   }

   public static class a extends eaj {
      @Override
      protected void a(dfe.a<eaf, eag> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eag $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eag $$0) {
         return false;
      }
   }

   public static class b extends eaj {
      @Override
      public int d(eag $$0) {
         return 8;
      }

      @Override
      public boolean c(eag $$0) {
         return true;
      }
   }
}
