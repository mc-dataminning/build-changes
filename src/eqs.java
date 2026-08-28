import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eqs extends eqn {
   public static final float e = 0.44444445F;

   @Override
   public eqo d() {
      return eqq.d;
   }

   @Override
   public eqo e() {
      return eqq.e;
   }

   @Override
   public cvk a() {
      return cvt.qB;
   }

   @Override
   public void a(deg $$0, je $$1, eqp $$2, azl $$3) {
      je $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(ln.Y, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awe.nS, awf.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awe.nQ, awf.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(deg $$0, je $$1, eqp $$2, azl $$3) {
      if ($$0.ac().b(dec.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            je $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               duo $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((dej)$$0, $$5)) {
                     $$0.b($$5, dgw.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               je $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.d()) && this.b($$0, $$9)) {
                  $$0.b($$9.d(), dgw.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dej $$0, je $$1) {
      for (jj $$2 : jj.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dej $$0, je $$1) {
      return $$0.d($$1.v()) && !$$0.B($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public ll h() {
      return ln.i;
   }

   @Override
   protected void a(deh $$0, je $$1, duo $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dej $$0) {
      return $$0.B_().i() ? 4 : 2;
   }

   @Override
   public duo b(eqp $$0) {
      return dhl.H.o().b(dlz.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eqo $$0) {
      return $$0 == eqq.e || $$0 == eqq.d;
   }

   @Override
   public int c(dej $$0) {
      return $$0.B_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eqp $$0, ddl $$1, je $$2, eqo $$3, jj $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awz.a);
   }

   @Override
   public int a(dej $$0) {
      return $$0.B_().i() ? 10 : 30;
   }

   @Override
   public int a(deg $$0, je $$1, eqp $$2, eqp $$3) {
      int $$4 = this.a((dej)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.C_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(deh $$0, je $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(deg $$0) {
      return $$0.ac().b(dec.V);
   }

   @Override
   protected void a(deh $$0, je $$1, duo $$2, jj $$3, eqp $$4) {
      if ($$3 == jj.a) {
         eqp $$5 = $$0.b_($$1);
         if (this.a(awz.b) && $$5.a(awz.a)) {
            if ($$2.b() instanceof dlz) {
               $$0.a($$1, dhl.b.o(), 3);
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
   public Optional<awd> j() {
      return Optional.of(awe.dl);
   }

   public static class a extends eqs {
      @Override
      protected void a(dup.a<eqo, eqp> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eqp $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eqp $$0) {
         return false;
      }
   }

   public static class b extends eqs {
      @Override
      public int d(eqp $$0) {
         return 8;
      }

      @Override
      public boolean c(eqp $$0) {
         return true;
      }
   }
}
