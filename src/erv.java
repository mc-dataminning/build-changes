import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface erv extends eqj, BiFunction<cup, eqi, cup> {
   erw<? extends erv> b();

   static Consumer<cup> a(BiFunction<cup, eqi, cup> $$0, Consumer<cup> $$1, eqi $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      erv b();
   }
}
