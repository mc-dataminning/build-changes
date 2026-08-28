import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface esz extends erm, BiFunction<cuo, erl, cuo> {
   eta<? extends esz> b();

   static Consumer<cuo> a(BiFunction<cuo, erl, cuo> $$0, Consumer<cuo> $$1, erl $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      esz b();
   }
}
