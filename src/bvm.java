import com.google.common.collect.ImmutableMap;

public class bvm extends bug<bsq> {
   public bvm(int $$0, int $$1) {
      super(ImmutableMap.of(cbr.n, cbs.a), $$0, $$1);
   }

   protected boolean a(aqt $$0, bsq $$1, long $$2) {
      return $$1.dZ().c(cbr.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aqt $$0, bsq $$1, long $$2) {
      $$1.dZ().b(cbr.n);
   }

   protected void c(aqt $$0, bsq $$1, long $$2) {
      $$1.dZ().c(cbr.n).ifPresent($$1x -> $$1.F().a($$1x.a()));
   }
}
