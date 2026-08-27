import com.google.common.collect.ImmutableMap;

public class blu extends bkp<bja> {
   public blu(int $$0, int $$1) {
      super(ImmutableMap.of(brz.n, bsa.a), $$0, $$1);
   }

   protected boolean a(akk $$0, bja $$1, long $$2) {
      return $$1.dM().c(brz.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(akk $$0, bja $$1, long $$2) {
      $$1.dM().b(brz.n);
   }

   protected void c(akk $$0, bja $$1, long $$2) {
      $$1.dM().c(brz.n).ifPresent($$1x -> $$1.D().a($$1x.a()));
   }
}
