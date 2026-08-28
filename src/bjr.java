import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjr extends Schema {
   public bjr(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bia.J, () -> DSL.constType(bjo.a()));
      $$0.registerType(
         false,
         bia.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bia.A.in($$0))),
                  Pair.of("ender_pearls", DSL.list(bia.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bia.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bia.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bia.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bia.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bia.J.in($$0)), "toBeDisplayed", DSL.list(bia.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bia.d, () -> DSL.compoundList(DSL.list(bia.t.in($$0))));
   }
}
