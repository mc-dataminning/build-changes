import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bby extends Schema {
   public bby(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, ban.F, () -> DSL.constType(bbv.a()));
      $$0.registerType(
         false,
         ban.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", ban.w.in($$0)),
               "Inventory",
               DSL.list(ban.t.in($$0)),
               "EnderItems",
               DSL.list(ban.t.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  ban.w.in($$0),
                  "ShoulderEntityRight",
                  ban.w.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(ban.F.in($$0)), "toBeDisplayed", DSL.list(ban.F.in($$0)))
               )
            )
      );
      $$0.registerType(false, ban.d, () -> DSL.compoundList(DSL.list(ban.t.in($$0))));
   }
}
