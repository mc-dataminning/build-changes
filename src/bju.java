import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bju extends bji {
   public bju(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.registerSimple($$1, "minecraft:egg");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", bhu.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      $$0.registerSimple($$1, "minecraft:wither_skull");
      $$0.registerSimple($$1, "minecraft:xp_bottle");
      $$0.register($$1, "minecraft:arrow", () -> DSL.optionalFields("inBlockState", bhu.u.in($$0)));
      $$0.register($$1, "minecraft:enderman", () -> DSL.optionalFields("carriedBlockState", bhu.u.in($$0), bjj.a($$0)));
      $$0.register($$1, "minecraft:falling_block", () -> DSL.optionalFields("BlockState", bhu.u.in($$0), "TileEntityData", bhu.s.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", () -> DSL.optionalFields("inBlockState", bhu.u.in($$0)));
      $$0.register($$1, "minecraft:chest_minecart", () -> DSL.optionalFields("DisplayState", bhu.u.in($$0), "Items", DSL.list(bhu.t.in($$0))));
      $$0.register($$1, "minecraft:commandblock_minecart", () -> DSL.optionalFields("DisplayState", bhu.u.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", () -> DSL.optionalFields("DisplayState", bhu.u.in($$0)));
      $$0.register($$1, "minecraft:hopper_minecart", () -> DSL.optionalFields("DisplayState", bhu.u.in($$0), "Items", DSL.list(bhu.t.in($$0))));
      $$0.register($$1, "minecraft:minecart", () -> DSL.optionalFields("DisplayState", bhu.u.in($$0)));
      $$0.register($$1, "minecraft:spawner_minecart", () -> DSL.optionalFields("DisplayState", bhu.u.in($$0), bhu.F.in($$0)));
      $$0.register($$1, "minecraft:tnt_minecart", () -> DSL.optionalFields("DisplayState", bhu.u.in($$0)));
      return $$1;
   }
}
