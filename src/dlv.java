import java.util.Collection;
import javax.annotation.Nullable;

public interface dlv {
   dlv s_ = new dlv() {
      @Override
      public boolean a(dce $$0, ja $$1, dsh $$2, @Nullable Collection<jf> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dmb)dfh.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eoc.c) ? false : dmb.a($$0, $$1, $$2, $$3);
         } else {
            return dlv.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dma.a $$0, dce $$1, ja $$2, aym $$3, dma $$4, boolean $$5) {
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

   default void a(dce $$0, dsh $$1, ja $$2, aym $$3) {
   }

   default boolean a(dce $$0, ja $$1, aym $$2) {
      return false;
   }

   default boolean a(dce $$0, ja $$1, dsh $$2, @Nullable Collection<jf> $$3, boolean $$4) {
      return ((dkf)dfh.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dma.a var1, dce var2, ja var3, aym var4, dma var5, boolean var6);
}
