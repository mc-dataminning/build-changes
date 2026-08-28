import java.util.Collection;
import javax.annotation.Nullable;

public interface doa {
   doa w_ = new doa() {
      @Override
      public boolean a(deh $$0, je $$1, duo $$2, @Nullable Collection<jj> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dog)dhl.qT).l().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(eqq.c) ? false : dog.a($$0, $$1, $$2, $$3);
         } else {
            return doa.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dof.a $$0, deh $$1, je $$2, azl $$3, dof $$4, boolean $$5) {
         return $$0.c() > 0 ? $$0.b() : 0;
      }

      @Override
      public int j_(int $$0) {
         return Math.max($$0 - 1, 0);
      }
   };

   default byte b() {
      return 1;
   }

   default void a(deh $$0, duo $$1, je $$2, azl $$3) {
   }

   default boolean a(deh $$0, je $$1, azl $$2) {
      return false;
   }

   default boolean a(deh $$0, je $$1, duo $$2, @Nullable Collection<jj> $$3, boolean $$4) {
      return ((dmj)dhl.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dof.a var1, deh var2, je var3, azl var4, dof var5, boolean var6);
}
