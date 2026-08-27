import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eop extends enc, BiFunction<crj, enb, crj> {
   eoq b();

   static Consumer<crj> a(BiFunction<crj, enb, crj> $$0, Consumer<crj> $$1, enb $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eop b();
   }
}
