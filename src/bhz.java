import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bhz extends Schema {
   public bhz(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bgg.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bgg.A.in($$0)), "Inventory", DSL.list(bgg.t.in($$0)), "EnderItems", DSL.list(bgg.t.in($$0))
            )
      );
      $$0.registerType(true, bgg.A, () -> DSL.optionalFields("Passengers", DSL.list(bgg.A.in($$0)), bgg.B.in($$0)));
   }
}
