import com.google.common.collect.ImmutableMap;

public class blv extends bkq<bja> {
   public blv(int $$0, int $$1) {
      super(ImmutableMap.of(bsa.n, bsb.a), $$0, $$1);
   }

   protected boolean a(akk $$0, bja $$1, long $$2) {
      return $$1.dM().c(bsa.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(akk $$0, bja $$1, long $$2) {
      $$1.dM().b(bsa.n);
   }

   protected void c(akk $$0, bja $$1, long $$2) {
      $$1.dM().c(bsa.n).ifPresent($$1x -> $$1.D().a($$1x.a()));
   }
}
