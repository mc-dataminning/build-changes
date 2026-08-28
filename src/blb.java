import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class blb extends bju {
   public blb(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register(
         $$1,
         "minecraft:wandering_trader",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(bic.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(bic.x.in($$0))), bjv.a($$0))
      );
      $$0.register(
         $$1,
         "minecraft:trader_llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(bic.t.in($$0)), "SaddleItem", bic.t.in($$0), "DecorItem", bic.t.in($$0), bjv.a($$0))
      );
      return $$1;
   }
}
