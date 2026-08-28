import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bof extends bko {
   public bof(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$1.remove("minecraft:potion");
      $$0.register($$1, "minecraft:splash_potion", () -> DSL.optionalFields("Item", bit.t.in($$0)));
      $$0.register($$1, "minecraft:lingering_potion", () -> DSL.optionalFields("Item", bit.t.in($$0)));
      return $$1;
   }
}
