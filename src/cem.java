import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cem {
   @Nullable
   public static exc a(btw $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static exc a(btw $$0, int $$1, int $$2, ToDoubleFunction<jd> $$3) {
      boolean $$4 = cek.a($$0, $$1);
      return cen.a(() -> {
         jd $$4x = cen.a($$0.dR(), $$1, $$2);
         jd $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static exc a(btw $$0, int $$1, int $$2, exc $$3) {
      exc $$4 = $$3.a($$0.dt(), $$0.dv(), $$0.dz());
      boolean $$5 = cek.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static exc b(btw $$0, int $$1, int $$2, exc $$3) {
      exc $$4 = $$0.dm().d($$3);
      boolean $$5 = cek.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static exc a(btw $$0, int $$1, int $$2, exc $$3, boolean $$4) {
      return cen.a($$0, () -> {
         jd $$5 = cen.a($$0.dR(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            jd $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static jd a(btw $$0, jd $$1) {
      $$1 = cen.a($$1, $$0.dO().am(), $$1x -> cek.c($$0, $$1x));
      return !cek.a($$0, $$1) && !cek.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static jd a(btw $$0, int $$1, boolean $$2, jd $$3) {
      jd $$4 = cen.a($$0, $$1, $$0.dR(), $$3);
      return !cek.a($$4, $$0) && !cek.a($$2, $$0, $$4) && !cek.a($$0.N(), $$4) ? $$4 : null;
   }
}
