import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eqz extends eqr {
   @Override
   public eqs d() {
      return equ.b;
   }

   @Override
   public eqs e() {
      return equ.c;
   }

   @Override
   public cvn a() {
      return cvw.qA;
   }

   @Override
   public void a(dej $$0, jf $$1, eqt $$2, azn $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awg.Ci, awh.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lo.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lm h() {
      return lo.l;
   }

   @Override
   protected boolean a(dej $$0) {
      return $$0.ac().b(def.U);
   }

   @Override
   protected void a(dek $$0, jf $$1, dus $$2) {
      drv $$3 = $$2.x() ? $$0.c_($$1) : null;
      dhm.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dem $$0) {
      return 4;
   }

   @Override
   public dus b(eqt $$0) {
      return dho.G.n().b(dmc.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eqs $$0) {
      return $$0 == equ.c || $$0 == equ.b;
   }

   @Override
   public int c(dem $$0) {
      return 1;
   }

   @Override
   public int a(dem $$0) {
      return 5;
   }

   @Override
   public boolean a(eqt $$0, ddo $$1, jf $$2, eqs $$3, jk $$4) {
      return $$4 == jk.a && !$$3.a(axb.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awf> j() {
      return Optional.of(awg.di);
   }

   public static class a extends eqz {
      @Override
      protected void a(dut.a<eqs, eqt> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eqt $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eqt $$0) {
         return false;
      }
   }

   public static class b extends eqz {
      @Override
      public int d(eqt $$0) {
         return 8;
      }

      @Override
      public boolean c(eqt $$0) {
         return true;
      }
   }
}
