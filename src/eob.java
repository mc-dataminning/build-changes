import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eob extends ent {
   @Override
   public enu d() {
      return enw.b;
   }

   @Override
   public enu e() {
      return enw.c;
   }

   @Override
   public cuk a() {
      return cus.qz;
   }

   @Override
   public void a(dby $$0, iz $$1, env $$2, azh $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, awa.BY, awb.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(li.al, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public lg h() {
      return li.l;
   }

   @Override
   protected boolean a(dby $$0) {
      return $$0.ab().b(dbu.U);
   }

   @Override
   protected void a(dbz $$0, iz $$1, dsc $$2) {
      dph $$3 = $$2.t() ? $$0.c_($$1) : null;
      dez.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dcb $$0) {
      return 4;
   }

   @Override
   public dsc b(env $$0) {
      return dfb.G.o().a(djp.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(enu $$0) {
      return $$0 == enw.c || $$0 == enw.b;
   }

   @Override
   public int c(dcb $$0) {
      return 1;
   }

   @Override
   public int a(dcb $$0) {
      return 5;
   }

   @Override
   public boolean a(env $$0, dbe $$1, iz $$2, enu $$3, je $$4) {
      return $$4 == je.a && !$$3.a(awv.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avz> j() {
      return Optional.of(awa.di);
   }

   public static class a extends eob {
      @Override
      protected void a(dsd.a<enu, env> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(env $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(env $$0) {
         return false;
      }
   }

   public static class b extends eob {
      @Override
      public int d(env $$0) {
         return 8;
      }

      @Override
      public boolean c(env $$0) {
         return true;
      }
   }
}
