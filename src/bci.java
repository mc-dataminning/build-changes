import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bci extends Schema {
   public bci(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bax.F, () -> DSL.constType(bcf.a()));
      $$0.registerType(
         false,
         bax.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bax.w.in($$0)),
               "Inventory",
               DSL.list(bax.t.in($$0)),
               "EnderItems",
               DSL.list(bax.t.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  bax.w.in($$0),
                  "ShoulderEntityRight",
                  bax.w.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(bax.F.in($$0)), "toBeDisplayed", DSL.list(bax.F.in($$0)))
               )
            )
      );
      $$0.registerType(false, bax.d, () -> DSL.compoundList(DSL.list(bax.t.in($$0))));
   }
}
