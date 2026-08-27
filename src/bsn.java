import com.google.common.collect.ImmutableMap;

public class bsn extends brh<bpr> {
   public bsn(int $$0, int $$1) {
      super(ImmutableMap.of(bys.n, byt.a), $$0, $$1);
   }

   protected boolean a(apf $$0, bpr $$1, long $$2) {
      return $$1.dP().c(bys.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(apf $$0, bpr $$1, long $$2) {
      $$1.dP().b(bys.n);
   }

   protected void c(apf $$0, bpr $$1, long $$2) {
      $$1.dP().c(bys.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
