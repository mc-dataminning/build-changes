import javax.annotation.Nullable;

public class cfd {
   @Nullable
   public static eys a(bus $$0, int $$1, int $$2, int $$3, eys $$4, double $$5) {
      eys $$6 = $$4.a($$0.dx(), $$0.dz(), $$0.dD());
      boolean $$7 = cff.a($$0, $$1);
      return cfi.a($$0, () -> {
         je $$7x = cfc.a($$0, $$1, $$2, $$3, $$6.d, $$6.f, $$5, $$7);
         return $$7x != null && !cff.a($$0, $$7x) ? $$7x : null;
      });
   }
}
