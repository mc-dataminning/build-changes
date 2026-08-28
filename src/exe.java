import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface exe extends evr, BiFunction<cwo, evq, cwo> {
   exf<? extends exe> b();

   static Consumer<cwo> a(BiFunction<cwo, evq, cwo> $$0, Consumer<cwo> $$1, evq $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      exe b();
   }
}
