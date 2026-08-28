import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface exg extends evt, BiFunction<cwq, evs, cwq> {
   exh<? extends exg> b();

   static Consumer<cwq> a(BiFunction<cwq, evs, cwq> $$0, Consumer<cwq> $$1, evs $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      exg b();
   }
}
