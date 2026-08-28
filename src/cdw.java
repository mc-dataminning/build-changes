import javax.annotation.Nullable;

public class cdw {
   @Nullable
   public static ewf a(btk $$0, int $$1, int $$2) {
      boolean $$3 = cdx.a($$0, $$1);
      return cea.a($$0, () -> {
         ja $$4 = cea.a($$0.dT(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ewf a(btk $$0, int $$1, int $$2, ewf $$3, double $$4) {
      ewf $$5 = $$3.a($$0.dv(), $$0.dx(), $$0.dB());
      boolean $$6 = cdx.a($$0, $$1);
      return cea.a($$0, () -> {
         ja $$6x = cea.a($$0.dT(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ewf a(btk $$0, int $$1, int $$2, ewf $$3) {
      ewf $$4 = $$0.do().d($$3);
      boolean $$5 = cdx.a($$0, $$1);
      return cea.a($$0, () -> {
         ja $$5x = cea.a($$0.dT(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ja a(btk $$0, int $$1, boolean $$2, ja $$3) {
      ja $$4 = cea.a($$0, $$1, $$0.dT(), $$3);
      return !cdx.a($$4, $$0) && !cdx.a($$2, $$0, $$4) && !cdx.a($$0.K(), $$4) && !cdx.b($$0, $$4) ? $$4 : null;
   }
}
