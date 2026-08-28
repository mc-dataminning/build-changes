import java.util.Collection;
import javax.annotation.Nullable;

public interface doz {
   doz w_ = new doz() {
      @Override
      public boolean a(dfg $$0, jh $$1, dvo $$2, @Nullable Collection<jm> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dpf)dil.qT).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(erp.c) ? false : dpf.a($$0, $$1, $$2, $$3);
         } else {
            return doz.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dpe.a $$0, dfg $$1, jh $$2, azv $$3, dpe $$4, boolean $$5) {
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

   default void a(dfg $$0, dvo $$1, jh $$2, azv $$3) {
   }

   default boolean a(dfg $$0, jh $$1, azv $$2) {
      return false;
   }

   default boolean a(dfg $$0, jh $$1, dvo $$2, @Nullable Collection<jm> $$3, boolean $$4) {
      return ((dni)dil.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dpe.a var1, dfg var2, jh var3, azv var4, dpe var5, boolean var6);
}
