import com.google.common.collect.ImmutableMap;

public class bvn extends buh<bsq> {
   public bvn(int $$0, int $$1) {
      super(ImmutableMap.of(cbs.n, cbt.a), $$0, $$1);
   }

   protected boolean a(aqm $$0, bsq $$1, long $$2) {
      return $$1.dS().c(cbs.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aqm $$0, bsq $$1, long $$2) {
      $$1.dS().b(cbs.n);
   }

   protected void c(aqm $$0, bsq $$1, long $$2) {
      $$1.dS().c(cbs.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
