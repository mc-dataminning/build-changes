import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bbp extends Schema {
   public bbp(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         baa.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", baa.w.in($$0)), "Inventory", DSL.list(baa.t.in($$0)), "EnderItems", DSL.list(baa.t.in($$0))
            )
      );
      $$0.registerType(true, baa.w, () -> DSL.optionalFields("Passengers", DSL.list(baa.w.in($$0)), baa.x.in($$0)));
   }
}
