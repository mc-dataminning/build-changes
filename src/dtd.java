import java.util.Collection;
import javax.annotation.Nullable;

public interface dtd {
   dtd u_ = new dtd() {
      @Override
      public boolean a(djb $$0, iu $$1, eah $$2, @Nullable Collection<ja> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dtj)dmh.rB).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(ewp.c) ? false : dtj.a($$0, $$1, $$2, $$3);
         } else {
            return dtd.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dti.a $$0, djb $$1, iu $$2, azv $$3, dti $$4, boolean $$5) {
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

   default void a(djb $$0, eah $$1, iu $$2, azv $$3) {
   }

   default boolean a(djb $$0, iu $$1, azv $$2) {
      return false;
   }

   default boolean a(djb $$0, iu $$1, eah $$2, @Nullable Collection<ja> $$3, boolean $$4) {
      return ((drm)dmh.rB).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dti.a var1, djb var2, iu var3, azv var4, dti var5, boolean var6);
}
