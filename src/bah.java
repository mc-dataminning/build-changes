import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bah extends Schema {
   public bah(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         ays.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", ays.w.in($$0)), "Inventory", DSL.list(ays.t.in($$0)), "EnderItems", DSL.list(ays.t.in($$0))
            )
      );
      $$0.registerType(true, ays.w, () -> DSL.optionalFields("Passengers", DSL.list(ays.w.in($$0)), ays.x.in($$0)));
   }
}
