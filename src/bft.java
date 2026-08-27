import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bft extends azr {
   private final Predicate<String> a;

   public bft(Schema $$0, String $$1, Predicate<String> $$2) {
      super($$0, $$1);
      this.a = $$2.negate();
   }

   @Override
   protected <T> Stream<Dynamic<T>> a(Stream<Dynamic<T>> $$0) {
      return $$0.filter(this::a);
   }

   private <T> boolean a(Dynamic<T> $$0) {
      return $$0.get("type").asString().result().filter(this.a).isPresent();
   }
}
