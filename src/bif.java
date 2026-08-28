import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bif extends Schema {
   public bif(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bgq.J, () -> DSL.constType(bic.a()));
      $$0.registerType(
         false,
         bgq.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bgq.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bgq.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bgq.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bgq.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bgq.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bgq.J.in($$0)), "toBeDisplayed", DSL.list(bgq.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bgq.d, () -> DSL.compoundList(DSL.list(bgq.t.in($$0))));
   }
}
