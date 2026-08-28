import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface exd extends evq, BiFunction<cwn, evp, cwn> {
   exe<? extends exd> b();

   static Consumer<cwn> a(BiFunction<cwn, evp, cwn> $$0, Consumer<cwn> $$1, evp $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      exd b();
   }
}
