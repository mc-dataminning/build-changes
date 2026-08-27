import java.util.Collection;
import javax.annotation.Nullable;

public interface dju {
   dju s_ = new dju() {
      @Override
      public boolean a(dae $$0, in $$1, dqh $$2, @Nullable Collection<is> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dka)ddg.qT).k().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(emb.c) ? false : dka.a($$0, $$1, $$2, $$3);
         } else {
            return dju.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(djz.a $$0, dae $$1, in $$2, ayg $$3, djz $$4, boolean $$5) {
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

   default void a(dae $$0, dqh $$1, in $$2, ayg $$3) {
   }

   default boolean a(dae $$0, in $$1, ayg $$2) {
      return false;
   }

   default boolean a(dae $$0, in $$1, dqh $$2, @Nullable Collection<is> $$3, boolean $$4) {
      return ((die)ddg.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(djz.a var1, dae var2, in var3, ayg var4, djz var5, boolean var6);
}
