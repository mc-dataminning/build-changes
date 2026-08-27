import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eki extends eiw, BiFunction<coz, eiv, coz> {
   ekj b();

   static Consumer<coz> a(BiFunction<coz, eiv, coz> $$0, Consumer<coz> $$1, eiv $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eki b();
   }
}
