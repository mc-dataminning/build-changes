import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface eoy extends enl, BiFunction<crs, enk, crs> {
   eoz b();

   static Consumer<crs> a(BiFunction<crs, enk, crs> $$0, Consumer<crs> $$1, enk $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      eoy b();
   }
}
