import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class biz extends Schema {
   public biz(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, bhk.J, () -> DSL.constType(biw.a()));
      $$0.registerType(
         false,
         bhk.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bhk.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bhk.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bhk.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bhk.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bhk.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bhk.J.in($$0)), "toBeDisplayed", DSL.list(bhk.J.in($$0))))
               }
            )
      );
      $$0.registerType(false, bhk.d, () -> DSL.compoundList(DSL.list(bhk.t.in($$0))));
   }
}
