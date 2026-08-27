import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eii extends egw, BiFunction<cmx, egv, cmx> {
   eij b();

   static Consumer<cmx> a(BiFunction<cmx, egv, cmx> $$0, Consumer<cmx> $$1, egv $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eii b();
   }
}
