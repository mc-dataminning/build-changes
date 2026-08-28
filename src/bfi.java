import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bfi extends bda {
   private static final Optional<String> a = Optional.of("\"\"");

   public bfi(Schema $$0) {
      super($$0, "InvalidLockComponentPredicateFix", "minecraft:lock");
   }

   @Nullable
   @Override
   protected <T> Dynamic<T> a(Dynamic<T> $$0) {
      return b($$0);
   }

   @Nullable
   public static <T> Dynamic<T> b(Dynamic<T> $$0) {
      return c($$0) ? null : $$0;
   }

   private static <T> boolean c(Dynamic<T> $$0) {
      return a($$0, "components", $$0x -> a($$0x, "minecraft:custom_name", $$0xx -> $$0xx.asString().result().equals(a)));
   }

   private static <T> boolean a(Dynamic<T> $$0, String $$1, Predicate<Dynamic<T>> $$2) {
      Optional<Map<Dynamic<T>, Dynamic<T>>> $$3 = $$0.getMapValues().result();
      return !$$3.isEmpty() && $$3.get().size() == 1 ? $$0.get($$1).result().filter($$2).isPresent() : false;
   }
}
