import java.util.Collection;
import javax.annotation.Nullable;

public interface dsp {
   dsp u_ = new dsp() {
      @Override
      public boolean a(diq $$0, iu $$1, dzo $$2, @Nullable Collection<ja> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dsv)dlw.rx).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(evw.c) ? false : dsv.a($$0, $$1, $$2, $$3);
         } else {
            return dsp.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dsu.a $$0, diq $$1, iu $$2, azt $$3, dsu $$4, boolean $$5) {
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

   default void a(diq $$0, dzo $$1, iu $$2, azt $$3) {
   }

   default boolean a(diq $$0, iu $$1, azt $$2) {
      return false;
   }

   default boolean a(diq $$0, iu $$1, dzo $$2, @Nullable Collection<ja> $$3, boolean $$4) {
      return ((dqz)dlw.rx).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dsu.a var1, diq var2, iu var3, azt var4, dsu var5, boolean var6);
}
