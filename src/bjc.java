import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjc extends Schema {
   public bjc(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bhm.J, () -> DSL.constType(biz.a()));
      $$0.registerType(
         false,
         bhm.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bhm.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bhm.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bhm.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bhm.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bhm.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bhm.J.in($$0)), "toBeDisplayed", DSL.list(bhm.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bhm.d, () -> DSL.compoundList(DSL.list(bhm.t.in($$0))));
   }
}
