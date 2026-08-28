import java.util.Optional;
import javax.annotation.Nullable;

public abstract class erk extends erc {
   @Override
   public erd d() {
      return erf.b;
   }

   @Override
   public erd e() {
      return erf.c;
   }

   @Override
   public cvt a() {
      return cwb.qA;
   }

   @Override
   public void a(dev $$0, jg $$1, ere $$2, azr $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awk.Cg, awl.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lq.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lo h() {
      return lq.l;
   }

   @Override
   protected boolean a(dev $$0) {
      return $$0.ac().b(der.U);
   }

   @Override
   protected void a(dew $$0, jg $$1, dvd $$2) {
      dsg $$3 = $$2.x() ? $$0.c_($$1) : null;
      dhy.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dey $$0) {
      return 4;
   }

   @Override
   public dvd b(ere $$0) {
      return dia.G.m().b(dmn.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(erd $$0) {
      return $$0 == erf.c || $$0 == erf.b;
   }

   @Override
   public int c(dey $$0) {
      return 1;
   }

   @Override
   public int a(dey $$0) {
      return 5;
   }

   @Override
   public boolean a(ere $$0, dea $$1, jg $$2, erd $$3, jl $$4) {
      return $$4 == jl.a && !$$3.a(axf.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awj> j() {
      return Optional.of(awk.di);
   }

   public static class a extends erk {
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

   public static class b extends erk {
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
