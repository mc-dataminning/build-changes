import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bmo extends Schema {
   public bmo(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register($$1, "ZombieVillager", $$1x -> DSL.optionalFields("Offers", DSL.optionalFields("Recipes", DSL.list(bhu.x.in($$0))), bjj.a($$0)));
      $$0.register($$1, "Husk", () -> bjj.a($$0));
      return $$1;
   }
}
