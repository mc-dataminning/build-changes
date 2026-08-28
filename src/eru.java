import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eru extends erm {
   @Override
   public ern d() {
      return erp.b;
   }

   @Override
   public ern e() {
      return erp.c;
   }

   @Override
   public cwb a() {
      return cwj.qA;
   }

   @Override
   public void a(dff $$0, jh $$1, ero $$2, azv $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awo.Cg, awp.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(ls.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lq h() {
      return ls.l;
   }

   @Override
   protected boolean a(dff $$0) {
      return $$0.ac().b(dfb.U);
   }

   @Override
   protected void a(dfg $$0, jh $$1, dvo $$2) {
      dsr $$3 = $$2.x() ? $$0.c_($$1) : null;
      dij.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dfi $$0) {
      return 4;
   }

   @Override
   public dvo b(ero $$0) {
      return dil.G.m().b(dmy.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ern $$0) {
      return $$0 == erp.c || $$0 == erp.b;
   }

   @Override
   public int c(dfi $$0) {
      return 1;
   }

   @Override
   public int a(dfi $$0) {
      return 5;
   }

   @Override
   public boolean a(ero $$0, dek $$1, jh $$2, ern $$3, jm $$4) {
      return $$4 == jm.a && !$$3.a(axj.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awn> j() {
      return Optional.of(awo.di);
   }

   public static class a extends eru {
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

   public static class b extends eru {
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
