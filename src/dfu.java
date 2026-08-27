import java.util.Collection;
import javax.annotation.Nullable;

public interface dfu {
   dfu s_ = new dfu() {
      @Override
      public boolean a(cwf $$0, ib $$1, dme $$2, @Nullable Collection<ih> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dga)czh.qT).i().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(ehs.c) ? false : dga.a($$0, $$1, $$2, $$3);
         } else {
            return dfu.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dfz.a $$0, cwf $$1, ib $$2, awt $$3, dfz $$4, boolean $$5) {
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

   default void a(cwf $$0, dme $$1, ib $$2, awt $$3) {
   }

   default boolean a(cwf $$0, ib $$1, awt $$2) {
      return false;
   }

   default boolean a(cwf $$0, ib $$1, dme $$2, @Nullable Collection<ih> $$3, boolean $$4) {
      return ((dee)czh.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dfz.a var1, cwf var2, ib var3, awt var4, dfz var5, boolean var6);
}
