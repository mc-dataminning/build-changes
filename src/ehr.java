import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface ehr extends egf, BiFunction<cmh, ege, cmh> {
   ehs b();

   static Consumer<cmh> a(BiFunction<cmh, ege, cmh> $$0, Consumer<cmh> $$1, ege $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      ehr b();
   }
}
