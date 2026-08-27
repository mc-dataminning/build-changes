import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bak extends Schema {
   public bak(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, ayz.F, () -> DSL.constType(bah.a()));
      $$0.registerType(
         false,
         ayz.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", ayz.w.in($$0)),
               "Inventory",
               DSL.list(ayz.t.in($$0)),
               "EnderItems",
               DSL.list(ayz.t.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  ayz.w.in($$0),
                  "ShoulderEntityRight",
                  ayz.w.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(ayz.F.in($$0)), "toBeDisplayed", DSL.list(ayz.F.in($$0)))
               )
            )
      );
      $$0.registerType(false, ayz.d, () -> DSL.compoundList(DSL.list(ayz.t.in($$0))));
   }
}
