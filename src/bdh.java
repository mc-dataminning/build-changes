import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bdh extends Schema {
   public bdh(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bbw.G, () -> DSL.constType(bde.a()));
      $$0.registerType(
         false,
         bbw.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bbw.x.in($$0)),
               "Inventory",
               DSL.list(bbw.t.in($$0)),
               "EnderItems",
               DSL.list(bbw.t.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  bbw.x.in($$0),
                  "ShoulderEntityRight",
                  bbw.x.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(bbw.G.in($$0)), "toBeDisplayed", DSL.list(bbw.G.in($$0)))
               )
            )
      );
      $$0.registerType(false, bbw.d, () -> DSL.compoundList(DSL.list(bbw.t.in($$0))));
   }
}
