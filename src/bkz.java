import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bkz extends Schema {
   public bkz(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bix.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bix.C.in($$0)),
               "ender_pearls",
               DSL.list(bix.C.in($$0)),
               "Inventory",
               DSL.list(bix.t.in($$0)),
               "EnderItems",
               DSL.list(bix.t.in($$0))
            )
      );
      $$0.registerType(true, bix.C, () -> DSL.optionalFields("Passengers", DSL.list(bix.C.in($$0)), bix.D.in($$0)));
   }
}
