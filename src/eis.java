import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eis extends ehg, BiFunction<cng, ehf, cng> {
   eit b();

   static Consumer<cng> a(BiFunction<cng, ehf, cng> $$0, Consumer<cng> $$1, ehf $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eis b();
   }
}
