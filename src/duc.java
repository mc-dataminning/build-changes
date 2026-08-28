import java.util.Collection;
import javax.annotation.Nullable;

public interface duc {
   duc s_ = new duc() {
      @Override
      public boolean a(dka $$0, iw $$1, ebg $$2, @Nullable Collection<jc> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dui)dng.rB).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(exr.c) ? false : dui.a($$0, $$1, $$2, $$3);
         } else {
            return duc.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(duh.a $$0, dka $$1, iw $$2, azz $$3, duh $$4, boolean $$5) {
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

   default void a(dka $$0, ebg $$1, iw $$2, azz $$3) {
   }

   default boolean a(dka $$0, iw $$1, azz $$2) {
      return false;
   }

   default boolean a(dka $$0, iw $$1, ebg $$2, @Nullable Collection<jc> $$3, boolean $$4) {
      return ((dsl)dng.rB).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(duh.a var1, dka var2, iw var3, azz var4, duh var5, boolean var6);
}
