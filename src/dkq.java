import java.util.Collection;
import javax.annotation.Nullable;

public interface dkq {
   dkq s_ = new dkq() {
      @Override
      public boolean a(dba $$0, io $$1, drd $$2, @Nullable Collection<it> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dkw)dec.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.i() && !$$2.u().b(emx.c) ? false : dkw.a($$0, $$1, $$2, $$3);
         } else {
            return dkq.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dkv.a $$0, dba $$1, io $$2, aym $$3, dkv $$4, boolean $$5) {
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

   default void a(dba $$0, drd $$1, io $$2, aym $$3) {
   }

   default boolean a(dba $$0, io $$1, aym $$2) {
      return false;
   }

   default boolean a(dba $$0, io $$1, drd $$2, @Nullable Collection<it> $$3, boolean $$4) {
      return ((dja)dec.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int i_(int $$0) {
      return 1;
   }

   int a(dkv.a var1, dba var2, io var3, aym var4, dkv var5, boolean var6);
}
