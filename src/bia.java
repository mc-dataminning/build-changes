import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bia extends Schema {
   public bia(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bgh.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bgh.A.in($$0)), "Inventory", DSL.list(bgh.t.in($$0)), "EnderItems", DSL.list(bgh.t.in($$0))
            )
      );
      $$0.registerType(true, bgh.A, () -> DSL.optionalFields("Passengers", DSL.list(bgh.A.in($$0)), bgh.B.in($$0)));
   }
}
