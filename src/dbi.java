import java.util.Collection;
import javax.annotation.Nullable;

public interface dbi {
   dbi t_ = new dbi() {
      @Override
      public boolean a(crt $$0, ht $$1, dgw $$2, @Nullable Collection<hx> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dbo)cuv.qG).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(ech.c) ? false : dbo.a($$0, $$1, $$2, $$3);
         } else {
            return dbi.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dbn.a $$0, crt $$1, ht $$2, ato $$3, dbn $$4, boolean $$5) {
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

   default void a(crt $$0, dgw $$1, ht $$2, ato $$3) {
   }

   default boolean a(crt $$0, ht $$1, ato $$2) {
      return false;
   }

   default boolean a(crt $$0, ht $$1, dgw $$2, @Nullable Collection<hx> $$3, boolean $$4) {
      return ((czs)cuv.qG).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dbn.a var1, crt var2, ht var3, ato var4, dbn var5, boolean var6);
}
