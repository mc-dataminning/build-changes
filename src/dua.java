import java.util.Collection;
import javax.annotation.Nullable;

public interface dua {
   dua s_ = new dua() {
      @Override
      public boolean a(djy $$0, iv $$1, ebe $$2, @Nullable Collection<jb> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dug)dne.rB).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(exp.c) ? false : dug.a($$0, $$1, $$2, $$3);
         } else {
            return dua.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(duf.a $$0, djy $$1, iv $$2, azx $$3, duf $$4, boolean $$5) {
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

   default void a(djy $$0, ebe $$1, iv $$2, azx $$3) {
   }

   default boolean a(djy $$0, iv $$1, azx $$2) {
      return false;
   }

   default boolean a(djy $$0, iv $$1, ebe $$2, @Nullable Collection<jb> $$3, boolean $$4) {
      return ((dsj)dne.rB).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(duf.a var1, djy var2, iv var3, azx var4, duf var5, boolean var6);
}
