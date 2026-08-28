import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bmp extends bju {
   public bmp(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerBlockEntities($$0);
      $$0.register(
         $$1,
         "minecraft:vault",
         () -> DSL.optionalFields(
               "config",
               DSL.optionalFields("key_item", bic.t.in($$0)),
               "server_data",
               DSL.optionalFields("items_to_eject", DSL.list(bic.t.in($$0))),
               "shared_data",
               DSL.optionalFields("display_item", bic.t.in($$0))
            )
      );
      return $$1;
   }
}
