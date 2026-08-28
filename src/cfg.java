import javax.annotation.Nullable;

public class cfg {
   @Nullable
   public static eyw a(buv $$0, int $$1, int $$2, int $$3, eyw $$4, double $$5) {
      eyw $$6 = $$4.a($$0.dx(), $$0.dz(), $$0.dD());
      boolean $$7 = cfi.a($$0, $$1);
      return cfl.a($$0, () -> {
         jf $$7x = cff.a($$0, $$1, $$2, $$3, $$6.d, $$6.f, $$5, $$7);
         return $$7x != null && !cfi.a($$0, $$7x) ? $$7x : null;
      });
   }
}
