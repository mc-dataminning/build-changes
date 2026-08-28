import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bjp extends Schema {
   public bjp(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bhu.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bhu.A.in($$0)),
               "ender_pearls",
               DSL.list(bhu.A.in($$0)),
               "Inventory",
               DSL.list(bhu.t.in($$0)),
               "EnderItems",
               DSL.list(bhu.t.in($$0))
            )
      );
      $$0.registerType(true, bhu.A, () -> DSL.optionalFields("Passengers", DSL.list(bhu.A.in($$0)), bhu.B.in($$0)));
   }
}
