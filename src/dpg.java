import java.util.Collection;
import javax.annotation.Nullable;

public interface dpg {
   dpg u_ = new dpg() {
      @Override
      public boolean a(dfn $$0, jh $$1, dvv $$2, @Nullable Collection<jm> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dpm)dis.qT).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(erw.c) ? false : dpm.a($$0, $$1, $$2, $$3);
         } else {
            return dpg.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dpl.a $$0, dfn $$1, jh $$2, azu $$3, dpl $$4, boolean $$5) {
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

   default void a(dfn $$0, dvv $$1, jh $$2, azu $$3) {
   }

   default boolean a(dfn $$0, jh $$1, azu $$2) {
      return false;
   }

   default boolean a(dfn $$0, jh $$1, dvv $$2, @Nullable Collection<jm> $$3, boolean $$4) {
      return ((dnp)dis.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dpl.a var1, dfn var2, jh var3, azu var4, dpl var5, boolean var6);
}
