import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface fch extends fau, BiFunction<dak, fat, dak> {
   fci<? extends fch> b();

   static Consumer<dak> a(BiFunction<dak, fat, dak> $$0, Consumer<dak> $$1, fat $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      fch b();
   }
}
