import com.google.common.collect.ImmutableMap;

public class bwa extends buu<btd> {
   public bwa(int $$0, int $$1) {
      super(ImmutableMap.of(ccf.n, ccg.a), $$0, $$1);
   }

   protected boolean a(aqm $$0, btd $$1, long $$2) {
      return $$1.dU().c(ccf.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aqm $$0, btd $$1, long $$2) {
      $$1.dU().b(ccf.n);
   }

   protected void c(aqm $$0, btd $$1, long $$2) {
      $$1.dU().c(ccf.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
