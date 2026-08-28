import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bkm extends bhs {
   public bkm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register($$1, "minecraft:trader_llama", $$1x -> DSL.optionalFields("Items", DSL.list(bgg.t.in($$0)), "SaddleItem", bgg.t.in($$0), bht.a($$0)));
      return $$1;
   }
}
