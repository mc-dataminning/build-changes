import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eyc extends ewp, BiFunction<cxh, ewo, cxh> {
   eyd<? extends eyc> b();

   static Consumer<cxh> a(BiFunction<cxh, ewo, cxh> $$0, Consumer<cxh> $$1, ewo $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eyc b();
   }
}
