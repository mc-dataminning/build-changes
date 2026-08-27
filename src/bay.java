import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bay extends azu {
   public bay(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register(
         $$1,
         "minecraft:wandering_trader",
         $$1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(aym.t.in($$0)),
               "Offers",
               DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", aym.t.in($$0), "buyB", aym.t.in($$0), "sell", aym.t.in($$0)))),
               azv.a($$0)
            )
      );
      $$0.register(
         $$1,
         "minecraft:trader_llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(aym.t.in($$0)), "SaddleItem", aym.t.in($$0), "DecorItem", aym.t.in($$0), azv.a($$0))
      );
      return $$1;
   }
}
