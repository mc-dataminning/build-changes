import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class axg extends Schema {
   public axg(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, avw.y, () -> DSL.constType(axd.a()));
      $$0.registerType(
         false,
         avw.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", avw.p.in($$0)),
               "Inventory",
               DSL.list(avw.m.in($$0)),
               "EnderItems",
               DSL.list(avw.m.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  avw.p.in($$0),
                  "ShoulderEntityRight",
                  avw.p.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(avw.y.in($$0)), "toBeDisplayed", DSL.list(avw.y.in($$0)))
               )
            )
      );
      $$0.registerType(false, avw.d, () -> DSL.compoundList(DSL.list(avw.m.in($$0))));
   }
}
