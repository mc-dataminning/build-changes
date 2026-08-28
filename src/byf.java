import com.google.common.collect.ImmutableMap;

public class byf extends bwz<bvi> {
   public byf(int $$0, int $$1) {
      super(ImmutableMap.of(cek.n, cel.a), $$0, $$1);
   }

   protected boolean a(arc $$0, bvi $$1, long $$2) {
      return $$1.ec().c(cek.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arc $$0, bvi $$1, long $$2) {
      $$1.ec().b(cek.n);
   }

   protected void c(arc $$0, bvi $$1, long $$2) {
      $$1.ec().c(cek.n).ifPresent($$1x -> $$1.H().a($$1x.a()));
   }
}
