import java.util.Optional;
import javax.annotation.Nullable;

public abstract class exw extends exo {
   @Override
   public exp d() {
      return exr.b;
   }

   @Override
   public exp e() {
      return exr.c;
   }

   @Override
   public czw a() {
      return dae.rp;
   }

   @Override
   public void a(djz $$0, iw $$1, exq $$2, azz $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awr.Dg, aws.i, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(lz.ao, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lx h() {
      return lz.l;
   }

   @Override
   protected boolean a(aru $$0) {
      return $$0.O().c(djv.W);
   }

   @Override
   protected void a(dka $$0, iw $$1, ebg $$2) {
      dye $$3 = $$2.x() ? $$0.c_($$1) : null;
      dne.a($$2, $$0, $$1, $$3);
   }

   @Override
   protected void a(djz $$0, iw $$1, bwv $$2, bxo $$3) {
      $$3.a(bxp.d);
   }

   @Override
   public int b(dkc $$0) {
      return 4;
   }

   @Override
   public ebg b(exq $$0) {
      return dng.J.m().b(dsa.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(exp $$0) {
      return $$0 == exr.c || $$0 == exr.b;
   }

   @Override
   public int c(dkc $$0) {
      return 1;
   }

   @Override
   public int a(dkc $$0) {
      return 5;
   }

   @Override
   public boolean a(exq $$0, djd $$1, iw $$2, exp $$3, jc $$4) {
      return $$4 == jc.a && !$$3.a(axl.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awq> j() {
      return Optional.of(awr.dj);
   }

   public static class a extends exw {
      @Override
      protected void a(ebh.a<exp, exq> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(exq $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(exq $$0) {
         return false;
      }
   }

   public static class b extends exw {
      @Override
      public int d(exq $$0) {
         return 8;
      }

      @Override
      public boolean c(exq $$0) {
         return true;
      }
   }
}
