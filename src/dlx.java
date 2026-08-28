import java.util.Collection;
import javax.annotation.Nullable;

public interface dlx {
   dlx s_ = new dlx() {
      @Override
      public boolean a(dcg $$0, ja $$1, dsk $$2, @Nullable Collection<jf> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dmd)dfj.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eoi.c) ? false : dmd.a($$0, $$1, $$2, $$3);
         } else {
            return dlx.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dmc.a $$0, dcg $$1, ja $$2, ayo $$3, dmc $$4, boolean $$5) {
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

   default void a(dcg $$0, dsk $$1, ja $$2, ayo $$3) {
   }

   default boolean a(dcg $$0, ja $$1, ayo $$2) {
      return false;
   }

   default boolean a(dcg $$0, ja $$1, dsk $$2, @Nullable Collection<jf> $$3, boolean $$4) {
      return ((dkh)dfj.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dmc.a var1, dcg var2, ja var3, ayo var4, dmc var5, boolean var6);
}
