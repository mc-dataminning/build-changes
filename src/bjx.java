import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjx extends Schema {
   public bjx(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bic.K, () -> DSL.constType(bju.a()));
      $$0.registerType(
         false,
         bic.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bic.B.in($$0))),
                  Pair.of("ender_pearls", DSL.list(bic.B.in($$0))),
                  Pair.of("Inventory", DSL.list(bic.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bic.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bic.B.in($$0)),
                  Pair.of("ShoulderEntityRight", bic.B.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bic.K.in($$0)), "toBeDisplayed", DSL.list(bic.K.in($$0))))
               }
            )
      );
      $$0.registerType(false, bic.d, () -> DSL.compoundList(DSL.list(bic.t.in($$0))));
   }
}
