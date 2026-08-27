import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface epp extends eob, BiFunction<csd, eoa, csd> {
   epq b();

   static Consumer<csd> a(BiFunction<csd, eoa, csd> $$0, Consumer<csd> $$1, eoa $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      epp b();
   }
}
