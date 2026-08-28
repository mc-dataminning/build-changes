import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface euv extends eti, BiFunction<cvp, eth, cvp> {
   euw<? extends euv> b();

   static Consumer<cvp> a(BiFunction<cvp, eth, cvp> $$0, Consumer<cvp> $$1, eth $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      euv b();
   }
}
