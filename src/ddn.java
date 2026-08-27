import java.util.Collection;
import javax.annotation.Nullable;

public interface ddn {
   ddn v_ = new ddn() {
      @Override
      public boolean a(cty $$0, hx $$1, djp $$2, @Nullable Collection<ic> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((ddt)cxa.qT).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(efa.c) ? false : ddt.a($$0, $$1, $$2, $$3);
         } else {
            return ddn.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dds.a $$0, cty $$1, hx $$2, auw $$3, dds $$4, boolean $$5) {
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

   default void a(cty $$0, djp $$1, hx $$2, auw $$3) {
   }

   default boolean a(cty $$0, hx $$1, auw $$2) {
      return false;
   }

   default boolean a(cty $$0, hx $$1, djp $$2, @Nullable Collection<ic> $$3, boolean $$4) {
      return ((dbx)cxa.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dds.a var1, cty var2, hx var3, auw var4, dds var5, boolean var6);
}
