import java.util.Collection;
import javax.annotation.Nullable;

public interface dly {
   dly s_ = new dly() {
      @Override
      public boolean a(dch $$0, ja $$1, dsl $$2, @Nullable Collection<jf> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dme)dfk.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eok.c) ? false : dme.a($$0, $$1, $$2, $$3);
         } else {
            return dly.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dmd.a $$0, dch $$1, ja $$2, ayo $$3, dmd $$4, boolean $$5) {
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

   default void a(dch $$0, dsl $$1, ja $$2, ayo $$3) {
   }

   default boolean a(dch $$0, ja $$1, ayo $$2) {
      return false;
   }

   default boolean a(dch $$0, ja $$1, dsl $$2, @Nullable Collection<jf> $$3, boolean $$4) {
      return ((dki)dfk.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dmd.a var1, dch var2, ja var3, ayo var4, dmd var5, boolean var6);
}
