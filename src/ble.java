import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class ble extends bju {
   public ble(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   private static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register(
         $$1,
         $$2,
         () -> DSL.optionalFields(
               "Items", DSL.list(bic.t.in($$0)), "CustomName", bic.z.in($$0), "RecipesUsed", DSL.compoundList(bic.K.in($$0), DSL.constType(DSL.intType()))
            )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerBlockEntities($$0);
      a($$0, $$1, "minecraft:furnace");
      a($$0, $$1, "minecraft:smoker");
      a($$0, $$1, "minecraft:blast_furnace");
      return $$1;
   }
}
