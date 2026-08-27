import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bae extends Schema {
   public bae(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         ayp.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", ayp.w.in($$0)), "Inventory", DSL.list(ayp.t.in($$0)), "EnderItems", DSL.list(ayp.t.in($$0))
            )
      );
      $$0.registerType(true, ayp.w, () -> DSL.optionalFields("Passengers", DSL.list(ayp.w.in($$0)), ayp.x.in($$0)));
   }
}
