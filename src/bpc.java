import com.google.common.collect.ImmutableMap;

public class bpc extends bnw<bmh> {
   public bpc(int $$0, int $$1) {
      super(ImmutableMap.of(bvh.n, bvi.a), $$0, $$1);
   }

   protected boolean a(amz $$0, bmh $$1, long $$2) {
      return $$1.dO().c(bvh.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(amz $$0, bmh $$1, long $$2) {
      $$1.dO().b(bvh.n);
   }

   protected void c(amz $$0, bmh $$1, long $$2) {
      $$1.dO().c(bvh.n).ifPresent($$1x -> $$1.I().a($$1x.a()));
   }
}
