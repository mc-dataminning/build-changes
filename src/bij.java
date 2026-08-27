import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bij extends bfq {
   public bij(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register($$1, "minecraft:llama", $$1x -> DSL.optionalFields("Items", DSL.list(beh.t.in($$0)), "SaddleItem", beh.t.in($$0), bfr.a($$0)));
      return $$1;
   }
}
