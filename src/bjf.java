import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjf extends Schema {
   public bjf(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bho.J, () -> DSL.constType(bjc.a()));
      $$0.registerType(
         false,
         bho.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bho.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bho.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bho.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bho.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bho.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bho.J.in($$0)), "toBeDisplayed", DSL.list(bho.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bho.d, () -> DSL.compoundList(DSL.list(bho.t.in($$0))));
   }
}
