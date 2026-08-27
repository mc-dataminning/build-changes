import com.google.common.collect.ImmutableMap;

public class bpi extends boc<bmn> {
   public bpi(int $$0, int $$1) {
      super(ImmutableMap.of(bvn.n, bvo.a), $$0, $$1);
   }

   protected boolean a(and $$0, bmn $$1, long $$2) {
      return $$1.dO().c(bvn.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(and $$0, bmn $$1, long $$2) {
      $$1.dO().b(bvn.n);
   }

   protected void c(and $$0, bmn $$1, long $$2) {
      $$1.dO().c(bvn.n).ifPresent($$1x -> $$1.I().a($$1x.a()));
   }
}
