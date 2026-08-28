import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class blf extends Schema {
   public blf(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bjd.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bjd.C.in($$0)),
               "ender_pearls",
               DSL.list(bjd.C.in($$0)),
               "Inventory",
               DSL.list(bjd.t.in($$0)),
               "EnderItems",
               DSL.list(bjd.t.in($$0))
            )
      );
      $$0.registerType(true, bjd.C, () -> DSL.optionalFields("Passengers", DSL.list(bjd.C.in($$0)), bjd.D.in($$0)));
   }
}
