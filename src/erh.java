import java.util.Optional;
import javax.annotation.Nullable;

public abstract class erh extends erc {
   public static final float e = 0.44444445F;

   @Override
   public erd d() {
      return erf.d;
   }

   @Override
   public erd e() {
      return erf.e;
   }

   @Override
   public cvt a() {
      return cwb.qB;
   }

   @Override
   public void a(dev $$0, jg $$1, ere $$2, azr $$3) {
      jg $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lq.Y, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awk.nQ, awl.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awk.nO, awl.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(dev $$0, jg $$1, ere $$2, azr $$3) {
      if ($$0.ac().b(der.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            jg $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dvd $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((dey)$$0, $$5)) {
                     $$0.b($$5, dhl.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               jg $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.d()) && this.b($$0, $$9)) {
                  $$0.b($$9.d(), dhl.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dey $$0, jg $$1) {
      for (jl $$2 : jl.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dey $$0, jg $$1) {
      return $$0.d($$1.v()) && !$$0.B($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lo h() {
      return lq.i;
   }

   @Override
   protected void a(dew $$0, jg $$1, dvd $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dey $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dvd b(ere $$0) {
      return dia.H.m().b(dmn.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(erd $$0) {
      return $$0 == erf.e || $$0 == erf.d;
   }

   @Override
   public int c(dey $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(ere $$0, dea $$1, jg $$2, erd $$3, jl $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(axf.a);
   }

   @Override
   public int a(dey $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(dev $$0, jg $$1, ere $$2, ere $$3) {
      int $$4 = this.a((dey)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dew $$0, jg $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(dev $$0) {
      return $$0.ac().b(der.V);
   }

   @Override
   protected void a(dew $$0, jg $$1, dvd $$2, jl $$3, ere $$4) {
      if ($$3 == jl.a) {
         ere $$5 = $$0.b_($$1);
         if (this.a(axf.b) && $$5.a(axf.a)) {
            if ($$2.b() instanceof dmn) {
               $$0.a($$1, dia.b.m(), 3);
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
   public Optional<awj> j() {
      return Optional.of(awk.dl);
   }

   public static class a extends erh {
      @Override
      protected void a(dve.a<erd, ere> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ere $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ere $$0) {
         return false;
      }
   }

   public static class b extends erh {
      @Override
      public int d(ere $$0) {
         return 8;
      }

      @Override
      public boolean c(ere $$0) {
         return true;
      }
   }
}
