import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bih extends bhp {
   public bih(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> bhq.a($$0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      a($$0, $$1, "minecraft:turtle");
      a($$0, $$1, "minecraft:cod_mob");
      a($$0, $$1, "minecraft:tropical_fish");
      a($$0, $$1, "minecraft:salmon_mob");
      a($$0, $$1, "minecraft:puffer_fish");
      a($$0, $$1, "minecraft:phantom");
      a($$0, $$1, "minecraft:dolphin");
      a($$0, $$1, "minecraft:drowned");
      $$0.register($$1, "minecraft:trident", $$1x -> DSL.optionalFields("inBlockState", bgf.u.in($$0), "Trident", bgf.t.in($$0)));
      return $$1;
   }
}
