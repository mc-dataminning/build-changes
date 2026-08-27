import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface etb extends erq, BiFunction<cuh, erp, cuh> {
   etc b();

   static Consumer<cuh> a(BiFunction<cuh, erp, cuh> $$0, Consumer<cuh> $$1, erp $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      etb b();
   }
}
