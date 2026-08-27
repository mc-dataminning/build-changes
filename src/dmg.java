import java.util.Collection;
import javax.annotation.Nullable;

public interface dmg {
   dmg s_ = new dmg() {
      @Override
      public boolean a(dcb $$0, ir $$1, dtc $$2, @Nullable Collection<iw> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dmm)dfe.se).k().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(epf.c) ? false : dmm.a($$0, $$1, $$2, $$3);
         } else {
            return dmg.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dml.a $$0, dcb $$1, ir $$2, ayt $$3, dml $$4, boolean $$5) {
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

   default void a(dcb $$0, dtc $$1, ir $$2, ayt $$3) {
   }

   default boolean a(dcb $$0, ir $$1, ayt $$2) {
      return false;
   }

   default boolean a(dcb $$0, ir $$1, dtc $$2, @Nullable Collection<iw> $$3, boolean $$4) {
      return ((dkh)dfe.se).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dml.a var1, dcb var2, ir var3, ayt var4, dml var5, boolean var6);
}
