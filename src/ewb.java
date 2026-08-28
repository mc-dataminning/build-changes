import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface ewb extends euo, BiFunction<cwm, eun, cwm> {
   ewc<? extends ewb> b();

   static Consumer<cwm> a(BiFunction<cwm, eun, cwm> $$0, Consumer<cwm> $$1, eun $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      ewb b();
   }
}
