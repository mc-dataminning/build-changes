import java.util.Collection;
import javax.annotation.Nullable;

public interface drf {
   drf u_ = new drf() {
      @Override
      public boolean a(dhj $$0, jh $$1, dxv $$2, @Nullable Collection<jm> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((drl)dko.ro).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(ety.c) ? false : drl.a($$0, $$1, $$2, $$3);
         } else {
            return drf.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(drk.a $$0, dhj $$1, jh $$2, bam $$3, drk $$4, boolean $$5) {
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

   default void a(dhj $$0, dxv $$1, jh $$2, bam $$3) {
   }

   default boolean a(dhj $$0, jh $$1, bam $$2) {
      return false;
   }

   default boolean a(dhj $$0, jh $$1, dxv $$2, @Nullable Collection<jm> $$3, boolean $$4) {
      return ((dpo)dko.ro).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(drk.a var1, dhj var2, jh var3, bam var4, drk var5, boolean var6);
}
