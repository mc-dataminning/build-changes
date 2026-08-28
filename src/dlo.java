import java.util.Collection;
import javax.annotation.Nullable;

public interface dlo {
   dlo s_ = new dlo() {
      @Override
      public boolean a(dby $$0, iz $$1, dsb $$2, @Nullable Collection<je> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dlu)dfa.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(env.c) ? false : dlu.a($$0, $$1, $$2, $$3);
         } else {
            return dlo.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dlt.a $$0, dby $$1, iz $$2, azg $$3, dlt $$4, boolean $$5) {
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

   default void a(dby $$0, dsb $$1, iz $$2, azg $$3) {
   }

   default boolean a(dby $$0, iz $$1, azg $$2) {
      return false;
   }

   default boolean a(dby $$0, iz $$1, dsb $$2, @Nullable Collection<je> $$3, boolean $$4) {
      return ((djy)dfa.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dlt.a var1, dby var2, iz var3, azg var4, dlt var5, boolean var6);
}
