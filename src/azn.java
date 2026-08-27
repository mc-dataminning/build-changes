import com.mojang.datafixers.Typed;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.stream.IntStream;

public class azn {
   public static Dynamic<?> a(Dynamic<?> $$0) {
      Optional<Number> $$1 = $$0.get("X").asNumber().result();
      Optional<Number> $$2 = $$0.get("Y").asNumber().result();
      Optional<Number> $$3 = $$0.get("Z").asNumber().result();
      return !$$1.isEmpty() && !$$2.isEmpty() && !$$3.isEmpty()
         ? $$0.createIntList(IntStream.of($$1.get().intValue(), $$2.get().intValue(), $$3.get().intValue()))
         : $$0;
   }

   public static <T, R> Typed<R> a(Type<R> $$0, Typed<T> $$1) {
      return new Typed($$0, $$1.getOps(), $$1.getValue());
   }
}
