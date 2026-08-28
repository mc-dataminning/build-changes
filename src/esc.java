import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface esc extends eqp, BiFunction<cua, eqo, cua> {
   esd<? extends esc> b();

   static Consumer<cua> a(BiFunction<cua, eqo, cua> $$0, Consumer<cua> $$1, eqo $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      esc b();
   }
}
