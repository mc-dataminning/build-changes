import java.util.Collection;
import javax.annotation.Nullable;

public interface dbu {
   dbu t_ = new dbu() {
      @Override
      public boolean a(csg $$0, hx $$1, dhn $$2, @Nullable Collection<ib> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dca)cvh.qT).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(ecy.c) ? false : dca.a($$0, $$1, $$2, $$3);
         } else {
            return dbu.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dbz.a $$0, csg $$1, hx $$2, atw $$3, dbz $$4, boolean $$5) {
         return $$0.c() > 0 ? $$0.b() : 0;
      }

      @Override
      public int i_(int $$0) {
         return Math.max($$0 - 1, 0);
      }
   };

   default byte b() {
      return 1;
   }

   default void a(csg $$0, dhn $$1, hx $$2, atw $$3) {
   }

   default boolean a(csg $$0, hx $$1, atw $$2) {
      return false;
   }

   default boolean a(csg $$0, hx $$1, dhn $$2, @Nullable Collection<ib> $$3, boolean $$4) {
      return ((dae)cvh.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dbz.a var1, csg var2, hx var3, atw var4, dbz var5, boolean var6);
}
