import java.util.Collection;
import javax.annotation.Nullable;

public interface dlk {
   dlk s_ = new dlk() {
      @Override
      public boolean a(dbu $$0, iz $$1, drx $$2, @Nullable Collection<je> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dlq)dew.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(enr.c) ? false : dlq.a($$0, $$1, $$2, $$3);
         } else {
            return dlk.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dlp.a $$0, dbu $$1, iz $$2, azc $$3, dlp $$4, boolean $$5) {
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

   default void a(dbu $$0, drx $$1, iz $$2, azc $$3) {
   }

   default boolean a(dbu $$0, iz $$1, azc $$2) {
      return false;
   }

   default boolean a(dbu $$0, iz $$1, drx $$2, @Nullable Collection<je> $$3, boolean $$4) {
      return ((dju)dew.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dlp.a var1, dbu var2, iz var3, azc var4, dlp var5, boolean var6);
}
