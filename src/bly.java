import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bly extends blh {
   public bly(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.registerSimple($$1, $$2);
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> blx.a($$0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.register($$1, "minecraft:area_effect_cloud", $$1x -> DSL.optionalFields("Particle", bjm.y.in($$0)));
      a($$0, $$1, "minecraft:armor_stand");
      $$0.register($$1, "minecraft:arrow", $$1x -> DSL.optionalFields("inBlockState", bjm.u.in($$0)));
      a($$0, $$1, "minecraft:bat");
      a($$0, $$1, "minecraft:blaze");
      $$0.registerSimple($$1, "minecraft:boat");
      a($$0, $$1, "minecraft:cave_spider");
      $$0.register($$1, "minecraft:chest_minecart", $$1x -> DSL.optionalFields("DisplayState", bjm.u.in($$0), "Items", DSL.list(bjm.t.in($$0))));
      a($$0, $$1, "minecraft:chicken");
      $$0.register($$1, "minecraft:commandblock_minecart", $$1x -> DSL.optionalFields("DisplayState", bjm.u.in($$0), "LastOutput", bjm.z.in($$0)));
      a($$0, $$1, "minecraft:cow");
      a($$0, $$1, "minecraft:creeper");
      $$0.register($$1, "minecraft:donkey", $$1x -> DSL.optionalFields("Items", DSL.list(bjm.t.in($$0)), "SaddleItem", bjm.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:dragon_fireball");
      $$0.registerSimple($$1, "minecraft:egg");
      a($$0, $$1, "minecraft:elder_guardian");
      $$0.registerSimple($$1, "minecraft:ender_crystal");
      a($$0, $$1, "minecraft:ender_dragon");
      $$0.register($$1, "minecraft:enderman", $$1x -> DSL.optionalFields("carriedBlockState", bjm.u.in($$0)));
      a($$0, $$1, "minecraft:endermite");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:evocation_fangs");
      a($$0, $$1, "minecraft:evocation_illager");
      $$0.registerSimple($$1, "minecraft:eye_of_ender_signal");
      $$0.register($$1, "minecraft:falling_block", $$1x -> DSL.optionalFields("BlockState", bjm.u.in($$0), "TileEntityData", bjm.s.in($$0)));
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:fireworks_rocket", $$1x -> DSL.optionalFields("FireworksItem", bjm.t.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", $$1x -> DSL.optionalFields("DisplayState", bjm.u.in($$0)));
      a($$0, $$1, "minecraft:ghast");
      a($$0, $$1, "minecraft:giant");
      a($$0, $$1, "minecraft:guardian");
      $$0.register($$1, "minecraft:hopper_minecart", $$1x -> DSL.optionalFields("DisplayState", bjm.u.in($$0), "Items", DSL.list(bjm.t.in($$0))));
      $$0.register($$1, "minecraft:horse", $$1x -> DSL.optionalFields("ArmorItem", bjm.t.in($$0), "SaddleItem", bjm.t.in($$0)));
      a($$0, $$1, "minecraft:husk");
      a($$0, $$1, "minecraft:illusion_illager");
      $$0.register($$1, "minecraft:item", $$1x -> DSL.optionalFields("Item", bjm.t.in($$0)));
      $$0.register($$1, "minecraft:item_frame", $$1x -> DSL.optionalFields("Item", bjm.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:leash_knot");
      $$0.register(
         $$1, "minecraft:llama", $$1x -> DSL.optionalFields("Items", DSL.list(bjm.t.in($$0)), "SaddleItem", bjm.t.in($$0), "DecorItem", bjm.t.in($$0))
      );
      $$0.registerSimple($$1, "minecraft:llama_spit");
      a($$0, $$1, "minecraft:magma_cube");
      $$0.register($$1, "minecraft:minecart", $$1x -> DSL.optionalFields("DisplayState", bjm.u.in($$0)));
      a($$0, $$1, "minecraft:mooshroom");
      $$0.register($$1, "minecraft:mule", $$1x -> DSL.optionalFields("Items", DSL.list(bjm.t.in($$0)), "SaddleItem", bjm.t.in($$0)));
      a($$0, $$1, "minecraft:ocelot");
      $$0.registerSimple($$1, "minecraft:painting");
      a($$0, $$1, "minecraft:parrot");
      a($$0, $$1, "minecraft:pig");
      a($$0, $$1, "minecraft:polar_bear");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", bjm.t.in($$0)));
      a($$0, $$1, "minecraft:rabbit");
      a($$0, $$1, "minecraft:sheep");
      a($$0, $$1, "minecraft:shulker");
      $$0.registerSimple($$1, "minecraft:shulker_bullet");
      a($$0, $$1, "minecraft:silverfish");
      a($$0, $$1, "minecraft:skeleton");
      $$0.register($$1, "minecraft:skeleton_horse", $$1x -> DSL.optionalFields("SaddleItem", bjm.t.in($$0)));
      a($$0, $$1, "minecraft:slime");
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      a($$0, $$1, "minecraft:snowman");
      $$0.register($$1, "minecraft:spawner_minecart", $$1x -> DSL.optionalFields("DisplayState", bjm.u.in($$0), bjm.H.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", $$1x -> DSL.optionalFields("inBlockState", bjm.u.in($$0)));
      a($$0, $$1, "minecraft:spider");
      a($$0, $$1, "minecraft:squid");
      a($$0, $$1, "minecraft:stray");
      $$0.registerSimple($$1, "minecraft:tnt");
      $$0.register($$1, "minecraft:tnt_minecart", $$1x -> DSL.optionalFields("DisplayState", bjm.u.in($$0)));
      a($$0, $$1, "minecraft:vex");
      $$0.register(
         $$1,
         "minecraft:villager",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(bjm.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(bjm.x.in($$0))))
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
      $$0.register($$1, "minecraft:zombie_horse", $$1x -> DSL.optionalFields("SaddleItem", bjm.t.in($$0)));
      a($$0, $$1, "minecraft:zombie_pigman");
      $$0.register($$1, "minecraft:zombie_villager", $$1x -> DSL.optionalFields("Offers", DSL.optionalFields("Recipes", DSL.list(bjm.x.in($$0)))));
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      b($$0, $$1, "minecraft:furnace");
      b($$0, $$1, "minecraft:chest");
      b($$0, $$1, "minecraft:trapped_chest");
      $$0.registerSimple($$1, "minecraft:ender_chest");
      $$0.register($$1, "minecraft:jukebox", $$1x -> DSL.optionalFields("RecordItem", bjm.t.in($$0)));
      b($$0, $$1, "minecraft:dispenser");
      b($$0, $$1, "minecraft:dropper");
      $$0.register($$1, "minecraft:sign", () -> bpj.a($$0));
      $$0.register($$1, "minecraft:mob_spawner", $$1x -> bjm.H.in($$0));
      $$0.register($$1, "minecraft:piston", $$1x -> DSL.optionalFields("blockState", bjm.u.in($$0)));
      b($$0, $$1, "minecraft:brewing_stand");
      $$0.register($$1, "minecraft:enchanting_table", () -> blx.b($$0));
      $$0.registerSimple($$1, "minecraft:end_portal");
      $$0.register($$1, "minecraft:beacon", () -> blx.b($$0));
      $$0.register($$1, "minecraft:skull", () -> DSL.optionalFields("custom_name", bjm.z.in($$0)));
      $$0.registerSimple($$1, "minecraft:daylight_detector");
      b($$0, $$1, "minecraft:hopper");
      $$0.registerSimple($$1, "minecraft:comparator");
      $$0.register($$1, "minecraft:banner", () -> blx.b($$0));
      $$0.registerSimple($$1, "minecraft:structure_block");
      $$0.registerSimple($$1, "minecraft:end_gateway");
      $$0.register($$1, "minecraft:command_block", () -> DSL.optionalFields("LastOutput", bjm.z.in($$0)));
      b($$0, $$1, "minecraft:shulker_box");
      $$0.registerSimple($$1, "minecraft:bed");
      return $$1;
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      $$0.registerType(false, bjm.a, () -> DSL.optionalFields("CustomBossEvents", DSL.compoundList(DSL.optionalFields("Name", bjm.z.in($$0)))));
      $$0.registerType(false, bjm.L, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         bjm.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bjm.C.in($$0))),
                  Pair.of("ender_pearls", DSL.list(bjm.C.in($$0))),
                  Pair.of("Inventory", DSL.list(bjm.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bjm.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bjm.C.in($$0)),
                  Pair.of("ShoulderEntityRight", bjm.C.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bjm.L.in($$0)), "toBeDisplayed", DSL.list(bjm.L.in($$0))))
               }
            )
      );
      $$0.registerType(
         false,
         bjm.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bjm.C.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bjm.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bjm.E.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(bjm.u.in($$0))))
               )
            )
      );
      $$0.registerType(true, bjm.s, () -> DSL.optionalFields("components", bjm.w.in($$0), DSL.taggedChoiceLazy("id", a(), $$2)));
      $$0.registerType(true, bjm.C, () -> DSL.optionalFields("Passengers", DSL.list(bjm.C.in($$0)), bjm.D.in($$0)));
      $$0.registerType(true, bjm.D, () -> DSL.and(bjm.A.in($$0), DSL.optionalFields("CustomName", bjm.z.in($$0), DSL.taggedChoiceLazy("id", a(), $$1))));
      $$0.registerType(true, bjm.t, () -> DSL.hook(DSL.optionalFields("id", bjm.F.in($$0), "tag", bpj.b($$0)), bph.b, HookFunction.IDENTITY));
      $$0.registerType(false, bjm.d, () -> DSL.compoundList(DSL.list(bjm.t.in($$0))));
      $$0.registerType(false, bjm.e, DSL::remainder);
      $$0.registerType(
         false,
         bjm.f,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", bjm.C.in($$0))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", bjm.s.in($$0))),
               "palette",
               DSL.list(bjm.u.in($$0))
            )
      );
      $$0.registerType(false, bjm.E, () -> DSL.constType(a()));
      $$0.registerType(false, bjm.F, () -> DSL.constType(a()));
      $$0.registerType(false, bjm.u, DSL::remainder);
      $$0.registerType(false, bjm.v, DSL::remainder);
      Supplier<TypeTemplate> $$3 = () -> DSL.compoundList(bjm.F.in($$0), DSL.constType(DSL.intType()));
      $$0.registerType(
         false,
         bjm.g,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("minecraft:mined", DSL.compoundList(bjm.E.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:crafted", $$3.get()),
                     Pair.of("minecraft:used", $$3.get()),
                     Pair.of("minecraft:broken", $$3.get()),
                     Pair.of("minecraft:picked_up", $$3.get()),
                     Pair.of("minecraft:dropped", $$3.get()),
                     Pair.of("minecraft:killed", DSL.compoundList(bjm.B.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:killed_by", DSL.compoundList(bjm.B.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:custom", DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType())))
                  }
               )
            )
      );
      $$0.registerType(false, bjm.h, DSL::remainder);
      $$0.registerType(false, bjm.i, DSL::remainder);
      $$0.registerType(false, bjm.j, () -> DSL.optionalFields("banners", DSL.list(DSL.optionalFields("Name", bjm.z.in($$0)))));
      $$0.registerType(false, bjm.k, DSL::remainder);
      $$0.registerType(false, bjm.l, DSL::remainder);
      $$0.registerType(false, bjm.m, DSL::remainder);
      $$0.registerType(
         false,
         bjm.o,
         () -> DSL.optionalFields(
               "data",
               DSL.optionalFields(
                  "Objectives",
                  DSL.list(bjm.J.in($$0)),
                  "Teams",
                  DSL.list(bjm.K.in($$0)),
                  "PlayerScores",
                  DSL.list(DSL.optionalFields("display", bjm.z.in($$0)))
               )
            )
      );
      $$0.registerType(false, bjm.n, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(bjm.I.in($$0)))));
      $$0.registerType(false, bjm.I, DSL::remainder);
      Map<String, Supplier<TypeTemplate>> $$4 = blw.a($$0);
      $$0.registerType(
         false,
         bjm.J,
         () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), $$4), "DisplayName", bjm.z.in($$0)), blw.c, blw.d)
      );
      $$0.registerType(
         false, bjm.K, () -> DSL.optionalFields("MemberNamePrefix", bjm.z.in($$0), "MemberNameSuffix", bjm.z.in($$0), "DisplayName", bjm.z.in($$0))
      );
      $$0.registerType(true, bjm.H, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", bjm.C.in($$0))), "SpawnData", bjm.C.in($$0)));
      $$0.registerType(
         false,
         bjm.p,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(bjm.M.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(bjm.B.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(bjm.B.in($$0), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(bjm.B.in($$0), DSL.constType(DSL.string())))
            )
      );
      $$0.registerType(false, bjm.M, () -> DSL.constType(a()));
      $$0.registerType(false, bjm.B, () -> DSL.constType(a()));
      $$0.registerType(false, bjm.q, DSL::remainder);
      $$0.registerType(false, bjm.O, DSL::remainder);
      $$0.registerType(false, bjm.r, () -> DSL.optionalFields("Entities", DSL.list(bjm.C.in($$0))));
      $$0.registerType(true, bjm.w, DSL::remainder);
      $$0.registerType(true, bjm.x, () -> DSL.optionalFields("buy", bjm.t.in($$0), "buyB", bjm.t.in($$0), "sell", bjm.t.in($$0)));
      $$0.registerType(true, bjm.y, () -> DSL.constType(DSL.string()));
      $$0.registerType(true, bjm.z, () -> DSL.constType(DSL.string()));
      $$0.registerType(
         true,
         bjm.A,
         () -> DSL.and(
               DSL.optional(DSL.field("ArmorItems", DSL.list(bjm.t.in($$0)))),
               new TypeTemplate[]{
                  DSL.optional(DSL.field("HandItems", DSL.list(bjm.t.in($$0)))),
                  DSL.optional(DSL.field("body_armor_item", bjm.t.in($$0))),
                  DSL.optional(DSL.field("saddle", bjm.t.in($$0)))
               }
            )
      );
   }
}
