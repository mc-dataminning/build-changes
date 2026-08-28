import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface euz extends etm, BiFunction<cvs, etl, cvs> {
   eva<? extends euz> b();

   static Consumer<cvs> a(BiFunction<cvs, etl, cvs> $$0, Consumer<cvs> $$1, etl $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      euz b();
   }
}
