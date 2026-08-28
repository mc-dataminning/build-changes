import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class blk extends Schema {
   public blk(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bjm.L, () -> DSL.constType(blh.a()));
      $$0.registerType(
         false,
         bjm.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bjm.C.in($$0))),
                  Pair.of("ender_pearls", DSL.list(bjm.C.in($$0))),
                  Pair.of("Inventory", DSL.list(bjm.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bjm.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bjm.C.in($$0)),
                  Pair.of("ShoulderEntityRight", bjm.C.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bjm.L.in($$0)), "toBeDisplayed", DSL.list(bjm.L.in($$0))))
               }
            )
      );
      $$0.registerType(false, bjm.d, () -> DSL.compoundList(DSL.list(bjm.t.in($$0))));
   }
}
