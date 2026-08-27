import java.util.Collection;
import javax.annotation.Nullable;

public interface djl {
   djl s_ = new djl() {
      @Override
      public boolean a(czv $$0, im $$1, dpy $$2, @Nullable Collection<ir> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((djr)dcx.qT).k().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(els.c) ? false : djr.a($$0, $$1, $$2, $$3);
         } else {
            return djl.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(djq.a $$0, czv $$1, im $$2, ayd $$3, djq $$4, boolean $$5) {
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

   default void a(czv $$0, dpy $$1, im $$2, ayd $$3) {
   }

   default boolean a(czv $$0, im $$1, ayd $$2) {
      return false;
   }

   default boolean a(czv $$0, im $$1, dpy $$2, @Nullable Collection<ir> $$3, boolean $$4) {
      return ((dhv)dcx.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(djq.a var1, czv var2, im var3, ayd var4, djq var5, boolean var6);
}
