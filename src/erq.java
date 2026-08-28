import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface erq extends eqe, BiFunction<cuk, eqd, cuk> {
   err<? extends erq> b();

   static Consumer<cuk> a(BiFunction<cuk, eqd, cuk> $$0, Consumer<cuk> $$1, eqd $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      erq b();
   }
}
