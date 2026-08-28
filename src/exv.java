import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface exv extends ewi, BiFunction<cxk, ewh, cxk> {
   exw<? extends exv> b();

   static Consumer<cxk> a(BiFunction<cxk, ewh, cxk> $$0, Consumer<cxk> $$1, ewh $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      exv b();
   }
}
