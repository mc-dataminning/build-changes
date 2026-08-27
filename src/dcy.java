import java.util.Collection;
import javax.annotation.Nullable;

public interface dcy {
   dcy u_ = new dcy() {
      @Override
      public boolean a(ctj $$0, hx $$1, dja $$2, @Nullable Collection<ic> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dde)cwl.qT).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eel.c) ? false : dde.a($$0, $$1, $$2, $$3);
         } else {
            return dcy.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(ddd.a $$0, ctj $$1, hx $$2, aup $$3, ddd $$4, boolean $$5) {
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

   default void a(ctj $$0, dja $$1, hx $$2, aup $$3) {
   }

   default boolean a(ctj $$0, hx $$1, aup $$2) {
      return false;
   }

   default boolean a(ctj $$0, hx $$1, dja $$2, @Nullable Collection<ic> $$3, boolean $$4) {
      return ((dbi)cwl.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(ddd.a var1, ctj var2, hx var3, aup var4, ddd var5, boolean var6);
}
