import com.google.common.collect.ImmutableMap;

public class bza extends bxu<bwd> {
   public bza(int $$0, int $$1) {
      super(ImmutableMap.of(cff.n, cfg.a), $$0, $$1);
   }

   protected boolean a(ash $$0, bwd $$1, long $$2) {
      return $$1.eb().c(cff.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(ash $$0, bwd $$1, long $$2) {
      $$1.eb().b(cff.n);
   }

   protected void c(ash $$0, bwd $$1, long $$2) {
      $$1.eb().c(cff.n).ifPresent($$1x -> $$1.H().a($$1x.a()));
   }
}
