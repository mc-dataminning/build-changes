import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bcj extends bah {
   public bcj(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register(
         $$1,
         $$2,
         () -> DSL.optionalFields(
               "ArmorItems",
               DSL.list(ayz.t.in($$0)),
               "HandItems",
               DSL.list(ayz.t.in($$0)),
               "listener",
               DSL.optionalFields("event", DSL.optionalFields("game_event", ayz.A.in($$0)))
            )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      a($$0, $$1, "minecraft:allay");
      return $$1;
   }
}
