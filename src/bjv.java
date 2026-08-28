import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bjv extends Schema {
   public bjv(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bia.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bia.A.in($$0)),
               "ender_pearls",
               DSL.list(bia.A.in($$0)),
               "Inventory",
               DSL.list(bia.t.in($$0)),
               "EnderItems",
               DSL.list(bia.t.in($$0))
            )
      );
      $$0.registerType(true, bia.A, () -> DSL.optionalFields("Passengers", DSL.list(bia.A.in($$0)), bia.B.in($$0)));
   }
}
