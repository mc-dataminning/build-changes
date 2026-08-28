import com.google.common.collect.ImmutableMap;

public class bwb extends buv<bte> {
   public bwb(int $$0, int $$1) {
      super(ImmutableMap.of(ccg.n, cch.a), $$0, $$1);
   }

   protected boolean a(aqm $$0, bte $$1, long $$2) {
      return $$1.dV().c(ccg.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aqm $$0, bte $$1, long $$2) {
      $$1.dV().b(ccg.n);
   }

   protected void c(aqm $$0, bte $$1, long $$2) {
      $$1.dV().c(ccg.n).ifPresent($$1x -> $$1.F().a($$1x.a()));
   }
}
