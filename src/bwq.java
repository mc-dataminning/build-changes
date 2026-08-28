import com.google.common.collect.ImmutableMap;

public class bwq extends bvk<btt> {
   public bwq(int $$0, int $$1) {
      super(ImmutableMap.of(ccv.n, ccw.a), $$0, $$1);
   }

   protected boolean a(arf $$0, btt $$1, long $$2) {
      return $$1.dS().c(ccv.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arf $$0, btt $$1, long $$2) {
      $$1.dS().b(ccv.n);
   }

   protected void c(arf $$0, btt $$1, long $$2) {
      $$1.dS().c(ccv.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
