import com.google.common.collect.ImmutableMap;

public class bwj extends bvd<btm> {
   public bwj(int $$0, int $$1) {
      super(ImmutableMap.of(cco.n, ccp.a), $$0, $$1);
   }

   protected boolean a(arb $$0, btm $$1, long $$2) {
      return $$1.dS().c(cco.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arb $$0, btm $$1, long $$2) {
      $$1.dS().b(cco.n);
   }

   protected void c(arb $$0, btm $$1, long $$2) {
      $$1.dS().c(cco.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
