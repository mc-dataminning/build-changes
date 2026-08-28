import com.google.common.collect.ImmutableMap;

public class bvx extends bur<bta> {
   public bvx(int $$0, int $$1) {
      super(ImmutableMap.of(ccc.n, ccd.a), $$0, $$1);
   }

   protected boolean a(aqk $$0, bta $$1, long $$2) {
      return $$1.dT().c(ccc.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aqk $$0, bta $$1, long $$2) {
      $$1.dT().b(ccc.n);
   }

   protected void c(aqk $$0, bta $$1, long $$2) {
      $$1.dT().c(ccc.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
