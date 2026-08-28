import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bkm extends Schema {
   public bkm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, biq.L, () -> DSL.constType(bkj.a()));
      $$0.registerType(
         false,
         biq.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", biq.C.in($$0))),
                  Pair.of("ender_pearls", DSL.list(biq.C.in($$0))),
                  Pair.of("Inventory", DSL.list(biq.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(biq.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", biq.C.in($$0)),
                  Pair.of("ShoulderEntityRight", biq.C.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(biq.L.in($$0)), "toBeDisplayed", DSL.list(biq.L.in($$0))))
               }
            )
      );
      $$0.registerType(false, biq.d, () -> DSL.compoundList(DSL.list(biq.t.in($$0))));
   }
}
