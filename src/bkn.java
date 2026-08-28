import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bkn extends Schema {
   public bkn(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bis.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bis.A.in($$0)),
               "ender_pearls",
               DSL.list(bis.A.in($$0)),
               "Inventory",
               DSL.list(bis.t.in($$0)),
               "EnderItems",
               DSL.list(bis.t.in($$0))
            )
      );
      $$0.registerType(true, bis.A, () -> DSL.optionalFields("Passengers", DSL.list(bis.A.in($$0)), bis.B.in($$0)));
   }
}
