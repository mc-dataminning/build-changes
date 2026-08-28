import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bkr extends Schema {
   public bkr(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         biw.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", biw.A.in($$0)),
               "ender_pearls",
               DSL.list(biw.A.in($$0)),
               "Inventory",
               DSL.list(biw.t.in($$0)),
               "EnderItems",
               DSL.list(biw.t.in($$0))
            )
      );
      $$0.registerType(true, biw.A, () -> DSL.optionalFields("Passengers", DSL.list(biw.A.in($$0)), biw.B.in($$0)));
   }
}
