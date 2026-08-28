import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cek {
   @Nullable
   public static eww a(btu $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static eww a(btu $$0, int $$1, int $$2, ToDoubleFunction<jd> $$3) {
      boolean $$4 = cei.a($$0, $$1);
      return cel.a(() -> {
         jd $$4x = cel.a($$0.dT(), $$1, $$2);
         jd $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static eww a(btu $$0, int $$1, int $$2, eww $$3) {
      eww $$4 = $$3.a($$0.dv(), $$0.dx(), $$0.dB());
      boolean $$5 = cei.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static eww b(btu $$0, int $$1, int $$2, eww $$3) {
      eww $$4 = $$0.do().d($$3);
      boolean $$5 = cei.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static eww a(btu $$0, int $$1, int $$2, eww $$3, boolean $$4) {
      return cel.a($$0, () -> {
         jd $$5 = cel.a($$0.dT(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            jd $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static jd a(btu $$0, jd $$1) {
      $$1 = cel.a($$1, $$0.dQ().am(), $$1x -> cei.c($$0, $$1x));
      return !cei.a($$0, $$1) && !cei.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static jd a(btu $$0, int $$1, boolean $$2, jd $$3) {
      jd $$4 = cel.a($$0, $$1, $$0.dT(), $$3);
      return !cei.a($$4, $$0) && !cei.a($$2, $$0, $$4) && !cei.a($$0.J(), $$4) ? $$4 : null;
   }
}
