import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eyd extends ewq, BiFunction<cxp, ewp, cxp> {
   eye<? extends eyd> b();

   static Consumer<cxp> a(BiFunction<cxp, ewp, cxp> $$0, Consumer<cxp> $$1, ewp $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eyd b();
   }
}
