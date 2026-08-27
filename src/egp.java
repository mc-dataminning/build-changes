import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface egp extends efd, BiFunction<clo, efc, clo> {
   egq b();

   static Consumer<clo> a(BiFunction<clo, efc, clo> $$0, Consumer<clo> $$1, efc $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      egp b();
   }
}
