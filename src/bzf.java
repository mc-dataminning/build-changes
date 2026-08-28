import com.google.common.collect.ImmutableMap;

public class bzf extends bxz<bwi> {
   public bzf(int $$0, int $$1) {
      super(ImmutableMap.of(cfk.n, cfl.a), $$0, $$1);
   }

   protected boolean a(ash $$0, bwi $$1, long $$2) {
      return $$1.ec().c(cfk.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(ash $$0, bwi $$1, long $$2) {
      $$1.ec().b(cfk.n);
   }

   protected void c(ash $$0, bwi $$1, long $$2) {
      $$1.ec().c(cfk.n).ifPresent($$1x -> $$1.H().a($$1x.a()));
   }
}
