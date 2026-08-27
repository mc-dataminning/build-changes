import java.util.Collection;
import javax.annotation.Nullable;

public interface czb {
   czb t_ = new czb() {
      @Override
      public boolean a(cpm $$0, gu $$1, dez $$2, @Nullable Collection<ha> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((czh)csm.qG).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(ead.c) ? false : czh.a($$0, $$1, $$2, $$3);
         } else {
            return czb.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(czg.a $$0, cpm $$1, gu $$2, aru $$3, czg $$4, boolean $$5) {
         return $$0.c() > 0 ? $$0.b() : 0;
      }

      @Override
      public int i_(int $$0) {
         return Math.max($$0 - 1, 0);
      }
   };

   default byte a() {
      return 1;
   }

   default void a(cpm $$0, dez $$1, gu $$2, aru $$3) {
   }

   default boolean a(cpm $$0, gu $$1, aru $$2) {
      return false;
   }

   default boolean a(cpm $$0, gu $$1, dez $$2, @Nullable Collection<ha> $$3, boolean $$4) {
      return ((cxj)csm.qG).b().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean c() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(czg.a var1, cpm var2, gu var3, aru var4, czg var5, boolean var6);
}
