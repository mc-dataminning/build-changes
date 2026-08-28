import java.util.Optional;
import javax.annotation.Nullable;

public abstract class euc extends etu {
   @Override
   public etv d() {
      return etx.b;
   }

   @Override
   public etv e() {
      return etx.c;
   }

   @Override
   public cxk a() {
      return cxs.qX;
   }

   @Override
   public void a(dhh $$0, jh $$1, etw $$2, bam $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, axf.CB, axg.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(ls.am, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lq h() {
      return ls.l;
   }

   @Override
   protected boolean a(ash $$0) {
      return $$0.N().b(dhd.V);
   }

   @Override
   protected void a(dhi $$0, jh $$1, dxu $$2) {
      duw $$3 = $$2.x() ? $$0.c_($$1) : null;
      dkl.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dhk $$0) {
      return 4;
   }

   @Override
   public dxu b(etw $$0) {
      return dkn.J.m().b(dpd.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(etv $$0) {
      return $$0 == etx.c || $$0 == etx.b;
   }

   @Override
   public int c(dhk $$0) {
      return 1;
   }

   @Override
   public int a(dhk $$0) {
      return 5;
   }

   @Override
   public boolean a(etw $$0, dgm $$1, jh $$2, etv $$3, jm $$4) {
      return $$4 == jm.a && !$$3.a(aya.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<axe> j() {
      return Optional.of(axf.dj);
   }

   public static class a extends euc {
      @Override
      protected void a(dxv.a<etv, etw> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(etw $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(etw $$0) {
         return false;
      }
   }

   public static class b extends euc {
      @Override
      public int d(etw $$0) {
         return 8;
      }

      @Override
      public boolean c(etw $$0) {
         return true;
      }
   }
}
