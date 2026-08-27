import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eef extends ect, BiFunction<cjh, ecs, cjh> {
   eeg b();

   static Consumer<cjh> a(BiFunction<cjh, ecs, cjh> $$0, Consumer<cjh> $$1, ecs $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eef b();
   }
}
