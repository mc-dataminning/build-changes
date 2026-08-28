import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bnb extends bkr {
   public bnb(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register($$1, "minecraft:item_display", $$1x -> DSL.optionalFields("item", biw.t.in($$0)));
      $$0.register($$1, "minecraft:block_display", $$1x -> DSL.optionalFields("block_state", biw.u.in($$0)));
      $$0.register($$1, "minecraft:text_display", () -> DSL.optionalFields("text", biw.z.in($$0)));
      return $$1;
   }
}
