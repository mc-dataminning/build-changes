import java.util.Collection;
import javax.annotation.Nullable;

public interface dde {
   dde u_ = new dde() {
      @Override
      public boolean a(ctp $$0, hx $$1, djg $$2, @Nullable Collection<ic> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((ddk)cwr.qT).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eer.c) ? false : ddk.a($$0, $$1, $$2, $$3);
         } else {
            return dde.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(ddj.a $$0, ctp $$1, hx $$2, auu $$3, ddj $$4, boolean $$5) {
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

   default void a(ctp $$0, djg $$1, hx $$2, auu $$3) {
   }

   default boolean a(ctp $$0, hx $$1, auu $$2) {
      return false;
   }

   default boolean a(ctp $$0, hx $$1, djg $$2, @Nullable Collection<ic> $$3, boolean $$4) {
      return ((dbo)cwr.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(ddj.a var1, ctp var2, hx var3, auu var4, ddj var5, boolean var6);
}
