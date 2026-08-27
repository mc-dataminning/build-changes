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
      $$0.registerType(false, bgf.H, () -> DSL.constType(bhp.a()));
      $$0.registerType(
         false,
         bgf.b,
         () -> azu.a(
               Pair.of("RootVehicle", DSL.optionalFields("Entity", bgf.y.in($$0))),
               Pair.of("Inventory", DSL.list(bgf.t.in($$0))),
               Pair.of("EnderItems", DSL.list(bgf.t.in($$0))),
               Pair.of("ShoulderEntityLeft", bgf.y.in($$0)),
               Pair.of("ShoulderEntityRight", bgf.y.in($$0)),
               Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bgf.H.in($$0)), "toBeDisplayed", DSL.list(bgf.H.in($$0))))
            )
      );
      $$0.registerType(false, bgf.d, () -> DSL.compoundList(DSL.list(bgf.t.in($$0))));
   }
}
