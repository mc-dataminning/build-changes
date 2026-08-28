import java.util.function.Supplier;

public class cvm extends cut {
   public cvm(bxn<? extends cvm> $$0, dkj $$1, Supplier<dag> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected double b(bxh $$0) {
      return (double)($$0.b() * 0.8888889F);
   }
}
