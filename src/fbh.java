import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface fbh extends ezu, BiFunction<czn, ezt, czn> {
   fbi<? extends fbh> b();

   static Consumer<czn> a(BiFunction<czn, ezt, czn> $$0, Consumer<czn> $$1, ezt $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      fbh b();
   }
}
