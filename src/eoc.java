import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eoc extends enu {
   @Override
   public env d() {
      return enx.b;
   }

   @Override
   public env e() {
      return enx.c;
   }

   @Override
   public cul a() {
      return cut.qz;
   }

   @Override
   public void a(dbz $$0, iz $$1, enw $$2, azh $$3) {
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
   protected boolean a(dbz $$0) {
      return $$0.ab().b(dbv.U);
   }

   @Override
   protected void a(dca $$0, iz $$1, dsd $$2) {
      dpi $$3 = $$2.t() ? $$0.c_($$1) : null;
      dfa.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dcc $$0) {
      return 4;
   }

   @Override
   public dsd b(enw $$0) {
      return dfc.G.o().a(djq.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(env $$0) {
      return $$0 == enx.c || $$0 == enx.b;
   }

   @Override
   public int c(dcc $$0) {
      return 1;
   }

   @Override
   public int a(dcc $$0) {
      return 5;
   }

   @Override
   public boolean a(enw $$0, dbf $$1, iz $$2, env $$3, je $$4) {
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

   public static class a extends eoc {
      @Override
      protected void a(dse.a<env, enw> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(enw $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(enw $$0) {
         return false;
      }
   }

   public static class b extends eoc {
      @Override
      public int d(enw $$0) {
         return 8;
      }

      @Override
      public boolean c(enw $$0) {
         return true;
      }
   }
}
