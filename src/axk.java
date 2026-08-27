import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class axk extends Schema {
   public axk(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         avw.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", avw.p.in($$0)), "Inventory", DSL.list(avw.m.in($$0)), "EnderItems", DSL.list(avw.m.in($$0))
            )
      );
      $$0.registerType(true, avw.p, () -> DSL.optionalFields("Passengers", DSL.list(avw.p.in($$0)), avw.q.in($$0)));
   }
}
