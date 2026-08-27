import java.util.Collection;
import javax.annotation.Nullable;

public interface dco {
   dco t_ = new dco() {
      @Override
      public boolean a(csz $$0, hv $$1, dip $$2, @Nullable Collection<ia> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dcu)cwb.qT).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eea.c) ? false : dcu.a($$0, $$1, $$2, $$3);
         } else {
            return dco.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dct.a $$0, csz $$1, hv $$2, auf $$3, dct $$4, boolean $$5) {
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

   default void a(csz $$0, dip $$1, hv $$2, auf $$3) {
   }

   default boolean a(csz $$0, hv $$1, auf $$2) {
      return false;
   }

   default boolean a(csz $$0, hv $$1, dip $$2, @Nullable Collection<ia> $$3, boolean $$4) {
      return ((day)cwb.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dct.a var1, csz var2, hv var3, auf var4, dct var5, boolean var6);
}
