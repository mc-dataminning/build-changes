import java.util.Collection;
import javax.annotation.Nullable;

public interface dnm {
   dnm w_ = new dnm() {
      @Override
      public boolean a(ddt $$0, je $$1, dua $$2, @Nullable Collection<jj> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dns)dgx.qT).m().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(eqc.c) ? false : dns.a($$0, $$1, $$2, $$3);
         } else {
            return dnm.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dnr.a $$0, ddt $$1, je $$2, azk $$3, dnr $$4, boolean $$5) {
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

   default void a(ddt $$0, dua $$1, je $$2, azk $$3) {
   }

   default boolean a(ddt $$0, je $$1, azk $$2) {
      return false;
   }

   default boolean a(ddt $$0, je $$1, dua $$2, @Nullable Collection<jj> $$3, boolean $$4) {
      return ((dlv)dgx.qT).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dnr.a var1, ddt var2, je var3, azk var4, dnr var5, boolean var6);
}
