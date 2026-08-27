import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface emh extends ekv, BiFunction<cqk, eku, cqk> {
   emi b();

   static Consumer<cqk> a(BiFunction<cqk, eku, cqk> $$0, Consumer<cqk> $$1, eku $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      emh b();
   }
}
