import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bhx extends Schema {
   public bhx(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(true, bgh.F, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", bgh.A.in($$0))), "SpawnData", bgh.A.in($$0)));
   }
}
