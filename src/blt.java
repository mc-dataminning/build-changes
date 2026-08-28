import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class blt extends blh {
   public blt(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.registerSimple($$1, "minecraft:egg");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", bjm.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      $$0.registerSimple($$1, "minecraft:wither_skull");
      $$0.registerSimple($$1, "minecraft:xp_bottle");
      $$0.register($$1, "minecraft:arrow", () -> DSL.optionalFields("inBlockState", bjm.u.in($$0)));
      $$0.register($$1, "minecraft:enderman", () -> DSL.optionalFields("carriedBlockState", bjm.u.in($$0)));
      $$0.register($$1, "minecraft:falling_block", () -> DSL.optionalFields("BlockState", bjm.u.in($$0), "TileEntityData", bjm.s.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", () -> DSL.optionalFields("inBlockState", bjm.u.in($$0)));
      $$0.register($$1, "minecraft:chest_minecart", () -> DSL.optionalFields("DisplayState", bjm.u.in($$0), "Items", DSL.list(bjm.t.in($$0))));
      $$0.register($$1, "minecraft:commandblock_minecart", () -> DSL.optionalFields("DisplayState", bjm.u.in($$0), "LastOutput", bjm.z.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", () -> DSL.optionalFields("DisplayState", bjm.u.in($$0)));
      $$0.register($$1, "minecraft:hopper_minecart", () -> DSL.optionalFields("DisplayState", bjm.u.in($$0), "Items", DSL.list(bjm.t.in($$0))));
      $$0.register($$1, "minecraft:minecart", () -> DSL.optionalFields("DisplayState", bjm.u.in($$0)));
      $$0.register($$1, "minecraft:spawner_minecart", () -> DSL.optionalFields("DisplayState", bjm.u.in($$0), bjm.H.in($$0)));
      $$0.register($$1, "minecraft:tnt_minecart", () -> DSL.optionalFields("DisplayState", bjm.u.in($$0)));
      return $$1;
   }
}
