import java.util.Collection;
import javax.annotation.Nullable;

public interface dln {
   dln s_ = new dln() {
      @Override
      public boolean a(dbx $$0, iz $$1, dsa $$2, @Nullable Collection<je> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dlt)dez.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(enu.c) ? false : dlt.a($$0, $$1, $$2, $$3);
         } else {
            return dln.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dls.a $$0, dbx $$1, iz $$2, azf $$3, dls $$4, boolean $$5) {
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

   default void a(dbx $$0, dsa $$1, iz $$2, azf $$3) {
   }

   default boolean a(dbx $$0, iz $$1, azf $$2) {
      return false;
   }

   default boolean a(dbx $$0, iz $$1, dsa $$2, @Nullable Collection<je> $$3, boolean $$4) {
      return ((djx)dez.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dls.a var1, dbx var2, iz var3, azf var4, dls var5, boolean var6);
}
