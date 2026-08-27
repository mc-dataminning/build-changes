import java.util.Collection;
import javax.annotation.Nullable;

public interface ddf {
   ddf u_ = new ddf() {
      @Override
      public boolean a(ctq $$0, hx $$1, djh $$2, @Nullable Collection<ic> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((ddl)cws.qT).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(ees.c) ? false : ddl.a($$0, $$1, $$2, $$3);
         } else {
            return ddf.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(ddk.a $$0, ctq $$1, hx $$2, auv $$3, ddk $$4, boolean $$5) {
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

   default void a(ctq $$0, djh $$1, hx $$2, auv $$3) {
   }

   default boolean a(ctq $$0, hx $$1, auv $$2) {
      return false;
   }

   default boolean a(ctq $$0, hx $$1, djh $$2, @Nullable Collection<ic> $$3, boolean $$4) {
      return ((dbp)cws.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(ddk.a var1, ctq var2, hx var3, auv var4, ddk var5, boolean var6);
}
