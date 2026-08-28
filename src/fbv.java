import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface fbv extends fai, BiFunction<czy, fah, czy> {
   fbw<? extends fbv> b();

   static Consumer<czy> a(BiFunction<czy, fah, czy> $$0, Consumer<czy> $$1, fah $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      fbv b();
   }
}
