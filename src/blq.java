import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class blq extends bjc {
   public blq(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static TypeTemplate a(Schema $$0) {
      return DSL.optionalFields("inBlockState", bho.u.in($$0), "item", bho.t.in($$0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register($$1, "minecraft:trident", () -> a($$0));
      $$0.register($$1, "minecraft:spectral_arrow", () -> a($$0));
      $$0.register($$1, "minecraft:arrow", () -> a($$0));
      return $$1;
   }
}
