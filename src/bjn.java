import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bjn extends bhl {
   public bjn(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register(
         $$1,
         "minecraft:allay",
         () -> DSL.optionalFields(
               "ArmorItems",
               DSL.list(bga.t.in($$0)),
               "HandItems",
               DSL.list(bga.t.in($$0)),
               "Inventory",
               DSL.list(bga.t.in($$0)),
               "listener",
               DSL.optionalFields("event", DSL.optionalFields("game_event", bga.C.in($$0)))
            )
      );
      return $$1;
   }
}
