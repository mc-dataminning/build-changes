import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class blb extends bjj {
   public blb(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register($$1, "minecraft:glow_squid", () -> bjk.a($$0));
      $$0.register($$1, "minecraft:glow_item_frame", $$1x -> DSL.optionalFields("Item", bhv.t.in($$0)));
      return $$1;
   }
}
