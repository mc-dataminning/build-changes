import javax.annotation.Nullable;

public class ceh {
   @Nullable
   public static eww a(btu $$0, int $$1, int $$2) {
      boolean $$3 = cei.a($$0, $$1);
      return cel.a($$0, () -> {
         jd $$4 = cel.a($$0.dT(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static eww a(btu $$0, int $$1, int $$2, eww $$3, double $$4) {
      eww $$5 = $$3.a($$0.dv(), $$0.dx(), $$0.dB());
      boolean $$6 = cei.a($$0, $$1);
      return cel.a($$0, () -> {
         jd $$6x = cel.a($$0.dT(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static eww a(btu $$0, int $$1, int $$2, eww $$3) {
      eww $$4 = $$0.do().d($$3);
      boolean $$5 = cei.a($$0, $$1);
      return cel.a($$0, () -> {
         jd $$5x = cel.a($$0.dT(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static jd a(btu $$0, int $$1, boolean $$2, jd $$3) {
      jd $$4 = cel.a($$0, $$1, $$0.dT(), $$3);
      return !cei.a($$4, $$0) && !cei.a($$2, $$0, $$4) && !cei.a($$0.J(), $$4) && !cei.b($$0, $$4) ? $$4 : null;
   }
}
