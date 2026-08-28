import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface exf extends evs, BiFunction<cwp, evr, cwp> {
   exg<? extends exf> b();

   static Consumer<cwp> a(BiFunction<cwp, evr, cwp> $$0, Consumer<cwp> $$1, evr $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      exf b();
   }
}
