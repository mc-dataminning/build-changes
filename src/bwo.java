import com.google.common.collect.ImmutableMap;

public class bwo extends bvi<btr> {
   public bwo(int $$0, int $$1) {
      super(ImmutableMap.of(cct.n, ccu.a), $$0, $$1);
   }

   protected boolean a(arf $$0, btr $$1, long $$2) {
      return $$1.dS().c(cct.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arf $$0, btr $$1, long $$2) {
      $$1.dS().b(cct.n);
   }

   protected void c(arf $$0, btr $$1, long $$2) {
      $$1.dS().c(cct.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
