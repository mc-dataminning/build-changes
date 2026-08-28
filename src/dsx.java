import java.util.Collection;
import javax.annotation.Nullable;

public interface dsx {
   dsx u_ = new dsx() {
      @Override
      public boolean a(diw $$0, iu $$1, dzz $$2, @Nullable Collection<ja> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dtd)dmc.ry).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(ewh.c) ? false : dtd.a($$0, $$1, $$2, $$3);
         } else {
            return dsx.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dtc.a $$0, diw $$1, iu $$2, azv $$3, dtc $$4, boolean $$5) {
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

   default void a(diw $$0, dzz $$1, iu $$2, azv $$3) {
   }

   default boolean a(diw $$0, iu $$1, azv $$2) {
      return false;
   }

   default boolean a(diw $$0, iu $$1, dzz $$2, @Nullable Collection<ja> $$3, boolean $$4) {
      return ((drg)dmc.ry).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dtc.a var1, diw var2, iu var3, azv var4, dtc var5, boolean var6);
}
