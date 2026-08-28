import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface erw extends eqk, BiFunction<cuq, eqj, cuq> {
   erx<? extends erw> b();

   static Consumer<cuq> a(BiFunction<cuq, eqj, cuq> $$0, Consumer<cuq> $$1, eqj $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      erw b();
   }
}
