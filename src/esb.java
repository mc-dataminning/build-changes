import java.util.Optional;
import javax.annotation.Nullable;

public abstract class esb extends ert {
   @Override
   public eru d() {
      return erw.b;
   }

   @Override
   public eru e() {
      return erw.c;
   }

   @Override
   public cwi a() {
      return cwq.qA;
   }

   @Override
   public void a(dfm $$0, jh $$1, erv $$2, azu $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awn.Cg, awo.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
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
   protected boolean a(arp $$0) {
      return $$0.N().b(dfi.U);
   }

   @Override
   protected void a(dfn $$0, jh $$1, dvv $$2) {
      dsy $$3 = $$2.x() ? $$0.c_($$1) : null;
      diq.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dfp $$0) {
      return 4;
   }

   @Override
   public dvv b(erv $$0) {
      return dis.G.m().b(dnf.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eru $$0) {
      return $$0 == erw.c || $$0 == erw.b;
   }

   @Override
   public int c(dfp $$0) {
      return 1;
   }

   @Override
   public int a(dfp $$0) {
      return 5;
   }

   @Override
   public boolean a(erv $$0, der $$1, jh $$2, eru $$3, jm $$4) {
      return $$4 == jm.a && !$$3.a(axi.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<awm> j() {
      return Optional.of(awn.di);
   }

   public static class a extends esb {
      @Override
      protected void a(dvw.a<eru, erv> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(erv $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(erv $$0) {
         return false;
      }
   }

   public static class b extends esb {
      @Override
      public int d(erv $$0) {
         return 8;
      }

      @Override
      public boolean c(erv $$0) {
         return true;
      }
   }
}
