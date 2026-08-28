import com.google.common.collect.ImmutableMap;

public class byg extends bxa<bvj> {
   public byg(int $$0, int $$1) {
      super(ImmutableMap.of(cel.n, cem.a), $$0, $$1);
   }

   protected boolean a(arp $$0, bvj $$1, long $$2) {
      return $$1.eb().c(cel.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arp $$0, bvj $$1, long $$2) {
      $$1.eb().b(cel.n);
   }

   protected void c(arp $$0, bvj $$1, long $$2) {
      $$1.eb().c(cel.n).ifPresent($$1x -> $$1.H().a($$1x.a()));
   }
}
