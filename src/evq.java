import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface evq extends eud, BiFunction<cwb, euc, cwb> {
   evr<? extends evq> b();

   static Consumer<cwb> a(BiFunction<cwb, euc, cwb> $$0, Consumer<cwb> $$1, euc $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      evq b();
   }
}
