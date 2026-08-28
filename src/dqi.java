import java.util.Collection;
import javax.annotation.Nullable;

public interface dqi {
   dqi u_ = new dqi() {
      @Override
      public boolean a(dgk $$0, ji $$1, dwy $$2, @Nullable Collection<jn> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dqo)djp.rv).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(etb.c) ? false : dqo.a($$0, $$1, $$2, $$3);
         } else {
            return dqi.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dqn.a $$0, dgk $$1, ji $$2, azh $$3, dqn $$4, boolean $$5) {
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

   default void a(dgk $$0, dwy $$1, ji $$2, azh $$3) {
   }

   default boolean a(dgk $$0, ji $$1, azh $$2) {
      return false;
   }

   default boolean a(dgk $$0, ji $$1, dwy $$2, @Nullable Collection<jn> $$3, boolean $$4) {
      return ((doq)djp.rv).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dqn.a var1, dgk var2, ji var3, azh var4, dqn var5, boolean var6);
}
