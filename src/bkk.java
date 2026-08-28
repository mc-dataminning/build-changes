import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bkk extends bjg {
   public bkk(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register(
         $$1,
         "minecraft:wandering_trader",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(bhs.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(bhs.x.in($$0))), bjh.a($$0))
      );
      $$0.register(
         $$1,
         "minecraft:trader_llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(bhs.t.in($$0)), "SaddleItem", bhs.t.in($$0), "DecorItem", bhs.t.in($$0), bjh.a($$0))
      );
      return $$1;
   }
}
