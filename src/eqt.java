import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eqt extends epi, BiFunction<ctq, eph, ctq> {
   equ b();

   static Consumer<ctq> a(BiFunction<ctq, eph, ctq> $$0, Consumer<ctq> $$1, eph $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eqt b();
   }
}
