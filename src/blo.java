import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class blo extends bkk {
   public blo(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register(
         $$1,
         "minecraft:wandering_trader",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(biw.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(biw.x.in($$0))), bkl.a($$0))
      );
      $$0.register(
         $$1,
         "minecraft:trader_llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(biw.t.in($$0)), "SaddleItem", biw.t.in($$0), "DecorItem", biw.t.in($$0), bkl.a($$0))
      );
      return $$1;
   }
}
