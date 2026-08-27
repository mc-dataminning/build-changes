import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bhg extends Schema {
   public bhg(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bfp.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bfp.y.in($$0)), "Inventory", DSL.list(bfp.t.in($$0)), "EnderItems", DSL.list(bfp.t.in($$0))
            )
      );
      $$0.registerType(true, bfp.y, () -> DSL.optionalFields("Passengers", DSL.list(bfp.y.in($$0)), bfp.z.in($$0)));
   }
}
