import com.google.common.collect.ImmutableMap;

public class brg extends bqa<bok> {
   public brg(int $$0, int $$1) {
      super(ImmutableMap.of(bxl.n, bxm.a), $$0, $$1);
   }

   protected boolean a(aow $$0, bok $$1, long $$2) {
      return $$1.dO().c(bxl.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aow $$0, bok $$1, long $$2) {
      $$1.dO().b(bxl.n);
   }

   protected void c(aow $$0, bok $$1, long $$2) {
      $$1.dO().c(bxl.n).ifPresent($$1x -> $$1.I().a($$1x.a()));
   }
}
