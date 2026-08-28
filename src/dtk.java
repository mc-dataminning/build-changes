import java.util.Collection;
import javax.annotation.Nullable;

public interface dtk {
   dtk u_ = new dtk() {
      @Override
      public boolean a(dji $$0, iv $$1, eao $$2, @Nullable Collection<jb> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dtq)dmo.rB).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(eww.c) ? false : dtq.a($$0, $$1, $$2, $$3);
         } else {
            return dtk.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dtp.a $$0, dji $$1, iv $$2, azv $$3, dtp $$4, boolean $$5) {
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

   default void a(dji $$0, eao $$1, iv $$2, azv $$3) {
   }

   default boolean a(dji $$0, iv $$1, azv $$2) {
      return false;
   }

   default boolean a(dji $$0, iv $$1, eao $$2, @Nullable Collection<jb> $$3, boolean $$4) {
      return ((drt)dmo.rB).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dtp.a var1, dji var2, iv var3, azv var4, dtp var5, boolean var6);
}
