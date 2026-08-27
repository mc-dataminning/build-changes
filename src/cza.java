import java.util.Collection;
import javax.annotation.Nullable;

public interface cza {
   cza t_ = new cza() {
      @Override
      public boolean a(cpl $$0, gv $$1, dey $$2, @Nullable Collection<hb> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((czg)csl.qG).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eac.c) ? false : czg.a($$0, $$1, $$2, $$3);
         } else {
            return cza.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(czf.a $$0, cpl $$1, gv $$2, art $$3, czf $$4, boolean $$5) {
         return $$0.c() > 0 ? $$0.b() : 0;
      }

      @Override
      public int i_(int $$0) {
         return Math.max($$0 - 1, 0);
      }
   };

   default byte a() {
      return 1;
   }

   default void a(cpl $$0, dey $$1, gv $$2, art $$3) {
   }

   default boolean a(cpl $$0, gv $$1, art $$2) {
      return false;
   }

   default boolean a(cpl $$0, gv $$1, dey $$2, @Nullable Collection<hb> $$3, boolean $$4) {
      return ((cxi)csl.qG).b().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean c() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(czf.a var1, cpl var2, gv var3, art var4, czf var5, boolean var6);
}
