import java.util.Collection;
import javax.annotation.Nullable;

public interface czl {
   czl t_ = new czl() {
      @Override
      public boolean a(cpw $$0, gw $$1, dfj $$2, @Nullable Collection<hc> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((czr)csw.qG).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(ean.c) ? false : czr.a($$0, $$1, $$2, $$3);
         } else {
            return czl.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(czq.a $$0, cpw $$1, gw $$2, asc $$3, czq $$4, boolean $$5) {
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

   default void a(cpw $$0, dfj $$1, gw $$2, asc $$3) {
   }

   default boolean a(cpw $$0, gw $$1, asc $$2) {
      return false;
   }

   default boolean a(cpw $$0, gw $$1, dfj $$2, @Nullable Collection<hc> $$3, boolean $$4) {
      return ((cxt)csw.qG).b().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean c() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(czq.a var1, cpw var2, gw var3, asc var4, czq var5, boolean var6);
}
