import java.util.Collection;
import javax.annotation.Nullable;

public interface dlp {
   dlp s_ = new dlp() {
      @Override
      public boolean a(dbz $$0, iz $$1, dsc $$2, @Nullable Collection<je> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dlv)dfb.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(enw.c) ? false : dlv.a($$0, $$1, $$2, $$3);
         } else {
            return dlp.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dlu.a $$0, dbz $$1, iz $$2, azh $$3, dlu $$4, boolean $$5) {
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

   default void a(dbz $$0, dsc $$1, iz $$2, azh $$3) {
   }

   default boolean a(dbz $$0, iz $$1, azh $$2) {
      return false;
   }

   default boolean a(dbz $$0, iz $$1, dsc $$2, @Nullable Collection<je> $$3, boolean $$4) {
      return ((djz)dfb.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dlu.a var1, dbz var2, iz var3, azh var4, dlu var5, boolean var6);
}
