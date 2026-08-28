import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bon extends bku {
   public bon(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         biz.b,
         () -> DSL.and(
               biz.A.in($$0),
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("RootVehicle", DSL.optionalFields("Entity", biz.C.in($$0))),
                     Pair.of("ender_pearls", DSL.list(biz.C.in($$0))),
                     Pair.of("Inventory", DSL.list(biz.t.in($$0))),
                     Pair.of("EnderItems", DSL.list(biz.t.in($$0))),
                     Pair.of("ShoulderEntityLeft", biz.C.in($$0)),
                     Pair.of("ShoulderEntityRight", biz.C.in($$0)),
                     Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(biz.L.in($$0)), "toBeDisplayed", DSL.list(biz.L.in($$0))))
                  }
               )
            )
      );
   }
}
