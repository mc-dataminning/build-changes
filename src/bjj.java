import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bjj extends Schema {
   public bjj(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bho.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bho.A.in($$0)), "Inventory", DSL.list(bho.t.in($$0)), "EnderItems", DSL.list(bho.t.in($$0))
            )
      );
      $$0.registerType(true, bho.A, () -> DSL.optionalFields("Passengers", DSL.list(bho.A.in($$0)), bho.B.in($$0)));
   }
}
