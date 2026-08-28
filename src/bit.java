import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bit extends bht {
   public bit(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerBlockEntities($$0);
      a($$0, $$1, "minecraft:barrel");
      a($$0, $$1, "minecraft:smoker");
      a($$0, $$1, "minecraft:blast_furnace");
      $$0.register($$1, "minecraft:lectern", $$1x -> DSL.optionalFields("Book", bgh.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:bell");
      return $$1;
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("Items", DSL.list(bgh.t.in($$0))));
   }
}
