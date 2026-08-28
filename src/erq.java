import java.util.Optional;
import javax.annotation.Nullable;

public abstract class erq extends eri {
   @Override
   public erj d() {
      return erl.b;
   }

   @Override
   public erj e() {
      return erl.c;
   }

   @Override
   public cvx a() {
      return cwf.qA;
   }

   @Override
   public void a(dfb $$0, jh $$1, erk $$2, azs $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awl.Cg, awm.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lr.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lp h() {
      return lr.l;
   }

   @Override
   protected boolean a(dfb $$0) {
      return $$0.ac().b(dex.U);
   }

   @Override
   protected void a(dfc $$0, jh $$1, dvj $$2) {
      dsm $$3 = $$2.x() ? $$0.c_($$1) : null;
      die.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dfe $$0) {
      return 4;
   }

   @Override
   public dvj b(erk $$0) {
      return dig.G.m().b(dmt.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(erj $$0) {
      return $$0 == erl.c || $$0 == erl.b;
   }

   @Override
   public int c(dfe $$0) {
      return 1;
   }

   @Override
   public int a(dfe $$0) {
      return 5;
   }

   @Override
   public boolean a(erk $$0, deg $$1, jh $$2, erj $$3, jm $$4) {
      return $$4 == jm.a && !$$3.a(axg.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awk> j() {
      return Optional.of(awl.di);
   }

   public static class a extends erq {
      @Override
      protected void a(dvk.a<erj, erk> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(erk $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(erk $$0) {
         return false;
      }
   }

   public static class b extends erq {
      @Override
      public int d(erk $$0) {
         return 8;
      }

      @Override
      public boolean c(erk $$0) {
         return true;
      }
   }
}
