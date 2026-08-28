import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bik extends Schema {
   public bik(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bgw.J, () -> DSL.constType(bih.a()));
      $$0.registerType(
         false,
         bgw.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bgw.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bgw.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bgw.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bgw.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bgw.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bgw.J.in($$0)), "toBeDisplayed", DSL.list(bgw.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bgw.d, () -> DSL.compoundList(DSL.list(bgw.t.in($$0))));
   }
}
