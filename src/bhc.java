import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bhc extends Schema {
   public bhc(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bfp.H, () -> DSL.constType(bgz.a()));
      $$0.registerType(
         false,
         bfp.b,
         () -> aze.a(
               Pair.of("RootVehicle", DSL.optionalFields("Entity", bfp.y.in($$0))),
               Pair.of("Inventory", DSL.list(bfp.t.in($$0))),
               Pair.of("EnderItems", DSL.list(bfp.t.in($$0))),
               Pair.of("ShoulderEntityLeft", bfp.y.in($$0)),
               Pair.of("ShoulderEntityRight", bfp.y.in($$0)),
               Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bfp.H.in($$0)), "toBeDisplayed", DSL.list(bfp.H.in($$0))))
            )
      );
      $$0.registerType(false, bfp.d, () -> DSL.compoundList(DSL.list(bfp.t.in($$0))));
   }
}
