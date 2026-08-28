import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bmp extends bjo {
   public bmp(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static TypeTemplate a(Schema $$0) {
      return DSL.optionalFields("inBlockState", bia.u.in($$0), "item", bia.t.in($$0), "weapon", bia.t.in($$0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register($$1, "minecraft:spectral_arrow", () -> a($$0));
      $$0.register($$1, "minecraft:arrow", () -> a($$0));
      return $$1;
   }
}
