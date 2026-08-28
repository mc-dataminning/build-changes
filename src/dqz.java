import java.util.Collection;
import javax.annotation.Nullable;

public interface dqz {
   dqz u_ = new dqz() {
      @Override
      public boolean a(dha $$0, ji $$1, dxq $$2, @Nullable Collection<jn> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((drf)dkg.rv).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(etx.c) ? false : drf.a($$0, $$1, $$2, $$3);
         } else {
            return dqz.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dre.a $$0, dha $$1, ji $$2, azh $$3, dre $$4, boolean $$5) {
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

   default void a(dha $$0, dxq $$1, ji $$2, azh $$3) {
   }

   default boolean a(dha $$0, ji $$1, azh $$2) {
      return false;
   }

   default boolean a(dha $$0, ji $$1, dxq $$2, @Nullable Collection<jn> $$3, boolean $$4) {
      return ((dpj)dkg.rv).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dre.a var1, dha var2, ji var3, azh var4, dre var5, boolean var6);
}
