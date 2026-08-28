import java.util.function.Supplier;

public class csa extends crv {
   public csa(bvr<? extends csa> $$0, dhi $$1, Supplier<cxl> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected double b(bvn $$0) {
      return (double)($$0.b() * 0.8888889F);
   }
}
