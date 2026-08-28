import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bkz extends Schema {
   public bkz(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bjb.L, () -> DSL.constType(bkw.a()));
      $$0.registerType(
         false,
         bjb.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bjb.C.in($$0))),
                  Pair.of("ender_pearls", DSL.list(bjb.C.in($$0))),
                  Pair.of("Inventory", DSL.list(bjb.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bjb.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bjb.C.in($$0)),
                  Pair.of("ShoulderEntityRight", bjb.C.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bjb.L.in($$0)), "toBeDisplayed", DSL.list(bjb.L.in($$0))))
               }
            )
      );
      $$0.registerType(false, bjb.d, () -> DSL.compoundList(DSL.list(bjb.t.in($$0))));
   }
}
