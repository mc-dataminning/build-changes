import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bcc extends Schema {
   public bcc(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         ban.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", ban.w.in($$0)), "Inventory", DSL.list(ban.t.in($$0)), "EnderItems", DSL.list(ban.t.in($$0))
            )
      );
      $$0.registerType(true, ban.w, () -> DSL.optionalFields("Passengers", DSL.list(ban.w.in($$0)), ban.x.in($$0)));
   }
}
