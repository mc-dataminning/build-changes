import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bgn extends Schema {
   public bgn(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bfa.H, () -> DSL.constType(bgk.a()));
      $$0.registerType(
         false,
         bfa.b,
         () -> ays.a(
               Pair.of("RootVehicle", DSL.optionalFields("Entity", bfa.y.in($$0))),
               Pair.of("Inventory", DSL.list(bfa.t.in($$0))),
               Pair.of("EnderItems", DSL.list(bfa.t.in($$0))),
               Pair.of("ShoulderEntityLeft", bfa.y.in($$0)),
               Pair.of("ShoulderEntityRight", bfa.y.in($$0)),
               Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bfa.H.in($$0)), "toBeDisplayed", DSL.list(bfa.H.in($$0))))
            )
      );
      $$0.registerType(false, bfa.d, () -> DSL.compoundList(DSL.list(bfa.t.in($$0))));
   }
}
