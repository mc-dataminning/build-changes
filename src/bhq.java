import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bhq extends Schema {
   public bhq(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bfy.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bfy.y.in($$0)), "Inventory", DSL.list(bfy.t.in($$0)), "EnderItems", DSL.list(bfy.t.in($$0))
            )
      );
      $$0.registerType(true, bfy.y, () -> DSL.optionalFields("Passengers", DSL.list(bfy.y.in($$0)), bfy.z.in($$0)));
   }
}
