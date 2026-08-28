import com.google.common.collect.ImmutableMap;

public class bwn extends bvh<btq> {
   public bwn(int $$0, int $$1) {
      super(ImmutableMap.of(ccs.n, cct.a), $$0, $$1);
   }

   protected boolean a(are $$0, btq $$1, long $$2) {
      return $$1.dS().c(ccs.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(are $$0, btq $$1, long $$2) {
      $$1.dS().b(ccs.n);
   }

   protected void c(are $$0, btq $$1, long $$2) {
      $$1.dS().c(ccs.n).ifPresent($$1x -> $$1.G().a($$1x.a()));
   }
}
