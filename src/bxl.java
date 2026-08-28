import com.google.common.collect.ImmutableMap;

public class bxl extends bwf<bup> {
   public bxl(int $$0, int $$1) {
      super(ImmutableMap.of(cdq.n, cdr.a), $$0, $$1);
   }

   protected boolean a(arj $$0, bup $$1, long $$2) {
      return $$1.dY().c(cdq.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arj $$0, bup $$1, long $$2) {
      $$1.dY().b(cdq.n);
   }

   protected void c(arj $$0, bup $$1, long $$2) {
      $$1.dY().c(cdq.n).ifPresent($$1x -> $$1.K().a($$1x.a()));
   }
}
