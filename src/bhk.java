import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bhk extends bfc {
   public bhk(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerBlockEntities($$0);
      $$0.register($$1, "minecraft:decorated_pot", () -> DSL.optionalFields("shards", DSL.list(bdt.A.in($$0)), "item", bdt.t.in($$0)));
      $$0.register($$1, "minecraft:suspicious_sand", () -> DSL.optionalFields("item", bdt.t.in($$0)));
      return $$1;
   }
}
