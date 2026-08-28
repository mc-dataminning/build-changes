import javax.annotation.Nullable;

public class chk {
   @Nullable
   public static fcu a(bwz $$0, int $$1, int $$2) {
      boolean $$3 = chl.a($$0, $$1);
      return cho.a($$0, () -> {
         jj $$4 = cho.a($$0.dY(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static fcu a(bwz $$0, int $$1, int $$2, fcu $$3, double $$4) {
      fcu $$5 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$6 = chl.a($$0, $$1);
      return cho.a($$0, () -> {
         jj $$6x = cho.a($$0.dY(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static fcu a(bwz $$0, int $$1, int $$2, fcu $$3) {
      fcu $$4 = $$0.dt().d($$3);
      boolean $$5 = chl.a($$0, $$1);
      return cho.a($$0, () -> {
         jj $$5x = cho.a($$0.dY(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static jj a(bwz $$0, int $$1, boolean $$2, jj $$3) {
      jj $$4 = cho.a($$0, $$1, $$0.dY(), $$3);
      return !chl.a($$4, $$0) && !chl.a($$2, $$0, $$4) && !chl.a($$0.O(), $$4) && !chl.b($$0, $$4) ? $$4 : null;
   }
}
