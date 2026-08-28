import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class blm extends bjg {
   public blm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register($$1, "minecraft:item_display", $$1x -> DSL.optionalFields("item", bhs.t.in($$0)));
      $$0.register($$1, "minecraft:block_display", $$1x -> DSL.optionalFields("block_state", bhs.u.in($$0)));
      $$0.registerSimple($$1, "minecraft:text_display");
      return $$1;
   }
}
