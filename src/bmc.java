import com.google.common.collect.ImmutableMap;

public class bmc extends bkx<bji> {
   public bmc(int $$0, int $$1) {
      super(ImmutableMap.of(bsh.n, bsi.a), $$0, $$1);
   }

   protected boolean a(akq $$0, bji $$1, long $$2) {
      return $$1.dN().c(bsh.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(akq $$0, bji $$1, long $$2) {
      $$1.dN().b(bsh.n);
   }

   protected void c(akq $$0, bji $$1, long $$2) {
      $$1.dN().c(bsh.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
