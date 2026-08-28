import com.google.common.collect.ImmutableMap;

public class bwp extends bvj<bts> {
   public bwp(int $$0, int $$1) {
      super(ImmutableMap.of(ccu.n, ccv.a), $$0, $$1);
   }

   protected boolean a(arf $$0, bts $$1, long $$2) {
      return $$1.dS().c(ccu.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arf $$0, bts $$1, long $$2) {
      $$1.dS().b(ccu.n);
   }

   protected void c(arf $$0, bts $$1, long $$2) {
      $$1.dS().c(ccu.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
