import java.util.Collection;
import javax.annotation.Nullable;

public interface dmn {
   dmn s_ = new dmn() {
      @Override
      public boolean a(dcv $$0, jd $$1, dta $$2, @Nullable Collection<ji> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dmt)dfy.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eoz.c) ? false : dmt.a($$0, $$1, $$2, $$3);
         } else {
            return dmn.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dms.a $$0, dcv $$1, jd $$2, ayv $$3, dms $$4, boolean $$5) {
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

   default void a(dcv $$0, dta $$1, jd $$2, ayv $$3) {
   }

   default boolean a(dcv $$0, jd $$1, ayv $$2) {
      return false;
   }

   default boolean a(dcv $$0, jd $$1, dta $$2, @Nullable Collection<ji> $$3, boolean $$4) {
      return ((dkw)dfy.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dms.a var1, dcv var2, jd var3, ayv var4, dms var5, boolean var6);
}
