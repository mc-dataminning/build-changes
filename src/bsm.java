import com.google.common.collect.ImmutableMap;

public class bsm extends brg<bpq> {
   public bsm(int $$0, int $$1) {
      super(ImmutableMap.of(byr.n, bys.a), $$0, $$1);
   }

   protected boolean a(apf $$0, bpq $$1, long $$2) {
      return $$1.dP().c(byr.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(apf $$0, bpq $$1, long $$2) {
      $$1.dP().b(byr.n);
   }

   protected void c(apf $$0, bpq $$1, long $$2) {
      $$1.dP().c(byr.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
