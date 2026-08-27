import com.google.common.collect.ImmutableMap;

public class buy extends bts<bsc> {
   public buy(int $$0, int $$1) {
      super(ImmutableMap.of(cbd.n, cbe.a), $$0, $$1);
   }

   protected boolean a(aqh $$0, bsc $$1, long $$2) {
      return $$1.dQ().c(cbd.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aqh $$0, bsc $$1, long $$2) {
      $$1.dQ().b(cbd.n);
   }

   protected void c(aqh $$0, bsc $$1, long $$2) {
      $$1.dQ().c(cbd.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
