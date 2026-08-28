import java.util.Collection;
import javax.annotation.Nullable;

public interface dod {
   dod w_ = new dod() {
      @Override
      public boolean a(dek $$0, jf $$1, dus $$2, @Nullable Collection<jk> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((doj)dho.qT).l().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(equ.c) ? false : doj.a($$0, $$1, $$2, $$3);
         } else {
            return dod.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(doi.a $$0, dek $$1, jf $$2, azn $$3, doi $$4, boolean $$5) {
         return $$0.c() > 0 ? $$0.b() : 0;
      }

      @Override
      public int j_(int $$0) {
         return Math.max($$0 - 1, 0);
      }
   };

   default byte b() {
      return 1;
   }

   default void a(dek $$0, dus $$1, jf $$2, azn $$3) {
   }

   default boolean a(dek $$0, jf $$1, azn $$2) {
      return false;
   }

   default boolean a(dek $$0, jf $$1, dus $$2, @Nullable Collection<jk> $$3, boolean $$4) {
      return ((dmm)dho.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(doi.a var1, dek var2, jf var3, azn var4, doi var5, boolean var6);
}
