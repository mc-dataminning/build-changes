import java.util.Collection;
import javax.annotation.Nullable;

public interface dqf {
   dqf u_ = new dqf() {
      @Override
      public boolean a(dgh $$0, ji $$1, dwv $$2, @Nullable Collection<jn> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dql)djm.rv).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(esy.c) ? false : dql.a($$0, $$1, $$2, $$3);
         } else {
            return dqf.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dqk.a $$0, dgh $$1, ji $$2, azg $$3, dqk $$4, boolean $$5) {
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

   default void a(dgh $$0, dwv $$1, ji $$2, azg $$3) {
   }

   default boolean a(dgh $$0, ji $$1, azg $$2) {
      return false;
   }

   default boolean a(dgh $$0, ji $$1, dwv $$2, @Nullable Collection<jn> $$3, boolean $$4) {
      return ((don)djm.rv).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dqk.a var1, dgh var2, ji var3, azg var4, dqk var5, boolean var6);
}
