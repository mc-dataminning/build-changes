import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bmn extends bkr {
   public bmn(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.registerSimple($$1, "minecraft:glow_squid");
      $$0.register($$1, "minecraft:glow_item_frame", $$1x -> DSL.optionalFields("Item", biw.t.in($$0)));
      return $$1;
   }
}
