import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface epx extends eom, BiFunction<csz, eol, csz> {
   epy b();

   static Consumer<csz> a(BiFunction<csz, eol, csz> $$0, Consumer<csz> $$1, eol $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      epx b();
   }
}
