import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface erx extends eql, BiFunction<cur, eqk, cur> {
   ery<? extends erx> b();

   static Consumer<cur> a(BiFunction<cur, eqk, cur> $$0, Consumer<cur> $$1, eqk $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      erx b();
   }
}
