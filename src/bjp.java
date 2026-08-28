import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjp extends Schema {
   public bjp(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bhy.J, () -> DSL.constType(bjm.a()));
      $$0.registerType(
         false,
         bhy.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bhy.A.in($$0))),
                  Pair.of("ender_pearls", DSL.list(bhy.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bhy.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bhy.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bhy.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bhy.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bhy.J.in($$0)), "toBeDisplayed", DSL.list(bhy.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bhy.d, () -> DSL.compoundList(DSL.list(bhy.t.in($$0))));
   }
}
