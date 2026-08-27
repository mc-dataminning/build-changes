import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eij extends egx, BiFunction<cmy, egw, cmy> {
   eik b();

   static Consumer<cmy> a(BiFunction<cmy, egw, cmy> $$0, Consumer<cmy> $$1, egw $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eij b();
   }
}
