import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eqr extends epg, BiFunction<cto, epf, cto> {
   eqs b();

   static Consumer<cto> a(BiFunction<cto, epf, cto> $$0, Consumer<cto> $$1, epf $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eqr b();
   }
}
