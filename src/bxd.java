import com.google.common.collect.ImmutableMap;

public class bxd extends bvx<buh> {
   public bxd(int $$0, int $$1) {
      super(ImmutableMap.of(cdi.n, cdj.a), $$0, $$1);
   }

   protected boolean a(arg $$0, buh $$1, long $$2) {
      return $$1.dX().c(cdi.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arg $$0, buh $$1, long $$2) {
      $$1.dX().b(cdi.n);
   }

   protected void c(arg $$0, buh $$1, long $$2) {
      $$1.dX().c(cdi.n).ifPresent($$1x -> $$1.K().a($$1x.a()));
   }
}
