import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjm extends Schema {
   public bjm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bhv.J, () -> DSL.constType(bjj.a()));
      $$0.registerType(
         false,
         bhv.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bhv.A.in($$0))),
                  Pair.of("ender_pearls", DSL.list(bhv.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bhv.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bhv.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bhv.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bhv.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bhv.J.in($$0)), "toBeDisplayed", DSL.list(bhv.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bhv.d, () -> DSL.compoundList(DSL.list(bhv.t.in($$0))));
   }
}
