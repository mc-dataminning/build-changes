import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bki extends Schema {
   public bki(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bin.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bin.A.in($$0)),
               "ender_pearls",
               DSL.list(bin.A.in($$0)),
               "Inventory",
               DSL.list(bin.t.in($$0)),
               "EnderItems",
               DSL.list(bin.t.in($$0))
            )
      );
      $$0.registerType(true, bin.A, () -> DSL.optionalFields("Passengers", DSL.list(bin.A.in($$0)), bin.B.in($$0)));
   }
}
