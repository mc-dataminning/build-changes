import java.util.Collection;
import javax.annotation.Nullable;

public interface dfh {
   dfh v_ = new dfh() {
      @Override
      public boolean a(cvs $$0, hz $$1, dlj $$2, @Nullable Collection<ie> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dfn)cyu.qT).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(egx.c) ? false : dfn.a($$0, $$1, $$2, $$3);
         } else {
            return dfh.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dfm.a $$0, cvs $$1, hz $$2, awp $$3, dfm $$4, boolean $$5) {
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

   default void a(cvs $$0, dlj $$1, hz $$2, awp $$3) {
   }

   default boolean a(cvs $$0, hz $$1, awp $$2) {
      return false;
   }

   default boolean a(cvs $$0, hz $$1, dlj $$2, @Nullable Collection<ie> $$3, boolean $$4) {
      return ((ddr)cyu.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dfm.a var1, cvs var2, hz var3, awp var4, dfm var5, boolean var6);
}
