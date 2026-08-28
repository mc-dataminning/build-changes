import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eyz extends exm, BiFunction<cxy, exl, cxy> {
   eza<? extends eyz> b();

   static Consumer<cxy> a(BiFunction<cxy, exl, cxy> $$0, Consumer<cxy> $$1, exl $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eyz b();
   }
}
