import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface egk extends eey, BiFunction<clj, eex, clj> {
   egl b();

   static Consumer<clj> a(BiFunction<clj, eex, clj> $$0, Consumer<clj> $$1, eex $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      egk b();
   }
}
