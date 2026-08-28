import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface esk extends eqx, BiFunction<cud, eqw, cud> {
   esl<? extends esk> b();

   static Consumer<cud> a(BiFunction<cud, eqw, cud> $$0, Consumer<cud> $$1, eqw $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      esk b();
   }
}
