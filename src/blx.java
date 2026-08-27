import com.google.common.collect.ImmutableMap;

public class blx extends bks<bjd> {
   public blx(int $$0, int $$1) {
      super(ImmutableMap.of(bsc.n, bsd.a), $$0, $$1);
   }

   protected boolean a(akn $$0, bjd $$1, long $$2) {
      return $$1.dM().c(bsc.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(akn $$0, bjd $$1, long $$2) {
      $$1.dM().b(bsc.n);
   }

   protected void c(akn $$0, bjd $$1, long $$2) {
      $$1.dM().c(bsc.n).ifPresent($$1x -> $$1.D().a($$1x.a()));
   }
}
