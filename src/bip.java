import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bip extends Schema {
   public bip(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bgx.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bgx.A.in($$0)), "Inventory", DSL.list(bgx.t.in($$0)), "EnderItems", DSL.list(bgx.t.in($$0))
            )
      );
      $$0.registerType(true, bgx.A, () -> DSL.optionalFields("Passengers", DSL.list(bgx.A.in($$0)), bgx.B.in($$0)));
   }
}
