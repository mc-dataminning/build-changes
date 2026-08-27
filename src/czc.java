import java.util.Collection;
import javax.annotation.Nullable;

public interface czc {
   czc t_ = new czc() {
      @Override
      public boolean a(cpn $$0, gu $$1, dfa $$2, @Nullable Collection<ha> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((czi)csn.qG).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eae.c) ? false : czi.a($$0, $$1, $$2, $$3);
         } else {
            return czc.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(czh.a $$0, cpn $$1, gu $$2, aru $$3, czh $$4, boolean $$5) {
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

   default void a(cpn $$0, dfa $$1, gu $$2, aru $$3) {
   }

   default boolean a(cpn $$0, gu $$1, aru $$2) {
      return false;
   }

   default boolean a(cpn $$0, gu $$1, dfa $$2, @Nullable Collection<ha> $$3, boolean $$4) {
      return ((cxk)csn.qG).b().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean c() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(czh.a var1, cpn var2, gu var3, aru var4, czh var5, boolean var6);
}
