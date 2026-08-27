import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bdf extends Schema {
   public bdf(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bbq.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bbq.w.in($$0)), "Inventory", DSL.list(bbq.t.in($$0)), "EnderItems", DSL.list(bbq.t.in($$0))
            )
      );
      $$0.registerType(true, bbq.w, () -> DSL.optionalFields("Passengers", DSL.list(bbq.w.in($$0)), bbq.x.in($$0)));
   }
}
