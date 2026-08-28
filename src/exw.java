import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface exw extends ewj, BiFunction<cxg, ewi, cxg> {
   exx<? extends exw> b();

   static Consumer<cxg> a(BiFunction<cxg, ewi, cxg> $$0, Consumer<cxg> $$1, ewi $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      exw b();
   }
}
