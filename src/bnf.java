import com.google.common.collect.ImmutableMap;

public class bnf extends bma<bkl> {
   public bnf(int $$0, int $$1) {
      super(ImmutableMap.of(btk.n, btl.a), $$0, $$1);
   }

   protected boolean a(alq $$0, bkl $$1, long $$2) {
      return $$1.dN().c(btk.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(alq $$0, bkl $$1, long $$2) {
      $$1.dN().b(btk.n);
   }

   protected void c(alq $$0, bkl $$1, long $$2) {
      $$1.dN().c(btk.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
