import com.google.common.collect.ImmutableMap;

public class bos extends bnm<blx> {
   public bos(int $$0, int $$1) {
      super(ImmutableMap.of(bux.n, buy.a), $$0, $$1);
   }

   protected boolean a(amp $$0, blx $$1, long $$2) {
      return $$1.dO().c(bux.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(amp $$0, blx $$1, long $$2) {
      $$1.dO().b(bux.n);
   }

   protected void c(amp $$0, blx $$1, long $$2) {
      $$1.dO().c(bux.n).ifPresent($$1x -> $$1.I().a($$1x.a()));
   }
}
