import java.util.Collection;
import javax.annotation.Nullable;

public interface dqg {
   dqg u_ = new dqg() {
      @Override
      public boolean a(dgi $$0, ji $$1, dww $$2, @Nullable Collection<jn> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dqm)djn.rv).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(esz.c) ? false : dqm.a($$0, $$1, $$2, $$3);
         } else {
            return dqg.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dql.a $$0, dgi $$1, ji $$2, azh $$3, dql $$4, boolean $$5) {
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

   default void a(dgi $$0, dww $$1, ji $$2, azh $$3) {
   }

   default boolean a(dgi $$0, ji $$1, azh $$2) {
      return false;
   }

   default boolean a(dgi $$0, ji $$1, dww $$2, @Nullable Collection<jn> $$3, boolean $$4) {
      return ((doo)djn.rv).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dql.a var1, dgi var2, ji var3, azh var4, dql var5, boolean var6);
}
