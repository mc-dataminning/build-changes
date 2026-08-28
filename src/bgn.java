import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bgn extends bft {
   public bgn(Schema $$0) {
      super($$0, "LockComponentPredicateFix", "minecraft:lock");
   }

   @Override
   protected <T> Dynamic<T> a(Dynamic<T> $$0) {
      return b($$0);
   }

   public static <T> Dynamic<T> b(Dynamic<T> $$0) {
      Optional<String> $$1 = $$0.asString().result();
      if ($$1.isPresent()) {
         Dynamic<T> $$2 = $$0.createString("\"" + $$1.get().replace("\"", "\\\"") + "\"");
         Dynamic<T> $$3 = $$0.emptyMap().set("minecraft:custom_name", $$2);
         return $$0.emptyMap().set("components", $$3);
      } else {
         return $$0.emptyMap();
      }
   }
}
