import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface efy extends eem, BiFunction<clb, eel, clb> {
   efz b();

   static Consumer<clb> a(BiFunction<clb, eel, clb> $$0, Consumer<clb> $$1, eel $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      efy b();
   }
}
