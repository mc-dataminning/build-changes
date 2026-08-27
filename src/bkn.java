import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bkn extends bhp {
   public bkn(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerBlockEntities($$0);
      $$0.registerSimple($$1, "minecraft:big_brain");
      $$0.registerSimple($$1, "minecraft:poisonous_potato_cutter");
      $$0.registerSimple($$1, "minecraft:fletching");
      $$0.registerSimple($$1, "minecraft:potato_refinery");
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      bif.a($$0, $$1, "minecraft:batato");
      bif.a($$0, $$1, "minecraft:toxifin");
      bif.a($$0, $$1, "minecraft:plaguewhale");
      bif.a($$0, $$1, "minecraft:poisonous_potato_zombie");
      bif.a($$0, $$1, "minecraft:mega_spud");
      $$0.registerSimple($$1, "minecraft:grid_carrier");
      $$0.registerSimple($$1, "minecraft:vine_projectile");
      $$0.registerSimple($$1, "minecraft:eye_of_potato");
      return $$1;
   }
}
