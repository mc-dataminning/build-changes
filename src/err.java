import java.util.Optional;
import javax.annotation.Nullable;

public abstract class err extends erm {
   public static final float e = 0.44444445F;

   @Override
   public ern d() {
      return erp.d;
   }

   @Override
   public ern e() {
      return erp.e;
   }

   @Override
   public cwb a() {
      return cwj.qB;
   }

   @Override
   public void a(dff $$0, jh $$1, ero $$2, azv $$3) {
      jh $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(ls.Y, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awo.nQ, awp.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awo.nO, awp.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(dff $$0, jh $$1, ero $$2, azv $$3) {
      if ($$0.ac().b(dfb.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            jh $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dvo $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((dfi)$$0, $$5)) {
                     $$0.b($$5, dhw.a($$0, $$5));
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
                  $$0.b($$9.d(), dhw.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dfi $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dfi $$0, jh $$1) {
      return $$0.d($$1.v()) && !$$0.B($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lq h() {
      return ls.i;
   }

   @Override
   protected void a(dfg $$0, jh $$1, dvo $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dfi $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dvo b(ero $$0) {
      return dil.H.m().b(dmy.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ern $$0) {
      return $$0 == erp.e || $$0 == erp.d;
   }

   @Override
   public int c(dfi $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(ero $$0, dek $$1, jh $$2, ern $$3, jm $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(axj.a);
   }

   @Override
   public int a(dfi $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(dff $$0, jh $$1, ero $$2, ero $$3) {
      int $$4 = this.a((dfi)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dfg $$0, jh $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(dff $$0) {
      return $$0.ac().b(dfb.V);
   }

   @Override
   protected void a(dfg $$0, jh $$1, dvo $$2, jm $$3, ero $$4) {
      if ($$3 == jm.a) {
         ero $$5 = $$0.b_($$1);
         if (this.a(axj.b) && $$5.a(axj.a)) {
            if ($$2.b() instanceof dmy) {
               $$0.a($$1, dil.b.m(), 3);
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
   public Optional<awn> j() {
      return Optional.of(awo.dl);
   }

   public static class a extends err {
      @Override
      protected void a(dvp.a<ern, ero> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ero $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ero $$0) {
         return false;
      }
   }

   public static class b extends err {
      @Override
      public int d(ero $$0) {
         return 8;
      }

      @Override
      public boolean c(ero $$0) {
         return true;
      }
   }
}
