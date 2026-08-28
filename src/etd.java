import java.util.Optional;
import javax.annotation.Nullable;

public abstract class etd extends esy {
   public static final float e = 0.44444445F;

   @Override
   public esz d() {
      return etb.d;
   }

   @Override
   public esz e() {
      return etb.e;
   }

   @Override
   public cwm a() {
      return cwu.rh;
   }

   @Override
   public void a(dgj $$0, ji $$1, eta $$2, azh $$3) {
      ji $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lt.aa, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awa.op, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awa.on, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(ard $$0, ji $$1, eta $$2, azh $$3) {
      if ($$0.O().b(dgf.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            ji $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dwy $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((dgm)$$0, $$5)) {
                     $$0.b($$5, dja.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               ji $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.d()) && this.b($$0, $$9)) {
                  $$0.b($$9.d(), dja.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dgm $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dgm $$0, ji $$1) {
      return $$0.d($$1.v()) && !$$0.B($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lr h() {
      return lt.i;
   }

   @Override
   protected void a(dgk $$0, ji $$1, dwy $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dgm $$0) {
      return $$0.G_().i() ? 4 : 2;
   }

   @Override
   public dwy b(eta $$0) {
      return djp.K.m().b(dof.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(esz $$0) {
      return $$0 == etb.e || $$0 == etb.d;
   }

   @Override
   public int c(dgm $$0) {
      return $$0.G_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eta $$0, dfo $$1, ji $$2, esz $$3, jn $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awv.a);
   }

   @Override
   public int a(dgm $$0) {
      return $$0.G_().i() ? 10 : 30;
   }

   @Override
   public int a(dgj $$0, ji $$1, eta $$2, eta $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.H_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dgk $$0, ji $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(ard $$0) {
      return $$0.O().b(dgf.W);
   }

   @Override
   protected void a(dgk $$0, ji $$1, dwy $$2, jn $$3, eta $$4) {
      if ($$3 == jn.a) {
         eta $$5 = $$0.b_($$1);
         if (this.a(awv.b) && $$5.a(awv.a)) {
            if ($$2.b() instanceof dof) {
               $$0.a($$1, djp.b.m(), 3);
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
   public Optional<avz> j() {
      return Optional.of(awa.dm);
   }

   public static class a extends etd {
      @Override
      protected void a(dwz.a<esz, eta> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eta $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eta $$0) {
         return false;
      }
   }

   public static class b extends etd {
      @Override
      public int d(eta $$0) {
         return 8;
      }

      @Override
      public boolean c(eta $$0) {
         return true;
      }
   }
}
