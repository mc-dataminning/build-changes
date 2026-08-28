import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eoa extends ens {
   @Override
   public ent d() {
      return env.b;
   }

   @Override
   public ent e() {
      return env.c;
   }

   @Override
   public cuj a() {
      return cur.qz;
   }

   @Override
   public void a(dbx $$0, iz $$1, enu $$2, azg $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avz.BY, awa.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
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
   protected boolean a(dbx $$0) {
      return $$0.ab().b(dbt.U);
   }

   @Override
   protected void a(dby $$0, iz $$1, dsb $$2) {
      dpg $$3 = $$2.t() ? $$0.c_($$1) : null;
      dey.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dca $$0) {
      return 4;
   }

   @Override
   public dsb b(enu $$0) {
      return dfa.G.o().a(djo.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ent $$0) {
      return $$0 == env.c || $$0 == env.b;
   }

   @Override
   public int c(dca $$0) {
      return 1;
   }

   @Override
   public int a(dca $$0) {
      return 5;
   }

   @Override
   public boolean a(enu $$0, dbd $$1, iz $$2, ent $$3, je $$4) {
      return $$4 == je.a && !$$3.a(awu.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avy> j() {
      return Optional.of(avz.di);
   }

   public static class a extends eoa {
      @Override
      protected void a(dsc.a<ent, enu> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(enu $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(enu $$0) {
         return false;
      }
   }

   public static class b extends eoa {
      @Override
      public int d(enu $$0) {
         return 8;
      }

      @Override
      public boolean c(enu $$0) {
         return true;
      }
   }
}
