import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bff extends Schema {
   public bff(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bdt.G, () -> DSL.constType(bfc.a()));
      $$0.registerType(
         false,
         bdt.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bdt.x.in($$0)),
               "Inventory",
               DSL.list(bdt.t.in($$0)),
               "EnderItems",
               DSL.list(bdt.t.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  bdt.x.in($$0),
                  "ShoulderEntityRight",
                  bdt.x.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(bdt.G.in($$0)), "toBeDisplayed", DSL.list(bdt.G.in($$0)))
               )
            )
      );
      $$0.registerType(false, bdt.d, () -> DSL.compoundList(DSL.list(bdt.t.in($$0))));
   }
}
