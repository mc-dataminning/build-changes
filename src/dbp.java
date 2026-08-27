import java.util.Collection;
import javax.annotation.Nullable;

public interface dbp {
   dbp t_ = new dbp() {
      @Override
      public boolean a(csb $$0, ht $$1, dhi $$2, @Nullable Collection<hx> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dbv)cvc.qT).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(ect.c) ? false : dbv.a($$0, $$1, $$2, $$3);
         } else {
            return dbp.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dbu.a $$0, csb $$1, ht $$2, ats $$3, dbu $$4, boolean $$5) {
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

   default void a(csb $$0, dhi $$1, ht $$2, ats $$3) {
   }

   default boolean a(csb $$0, ht $$1, ats $$2) {
      return false;
   }

   default boolean a(csb $$0, ht $$1, dhi $$2, @Nullable Collection<hx> $$3, boolean $$4) {
      return ((czz)cvc.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dbu.a var1, csb var2, ht var3, ats var4, dbu var5, boolean var6);
}
