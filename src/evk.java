import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface evk extends etx, BiFunction<cvx, etw, cvx> {
   evl<? extends evk> b();

   static Consumer<cvx> a(BiFunction<cvx, etw, cvx> $$0, Consumer<cvx> $$1, etw $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      evk b();
   }
}
