import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bcm extends bbi {
   public bcm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register(
         $$1,
         "minecraft:wandering_trader",
         $$1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(baa.t.in($$0)),
               "Offers",
               DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", baa.t.in($$0), "buyB", baa.t.in($$0), "sell", baa.t.in($$0)))),
               bbj.a($$0)
            )
      );
      $$0.register(
         $$1,
         "minecraft:trader_llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(baa.t.in($$0)), "SaddleItem", baa.t.in($$0), "DecorItem", baa.t.in($$0), bbj.a($$0))
      );
      return $$1;
   }
}
