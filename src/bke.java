import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bke extends Schema {
   public bke(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bin.J, () -> DSL.constType(bkb.a()));
      $$0.registerType(
         false,
         bin.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bin.A.in($$0))),
                  Pair.of("ender_pearls", DSL.list(bin.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bin.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bin.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bin.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bin.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bin.J.in($$0)), "toBeDisplayed", DSL.list(bin.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bin.d, () -> DSL.compoundList(DSL.list(bin.t.in($$0))));
   }
}
