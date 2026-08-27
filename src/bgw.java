import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bgw extends Schema {
   public bgw(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bff.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bff.y.in($$0)), "Inventory", DSL.list(bff.t.in($$0)), "EnderItems", DSL.list(bff.t.in($$0))
            )
      );
      $$0.registerType(true, bff.y, () -> DSL.optionalFields("Passengers", DSL.list(bff.y.in($$0)), bff.z.in($$0)));
   }
}
