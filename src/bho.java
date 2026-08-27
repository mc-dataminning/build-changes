import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bho extends Schema {
   public bho(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bga.H, () -> DSL.constType(bhl.a()));
      $$0.registerType(
         false,
         bga.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bga.y.in($$0))),
                  Pair.of("Inventory", DSL.list(bga.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bga.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bga.y.in($$0)),
                  Pair.of("ShoulderEntityRight", bga.y.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bga.H.in($$0)), "toBeDisplayed", DSL.list(bga.H.in($$0))))
               }
            )
      );
      $$0.registerType(false, bga.d, () -> DSL.compoundList(DSL.list(bga.t.in($$0))));
   }
}
