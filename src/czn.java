import java.util.Collection;
import javax.annotation.Nullable;

public interface czn {
   czn t_ = new czn() {
      @Override
      public boolean a(cpy $$0, gw $$1, dfl $$2, @Nullable Collection<hc> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((czt)csy.qG).g().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(eap.c) ? false : czt.a($$0, $$1, $$2, $$3);
         } else {
            return czn.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(czs.a $$0, cpy $$1, gw $$2, ase $$3, czs $$4, boolean $$5) {
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

   default void a(cpy $$0, dfl $$1, gw $$2, ase $$3) {
   }

   default boolean a(cpy $$0, gw $$1, ase $$2) {
      return false;
   }

   default boolean a(cpy $$0, gw $$1, dfl $$2, @Nullable Collection<hc> $$3, boolean $$4) {
      return ((cxv)csy.qG).b().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean c() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(czs.a var1, cpy var2, gw var3, ase var4, czs var5, boolean var6);
}
