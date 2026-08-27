import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bhf extends Schema {
   public bhf(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bfs.H, () -> DSL.constType(bhc.a()));
      $$0.registerType(
         false,
         bfs.b,
         () -> azh.a(
               Pair.of("RootVehicle", DSL.optionalFields("Entity", bfs.y.in($$0))),
               Pair.of("Inventory", DSL.list(bfs.t.in($$0))),
               Pair.of("EnderItems", DSL.list(bfs.t.in($$0))),
               Pair.of("ShoulderEntityLeft", bfs.y.in($$0)),
               Pair.of("ShoulderEntityRight", bfs.y.in($$0)),
               Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bfs.H.in($$0)), "toBeDisplayed", DSL.list(bfs.H.in($$0))))
            )
      );
      $$0.registerType(false, bfs.d, () -> DSL.compoundList(DSL.list(bfs.t.in($$0))));
   }
}
