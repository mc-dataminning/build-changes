import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eaz extends dzl, BiFunction<cfz, dzk, cfz> {
   eba b();

   static Consumer<cfz> a(BiFunction<cfz, dzk, cfz> $$0, Consumer<cfz> $$1, dzk $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eaz b();
   }
}
