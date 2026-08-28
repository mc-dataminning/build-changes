import java.util.Collection;
import javax.annotation.Nullable;

public interface dlq {
   dlq s_ = new dlq() {
      @Override
      public boolean a(dca $$0, iz $$1, dsd $$2, @Nullable Collection<je> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dlw)dfc.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(enx.c) ? false : dlw.a($$0, $$1, $$2, $$3);
         } else {
            return dlq.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dlv.a $$0, dca $$1, iz $$2, azh $$3, dlv $$4, boolean $$5) {
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

   default void a(dca $$0, dsd $$1, iz $$2, azh $$3) {
   }

   default boolean a(dca $$0, iz $$1, azh $$2) {
      return false;
   }

   default boolean a(dca $$0, iz $$1, dsd $$2, @Nullable Collection<je> $$3, boolean $$4) {
      return ((dka)dfc.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dlv.a var1, dca var2, iz var3, azh var4, dlv var5, boolean var6);
}
