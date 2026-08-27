import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bab extends Schema {
   public bab(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         aym.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", aym.w.in($$0)), "Inventory", DSL.list(aym.t.in($$0)), "EnderItems", DSL.list(aym.t.in($$0))
            )
      );
      $$0.registerType(true, aym.w, () -> DSL.optionalFields("Passengers", DSL.list(aym.w.in($$0)), aym.x.in($$0)));
   }
}
