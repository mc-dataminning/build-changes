import com.google.common.collect.ImmutableMap;

public class byh extends bxb<bvk> {
   public byh(int $$0, int $$1) {
      super(ImmutableMap.of(cem.n, cen.a), $$0, $$1);
   }

   protected boolean a(ard $$0, bvk $$1, long $$2) {
      return $$1.eb().c(cem.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(ard $$0, bvk $$1, long $$2) {
      $$1.eb().b(cem.n);
   }

   protected void c(ard $$0, bvk $$1, long $$2) {
      $$1.eb().c(cem.n).ifPresent($$1x -> $$1.L().a($$1x.a()));
   }
}
