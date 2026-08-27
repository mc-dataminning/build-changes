import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bfd extends bdd {
   public bfd(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register(
         $$1,
         "minecraft:warden",
         () -> DSL.optionalFields("listener", DSL.optionalFields("event", DSL.optionalFields("game_event", bbv.A.in($$0))), bde.a($$0))
      );
      return $$1;
   }
}
