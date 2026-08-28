import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bjg extends Schema {
   public bjg(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bhm.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bhm.A.in($$0)), "Inventory", DSL.list(bhm.t.in($$0)), "EnderItems", DSL.list(bhm.t.in($$0))
            )
      );
      $$0.registerType(true, bhm.A, () -> DSL.optionalFields("Passengers", DSL.list(bhm.A.in($$0)), bhm.B.in($$0)));
   }
}
