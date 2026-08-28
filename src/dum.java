import java.util.Collection;
import javax.annotation.Nullable;

public interface dum {
   dum s_ = new dum() {
      @Override
      public boolean a(dkk $$0, iw $$1, ebq $$2, @Nullable Collection<jc> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dus)dnq.rB).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(eyb.c) ? false : dus.a($$0, $$1, $$2, $$3);
         } else {
            return dum.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dur.a $$0, dkk $$1, iw $$2, bai $$3, dur $$4, boolean $$5) {
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

   default void a(dkk $$0, ebq $$1, iw $$2, bai $$3) {
   }

   default boolean a(dkk $$0, iw $$1, bai $$2) {
      return false;
   }

   default boolean a(dkk $$0, iw $$1, ebq $$2, @Nullable Collection<jc> $$3, boolean $$4) {
      return ((dsv)dnq.rB).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dur.a var1, dkk var2, iw var3, bai var4, dur var5, boolean var6);
}
