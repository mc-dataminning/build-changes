import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eky extends ekq {
   @Override
   public ekr d() {
      return ekt.b;
   }

   @Override
   public ekr e() {
      return ekt.c;
   }

   @Override
   public cre a() {
      return crm.qy;
   }

   @Override
   public void a(cyx $$0, ib $$1, eks $$2, axr $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aum.BF, aun.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(kl.aj, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public kj h() {
      return kl.m;
   }

   @Override
   protected boolean a(cyx $$0) {
      return $$0.aa().b(cyt.U);
   }

   @Override
   protected void a(cyy $$0, ib $$1, doz $$2) {
      dmf $$3 = $$2.t() ? $$0.c_($$1) : null;
      dby.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cza $$0) {
      return 4;
   }

   @Override
   public doz b(eks $$0) {
      return dca.G.n().a(dgn.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ekr $$0) {
      return $$0 == ekt.c || $$0 == ekt.b;
   }

   @Override
   public int c(cza $$0) {
      return 1;
   }

   @Override
   public int a(cza $$0) {
      return 5;
   }

   @Override
   public boolean a(eks $$0, cyd $$1, ib $$2, ekr $$3, ih $$4) {
      return $$4 == ih.a && !$$3.a(avh.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<aul> j() {
      return Optional.of(aum.di);
   }

   public static class a extends eky {
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

   public static class b extends eky {
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
