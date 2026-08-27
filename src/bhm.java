import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bhm extends Schema {
   public bhm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bfy.H, () -> DSL.constType(bhj.a()));
      $$0.registerType(
         false,
         bfy.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bfy.y.in($$0))),
                  Pair.of("Inventory", DSL.list(bfy.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bfy.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bfy.y.in($$0)),
                  Pair.of("ShoulderEntityRight", bfy.y.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bfy.H.in($$0)), "toBeDisplayed", DSL.list(bfy.H.in($$0))))
               }
            )
      );
      $$0.registerType(false, bfy.d, () -> DSL.compoundList(DSL.list(bfy.t.in($$0))));
   }
}
