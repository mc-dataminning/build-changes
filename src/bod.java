import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bod extends Schema {
   public bod(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$1.remove("EntityHorse");
      $$0.register($$1, "Horse", () -> DSL.optionalFields("ArmorItem", biq.t.in($$0), "SaddleItem", biq.t.in($$0)));
      $$0.register($$1, "Donkey", () -> DSL.optionalFields("Items", DSL.list(biq.t.in($$0)), "SaddleItem", biq.t.in($$0)));
      $$0.register($$1, "Mule", () -> DSL.optionalFields("Items", DSL.list(biq.t.in($$0)), "SaddleItem", biq.t.in($$0)));
      $$0.register($$1, "ZombieHorse", () -> DSL.optionalFields("SaddleItem", biq.t.in($$0)));
      $$0.register($$1, "SkeletonHorse", () -> DSL.optionalFields("SaddleItem", biq.t.in($$0)));
      return $$1;
   }
}
