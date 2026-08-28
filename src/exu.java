import java.util.Optional;
import javax.annotation.Nullable;

public abstract class exu extends exm {
   @Override
   public exn d() {
      return exp.b;
   }

   @Override
   public exn e() {
      return exp.c;
   }

   @Override
   public czu a() {
      return dac.rp;
   }

   @Override
   public void a(djx $$0, iv $$1, exo $$2, azx $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awp.Dg, awq.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(ly.ao, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lw h() {
      return ly.l;
   }

   @Override
   protected boolean a(ars $$0) {
      return $$0.O().c(djt.W);
   }

   @Override
   protected void a(djy $$0, iv $$1, ebe $$2) {
      dyc $$3 = $$2.x() ? $$0.c_($$1) : null;
      dnc.a($$2, $$0, $$1, $$3);
   }

   @Override
   protected void a(djx $$0, iv $$1, bwt $$2, bxm $$3) {
      $$3.a(bxn.d);
   }

   @Override
   public int b(dka $$0) {
      return 4;
   }

   @Override
   public ebe b(exo $$0) {
      return dne.J.m().b(dry.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(exn $$0) {
      return $$0 == exp.c || $$0 == exp.b;
   }

   @Override
   public int c(dka $$0) {
      return 1;
   }

   @Override
   public int a(dka $$0) {
      return 5;
   }

   @Override
   public boolean a(exo $$0, djb $$1, iv $$2, exn $$3, jb $$4) {
      return $$4 == jb.a && !$$3.a(axj.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awo> j() {
      return Optional.of(awp.dj);
   }

   public static class a extends exu {
      @Override
      protected void a(ebf.a<exn, exo> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(exo $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(exo $$0) {
         return false;
      }
   }

   public static class b extends exu {
      @Override
      public int d(exo $$0) {
         return 8;
      }

      @Override
      public boolean c(exo $$0) {
         return true;
      }
   }
}
