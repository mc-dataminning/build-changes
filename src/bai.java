import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bai extends Schema {
   public bai(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, ayx.F, () -> DSL.constType(baf.a()));
      $$0.registerType(
         false,
         ayx.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", ayx.w.in($$0)),
               "Inventory",
               DSL.list(ayx.t.in($$0)),
               "EnderItems",
               DSL.list(ayx.t.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  ayx.w.in($$0),
                  "ShoulderEntityRight",
                  ayx.w.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(ayx.F.in($$0)), "toBeDisplayed", DSL.list(ayx.F.in($$0)))
               )
            )
      );
      $$0.registerType(false, ayx.d, () -> DSL.compoundList(DSL.list(ayx.t.in($$0))));
   }
}
