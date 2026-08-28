import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjl extends Schema {
   public bjl(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bhu.J, () -> DSL.constType(bji.a()));
      $$0.registerType(
         false,
         bhu.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bhu.A.in($$0))),
                  Pair.of("ender_pearls", DSL.list(bhu.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bhu.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bhu.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bhu.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bhu.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bhu.J.in($$0)), "toBeDisplayed", DSL.list(bhu.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bhu.d, () -> DSL.compoundList(DSL.list(bhu.t.in($$0))));
   }
}
