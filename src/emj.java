import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface emj extends ekx, BiFunction<cqm, ekw, cqm> {
   emk b();

   static Consumer<cqm> a(BiFunction<cqm, ekw, cqm> $$0, Consumer<cqm> $$1, ekw $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      emj b();
   }
}
