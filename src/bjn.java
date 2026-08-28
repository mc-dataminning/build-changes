import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjn extends Schema {
   public bjn(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bhw.J, () -> DSL.constType(bjk.a()));
      $$0.registerType(
         false,
         bhw.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bhw.A.in($$0))),
                  Pair.of("ender_pearls", DSL.list(bhw.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bhw.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bhw.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bhw.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bhw.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bhw.J.in($$0)), "toBeDisplayed", DSL.list(bhw.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bhw.d, () -> DSL.compoundList(DSL.list(bhw.t.in($$0))));
   }
}
