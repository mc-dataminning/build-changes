import com.google.common.collect.ImmutableMap;

public class bwn extends bvh<btp> {
   public bwn(int $$0, int $$1) {
      super(ImmutableMap.of(ccs.n, cct.a), $$0, $$1);
   }

   protected boolean a(aqu $$0, btp $$1, long $$2) {
      return $$1.dU().c(ccs.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aqu $$0, btp $$1, long $$2) {
      $$1.dU().b(ccs.n);
   }

   protected void c(aqu $$0, btp $$1, long $$2) {
      $$1.dU().c(ccs.n).ifPresent($$1x -> $$1.I().a($$1x.a()));
   }
}
