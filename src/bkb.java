import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bkb extends Schema {
   public bkb(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bic.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bic.B.in($$0)),
               "ender_pearls",
               DSL.list(bic.B.in($$0)),
               "Inventory",
               DSL.list(bic.t.in($$0)),
               "EnderItems",
               DSL.list(bic.t.in($$0))
            )
      );
      $$0.registerType(true, bic.B, () -> DSL.optionalFields("Passengers", DSL.list(bic.B.in($$0)), bic.C.in($$0)));
   }
}
