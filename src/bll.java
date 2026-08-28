import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bll extends bku {
   public bll(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.registerSimple($$1, $$2);
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> blk.a($$0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.register($$1, "minecraft:area_effect_cloud", $$1x -> DSL.optionalFields("Particle", biz.y.in($$0)));
      a($$0, $$1, "minecraft:armor_stand");
      $$0.register($$1, "minecraft:arrow", $$1x -> DSL.optionalFields("inBlockState", biz.u.in($$0)));
      a($$0, $$1, "minecraft:bat");
      a($$0, $$1, "minecraft:blaze");
      $$0.registerSimple($$1, "minecraft:boat");
      a($$0, $$1, "minecraft:cave_spider");
      $$0.register($$1, "minecraft:chest_minecart", $$1x -> DSL.optionalFields("DisplayState", biz.u.in($$0), "Items", DSL.list(biz.t.in($$0))));
      a($$0, $$1, "minecraft:chicken");
      $$0.register($$1, "minecraft:commandblock_minecart", $$1x -> DSL.optionalFields("DisplayState", biz.u.in($$0), "LastOutput", biz.z.in($$0)));
      a($$0, $$1, "minecraft:cow");
      a($$0, $$1, "minecraft:creeper");
      $$0.register($$1, "minecraft:donkey", $$1x -> DSL.optionalFields("Items", DSL.list(biz.t.in($$0)), "SaddleItem", biz.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:dragon_fireball");
      $$0.registerSimple($$1, "minecraft:egg");
      a($$0, $$1, "minecraft:elder_guardian");
      $$0.registerSimple($$1, "minecraft:ender_crystal");
      a($$0, $$1, "minecraft:ender_dragon");
      $$0.register($$1, "minecraft:enderman", $$1x -> DSL.optionalFields("carriedBlockState", biz.u.in($$0)));
      a($$0, $$1, "minecraft:endermite");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:evocation_fangs");
      a($$0, $$1, "minecraft:evocation_illager");
      $$0.registerSimple($$1, "minecraft:eye_of_ender_signal");
      $$0.register($$1, "minecraft:falling_block", $$1x -> DSL.optionalFields("BlockState", biz.u.in($$0), "TileEntityData", biz.s.in($$0)));
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:fireworks_rocket", $$1x -> DSL.optionalFields("FireworksItem", biz.t.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", $$1x -> DSL.optionalFields("DisplayState", biz.u.in($$0)));
      a($$0, $$1, "minecraft:ghast");
      a($$0, $$1, "minecraft:giant");
      a($$0, $$1, "minecraft:guardian");
      $$0.register($$1, "minecraft:hopper_minecart", $$1x -> DSL.optionalFields("DisplayState", biz.u.in($$0), "Items", DSL.list(biz.t.in($$0))));
      $$0.register($$1, "minecraft:horse", $$1x -> DSL.optionalFields("ArmorItem", biz.t.in($$0), "SaddleItem", biz.t.in($$0)));
      a($$0, $$1, "minecraft:husk");
      a($$0, $$1, "minecraft:illusion_illager");
      $$0.register($$1, "minecraft:item", $$1x -> DSL.optionalFields("Item", biz.t.in($$0)));
      $$0.register($$1, "minecraft:item_frame", $$1x -> DSL.optionalFields("Item", biz.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:leash_knot");
      $$0.register(
         $$1, "minecraft:llama", $$1x -> DSL.optionalFields("Items", DSL.list(biz.t.in($$0)), "SaddleItem", biz.t.in($$0), "DecorItem", biz.t.in($$0))
      );
      $$0.registerSimple($$1, "minecraft:llama_spit");
      a($$0, $$1, "minecraft:magma_cube");
      $$0.register($$1, "minecraft:minecart", $$1x -> DSL.optionalFields("DisplayState", biz.u.in($$0)));
      a($$0, $$1, "minecraft:mooshroom");
      $$0.register($$1, "minecraft:mule", $$1x -> DSL.optionalFields("Items", DSL.list(biz.t.in($$0)), "SaddleItem", biz.t.in($$0)));
      a($$0, $$1, "minecraft:ocelot");
      $$0.registerSimple($$1, "minecraft:painting");
      a($$0, $$1, "minecraft:parrot");
      a($$0, $$1, "minecraft:pig");
      a($$0, $$1, "minecraft:polar_bear");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", biz.t.in($$0)));
      a($$0, $$1, "minecraft:rabbit");
      a($$0, $$1, "minecraft:sheep");
      a($$0, $$1, "minecraft:shulker");
      $$0.registerSimple($$1, "minecraft:shulker_bullet");
      a($$0, $$1, "minecraft:silverfish");
      a($$0, $$1, "minecraft:skeleton");
      $$0.register($$1, "minecraft:skeleton_horse", $$1x -> DSL.optionalFields("SaddleItem", biz.t.in($$0)));
      a($$0, $$1, "minecraft:slime");
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      a($$0, $$1, "minecraft:snowman");
      $$0.register($$1, "minecraft:spawner_minecart", $$1x -> DSL.optionalFields("DisplayState", biz.u.in($$0), biz.H.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", $$1x -> DSL.optionalFields("inBlockState", biz.u.in($$0)));
      a($$0, $$1, "minecraft:spider");
      a($$0, $$1, "minecraft:squid");
      a($$0, $$1, "minecraft:stray");
      $$0.registerSimple($$1, "minecraft:tnt");
      $$0.register($$1, "minecraft:tnt_minecart", $$1x -> DSL.optionalFields("DisplayState", biz.u.in($$0)));
      a($$0, $$1, "minecraft:vex");
      $$0.register(
         $$1,
         "minecraft:villager",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(biz.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(biz.x.in($$0))))
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
      $$0.register($$1, "minecraft:zombie_horse", $$1x -> DSL.optionalFields("SaddleItem", biz.t.in($$0)));
      a($$0, $$1, "minecraft:zombie_pigman");
      $$0.register($$1, "minecraft:zombie_villager", $$1x -> DSL.optionalFields("Offers", DSL.optionalFields("Recipes", DSL.list(biz.x.in($$0)))));
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      b($$0, $$1, "minecraft:furnace");
      b($$0, $$1, "minecraft:chest");
      b($$0, $$1, "minecraft:trapped_chest");
      $$0.registerSimple($$1, "minecraft:ender_chest");
      $$0.register($$1, "minecraft:jukebox", $$1x -> DSL.optionalFields("RecordItem", biz.t.in($$0)));
      b($$0, $$1, "minecraft:dispenser");
      b($$0, $$1, "minecraft:dropper");
      $$0.register($$1, "minecraft:sign", () -> bow.a($$0));
      $$0.register($$1, "minecraft:mob_spawner", $$1x -> biz.H.in($$0));
      $$0.register($$1, "minecraft:piston", $$1x -> DSL.optionalFields("blockState", biz.u.in($$0)));
      b($$0, $$1, "minecraft:brewing_stand");
      $$0.register($$1, "minecraft:enchanting_table", () -> blk.b($$0));
      $$0.registerSimple($$1, "minecraft:end_portal");
      $$0.register($$1, "minecraft:beacon", () -> blk.b($$0));
      $$0.register($$1, "minecraft:skull", () -> DSL.optionalFields("custom_name", biz.z.in($$0)));
      $$0.registerSimple($$1, "minecraft:daylight_detector");
      b($$0, $$1, "minecraft:hopper");
      $$0.registerSimple($$1, "minecraft:comparator");
      $$0.register($$1, "minecraft:banner", () -> blk.b($$0));
      $$0.registerSimple($$1, "minecraft:structure_block");
      $$0.registerSimple($$1, "minecraft:end_gateway");
      $$0.register($$1, "minecraft:command_block", () -> DSL.optionalFields("LastOutput", biz.z.in($$0)));
      b($$0, $$1, "minecraft:shulker_box");
      $$0.registerSimple($$1, "minecraft:bed");
      return $$1;
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      $$0.registerType(false, biz.a, () -> DSL.optionalFields("CustomBossEvents", DSL.compoundList(DSL.optionalFields("Name", biz.z.in($$0)))));
      $$0.registerType(false, biz.L, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         biz.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", biz.C.in($$0))),
                  Pair.of("ender_pearls", DSL.list(biz.C.in($$0))),
                  Pair.of("Inventory", DSL.list(biz.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(biz.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", biz.C.in($$0)),
                  Pair.of("ShoulderEntityRight", biz.C.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(biz.L.in($$0)), "toBeDisplayed", DSL.list(biz.L.in($$0))))
               }
            )
      );
      $$0.registerType(
         false,
         biz.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(biz.C.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(biz.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", biz.E.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(biz.u.in($$0))))
               )
            )
      );
      $$0.registerType(true, biz.s, () -> DSL.optionalFields("components", biz.w.in($$0), DSL.taggedChoiceLazy("id", a(), $$2)));
      $$0.registerType(true, biz.C, () -> DSL.optionalFields("Passengers", DSL.list(biz.C.in($$0)), biz.D.in($$0)));
      $$0.registerType(true, biz.D, () -> DSL.and(biz.A.in($$0), DSL.optionalFields("CustomName", biz.z.in($$0), DSL.taggedChoiceLazy("id", a(), $$1))));
      $$0.registerType(true, biz.t, () -> DSL.hook(DSL.optionalFields("id", biz.F.in($$0), "tag", bow.b($$0)), bou.b, HookFunction.IDENTITY));
      $$0.registerType(false, biz.d, () -> DSL.compoundList(DSL.list(biz.t.in($$0))));
      $$0.registerType(false, biz.e, DSL::remainder);
      $$0.registerType(
         false,
         biz.f,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", biz.C.in($$0))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", biz.s.in($$0))),
               "palette",
               DSL.list(biz.u.in($$0))
            )
      );
      $$0.registerType(false, biz.E, () -> DSL.constType(a()));
      $$0.registerType(false, biz.F, () -> DSL.constType(a()));
      $$0.registerType(false, biz.u, DSL::remainder);
      $$0.registerType(false, biz.v, DSL::remainder);
      Supplier<TypeTemplate> $$3 = () -> DSL.compoundList(biz.F.in($$0), DSL.constType(DSL.intType()));
      $$0.registerType(
         false,
         biz.g,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("minecraft:mined", DSL.compoundList(biz.E.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:crafted", $$3.get()),
                     Pair.of("minecraft:used", $$3.get()),
                     Pair.of("minecraft:broken", $$3.get()),
                     Pair.of("minecraft:picked_up", $$3.get()),
                     Pair.of("minecraft:dropped", $$3.get()),
                     Pair.of("minecraft:killed", DSL.compoundList(biz.B.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:killed_by", DSL.compoundList(biz.B.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:custom", DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType())))
                  }
               )
            )
      );
      $$0.registerType(false, biz.h, DSL::remainder);
      $$0.registerType(false, biz.i, DSL::remainder);
      $$0.registerType(false, biz.j, () -> DSL.optionalFields("banners", DSL.list(DSL.optionalFields("Name", biz.z.in($$0)))));
      $$0.registerType(false, biz.k, DSL::remainder);
      $$0.registerType(false, biz.l, DSL::remainder);
      $$0.registerType(false, biz.m, DSL::remainder);
      $$0.registerType(
         false,
         biz.o,
         () -> DSL.optionalFields(
               "data",
               DSL.optionalFields(
                  "Objectives",
                  DSL.list(biz.J.in($$0)),
                  "Teams",
                  DSL.list(biz.K.in($$0)),
                  "PlayerScores",
                  DSL.list(DSL.optionalFields("display", biz.z.in($$0)))
               )
            )
      );
      $$0.registerType(false, biz.n, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(biz.I.in($$0)))));
      $$0.registerType(false, biz.I, DSL::remainder);
      Map<String, Supplier<TypeTemplate>> $$4 = blj.a($$0);
      $$0.registerType(
         false,
         biz.J,
         () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), $$4), "DisplayName", biz.z.in($$0)), blj.c, blj.d)
      );
      $$0.registerType(
         false, biz.K, () -> DSL.optionalFields("MemberNamePrefix", biz.z.in($$0), "MemberNameSuffix", biz.z.in($$0), "DisplayName", biz.z.in($$0))
      );
      $$0.registerType(true, biz.H, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", biz.C.in($$0))), "SpawnData", biz.C.in($$0)));
      $$0.registerType(
         false,
         biz.p,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(biz.M.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(biz.B.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(biz.B.in($$0), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(biz.B.in($$0), DSL.constType(DSL.string())))
            )
      );
      $$0.registerType(false, biz.M, () -> DSL.constType(a()));
      $$0.registerType(false, biz.B, () -> DSL.constType(a()));
      $$0.registerType(false, biz.q, DSL::remainder);
      $$0.registerType(false, biz.O, DSL::remainder);
      $$0.registerType(false, biz.r, () -> DSL.optionalFields("Entities", DSL.list(biz.C.in($$0))));
      $$0.registerType(true, biz.w, DSL::remainder);
      $$0.registerType(true, biz.x, () -> DSL.optionalFields("buy", biz.t.in($$0), "buyB", biz.t.in($$0), "sell", biz.t.in($$0)));
      $$0.registerType(true, biz.y, () -> DSL.constType(DSL.string()));
      $$0.registerType(true, biz.z, () -> DSL.constType(DSL.string()));
      $$0.registerType(
         true,
         biz.A,
         () -> DSL.and(
               DSL.optional(DSL.field("ArmorItems", DSL.list(biz.t.in($$0)))),
               new TypeTemplate[]{
                  DSL.optional(DSL.field("HandItems", DSL.list(biz.t.in($$0)))),
                  DSL.optional(DSL.field("body_armor_item", biz.t.in($$0))),
                  DSL.optional(DSL.field("saddle", biz.t.in($$0)))
               }
            )
      );
   }
}
