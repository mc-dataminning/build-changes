import java.util.Optional;
import javax.annotation.Nullable;

public abstract class enz extends enr {
   @Override
   public ens d() {
      return enu.b;
   }

   @Override
   public ens e() {
      return enu.c;
   }

   @Override
   public cui a() {
      return cuq.qz;
   }

   @Override
   public void a(dbw $$0, iz $$1, ent $$2, azf $$3) {
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
   protected boolean a(dbw $$0) {
      return $$0.ab().b(dbs.U);
   }

   @Override
   protected void a(dbx $$0, iz $$1, dsa $$2) {
      dpf $$3 = $$2.t() ? $$0.c_($$1) : null;
      dex.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(dbz $$0) {
      return 4;
   }

   @Override
   public dsa b(ent $$0) {
      return dez.G.o().a(djn.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ens $$0) {
      return $$0 == enu.c || $$0 == enu.b;
   }

   @Override
   public int c(dbz $$0) {
      return 1;
   }

   @Override
   public int a(dbz $$0) {
      return 5;
   }

   @Override
   public boolean a(ent $$0, dbc $$1, iz $$2, ens $$3, je $$4) {
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

   public static class a extends enz {
      @Override
      protected void a(dsb.a<ens, ent> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ent $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ent $$0) {
         return false;
      }
   }

   public static class b extends enz {
      @Override
      public int d(ent $$0) {
         return 8;
      }

      @Override
      public boolean c(ent $$0) {
         return true;
      }
   }
}
