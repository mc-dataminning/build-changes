import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bjo extends bht {
   public bjo(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bgh.F,
         () -> DSL.optionalFields(
               "SpawnPotentials", DSL.list(DSL.fields("data", DSL.fields("entity", bgh.A.in($$0)))), "SpawnData", DSL.fields("entity", bgh.A.in($$0))
            )
      );
   }
}
