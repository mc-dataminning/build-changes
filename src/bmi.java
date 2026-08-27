import com.google.common.collect.ImmutableMap;

public class bmi extends bld<bjo> {
   public bmi(int $$0, int $$1) {
      super(ImmutableMap.of(bsn.n, bso.a), $$0, $$1);
   }

   protected boolean a(akt $$0, bjo $$1, long $$2) {
      return $$1.dN().c(bsn.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(akt $$0, bjo $$1, long $$2) {
      $$1.dN().b(bsn.n);
   }

   protected void c(akt $$0, bjo $$1, long $$2) {
      $$1.dN().c(bsn.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
