import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface etd extends erq, BiFunction<cuq, erp, cuq> {
   ete<? extends etd> b();

   static Consumer<cuq> a(BiFunction<cuq, erp, cuq> $$0, Consumer<cuq> $$1, erp $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      etd b();
   }
}
