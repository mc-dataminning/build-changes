import java.util.Collection;
import javax.annotation.Nullable;

public interface doo {
   doo w_ = new doo() {
      @Override
      public boolean a(dew $$0, jg $$1, dvd $$2, @Nullable Collection<jl> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dou)dia.qT).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(erf.c) ? false : dou.a($$0, $$1, $$2, $$3);
         } else {
            return doo.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dot.a $$0, dew $$1, jg $$2, azr $$3, dot $$4, boolean $$5) {
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

   default void a(dew $$0, dvd $$1, jg $$2, azr $$3) {
   }

   default boolean a(dew $$0, jg $$1, azr $$2) {
      return false;
   }

   default boolean a(dew $$0, jg $$1, dvd $$2, @Nullable Collection<jl> $$3, boolean $$4) {
      return ((dmx)dia.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dot.a var1, dew var2, jg var3, azr var4, dot var5, boolean var6);
}
