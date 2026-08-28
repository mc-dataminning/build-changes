import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bhs extends Schema {
   public bhs(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bgd.J, () -> DSL.constType(bhp.a()));
      $$0.registerType(
         false,
         bgd.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bgd.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bgd.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bgd.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bgd.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bgd.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bgd.J.in($$0)), "toBeDisplayed", DSL.list(bgd.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bgd.d, () -> DSL.compoundList(DSL.list(bgd.t.in($$0))));
   }
}
