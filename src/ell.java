import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface ell extends ejz, BiFunction<cpq, ejy, cpq> {
   elm b();

   static Consumer<cpq> a(BiFunction<cpq, ejy, cpq> $$0, Consumer<cpq> $$1, ejy $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      ell b();
   }
}
