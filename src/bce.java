import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bce extends Schema {
   public bce(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bat.F, () -> DSL.constType(bcb.a()));
      $$0.registerType(
         false,
         bat.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bat.w.in($$0)),
               "Inventory",
               DSL.list(bat.t.in($$0)),
               "EnderItems",
               DSL.list(bat.t.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  bat.w.in($$0),
                  "ShoulderEntityRight",
                  bat.w.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(bat.F.in($$0)), "toBeDisplayed", DSL.list(bat.F.in($$0)))
               )
            )
      );
      $$0.registerType(false, bat.d, () -> DSL.compoundList(DSL.list(bat.t.in($$0))));
   }
}
