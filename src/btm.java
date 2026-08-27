import com.google.common.collect.ImmutableMap;

public class btm extends bsg<bqq> {
   public btm(int $$0, int $$1) {
      super(ImmutableMap.of(bzr.n, bzs.a), $$0, $$1);
   }

   protected boolean a(aps $$0, bqq $$1, long $$2) {
      return $$1.dP().c(bzr.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aps $$0, bqq $$1, long $$2) {
      $$1.dP().b(bzr.n);
   }

   protected void c(aps $$0, bqq $$1, long $$2) {
      $$1.dP().c(bzr.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
