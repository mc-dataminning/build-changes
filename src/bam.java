import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bam extends Schema {
   public bam(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         ayx.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", ayx.w.in($$0)), "Inventory", DSL.list(ayx.t.in($$0)), "EnderItems", DSL.list(ayx.t.in($$0))
            )
      );
      $$0.registerType(true, ayx.w, () -> DSL.optionalFields("Passengers", DSL.list(ayx.w.in($$0)), ayx.x.in($$0)));
   }
}
