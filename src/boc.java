import com.google.common.collect.ImmutableMap;

public class boc extends bmx<bli> {
   public boc(int $$0, int $$1) {
      super(ImmutableMap.of(buh.n, bui.a), $$0, $$1);
   }

   protected boolean a(ame $$0, bli $$1, long $$2) {
      return $$1.dP().c(buh.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(ame $$0, bli $$1, long $$2) {
      $$1.dP().b(buh.n);
   }

   protected void c(ame $$0, bli $$1, long $$2) {
      $$1.dP().c(buh.n).ifPresent($$1x -> $$1.I().a($$1x.a()));
   }
}
