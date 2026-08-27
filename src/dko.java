import java.util.Collection;
import javax.annotation.Nullable;

public interface dko {
   dko s_ = new dko() {
      @Override
      public boolean a(day $$0, io $$1, drb $$2, @Nullable Collection<it> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dku)dea.qT).l().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(emv.c) ? false : dku.a($$0, $$1, $$2, $$3);
         } else {
            return dko.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dkt.a $$0, day $$1, io $$2, ayk $$3, dkt $$4, boolean $$5) {
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

   default void a(day $$0, drb $$1, io $$2, ayk $$3) {
   }

   default boolean a(day $$0, io $$1, ayk $$2) {
      return false;
   }

   default boolean a(day $$0, io $$1, drb $$2, @Nullable Collection<it> $$3, boolean $$4) {
      return ((diy)dea.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dkt.a var1, day var2, io var3, ayk var4, dkt var5, boolean var6);
}
