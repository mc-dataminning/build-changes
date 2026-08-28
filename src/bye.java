import com.google.common.collect.ImmutableMap;

public class bye extends bwy<bvh> {
   public bye(int $$0, int $$1) {
      super(ImmutableMap.of(cej.n, cek.a), $$0, $$1);
   }

   protected boolean a(arc $$0, bvh $$1, long $$2) {
      return $$1.ec().c(cej.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arc $$0, bvh $$1, long $$2) {
      $$1.ec().b(cej.n);
   }

   protected void c(arc $$0, bvh $$1, long $$2) {
      $$1.ec().c(cej.n).ifPresent($$1x -> $$1.H().a($$1x.a()));
   }
}
