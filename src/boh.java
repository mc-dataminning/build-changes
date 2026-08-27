import com.google.common.collect.ImmutableMap;

public class boh extends bnc<bln> {
   public boh(int $$0, int $$1) {
      super(ImmutableMap.of(bum.n, bun.a), $$0, $$1);
   }

   protected boolean a(ami $$0, bln $$1, long $$2) {
      return $$1.dP().c(bum.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(ami $$0, bln $$1, long $$2) {
      $$1.dP().b(bum.n);
   }

   protected void c(ami $$0, bln $$1, long $$2) {
      $$1.dP().c(bum.n).ifPresent($$1x -> $$1.I().a($$1x.a()));
   }
}
