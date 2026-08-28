import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eru extends eqi, BiFunction<cuo, eqh, cuo> {
   erv<? extends eru> b();

   static Consumer<cuo> a(BiFunction<cuo, eqh, cuo> $$0, Consumer<cuo> $$1, eqh $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eru b();
   }
}
