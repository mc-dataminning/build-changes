import com.google.common.collect.ImmutableMap;

public class bze extends bxy<bwh> {
   public bze(int $$0, int $$1) {
      super(ImmutableMap.of(cfj.n, cfk.a), $$0, $$1);
   }

   protected boolean a(ash $$0, bwh $$1, long $$2) {
      return $$1.ec().c(cfj.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(ash $$0, bwh $$1, long $$2) {
      $$1.ec().b(cfj.n);
   }

   protected void c(ash $$0, bwh $$1, long $$2) {
      $$1.ec().c(cfj.n).ifPresent($$1x -> $$1.H().a($$1x.a()));
   }
}
