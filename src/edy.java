import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface edy extends ecm, BiFunction<cja, ecl, cja> {
   edz b();

   static Consumer<cja> a(BiFunction<cja, ecl, cja> $$0, Consumer<cja> $$1, ecl $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      edy b();
   }
}
