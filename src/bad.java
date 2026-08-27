import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bad extends Schema {
   public bad(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, ays.F, () -> DSL.constType(baa.a()));
      $$0.registerType(
         false,
         ays.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", ays.w.in($$0)),
               "Inventory",
               DSL.list(ays.t.in($$0)),
               "EnderItems",
               DSL.list(ays.t.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  ays.w.in($$0),
                  "ShoulderEntityRight",
                  ays.w.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(ays.F.in($$0)), "toBeDisplayed", DSL.list(ays.F.in($$0)))
               )
            )
      );
      $$0.registerType(false, ays.d, () -> DSL.compoundList(DSL.list(ays.t.in($$0))));
   }
}
