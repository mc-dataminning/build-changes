import java.util.Collection;
import javax.annotation.Nullable;

public interface dao {
   dao t_ = new dao() {
      @Override
      public boolean a(cra $$0, ht $$1, dgb $$2, @Nullable Collection<hx> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dau)cuc.qG).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(ebf.c) ? false : dau.a($$0, $$1, $$2, $$3);
         } else {
            return dao.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dat.a $$0, cra $$1, ht $$2, ate $$3, dat $$4, boolean $$5) {
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

   default void a(cra $$0, dgb $$1, ht $$2, ate $$3) {
   }

   default boolean a(cra $$0, ht $$1, ate $$2) {
      return false;
   }

   default boolean a(cra $$0, ht $$1, dgb $$2, @Nullable Collection<hx> $$3, boolean $$4) {
      return ((cyy)cuc.qG).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dat.a var1, cra var2, ht var3, ate var4, dat var5, boolean var6);
}
