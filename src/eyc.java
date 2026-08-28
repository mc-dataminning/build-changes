import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eyc extends ewp, BiFunction<cxo, ewo, cxo> {
   eyd<? extends eyc> b();

   static Consumer<cxo> a(BiFunction<cxo, ewo, cxo> $$0, Consumer<cxo> $$1, ewo $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eyc b();
   }
}
