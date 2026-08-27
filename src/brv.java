import com.google.common.collect.ImmutableMap;

public class brv extends bqp<boz> {
   public brv(int $$0, int $$1) {
      super(ImmutableMap.of(bya.n, byb.a), $$0, $$1);
   }

   protected boolean a(apa $$0, boz $$1, long $$2) {
      return $$1.dM().c(bya.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(apa $$0, boz $$1, long $$2) {
      $$1.dM().b(bya.n);
   }

   protected void c(apa $$0, boz $$1, long $$2) {
      $$1.dM().c(bya.n).ifPresent($$1x -> $$1.I().a($$1x.a()));
   }
}
