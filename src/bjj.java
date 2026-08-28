import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjj extends Schema {
   public bjj(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bhs.J, () -> DSL.constType(bjg.a()));
      $$0.registerType(
         false,
         bhs.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bhs.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bhs.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bhs.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bhs.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bhs.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bhs.J.in($$0)), "toBeDisplayed", DSL.list(bhs.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bhs.d, () -> DSL.compoundList(DSL.list(bhs.t.in($$0))));
   }
}
