import com.google.common.collect.ImmutableMap;

public class bpl extends bof<bmq> {
   public bpl(int $$0, int $$1) {
      super(ImmutableMap.of(bvq.n, bvr.a), $$0, $$1);
   }

   protected boolean a(ane $$0, bmq $$1, long $$2) {
      return $$1.dN().c(bvq.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(ane $$0, bmq $$1, long $$2) {
      $$1.dN().b(bvq.n);
   }

   protected void c(ane $$0, bmq $$1, long $$2) {
      $$1.dN().c(bvq.n).ifPresent($$1x -> $$1.I().a($$1x.a()));
   }
}
