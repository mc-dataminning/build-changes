import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bbm extends Schema {
   public bbm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(true, baa.B, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", baa.w.in($$0))), "SpawnData", baa.w.in($$0)));
   }
}
