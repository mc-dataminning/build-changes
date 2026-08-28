import com.google.common.collect.ImmutableMap;

public class byw extends bxq<bvz> {
   public byw(int $$0, int $$1) {
      super(ImmutableMap.of(cfb.n, cfc.a), $$0, $$1);
   }

   protected boolean a(arx $$0, bvz $$1, long $$2) {
      return $$1.ec().c(cfb.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arx $$0, bvz $$1, long $$2) {
      $$1.ec().b(cfb.n);
   }

   protected void c(arx $$0, bvz $$1, long $$2) {
      $$1.ec().c(cfb.n).ifPresent($$1x -> $$1.H().a($$1x.a()));
   }
}
