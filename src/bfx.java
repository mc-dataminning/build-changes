import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bfx extends Schema {
   public bfx(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         beh.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", beh.x.in($$0)), "Inventory", DSL.list(beh.t.in($$0)), "EnderItems", DSL.list(beh.t.in($$0))
            )
      );
      $$0.registerType(true, beh.x, () -> DSL.optionalFields("Passengers", DSL.list(beh.x.in($$0)), beh.y.in($$0)));
   }
}
