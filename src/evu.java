import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface evu extends euh, BiFunction<cwf, eug, cwf> {
   evv<? extends evu> b();

   static Consumer<cwf> a(BiFunction<cwf, eug, cwf> $$0, Consumer<cwf> $$1, eug $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      evu b();
   }
}
