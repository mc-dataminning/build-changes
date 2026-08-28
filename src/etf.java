import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface etf extends ers, BiFunction<cuq, err, cuq> {
   etg<? extends etf> b();

   static Consumer<cuq> a(BiFunction<cuq, err, cuq> $$0, Consumer<cuq> $$1, err $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      etf b();
   }
}
