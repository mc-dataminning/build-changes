import com.google.common.collect.ImmutableMap;

public class buc extends bsw<brg> {
   public buc(int $$0, int $$1) {
      super(ImmutableMap.of(cah.n, cai.a), $$0, $$1);
   }

   protected boolean a(aqe $$0, brg $$1, long $$2) {
      return $$1.dQ().c(cah.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aqe $$0, brg $$1, long $$2) {
      $$1.dQ().b(cah.n);
   }

   protected void c(aqe $$0, brg $$1, long $$2) {
      $$1.dQ().c(cah.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
