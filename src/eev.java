import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eev extends edj, BiFunction<ckj, edi, ckj> {
   eew b();

   static Consumer<ckj> a(BiFunction<ckj, edi, ckj> $$0, Consumer<ckj> $$1, edi $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eev b();
   }
}
