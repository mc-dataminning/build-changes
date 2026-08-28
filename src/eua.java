import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eua extends etv {
   public static final float e = 0.44444445F;

   @Override
   public etw d() {
      return ety.d;
   }

   @Override
   public etw e() {
      return ety.e;
   }

   @Override
   public cxl a() {
      return cxt.qY;
   }

   @Override
   public void a(dhi $$0, jh $$1, etx $$2, bam $$3) {
      jh $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(ls.Z, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, axf.oj, axg.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), axf.oh, axg.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(ash $$0, jh $$1, etx $$2, bam $$3) {
      if ($$0.N().b(dhe.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            jh $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dxv $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((dhl)$$0, $$5)) {
                     $$0.b($$5, djz.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               jh $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.d()) && this.b($$0, $$9)) {
                  $$0.b($$9.d(), djz.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dhl $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dhl $$0, jh $$1) {
      return $$0.d($$1.v()) && !$$0.B($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lq h() {
      return ls.i;
   }

   @Override
   protected void a(dhj $$0, jh $$1, dxv $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dhl $$0) {
      return $$0.G_().i() ? 4 : 2;
   }

   @Override
   public dxv b(etx $$0) {
      return dko.K.m().b(dpe.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(etw $$0) {
      return $$0 == ety.e || $$0 == ety.d;
   }

   @Override
   public int c(dhl $$0) {
      return $$0.G_().i() ? 1 : 2;
   }

   @Override
   public boolean a(etx $$0, dgn $$1, jh $$2, etw $$3, jm $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(aya.a);
   }

   @Override
   public int a(dhl $$0) {
      return $$0.G_().i() ? 10 : 30;
   }

   @Override
   public int a(dhi $$0, jh $$1, etx $$2, etx $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.H_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dhj $$0, jh $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(ash $$0) {
      return $$0.N().b(dhe.W);
   }

   @Override
   protected void a(dhj $$0, jh $$1, dxv $$2, jm $$3, etx $$4) {
      if ($$3 == jm.a) {
         etx $$5 = $$0.b_($$1);
         if (this.a(aya.b) && $$5.a(aya.a)) {
            if ($$2.b() instanceof dpe) {
               $$0.a($$1, dko.b.m(), 3);
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
   public Optional<axe> j() {
      return Optional.of(axf.dm);
   }

   public static class a extends eua {
      @Override
      protected void a(dxw.a<etw, etx> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(etx $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(etx $$0) {
         return false;
      }
   }

   public static class b extends eua {
      @Override
      public int d(etx $$0) {
         return 8;
      }

      @Override
      public boolean c(etx $$0) {
         return true;
      }
   }
}
