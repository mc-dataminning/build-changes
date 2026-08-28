import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bor extends bky {
   public bor(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bjd.b,
         () -> DSL.and(
               bjd.A.in($$0),
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("RootVehicle", DSL.optionalFields("Entity", bjd.C.in($$0))),
                     Pair.of("ender_pearls", DSL.list(bjd.C.in($$0))),
                     Pair.of("Inventory", DSL.list(bjd.t.in($$0))),
                     Pair.of("EnderItems", DSL.list(bjd.t.in($$0))),
                     Pair.of("ShoulderEntityLeft", bjd.C.in($$0)),
                     Pair.of("ShoulderEntityRight", bjd.C.in($$0)),
                     Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bjd.L.in($$0)), "toBeDisplayed", DSL.list(bjd.L.in($$0))))
                  }
               )
            )
      );
   }
}
