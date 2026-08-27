import com.google.common.collect.ImmutableMap;

public class bnu extends bmp<bla> {
   public bnu(int $$0, int $$1) {
      super(ImmutableMap.of(btz.n, bua.a), $$0, $$1);
   }

   protected boolean a(ama $$0, bla $$1, long $$2) {
      return $$1.dN().c(btz.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(ama $$0, bla $$1, long $$2) {
      $$1.dN().b(btz.n);
   }

   protected void c(ama $$0, bla $$1, long $$2) {
      $$1.dN().c(btz.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
