import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class blw extends bkb {
   public blw(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bin.F,
         () -> DSL.optionalFields(
               "SpawnPotentials", DSL.list(DSL.fields("data", DSL.fields("entity", bin.A.in($$0)))), "SpawnData", DSL.fields("entity", bin.A.in($$0))
            )
      );
   }
}
