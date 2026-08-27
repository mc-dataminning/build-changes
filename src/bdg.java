import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bdg extends Schema {
   public bdg(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bbv.F, () -> DSL.constType(bdd.a()));
      $$0.registerType(
         false,
         bbv.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bbv.w.in($$0)),
               "Inventory",
               DSL.list(bbv.t.in($$0)),
               "EnderItems",
               DSL.list(bbv.t.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  bbv.w.in($$0),
                  "ShoulderEntityRight",
                  bbv.w.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(bbv.F.in($$0)), "toBeDisplayed", DSL.list(bbv.F.in($$0)))
               )
            )
      );
      $$0.registerType(false, bbv.d, () -> DSL.compoundList(DSL.list(bbv.t.in($$0))));
   }
}
