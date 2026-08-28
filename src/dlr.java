import java.util.Collection;
import javax.annotation.Nullable;

public interface dlr {
   dlr s_ = new dlr() {
      @Override
      public boolean a(dcb $$0, iz $$1, dse $$2, @Nullable Collection<je> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dlx)dfd.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eny.c) ? false : dlx.a($$0, $$1, $$2, $$3);
         } else {
            return dlr.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dlw.a $$0, dcb $$1, iz $$2, azh $$3, dlw $$4, boolean $$5) {
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

   default void a(dcb $$0, dse $$1, iz $$2, azh $$3) {
   }

   default boolean a(dcb $$0, iz $$1, azh $$2) {
      return false;
   }

   default boolean a(dcb $$0, iz $$1, dse $$2, @Nullable Collection<je> $$3, boolean $$4) {
      return ((dkb)dfd.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dlw.a var1, dcb var2, iz var3, azh var4, dlw var5, boolean var6);
}
