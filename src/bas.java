import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bas extends Schema {
   public bas(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         azd.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", azd.w.in($$0)), "Inventory", DSL.list(azd.t.in($$0)), "EnderItems", DSL.list(azd.t.in($$0))
            )
      );
      $$0.registerType(true, azd.w, () -> DSL.optionalFields("Passengers", DSL.list(azd.w.in($$0)), azd.x.in($$0)));
   }
}
