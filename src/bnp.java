import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bnp extends bkl {
   public bnp(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.registerSimple($$1, "minecraft:pale_oak_boat");
      $$0.register($$1, "minecraft:pale_oak_chest_boat", $$1x -> DSL.optionalFields("Items", DSL.list(bix.t.in($$0))));
      return $$1;
   }
}
