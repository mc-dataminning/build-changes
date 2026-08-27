import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eed extends ecr, BiFunction<cjf, ecq, cjf> {
   eee b();

   static Consumer<cjf> a(BiFunction<cjf, ecq, cjf> $$0, Consumer<cjf> $$1, ecq $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eed b();
   }
}
