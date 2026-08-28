import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bol extends bks {
   public bol(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bix.b,
         () -> DSL.and(
               bix.A.in($$0),
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("RootVehicle", DSL.optionalFields("Entity", bix.C.in($$0))),
                     Pair.of("ender_pearls", DSL.list(bix.C.in($$0))),
                     Pair.of("Inventory", DSL.list(bix.t.in($$0))),
                     Pair.of("EnderItems", DSL.list(bix.t.in($$0))),
                     Pair.of("ShoulderEntityLeft", bix.C.in($$0)),
                     Pair.of("ShoulderEntityRight", bix.C.in($$0)),
                     Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bix.L.in($$0)), "toBeDisplayed", DSL.list(bix.L.in($$0))))
                  }
               )
            )
      );
   }
}
