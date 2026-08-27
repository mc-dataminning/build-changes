import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ecv extends ecq {
   public static final float e = 0.44444445F;

   @Override
   public ecr d() {
      return ect.d;
   }

   @Override
   public ecr e() {
      return ect.e;
   }

   @Override
   public cle a() {
      return clm.qx;
   }

   @Override
   public void a(csa $$0, ht $$1, ecs $$2, ats $$3) {
      ht $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(js.T, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, aqr.mJ, aqs.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), aqr.mH, aqs.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(csa $$0, ht $$1, ecs $$2, ats $$3) {
      if ($$0.Y().b(crw.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            ht $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.o($$5)) {
                  return;
               }

               dhi $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((csd)$$0, $$5)) {
                     $$0.b($$5, cun.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               ht $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.o($$9)) {
                  return;
               }

               if ($$0.t($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), cun.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(csd $$0, ht $$1) {
      for (hx $$2 : hx.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(csd $$0, ht $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.ak() && !$$0.A($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public jq h() {
      return js.j;
   }

   @Override
   protected void a(csb $$0, ht $$1, dhi $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(csd $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dhi b(ecs $$0) {
      return cvc.H.o().a(czp.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ecr $$0) {
      return $$0 == ect.e || $$0 == ect.d;
   }

   @Override
   public int c(csd $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(ecs $$0, crg $$1, ht $$2, ecr $$3, hx $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(arl.a);
   }

   @Override
   public int a(csd $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(csa $$0, ht $$1, ecs $$2, ecs $$3) {
      int $$4 = this.a((csd)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((crg)$$0, $$1) > $$2.a((crg)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(csb $$0, ht $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(csa $$0) {
      return $$0.Y().b(crw.V);
   }

   @Override
   protected void a(csb $$0, ht $$1, dhi $$2, hx $$3, ecs $$4) {
      if ($$3 == hx.a) {
         ecs $$5 = $$0.b_($$1);
         if (this.a(arl.b) && $$5.a(arl.a)) {
            if ($$2.b() instanceof czp) {
               $$0.a($$1, cvc.b.o(), 3);
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
   public Optional<aqq> j() {
      return Optional.of(aqr.cE);
   }

   public static class a extends ecv {
      @Override
      protected void a(dhj.a<ecr, ecs> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ecs $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ecs $$0) {
         return false;
      }
   }

   public static class b extends ecv {
      @Override
      public int d(ecs $$0) {
         return 8;
      }

      @Override
      public boolean c(ecs $$0) {
         return true;
      }
   }
}
