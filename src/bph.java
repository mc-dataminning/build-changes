import com.google.common.collect.ImmutableMap;

public class bph extends bob<bmm> {
   public bph(int $$0, int $$1) {
      super(ImmutableMap.of(bvm.n, bvn.a), $$0, $$1);
   }

   protected boolean a(and $$0, bmm $$1, long $$2) {
      return $$1.dO().c(bvm.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(and $$0, bmm $$1, long $$2) {
      $$1.dO().b(bvm.n);
   }

   protected void c(and $$0, bmm $$1, long $$2) {
      $$1.dO().c(bvm.n).ifPresent($$1x -> $$1.I().a($$1x.a()));
   }
}
