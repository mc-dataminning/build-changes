import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface fav extends ezi, BiFunction<czd, ezh, czd> {
   faw<? extends fav> b();

   static Consumer<czd> a(BiFunction<czd, ezh, czd> $$0, Consumer<czd> $$1, ezh $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      fav b();
   }
}
