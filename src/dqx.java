import java.util.Collection;
import javax.annotation.Nullable;

public interface dqx {
   dqx u_ = new dqx() {
      @Override
      public boolean a(dhb $$0, jh $$1, dxn $$2, @Nullable Collection<jm> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((drd)dkg.ro).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(etq.c) ? false : drd.a($$0, $$1, $$2, $$3);
         } else {
            return dqx.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(drc.a $$0, dhb $$1, jh $$2, bam $$3, drc $$4, boolean $$5) {
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

   default void a(dhb $$0, dxn $$1, jh $$2, bam $$3) {
   }

   default boolean a(dhb $$0, jh $$1, bam $$2) {
      return false;
   }

   default boolean a(dhb $$0, jh $$1, dxn $$2, @Nullable Collection<jm> $$3, boolean $$4) {
      return ((dpg)dkg.ro).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(drc.a var1, dhb var2, jh var3, bam var4, drc var5, boolean var6);
}
