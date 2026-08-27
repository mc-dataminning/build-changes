import java.util.Collection;
import javax.annotation.Nullable;

public interface dfd {
   dfd v_ = new dfd() {
      @Override
      public boolean a(cvo $$0, hz $$1, dlf $$2, @Nullable Collection<ie> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dfj)cyq.qT).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(egq.c) ? false : dfj.a($$0, $$1, $$2, $$3);
         } else {
            return dfd.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dfi.a $$0, cvo $$1, hz $$2, awo $$3, dfi $$4, boolean $$5) {
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

   default void a(cvo $$0, dlf $$1, hz $$2, awo $$3) {
   }

   default boolean a(cvo $$0, hz $$1, awo $$2) {
      return false;
   }

   default boolean a(cvo $$0, hz $$1, dlf $$2, @Nullable Collection<ie> $$3, boolean $$4) {
      return ((ddn)cyq.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dfi.a var1, cvo var2, hz var3, awo var4, dfi var5, boolean var6);
}
