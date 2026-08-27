import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ekv extends ekq {
   public static final float e = 0.44444445F;

   @Override
   public ekr d() {
      return ekt.d;
   }

   @Override
   public ekr e() {
      return ekt.e;
   }

   @Override
   public cre a() {
      return crm.qz;
   }

   @Override
   public void a(cyx $$0, ib $$1, eks $$2, axr $$3) {
      ib $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(kl.W, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, aum.nC, aun.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), aum.nA, aun.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(cyx $$0, ib $$1, eks $$2, axr $$3) {
      if ($$0.aa().b(cyt.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            ib $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               doz $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cza)$$0, $$5)) {
                     $$0.b($$5, dbl.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               ib $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), dbl.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cza $$0, ib $$1) {
      for (ih $$2 : ih.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cza $$0, ib $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.al() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public kj h() {
      return kl.j;
   }

   @Override
   protected void a(cyy $$0, ib $$1, doz $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cza $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public doz b(eks $$0) {
      return dca.H.n().a(dgn.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ekr $$0) {
      return $$0 == ekt.e || $$0 == ekt.d;
   }

   @Override
   public int c(cza $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eks $$0, cyd $$1, ib $$2, ekr $$3, ih $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(avh.a);
   }

   @Override
   public int a(cza $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(cyx $$0, ib $$1, eks $$2, eks $$3) {
      int $$4 = this.a((cza)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cyd)$$0, $$1) > $$2.a((cyd)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cyy $$0, ib $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(cyx $$0) {
      return $$0.aa().b(cyt.V);
   }

   @Override
   protected void a(cyy $$0, ib $$1, doz $$2, ih $$3, eks $$4) {
      if ($$3 == ih.a) {
         eks $$5 = $$0.b_($$1);
         if (this.a(avh.b) && $$5.a(avh.a)) {
            if ($$2.b() instanceof dgn) {
               $$0.a($$1, dca.b.n(), 3);
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
   public Optional<aul> j() {
      return Optional.of(aum.dl);
   }

   public static class a extends ekv {
      @Override
      protected void a(dpa.a<ekr, eks> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eks $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eks $$0) {
         return false;
      }
   }

   public static class b extends ekv {
      @Override
      public int d(eks $$0) {
         return 8;
      }

      @Override
      public boolean c(eks $$0) {
         return true;
      }
   }
}
