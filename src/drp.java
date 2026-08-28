import java.util.Collection;
import javax.annotation.Nullable;

public interface drp {
   drp u_ = new drp() {
      @Override
      public boolean a(dhq $$0, jj $$1, dym $$2, @Nullable Collection<jo> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((drv)dkw.rx).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(euu.c) ? false : drv.a($$0, $$1, $$2, $$3);
         } else {
            return drp.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dru.a $$0, dhq $$1, jj $$2, azs $$3, dru $$4, boolean $$5) {
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

   default void a(dhq $$0, dym $$1, jj $$2, azs $$3) {
   }

   default boolean a(dhq $$0, jj $$1, azs $$2) {
      return false;
   }

   default boolean a(dhq $$0, jj $$1, dym $$2, @Nullable Collection<jo> $$3, boolean $$4) {
      return ((dpz)dkw.rx).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dru.a var1, dhq var2, jj var3, azs var4, dru var5, boolean var6);
}
