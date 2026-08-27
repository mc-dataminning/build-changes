import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Map;
import java.util.function.Supplier;

public class bic extends bfc {
   protected static final HookFunction b = new HookFunction() {
      public <T> T apply(DynamicOps<T> $$0, T $$1) {
         return bie.a(new Dynamic($$0, $$1), bib.a, "minecraft:armor_stand");
      }
   };

   public bic(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> bfd.a($$0));
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("inTile", bdt.z.in($$0)));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.registerSimple($$1, "minecraft:area_effect_cloud");
      a($$0, $$1, "minecraft:armor_stand");
      $$0.register($$1, "minecraft:arrow", $$1x -> DSL.optionalFields("inTile", bdt.z.in($$0)));
      a($$0, $$1, "minecraft:bat");
      a($$0, $$1, "minecraft:blaze");
      $$0.registerSimple($$1, "minecraft:boat");
      a($$0, $$1, "minecraft:cave_spider");
      $$0.register($$1, "minecraft:chest_minecart", $$1x -> DSL.optionalFields("DisplayTile", bdt.z.in($$0), "Items", DSL.list(bdt.t.in($$0))));
      a($$0, $$1, "minecraft:chicken");
      $$0.register($$1, "minecraft:commandblock_minecart", $$1x -> DSL.optionalFields("DisplayTile", bdt.z.in($$0)));
      a($$0, $$1, "minecraft:cow");
      a($$0, $$1, "minecraft:creeper");
      $$0.register($$1, "minecraft:donkey", $$1x -> DSL.optionalFields("Items", DSL.list(bdt.t.in($$0)), "SaddleItem", bdt.t.in($$0), bfd.a($$0)));
      $$0.registerSimple($$1, "minecraft:dragon_fireball");
      b($$0, $$1, "minecraft:egg");
      a($$0, $$1, "minecraft:elder_guardian");
      $$0.registerSimple($$1, "minecraft:ender_crystal");
      a($$0, $$1, "minecraft:ender_dragon");
      $$0.register($$1, "minecraft:enderman", $$1x -> DSL.optionalFields("carried", bdt.z.in($$0), bfd.a($$0)));
      a($$0, $$1, "minecraft:endermite");
      b($$0, $$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:eye_of_ender_signal");
      $$0.register($$1, "minecraft:falling_block", $$1x -> DSL.optionalFields("Block", bdt.z.in($$0), "TileEntityData", bdt.s.in($$0)));
      b($$0, $$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:fireworks_rocket", $$1x -> DSL.optionalFields("FireworksItem", bdt.t.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", $$1x -> DSL.optionalFields("DisplayTile", bdt.z.in($$0)));
      a($$0, $$1, "minecraft:ghast");
      a($$0, $$1, "minecraft:giant");
      a($$0, $$1, "minecraft:guardian");
      $$0.register($$1, "minecraft:hopper_minecart", $$1x -> DSL.optionalFields("DisplayTile", bdt.z.in($$0), "Items", DSL.list(bdt.t.in($$0))));
      $$0.register($$1, "minecraft:horse", $$1x -> DSL.optionalFields("ArmorItem", bdt.t.in($$0), "SaddleItem", bdt.t.in($$0), bfd.a($$0)));
      a($$0, $$1, "minecraft:husk");
      $$0.register($$1, "minecraft:item", $$1x -> DSL.optionalFields("Item", bdt.t.in($$0)));
      $$0.register($$1, "minecraft:item_frame", $$1x -> DSL.optionalFields("Item", bdt.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:leash_knot");
      a($$0, $$1, "minecraft:magma_cube");
      $$0.register($$1, "minecraft:minecart", $$1x -> DSL.optionalFields("DisplayTile", bdt.z.in($$0)));
      a($$0, $$1, "minecraft:mooshroom");
      $$0.register($$1, "minecraft:mule", $$1x -> DSL.optionalFields("Items", DSL.list(bdt.t.in($$0)), "SaddleItem", bdt.t.in($$0), bfd.a($$0)));
      a($$0, $$1, "minecraft:ocelot");
      $$0.registerSimple($$1, "minecraft:painting");
      $$0.registerSimple($$1, "minecraft:parrot");
      a($$0, $$1, "minecraft:pig");
      a($$0, $$1, "minecraft:polar_bear");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", bdt.t.in($$0), "inTile", bdt.z.in($$0)));
      a($$0, $$1, "minecraft:rabbit");
      a($$0, $$1, "minecraft:sheep");
      a($$0, $$1, "minecraft:shulker");
      $$0.registerSimple($$1, "minecraft:shulker_bullet");
      a($$0, $$1, "minecraft:silverfish");
      a($$0, $$1, "minecraft:skeleton");
      $$0.register($$1, "minecraft:skeleton_horse", $$1x -> DSL.optionalFields("SaddleItem", bdt.t.in($$0), bfd.a($$0)));
      a($$0, $$1, "minecraft:slime");
      b($$0, $$1, "minecraft:small_fireball");
      b($$0, $$1, "minecraft:snowball");
      a($$0, $$1, "minecraft:snowman");
      $$0.register($$1, "minecraft:spawner_minecart", $$1x -> DSL.optionalFields("DisplayTile", bdt.z.in($$0), bdt.C.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", $$1x -> DSL.optionalFields("inTile", bdt.z.in($$0)));
      a($$0, $$1, "minecraft:spider");
      a($$0, $$1, "minecraft:squid");
      a($$0, $$1, "minecraft:stray");
      $$0.registerSimple($$1, "minecraft:tnt");
      $$0.register($$1, "minecraft:tnt_minecart", $$1x -> DSL.optionalFields("DisplayTile", bdt.z.in($$0)));
      $$0.register(
         $$1,
         "minecraft:villager",
         $$1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(bdt.t.in($$0)),
               "Offers",
               DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", bdt.t.in($$0), "buyB", bdt.t.in($$0), "sell", bdt.t.in($$0)))),
               bfd.a($$0)
            )
      );
      a($$0, $$1, "minecraft:villager_golem");
      a($$0, $$1, "minecraft:witch");
      a($$0, $$1, "minecraft:wither");
      a($$0, $$1, "minecraft:wither_skeleton");
      b($$0, $$1, "minecraft:wither_skull");
      a($$0, $$1, "minecraft:wolf");
      b($$0, $$1, "minecraft:xp_bottle");
      $$0.registerSimple($$1, "minecraft:xp_orb");
      a($$0, $$1, "minecraft:zombie");
      $$0.register($$1, "minecraft:zombie_horse", $$1x -> DSL.optionalFields("SaddleItem", bdt.t.in($$0), bfd.a($$0)));
      a($$0, $$1, "minecraft:zombie_pigman");
      a($$0, $$1, "minecraft:zombie_villager");
      $$0.registerSimple($$1, "minecraft:evocation_fangs");
      a($$0, $$1, "minecraft:evocation_illager");
      $$0.registerSimple($$1, "minecraft:illusion_illager");
      $$0.register(
         $$1,
         "minecraft:llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(bdt.t.in($$0)), "SaddleItem", bdt.t.in($$0), "DecorItem", bdt.t.in($$0), bfd.a($$0))
      );
      $$0.registerSimple($$1, "minecraft:llama_spit");
      a($$0, $$1, "minecraft:vex");
      a($$0, $$1, "minecraft:vindication_illager");
      return $$1;
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(true, bdt.y, () -> DSL.taggedChoiceLazy("id", a(), $$1));
      $$0.registerType(
         true,
         bdt.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bdt.A.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     bdt.x.in($$0),
                     "BlockEntityTag",
                     bdt.s.in($$0),
                     "CanDestroy",
                     DSL.list(bdt.z.in($$0)),
                     "CanPlaceOn",
                     DSL.list(bdt.z.in($$0)),
                     "Items",
                     DSL.list(bdt.t.in($$0))
                  )
               ),
               b,
               HookFunction.IDENTITY
            )
      );
   }
}
