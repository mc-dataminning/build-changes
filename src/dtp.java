import java.util.Collection;
import javax.annotation.Nullable;

public interface dtp {
   dtp u_ = new dtp() {
      @Override
      public boolean a(djn $$0, iv $$1, eat $$2, @Nullable Collection<jb> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dtv)dmt.rB).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(exb.c) ? false : dtv.a($$0, $$1, $$2, $$3);
         } else {
            return dtp.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dtu.a $$0, djn $$1, iv $$2, azv $$3, dtu $$4, boolean $$5) {
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

   default void a(djn $$0, eat $$1, iv $$2, azv $$3) {
   }

   default boolean a(djn $$0, iv $$1, azv $$2) {
      return false;
   }

   default boolean a(djn $$0, iv $$1, eat $$2, @Nullable Collection<jb> $$3, boolean $$4) {
      return ((dry)dmt.rB).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dtu.a var1, djn var2, iv var3, azv var4, dtu var5, boolean var6);
}
