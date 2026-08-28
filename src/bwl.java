import com.google.common.collect.ImmutableMap;

public class bwl extends bvf<btn> {
   public bwl(int $$0, int $$1) {
      super(ImmutableMap.of(ccq.n, ccr.a), $$0, $$1);
   }

   protected boolean a(aqt $$0, btn $$1, long $$2) {
      return $$1.dU().c(ccq.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aqt $$0, btn $$1, long $$2) {
      $$1.dU().b(ccq.n);
   }

   protected void c(aqt $$0, btn $$1, long $$2) {
      $$1.dU().c(ccq.n).ifPresent($$1x -> $$1.F().a($$1x.a()));
   }
}
