import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class big extends Schema {
   public big(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bgr.J, () -> DSL.constType(bid.a()));
      $$0.registerType(
         false,
         bgr.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bgr.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bgr.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bgr.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bgr.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bgr.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bgr.J.in($$0)), "toBeDisplayed", DSL.list(bgr.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bgr.d, () -> DSL.compoundList(DSL.list(bgr.t.in($$0))));
   }
}
