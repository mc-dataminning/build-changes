import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface fbc extends ezp, BiFunction<czk, ezo, czk> {
   fbd<? extends fbc> b();

   static Consumer<czk> a(BiFunction<czk, ezo, czk> $$0, Consumer<czk> $$1, ezo $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      fbc b();
   }
}
