import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bjd extends Schema {
   public bjd(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bhk.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bhk.A.in($$0)), "Inventory", DSL.list(bhk.t.in($$0)), "EnderItems", DSL.list(bhk.t.in($$0))
            )
      );
      $$0.registerType(true, bhk.A, () -> DSL.optionalFields("Passengers", DSL.list(bhk.A.in($$0)), bhk.B.in($$0)));
   }
}
