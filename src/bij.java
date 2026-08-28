import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bij extends Schema {
   public bij(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bgv.J, () -> DSL.constType(big.a()));
      $$0.registerType(
         false,
         bgv.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bgv.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bgv.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bgv.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bgv.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bgv.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bgv.J.in($$0)), "toBeDisplayed", DSL.list(bgv.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bgv.d, () -> DSL.compoundList(DSL.list(bgv.t.in($$0))));
   }
}
