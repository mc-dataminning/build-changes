import com.google.common.collect.ImmutableMap;

public class bwm extends bvg<btp> {
   public bwm(int $$0, int $$1) {
      super(ImmutableMap.of(ccr.n, ccs.a), $$0, $$1);
   }

   protected boolean a(are $$0, btp $$1, long $$2) {
      return $$1.dS().c(ccr.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(are $$0, btp $$1, long $$2) {
      $$1.dS().b(ccr.n);
   }

   protected void c(are $$0, btp $$1, long $$2) {
      $$1.dS().c(ccr.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
