import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bii extends bhs {
   public bii(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> bht.a($$0));
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("Items", DSL.list(bgg.t.in($$0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.register($$1, "minecraft:area_effect_cloud", $$1x -> DSL.optionalFields("Particle", bgg.y.in($$0)));
      a($$0, $$1, "minecraft:armor_stand");
      $$0.register($$1, "minecraft:arrow", $$1x -> DSL.optionalFields("inBlockState", bgg.u.in($$0)));
      a($$0, $$1, "minecraft:bat");
      a($$0, $$1, "minecraft:blaze");
      $$0.registerSimple($$1, "minecraft:boat");
      a($$0, $$1, "minecraft:cave_spider");
      $$0.register($$1, "minecraft:chest_minecart", $$1x -> DSL.optionalFields("DisplayState", bgg.u.in($$0), "Items", DSL.list(bgg.t.in($$0))));
      a($$0, $$1, "minecraft:chicken");
      $$0.register($$1, "minecraft:commandblock_minecart", $$1x -> DSL.optionalFields("DisplayState", bgg.u.in($$0)));
      a($$0, $$1, "minecraft:cow");
      a($$0, $$1, "minecraft:creeper");
      $$0.register($$1, "minecraft:donkey", $$1x -> DSL.optionalFields("Items", DSL.list(bgg.t.in($$0)), "SaddleItem", bgg.t.in($$0), bht.a($$0)));
      $$0.registerSimple($$1, "minecraft:dragon_fireball");
      $$0.registerSimple($$1, "minecraft:egg");
      a($$0, $$1, "minecraft:elder_guardian");
      $$0.registerSimple($$1, "minecraft:ender_crystal");
      a($$0, $$1, "minecraft:ender_dragon");
      $$0.register($$1, "minecraft:enderman", $$1x -> DSL.optionalFields("carriedBlockState", bgg.u.in($$0), bht.a($$0)));
      a($$0, $$1, "minecraft:endermite");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:evocation_fangs");
      a($$0, $$1, "minecraft:evocation_illager");
      $$0.registerSimple($$1, "minecraft:eye_of_ender_signal");
      $$0.register($$1, "minecraft:falling_block", $$1x -> DSL.optionalFields("BlockState", bgg.u.in($$0), "TileEntityData", bgg.s.in($$0)));
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:fireworks_rocket", $$1x -> DSL.optionalFields("FireworksItem", bgg.t.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", $$1x -> DSL.optionalFields("DisplayState", bgg.u.in($$0)));
      a($$0, $$1, "minecraft:ghast");
      a($$0, $$1, "minecraft:giant");
      a($$0, $$1, "minecraft:guardian");
      $$0.register($$1, "minecraft:hopper_minecart", $$1x -> DSL.optionalFields("DisplayState", bgg.u.in($$0), "Items", DSL.list(bgg.t.in($$0))));
      $$0.register($$1, "minecraft:horse", $$1x -> DSL.optionalFields("ArmorItem", bgg.t.in($$0), "SaddleItem", bgg.t.in($$0), bht.a($$0)));
      a($$0, $$1, "minecraft:husk");
      $$0.registerSimple($$1, "minecraft:illusion_illager");
      $$0.register($$1, "minecraft:item", $$1x -> DSL.optionalFields("Item", bgg.t.in($$0)));
      $$0.register($$1, "minecraft:item_frame", $$1x -> DSL.optionalFields("Item", bgg.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:leash_knot");
      $$0.register(
         $$1,
         "minecraft:llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(bgg.t.in($$0)), "SaddleItem", bgg.t.in($$0), "DecorItem", bgg.t.in($$0), bht.a($$0))
      );
      $$0.registerSimple($$1, "minecraft:llama_spit");
      a($$0, $$1, "minecraft:magma_cube");
      $$0.register($$1, "minecraft:minecart", $$1x -> DSL.optionalFields("DisplayState", bgg.u.in($$0)));
      a($$0, $$1, "minecraft:mooshroom");
      $$0.register($$1, "minecraft:mule", $$1x -> DSL.optionalFields("Items", DSL.list(bgg.t.in($$0)), "SaddleItem", bgg.t.in($$0), bht.a($$0)));
      a($$0, $$1, "minecraft:ocelot");
      $$0.registerSimple($$1, "minecraft:painting");
      $$0.registerSimple($$1, "minecraft:parrot");
      a($$0, $$1, "minecraft:pig");
      a($$0, $$1, "minecraft:polar_bear");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", bgg.t.in($$0)));
      a($$0, $$1, "minecraft:rabbit");
      a($$0, $$1, "minecraft:sheep");
      a($$0, $$1, "minecraft:shulker");
      $$0.registerSimple($$1, "minecraft:shulker_bullet");
      a($$0, $$1, "minecraft:silverfish");
      a($$0, $$1, "minecraft:skeleton");
      $$0.register($$1, "minecraft:skeleton_horse", $$1x -> DSL.optionalFields("SaddleItem", bgg.t.in($$0), bht.a($$0)));
      a($$0, $$1, "minecraft:slime");
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      a($$0, $$1, "minecraft:snowman");
      $$0.register($$1, "minecraft:spawner_minecart", $$1x -> DSL.optionalFields("DisplayState", bgg.u.in($$0), bgg.F.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", $$1x -> DSL.optionalFields("inBlockState", bgg.u.in($$0)));
      a($$0, $$1, "minecraft:spider");
      a($$0, $$1, "minecraft:squid");
      a($$0, $$1, "minecraft:stray");
      $$0.registerSimple($$1, "minecraft:tnt");
      $$0.register($$1, "minecraft:tnt_minecart", $$1x -> DSL.optionalFields("DisplayState", bgg.u.in($$0)));
      a($$0, $$1, "minecraft:vex");
      $$0.register(
         $$1,
         "minecraft:villager",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(bgg.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(bgg.x.in($$0))), bht.a($$0))
      );
      a($$0, $$1, "minecraft:villager_golem");
      a($$0, $$1, "minecraft:vindication_illager");
      a($$0, $$1, "minecraft:witch");
      a($$0, $$1, "minecraft:wither");
      a($$0, $$1, "minecraft:wither_skeleton");
      $$0.registerSimple($$1, "minecraft:wither_skull");
      a($$0, $$1, "minecraft:wolf");
      $$0.registerSimple($$1, "minecraft:xp_bottle");
      $$0.registerSimple($$1, "minecraft:xp_orb");
      a($$0, $$1, "minecraft:zombie");
      $$0.register($$1, "minecraft:zombie_horse", $$1x -> DSL.optionalFields("SaddleItem", bgg.t.in($$0), bht.a($$0)));
      a($$0, $$1, "minecraft:zombie_pigman");
      $$0.register($$1, "minecraft:zombie_villager", $$1x -> DSL.optionalFields("Offers", DSL.optionalFields("Recipes", DSL.list(bgg.x.in($$0))), bht.a($$0)));
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      b($$0, $$1, "minecraft:furnace");
      b($$0, $$1, "minecraft:chest");
      b($$0, $$1, "minecraft:trapped_chest");
      $$0.registerSimple($$1, "minecraft:ender_chest");
      $$0.register($$1, "minecraft:jukebox", $$1x -> DSL.optionalFields("RecordItem", bgg.t.in($$0)));
      b($$0, $$1, "minecraft:dispenser");
      b($$0, $$1, "minecraft:dropper");
      $$0.registerSimple($$1, "minecraft:sign");
      $$0.register($$1, "minecraft:mob_spawner", $$1x -> bgg.F.in($$0));
      $$0.register($$1, "minecraft:piston", $$1x -> DSL.optionalFields("blockState", bgg.u.in($$0)));
      b($$0, $$1, "minecraft:brewing_stand");
      $$0.registerSimple($$1, "minecraft:enchanting_table");
      $$0.registerSimple($$1, "minecraft:end_portal");
      $$0.registerSimple($$1, "minecraft:beacon");
      $$0.registerSimple($$1, "minecraft:skull");
      $$0.registerSimple($$1, "minecraft:daylight_detector");
      b($$0, $$1, "minecraft:hopper");
      $$0.registerSimple($$1, "minecraft:comparator");
      $$0.registerSimple($$1, "minecraft:banner");
      $$0.registerSimple($$1, "minecraft:structure_block");
      $$0.registerSimple($$1, "minecraft:end_gateway");
      $$0.registerSimple($$1, "minecraft:command_block");
      b($$0, $$1, "minecraft:shulker_box");
      $$0.registerSimple($$1, "minecraft:bed");
      return $$1;
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      $$0.registerType(false, bgg.a, DSL::remainder);
      $$0.registerType(false, bgg.J, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         bgg.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bgg.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bgg.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bgg.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bgg.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bgg.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bgg.J.in($$0)), "toBeDisplayed", DSL.list(bgg.J.in($$0))))
               }
            )
      );
      $$0.registerType(
         false,
         bgg.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bgg.A.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bgg.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bgg.C.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(bgg.u.in($$0))))
               )
            )
      );
      $$0.registerType(true, bgg.s, () -> DSL.optionalFields("components", bgg.w.in($$0), DSL.taggedChoiceLazy("id", a(), $$2)));
      $$0.registerType(true, bgg.A, () -> DSL.optionalFields("Passengers", DSL.list(bgg.A.in($$0)), bgg.B.in($$0)));
      $$0.registerType(true, bgg.B, () -> DSL.taggedChoiceLazy("id", a(), $$1));
      $$0.registerType(
         true,
         bgg.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bgg.D.in($$0),
                  "tag",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("EntityTag", bgg.A.in($$0)),
                        Pair.of("BlockEntityTag", bgg.s.in($$0)),
                        Pair.of("CanDestroy", DSL.list(bgg.C.in($$0))),
                        Pair.of("CanPlaceOn", DSL.list(bgg.C.in($$0))),
                        Pair.of("Items", DSL.list(bgg.t.in($$0))),
                        Pair.of("ChargedProjectiles", DSL.list(bgg.t.in($$0)))
                     }
                  )
               ),
               bla.b,
               HookFunction.IDENTITY
            )
      );
      $$0.registerType(false, bgg.d, () -> DSL.compoundList(DSL.list(bgg.t.in($$0))));
      $$0.registerType(false, bgg.e, DSL::remainder);
      $$0.registerType(
         false,
         bgg.f,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", bgg.A.in($$0))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", bgg.s.in($$0))),
               "palette",
               DSL.list(bgg.u.in($$0))
            )
      );
      $$0.registerType(false, bgg.C, () -> DSL.constType(a()));
      $$0.registerType(false, bgg.D, () -> DSL.constType(a()));
      $$0.registerType(false, bgg.u, DSL::remainder);
      $$0.registerType(false, bgg.v, DSL::remainder);
      Supplier<TypeTemplate> $$3 = () -> DSL.compoundList(bgg.D.in($$0), DSL.constType(DSL.intType()));
      $$0.registerType(
         false,
         bgg.g,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("minecraft:mined", DSL.compoundList(bgg.C.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:crafted", $$3.get()),
                     Pair.of("minecraft:used", $$3.get()),
                     Pair.of("minecraft:broken", $$3.get()),
                     Pair.of("minecraft:picked_up", $$3.get()),
                     Pair.of("minecraft:dropped", $$3.get()),
                     Pair.of("minecraft:killed", DSL.compoundList(bgg.z.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:killed_by", DSL.compoundList(bgg.z.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:custom", DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType())))
                  }
               )
            )
      );
      $$0.registerType(false, bgg.h, DSL::remainder);
      $$0.registerType(false, bgg.i, DSL::remainder);
      $$0.registerType(false, bgg.j, DSL::remainder);
      $$0.registerType(false, bgg.k, DSL::remainder);
      $$0.registerType(false, bgg.l, DSL::remainder);
      $$0.registerType(false, bgg.m, DSL::remainder);
      $$0.registerType(
         false, bgg.o, () -> DSL.optionalFields("data", DSL.optionalFields("Objectives", DSL.list(bgg.H.in($$0)), "Teams", DSL.list(bgg.I.in($$0))))
      );
      $$0.registerType(false, bgg.n, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(bgg.G.in($$0)))));
      $$0.registerType(false, bgg.G, DSL::remainder);
      Map<String, Supplier<TypeTemplate>> $$4 = bih.a($$0);
      $$0.registerType(false, bgg.H, () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), $$4)), bih.c, bih.d));
      $$0.registerType(false, bgg.I, DSL::remainder);
      $$0.registerType(true, bgg.F, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", bgg.A.in($$0))), "SpawnData", bgg.A.in($$0)));
      $$0.registerType(
         false,
         bgg.p,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(bgg.K.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(bgg.z.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(bgg.z.in($$0), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(bgg.z.in($$0), DSL.constType(DSL.string())))
            )
      );
      $$0.registerType(false, bgg.K, () -> DSL.constType(a()));
      $$0.registerType(false, bgg.z, () -> DSL.constType(a()));
      $$0.registerType(false, bgg.q, DSL::remainder);
      $$0.registerType(false, bgg.M, DSL::remainder);
      $$0.registerType(false, bgg.r, () -> DSL.optionalFields("Entities", DSL.list(bgg.A.in($$0))));
      $$0.registerType(true, bgg.w, DSL::remainder);
      $$0.registerType(true, bgg.x, () -> DSL.optionalFields("buy", bgg.t.in($$0), "buyB", bgg.t.in($$0), "sell", bgg.t.in($$0)));
      $$0.registerType(true, bgg.y, () -> DSL.constType(DSL.string()));
   }
}
