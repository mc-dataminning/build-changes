import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bdl extends Schema {
   public bdl(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bbw.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", bbw.w.in($$0)), "Inventory", DSL.list(bbw.t.in($$0)), "EnderItems", DSL.list(bbw.t.in($$0))
            )
      );
      $$0.registerType(true, bbw.w, () -> DSL.optionalFields("Passengers", DSL.list(bbw.w.in($$0)), bbw.x.in($$0)));
   }
}
