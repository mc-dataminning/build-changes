import com.google.common.collect.ImmutableMap;

public class bvp extends buj<bss> {
   public bvp(int $$0, int $$1) {
      super(ImmutableMap.of(cbu.n, cbv.a), $$0, $$1);
   }

   protected boolean a(aqn $$0, bss $$1, long $$2) {
      return $$1.dS().c(cbu.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aqn $$0, bss $$1, long $$2) {
      $$1.dS().b(cbu.n);
   }

   protected void c(aqn $$0, bss $$1, long $$2) {
      $$1.dS().c(cbu.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
