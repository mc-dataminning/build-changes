import java.util.Collection;
import javax.annotation.Nullable;

public interface dqh {
   dqh u_ = new dqh() {
      @Override
      public boolean a(dgj $$0, ji $$1, dwx $$2, @Nullable Collection<jn> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dqn)djo.rv).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(eta.c) ? false : dqn.a($$0, $$1, $$2, $$3);
         } else {
            return dqh.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dqm.a $$0, dgj $$1, ji $$2, azh $$3, dqm $$4, boolean $$5) {
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

   default void a(dgj $$0, dwx $$1, ji $$2, azh $$3) {
   }

   default boolean a(dgj $$0, ji $$1, azh $$2) {
      return false;
   }

   default boolean a(dgj $$0, ji $$1, dwx $$2, @Nullable Collection<jn> $$3, boolean $$4) {
      return ((dop)djo.rv).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dqm.a var1, dgj var2, ji var3, azh var4, dqm var5, boolean var6);
}
