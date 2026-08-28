import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bmn extends bko {
   public bmn(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bit.H,
         () -> DSL.optionalFields(
               "SpawnPotentials", DSL.list(DSL.fields("data", DSL.fields("entity", bit.C.in($$0)))), "SpawnData", DSL.fields("entity", bit.C.in($$0))
            )
      );
   }
}
