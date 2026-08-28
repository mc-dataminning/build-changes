import java.util.Collection;
import javax.annotation.Nullable;

public interface dmp {
   dmp t_ = new dmp() {
      @Override
      public boolean a(dcx $$0, jd $$1, dtc $$2, @Nullable Collection<ji> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dmv)dga.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(epf.c) ? false : dmv.a($$0, $$1, $$2, $$3);
         } else {
            return dmp.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dmu.a $$0, dcx $$1, jd $$2, ayw $$3, dmu $$4, boolean $$5) {
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

   default void a(dcx $$0, dtc $$1, jd $$2, ayw $$3) {
   }

   default boolean a(dcx $$0, jd $$1, ayw $$2) {
      return false;
   }

   default boolean a(dcx $$0, jd $$1, dtc $$2, @Nullable Collection<ji> $$3, boolean $$4) {
      return ((dky)dga.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dmu.a var1, dcx var2, jd var3, ayw var4, dmu var5, boolean var6);
}
