import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bkg extends bjj {
   public bkg(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register($$1, "minecraft:panda", () -> bjk.a($$0));
      $$0.register($$1, "minecraft:pillager", $$1x -> DSL.optionalFields("Inventory", DSL.list(bhv.t.in($$0)), bjk.a($$0)));
      return $$1;
   }
}
