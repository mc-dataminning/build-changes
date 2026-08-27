import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bhs extends Schema {
   public bhs(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bga.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bga.y.in($$0)), "Inventory", DSL.list(bga.t.in($$0)), "EnderItems", DSL.list(bga.t.in($$0))
            )
      );
      $$0.registerType(true, bga.y, () -> DSL.optionalFields("Passengers", DSL.list(bga.y.in($$0)), bga.z.in($$0)));
   }
}
