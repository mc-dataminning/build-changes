import java.util.Collection;
import javax.annotation.Nullable;

public interface czq {
   czq t_ = new czq() {
      @Override
      public boolean a(cqc $$0, gw $$1, dfd $$2, @Nullable Collection<ha> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((czw)cte.qG).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eah.c) ? false : czw.a($$0, $$1, $$2, $$3);
         } else {
            return czq.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(czv.a $$0, cqc $$1, gw $$2, ash $$3, czv $$4, boolean $$5) {
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

   default void a(cqc $$0, dfd $$1, gw $$2, ash $$3) {
   }

   default boolean a(cqc $$0, gw $$1, ash $$2) {
      return false;
   }

   default boolean a(cqc $$0, gw $$1, dfd $$2, @Nullable Collection<ha> $$3, boolean $$4) {
      return ((cya)cte.qG).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(czv.a var1, cqc var2, gw var3, ash var4, czv var5, boolean var6);
}
