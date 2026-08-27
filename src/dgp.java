import java.util.Collection;
import javax.annotation.Nullable;

public interface dgp {
   dgp s_ = new dgp() {
      @Override
      public boolean a(cxa $$0, ib $$1, dmz $$2, @Nullable Collection<ih> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dgv)dac.qT).i().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eio.c) ? false : dgv.a($$0, $$1, $$2, $$3);
         } else {
            return dgp.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dgu.a $$0, cxa $$1, ib $$2, axd $$3, dgu $$4, boolean $$5) {
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

   default void a(cxa $$0, dmz $$1, ib $$2, axd $$3) {
   }

   default boolean a(cxa $$0, ib $$1, axd $$2) {
      return false;
   }

   default boolean a(cxa $$0, ib $$1, dmz $$2, @Nullable Collection<ih> $$3, boolean $$4) {
      return ((dez)dac.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dgu.a var1, cxa var2, ib var3, axd var4, dgu var5, boolean var6);
}
