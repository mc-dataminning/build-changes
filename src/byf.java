import com.google.common.collect.ImmutableMap;

public class byf extends bwz<bvi> {
   public byf(int $$0, int $$1) {
      super(ImmutableMap.of(cek.n, cel.a), $$0, $$1);
   }

   protected boolean a(ard $$0, bvi $$1, long $$2) {
      return $$1.eb().c(cek.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(ard $$0, bvi $$1, long $$2) {
      $$1.eb().b(cek.n);
   }

   protected void c(ard $$0, bvi $$1, long $$2) {
      $$1.eb().c(cek.n).ifPresent($$1x -> $$1.L().a($$1x.a()));
   }
}
