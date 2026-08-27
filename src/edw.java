import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface edw extends eci, BiFunction<ciw, ech, ciw> {
   edx b();

   static Consumer<ciw> a(BiFunction<ciw, ech, ciw> $$0, Consumer<ciw> $$1, ech $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      edw b();
   }
}
