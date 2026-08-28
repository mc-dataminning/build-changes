import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface ert extends eqh, BiFunction<cun, eqg, cun> {
   eru<? extends ert> b();

   static Consumer<cun> a(BiFunction<cun, eqg, cun> $$0, Consumer<cun> $$1, eqg $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      ert b();
   }
}
