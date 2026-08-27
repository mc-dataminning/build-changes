import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class baa extends Schema {
   public baa(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, ayp.F, () -> DSL.constType(azx.a()));
      $$0.registerType(
         false,
         ayp.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", ayp.w.in($$0)),
               "Inventory",
               DSL.list(ayp.t.in($$0)),
               "EnderItems",
               DSL.list(ayp.t.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  ayp.w.in($$0),
                  "ShoulderEntityRight",
                  ayp.w.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(ayp.F.in($$0)), "toBeDisplayed", DSL.list(ayp.F.in($$0)))
               )
            )
      );
      $$0.registerType(false, ayp.d, () -> DSL.compoundList(DSL.list(ayp.t.in($$0))));
   }
}
