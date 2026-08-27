import java.util.Collection;
import javax.annotation.Nullable;

public interface czg {
   czg t_ = new czg() {
      @Override
      public boolean a(cpr $$0, gw $$1, dfe $$2, @Nullable Collection<hc> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((czm)csr.qG).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eai.c) ? false : czm.a($$0, $$1, $$2, $$3);
         } else {
            return czg.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(czl.a $$0, cpr $$1, gw $$2, arx $$3, czl $$4, boolean $$5) {
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

   default void a(cpr $$0, dfe $$1, gw $$2, arx $$3) {
   }

   default boolean a(cpr $$0, gw $$1, arx $$2) {
      return false;
   }

   default boolean a(cpr $$0, gw $$1, dfe $$2, @Nullable Collection<hc> $$3, boolean $$4) {
      return ((cxo)csr.qG).b().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean c() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(czl.a var1, cpr var2, gw var3, arx var4, czl var5, boolean var6);
}
