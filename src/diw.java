import java.util.Collection;
import javax.annotation.Nullable;

public interface diw {
   diw s_ = new diw() {
      @Override
      public boolean a(czh $$0, id $$1, dpi $$2, @Nullable Collection<ij> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((djc)dcj.qT).k().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(elc.c) ? false : djc.a($$0, $$1, $$2, $$3);
         } else {
            return diw.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(djb.a $$0, czh $$1, id $$2, axt $$3, djb $$4, boolean $$5) {
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

   default void a(czh $$0, dpi $$1, id $$2, axt $$3) {
   }

   default boolean a(czh $$0, id $$1, axt $$2) {
      return false;
   }

   default boolean a(czh $$0, id $$1, dpi $$2, @Nullable Collection<ij> $$3, boolean $$4) {
      return ((dhg)dcj.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(djb.a var1, czh var2, id var3, axt var4, djb var5, boolean var6);
}
