import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eic extends egq, BiFunction<cmr, egp, cmr> {
   eid b();

   static Consumer<cmr> a(BiFunction<cmr, egp, cmr> $$0, Consumer<cmr> $$1, egp $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eic b();
   }
}
