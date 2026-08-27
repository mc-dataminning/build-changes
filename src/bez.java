import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bez extends Schema {
   public bez(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bdn.G, () -> DSL.constType(bew.a()));
      $$0.registerType(
         false,
         bdn.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bdn.x.in($$0)),
               "Inventory",
               DSL.list(bdn.t.in($$0)),
               "EnderItems",
               DSL.list(bdn.t.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  bdn.x.in($$0),
                  "ShoulderEntityRight",
                  bdn.x.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(bdn.G.in($$0)), "toBeDisplayed", DSL.list(bdn.G.in($$0)))
               )
            )
      );
      $$0.registerType(false, bdn.d, () -> DSL.compoundList(DSL.list(bdn.t.in($$0))));
   }
}
