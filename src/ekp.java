import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface ekp extends ejd, BiFunction<cpd, ejc, cpd> {
   ekq b();

   static Consumer<cpd> a(BiFunction<cpd, ejc, cpd> $$0, Consumer<cpd> $$1, ejc $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      ekp b();
   }
}
