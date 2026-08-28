import com.google.common.collect.ImmutableMap;

public class bzo extends byi<bwt> {
   public bzo(int $$0, int $$1) {
      super(ImmutableMap.of(cft.o, cfu.a), $$0, $$1);
   }

   protected boolean a(arn $$0, bwt $$1, long $$2) {
      return $$1.eb().c(cft.o).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(arn $$0, bwt $$1, long $$2) {
      $$1.eb().b(cft.o);
   }

   protected void c(arn $$0, bwt $$1, long $$2) {
      $$1.eb().c(cft.o).ifPresent($$1x -> $$1.J().a($$1x.a()));
   }
}
