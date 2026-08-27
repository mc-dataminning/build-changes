import java.util.Collection;
import javax.annotation.Nullable;

public interface din {
   din s_ = new din() {
      @Override
      public boolean a(cyy $$0, ib $$1, doz $$2, @Nullable Collection<ih> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dit)dca.qT).k().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(ekt.c) ? false : dit.a($$0, $$1, $$2, $$3);
         } else {
            return din.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dis.a $$0, cyy $$1, ib $$2, axr $$3, dis $$4, boolean $$5) {
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

   default void a(cyy $$0, doz $$1, ib $$2, axr $$3) {
   }

   default boolean a(cyy $$0, ib $$1, axr $$2) {
      return false;
   }

   default boolean a(cyy $$0, ib $$1, doz $$2, @Nullable Collection<ih> $$3, boolean $$4) {
      return ((dgx)dca.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dis.a var1, cyy var2, ib var3, axr var4, dis var5, boolean var6);
}
