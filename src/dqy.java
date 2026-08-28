import java.util.Collection;
import javax.annotation.Nullable;

public interface dqy {
   dqy u_ = new dqy() {
      @Override
      public boolean a(dha $$0, jh $$1, dxo $$2, @Nullable Collection<jm> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dre)dkf.rv).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(etr.c) ? false : dre.a($$0, $$1, $$2, $$3);
         } else {
            return dqy.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(drd.a $$0, dha $$1, jh $$2, bac $$3, drd $$4, boolean $$5) {
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

   default void a(dha $$0, dxo $$1, jh $$2, bac $$3) {
   }

   default boolean a(dha $$0, jh $$1, bac $$2) {
      return false;
   }

   default boolean a(dha $$0, jh $$1, dxo $$2, @Nullable Collection<jm> $$3, boolean $$4) {
      return ((dpg)dkf.rv).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(drd.a var1, dha var2, jh var3, bac var4, drd var5, boolean var6);
}
