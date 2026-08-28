import java.util.Collection;
import javax.annotation.Nullable;

public interface dre {
   dre u_ = new dre() {
      @Override
      public boolean a(dhi $$0, jh $$1, dxu $$2, @Nullable Collection<jm> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((drk)dkn.ro).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(etx.c) ? false : drk.a($$0, $$1, $$2, $$3);
         } else {
            return dre.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(drj.a $$0, dhi $$1, jh $$2, bam $$3, drj $$4, boolean $$5) {
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

   default void a(dhi $$0, dxu $$1, jh $$2, bam $$3) {
   }

   default boolean a(dhi $$0, jh $$1, bam $$2) {
      return false;
   }

   default boolean a(dhi $$0, jh $$1, dxu $$2, @Nullable Collection<jm> $$3, boolean $$4) {
      return ((dpn)dkn.ro).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(drj.a var1, dhi var2, jh var3, bam var4, drj var5, boolean var6);
}
