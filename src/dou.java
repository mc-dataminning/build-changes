import java.util.Collection;
import javax.annotation.Nullable;

public interface dou {
   dou w_ = new dou() {
      @Override
      public boolean a(dfc $$0, jh $$1, dvj $$2, @Nullable Collection<jm> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dpa)dig.qT).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(erl.c) ? false : dpa.a($$0, $$1, $$2, $$3);
         } else {
            return dou.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(doz.a $$0, dfc $$1, jh $$2, azs $$3, doz $$4, boolean $$5) {
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

   default void a(dfc $$0, dvj $$1, jh $$2, azs $$3) {
   }

   default boolean a(dfc $$0, jh $$1, azs $$2) {
      return false;
   }

   default boolean a(dfc $$0, jh $$1, dvj $$2, @Nullable Collection<jm> $$3, boolean $$4) {
      return ((dnd)dig.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(doz.a var1, dfc var2, jh var3, azs var4, doz var5, boolean var6);
}
