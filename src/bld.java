import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bld extends Schema {
   public bld(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bjb.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bjb.C.in($$0)),
               "ender_pearls",
               DSL.list(bjb.C.in($$0)),
               "Inventory",
               DSL.list(bjb.t.in($$0)),
               "EnderItems",
               DSL.list(bjb.t.in($$0))
            )
      );
      $$0.registerType(true, bjb.C, () -> DSL.optionalFields("Passengers", DSL.list(bjb.C.in($$0)), bjb.D.in($$0)));
   }
}
