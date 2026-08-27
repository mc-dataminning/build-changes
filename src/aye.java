import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class aye {
   public static Dynamic<?> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.get("X").asNumber().result();
      Optional<Number> $$2 = $$0.get("Y").asNumber().result();
      Optional<Number> $$3 = $$0.get("Z").asNumber().result();
      return !$$1.isEmpty() && !$$2.isEmpty() && !$$3.isEmpty()
         ? $$0.createIntList(IntStream.of($$1.get().intValue(), $$2.get().intValue(), $$3.get().intValue()))
         : $$0;
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1, Optional<? extends Dynamic<?>> $$2) {
      return $$2.isEmpty() ? $$0 : $$0.set($$1, $$2.get());
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1, String $$2) {
      return a($$0, $$1, $$2, UnaryOperator.identity());
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1, String $$2, Optional<? extends Dynamic<?>> $$3) {
      return a($$0.remove($$1), $$2, $$3);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1, String $$2, UnaryOperator<Dynamic<?>> $$3) {
      return a($$0.remove($$1), $$2, $$0.get($$1).result().map($$3));
   }
}
