import java.util.Collection;
import javax.annotation.Nullable;

public interface dgr {
   dgr s_ = new dgr() {
      @Override
      public boolean a(cxc $$0, ib $$1, dnb $$2, @Nullable Collection<ih> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dgx)dae.qT).i().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eiq.c) ? false : dgx.a($$0, $$1, $$2, $$3);
         } else {
            return dgr.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dgw.a $$0, cxc $$1, ib $$2, axd $$3, dgw $$4, boolean $$5) {
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

   default void a(cxc $$0, dnb $$1, ib $$2, axd $$3) {
   }

   default boolean a(cxc $$0, ib $$1, axd $$2) {
      return false;
   }

   default boolean a(cxc $$0, ib $$1, dnb $$2, @Nullable Collection<ih> $$3, boolean $$4) {
      return ((dfb)dae.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dgw.a var1, cxc var2, ib var3, axd var4, dgw var5, boolean var6);
}
