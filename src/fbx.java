import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface fbx extends fak, BiFunction<daa, faj, daa> {
   fby<? extends fbx> b();

   static Consumer<daa> a(BiFunction<daa, faj, daa> $$0, Consumer<daa> $$1, faj $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      fbx b();
   }
}
