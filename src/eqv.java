import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eqv extends eqn {
   @Override
   public eqo d() {
      return eqq.b;
   }

   @Override
   public eqo e() {
      return eqq.c;
   }

   @Override
   public cvk a() {
      return cvt.qA;
   }

   @Override
   public void a(deg $$0, je $$1, eqp $$2, azl $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awe.Ci, awf.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(ln.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public ll h() {
      return ln.l;
   }

   @Override
   protected boolean a(deg $$0) {
      return $$0.ac().b(dec.U);
   }

   @Override
   protected void a(deh $$0, je $$1, duo $$2) {
      drs $$3 = $$2.x() ? $$0.c_($$1) : null;
      dhj.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dej $$0) {
      return 4;
   }

   @Override
   public duo b(eqp $$0) {
      return dhl.G.o().b(dlz.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eqo $$0) {
      return $$0 == eqq.c || $$0 == eqq.b;
   }

   @Override
   public int c(dej $$0) {
      return 1;
   }

   @Override
   public int a(dej $$0) {
      return 5;
   }

   @Override
   public boolean a(eqp $$0, ddl $$1, je $$2, eqo $$3, jj $$4) {
      return $$4 == jj.a && !$$3.a(awz.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awd> j() {
      return Optional.of(awe.di);
   }

   public static class a extends eqv {
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

   public static class b extends eqv {
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
