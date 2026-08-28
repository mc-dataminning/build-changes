import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bim extends Schema {
   public bim(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bgx.J, () -> DSL.constType(bij.a()));
      $$0.registerType(
         false,
         bgx.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bgx.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bgx.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bgx.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bgx.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bgx.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bgx.J.in($$0)), "toBeDisplayed", DSL.list(bgx.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bgx.d, () -> DSL.compoundList(DSL.list(bgx.t.in($$0))));
   }
}
