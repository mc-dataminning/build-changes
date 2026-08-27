import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bcm extends Schema {
   public bcm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bax.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bax.w.in($$0)), "Inventory", DSL.list(bax.t.in($$0)), "EnderItems", DSL.list(bax.t.in($$0))
            )
      );
      $$0.registerType(true, bax.w, () -> DSL.optionalFields("Passengers", DSL.list(bax.w.in($$0)), bax.x.in($$0)));
   }
}
