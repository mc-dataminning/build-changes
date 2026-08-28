import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bij extends Schema {
   public bij(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bgq.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bgq.A.in($$0)), "Inventory", DSL.list(bgq.t.in($$0)), "EnderItems", DSL.list(bgq.t.in($$0))
            )
      );
      $$0.registerType(true, bgq.A, () -> DSL.optionalFields("Passengers", DSL.list(bgq.A.in($$0)), bgq.B.in($$0)));
   }
}
