import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bhv extends Schema {
   public bhv(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bgg.J, () -> DSL.constType(bhs.a()));
      $$0.registerType(
         false,
         bgg.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bgg.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bgg.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bgg.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bgg.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bgg.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bgg.J.in($$0)), "toBeDisplayed", DSL.list(bgg.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bgg.d, () -> DSL.compoundList(DSL.list(bgg.t.in($$0))));
   }
}
