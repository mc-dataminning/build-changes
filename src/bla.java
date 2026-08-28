import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bla extends bkj {
   public bla(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.registerSimple($$1, $$2);
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> bkz.a($$0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.register($$1, "minecraft:area_effect_cloud", $$1x -> DSL.optionalFields("Particle", biq.y.in($$0)));
      a($$0, $$1, "minecraft:armor_stand");
      $$0.register($$1, "minecraft:arrow", $$1x -> DSL.optionalFields("inBlockState", biq.u.in($$0)));
      a($$0, $$1, "minecraft:bat");
      a($$0, $$1, "minecraft:blaze");
      $$0.registerSimple($$1, "minecraft:boat");
      a($$0, $$1, "minecraft:cave_spider");
      $$0.register($$1, "minecraft:chest_minecart", $$1x -> DSL.optionalFields("DisplayState", biq.u.in($$0), "Items", DSL.list(biq.t.in($$0))));
      a($$0, $$1, "minecraft:chicken");
      $$0.register($$1, "minecraft:commandblock_minecart", $$1x -> DSL.optionalFields("DisplayState", biq.u.in($$0), "LastOutput", biq.z.in($$0)));
      a($$0, $$1, "minecraft:cow");
      a($$0, $$1, "minecraft:creeper");
      $$0.register($$1, "minecraft:donkey", $$1x -> DSL.optionalFields("Items", DSL.list(biq.t.in($$0)), "SaddleItem", biq.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:dragon_fireball");
      $$0.registerSimple($$1, "minecraft:egg");
      a($$0, $$1, "minecraft:elder_guardian");
      $$0.registerSimple($$1, "minecraft:ender_crystal");
      a($$0, $$1, "minecraft:ender_dragon");
      $$0.register($$1, "minecraft:enderman", $$1x -> DSL.optionalFields("carriedBlockState", biq.u.in($$0)));
      a($$0, $$1, "minecraft:endermite");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:evocation_fangs");
      a($$0, $$1, "minecraft:evocation_illager");
      $$0.registerSimple($$1, "minecraft:eye_of_ender_signal");
      $$0.register($$1, "minecraft:falling_block", $$1x -> DSL.optionalFields("BlockState", biq.u.in($$0), "TileEntityData", biq.s.in($$0)));
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:fireworks_rocket", $$1x -> DSL.optionalFields("FireworksItem", biq.t.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", $$1x -> DSL.optionalFields("DisplayState", biq.u.in($$0)));
      a($$0, $$1, "minecraft:ghast");
      a($$0, $$1, "minecraft:giant");
      a($$0, $$1, "minecraft:guardian");
      $$0.register($$1, "minecraft:hopper_minecart", $$1x -> DSL.optionalFields("DisplayState", biq.u.in($$0), "Items", DSL.list(biq.t.in($$0))));
      $$0.register($$1, "minecraft:horse", $$1x -> DSL.optionalFields("ArmorItem", biq.t.in($$0), "SaddleItem", biq.t.in($$0)));
      a($$0, $$1, "minecraft:husk");
      a($$0, $$1, "minecraft:illusion_illager");
      $$0.register($$1, "minecraft:item", $$1x -> DSL.optionalFields("Item", biq.t.in($$0)));
      $$0.register($$1, "minecraft:item_frame", $$1x -> DSL.optionalFields("Item", biq.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:leash_knot");
      $$0.register(
         $$1, "minecraft:llama", $$1x -> DSL.optionalFields("Items", DSL.list(biq.t.in($$0)), "SaddleItem", biq.t.in($$0), "DecorItem", biq.t.in($$0))
      );
      $$0.registerSimple($$1, "minecraft:llama_spit");
      a($$0, $$1, "minecraft:magma_cube");
      $$0.register($$1, "minecraft:minecart", $$1x -> DSL.optionalFields("DisplayState", biq.u.in($$0)));
      a($$0, $$1, "minecraft:mooshroom");
      $$0.register($$1, "minecraft:mule", $$1x -> DSL.optionalFields("Items", DSL.list(biq.t.in($$0)), "SaddleItem", biq.t.in($$0)));
      a($$0, $$1, "minecraft:ocelot");
      $$0.registerSimple($$1, "minecraft:painting");
      a($$0, $$1, "minecraft:parrot");
      a($$0, $$1, "minecraft:pig");
      a($$0, $$1, "minecraft:polar_bear");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", biq.t.in($$0)));
      a($$0, $$1, "minecraft:rabbit");
      a($$0, $$1, "minecraft:sheep");
      a($$0, $$1, "minecraft:shulker");
      $$0.registerSimple($$1, "minecraft:shulker_bullet");
      a($$0, $$1, "minecraft:silverfish");
      a($$0, $$1, "minecraft:skeleton");
      $$0.register($$1, "minecraft:skeleton_horse", $$1x -> DSL.optionalFields("SaddleItem", biq.t.in($$0)));
      a($$0, $$1, "minecraft:slime");
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      a($$0, $$1, "minecraft:snowman");
      $$0.register($$1, "minecraft:spawner_minecart", $$1x -> DSL.optionalFields("DisplayState", biq.u.in($$0), biq.H.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", $$1x -> DSL.optionalFields("inBlockState", biq.u.in($$0)));
      a($$0, $$1, "minecraft:spider");
      a($$0, $$1, "minecraft:squid");
      a($$0, $$1, "minecraft:stray");
      $$0.registerSimple($$1, "minecraft:tnt");
      $$0.register($$1, "minecraft:tnt_minecart", $$1x -> DSL.optionalFields("DisplayState", biq.u.in($$0)));
      a($$0, $$1, "minecraft:vex");
      $$0.register(
         $$1,
         "minecraft:villager",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(biq.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(biq.x.in($$0))))
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
      $$0.register($$1, "minecraft:zombie_horse", $$1x -> DSL.optionalFields("SaddleItem", biq.t.in($$0)));
      a($$0, $$1, "minecraft:zombie_pigman");
      $$0.register($$1, "minecraft:zombie_villager", $$1x -> DSL.optionalFields("Offers", DSL.optionalFields("Recipes", DSL.list(biq.x.in($$0)))));
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      b($$0, $$1, "minecraft:furnace");
      b($$0, $$1, "minecraft:chest");
      b($$0, $$1, "minecraft:trapped_chest");
      $$0.registerSimple($$1, "minecraft:ender_chest");
      $$0.register($$1, "minecraft:jukebox", $$1x -> DSL.optionalFields("RecordItem", biq.t.in($$0)));
      b($$0, $$1, "minecraft:dispenser");
      b($$0, $$1, "minecraft:dropper");
      $$0.register($$1, "minecraft:sign", () -> boh.a($$0));
      $$0.register($$1, "minecraft:mob_spawner", $$1x -> biq.H.in($$0));
      $$0.register($$1, "minecraft:piston", $$1x -> DSL.optionalFields("blockState", biq.u.in($$0)));
      b($$0, $$1, "minecraft:brewing_stand");
      $$0.register($$1, "minecraft:enchanting_table", () -> bkz.b($$0));
      $$0.registerSimple($$1, "minecraft:end_portal");
      $$0.register($$1, "minecraft:beacon", () -> bkz.b($$0));
      $$0.register($$1, "minecraft:skull", () -> DSL.optionalFields("custom_name", biq.z.in($$0)));
      $$0.registerSimple($$1, "minecraft:daylight_detector");
      b($$0, $$1, "minecraft:hopper");
      $$0.registerSimple($$1, "minecraft:comparator");
      $$0.register($$1, "minecraft:banner", () -> bkz.b($$0));
      $$0.registerSimple($$1, "minecraft:structure_block");
      $$0.registerSimple($$1, "minecraft:end_gateway");
      $$0.register($$1, "minecraft:command_block", () -> DSL.optionalFields("LastOutput", biq.z.in($$0)));
      b($$0, $$1, "minecraft:shulker_box");
      $$0.registerSimple($$1, "minecraft:bed");
      return $$1;
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      $$0.registerType(false, biq.a, () -> DSL.optionalFields("CustomBossEvents", DSL.compoundList(DSL.optionalFields("Name", biq.z.in($$0)))));
      $$0.registerType(false, biq.L, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         biq.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", biq.C.in($$0))),
                  Pair.of("ender_pearls", DSL.list(biq.C.in($$0))),
                  Pair.of("Inventory", DSL.list(biq.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(biq.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", biq.C.in($$0)),
                  Pair.of("ShoulderEntityRight", biq.C.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(biq.L.in($$0)), "toBeDisplayed", DSL.list(biq.L.in($$0))))
               }
            )
      );
      $$0.registerType(
         false,
         biq.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(biq.C.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(biq.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", biq.E.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(biq.u.in($$0))))
               )
            )
      );
      $$0.registerType(true, biq.s, () -> DSL.optionalFields("components", biq.w.in($$0), DSL.taggedChoiceLazy("id", a(), $$2)));
      $$0.registerType(true, biq.C, () -> DSL.optionalFields("Passengers", DSL.list(biq.C.in($$0)), biq.D.in($$0)));
      $$0.registerType(true, biq.D, () -> DSL.and(biq.A.in($$0), DSL.optionalFields("CustomName", biq.z.in($$0), DSL.taggedChoiceLazy("id", a(), $$1))));
      $$0.registerType(true, biq.t, () -> DSL.hook(DSL.optionalFields("id", biq.F.in($$0), "tag", boh.b($$0)), bof.b, HookFunction.IDENTITY));
      $$0.registerType(false, biq.d, () -> DSL.compoundList(DSL.list(biq.t.in($$0))));
      $$0.registerType(false, biq.e, DSL::remainder);
      $$0.registerType(
         false,
         biq.f,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", biq.C.in($$0))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", biq.s.in($$0))),
               "palette",
               DSL.list(biq.u.in($$0))
            )
      );
      $$0.registerType(false, biq.E, () -> DSL.constType(a()));
      $$0.registerType(false, biq.F, () -> DSL.constType(a()));
      $$0.registerType(false, biq.u, DSL::remainder);
      $$0.registerType(false, biq.v, DSL::remainder);
      Supplier<TypeTemplate> $$3 = () -> DSL.compoundList(biq.F.in($$0), DSL.constType(DSL.intType()));
      $$0.registerType(
         false,
         biq.g,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("minecraft:mined", DSL.compoundList(biq.E.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:crafted", $$3.get()),
                     Pair.of("minecraft:used", $$3.get()),
                     Pair.of("minecraft:broken", $$3.get()),
                     Pair.of("minecraft:picked_up", $$3.get()),
                     Pair.of("minecraft:dropped", $$3.get()),
                     Pair.of("minecraft:killed", DSL.compoundList(biq.B.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:killed_by", DSL.compoundList(biq.B.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:custom", DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType())))
                  }
               )
            )
      );
      $$0.registerType(false, biq.h, DSL::remainder);
      $$0.registerType(false, biq.i, DSL::remainder);
      $$0.registerType(false, biq.j, () -> DSL.optionalFields("banners", DSL.list(DSL.optionalFields("Name", biq.z.in($$0)))));
      $$0.registerType(false, biq.k, DSL::remainder);
      $$0.registerType(false, biq.l, DSL::remainder);
      $$0.registerType(false, biq.m, DSL::remainder);
      $$0.registerType(
         false,
         biq.o,
         () -> DSL.optionalFields(
               "data",
               DSL.optionalFields(
                  "Objectives",
                  DSL.list(biq.J.in($$0)),
                  "Teams",
                  DSL.list(biq.K.in($$0)),
                  "PlayerScores",
                  DSL.list(DSL.optionalFields("display", biq.z.in($$0)))
               )
            )
      );
      $$0.registerType(false, biq.n, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(biq.I.in($$0)))));
      $$0.registerType(false, biq.I, DSL::remainder);
      Map<String, Supplier<TypeTemplate>> $$4 = bky.a($$0);
      $$0.registerType(
         false,
         biq.J,
         () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), $$4), "DisplayName", biq.z.in($$0)), bky.c, bky.d)
      );
      $$0.registerType(
         false, biq.K, () -> DSL.optionalFields("MemberNamePrefix", biq.z.in($$0), "MemberNameSuffix", biq.z.in($$0), "DisplayName", biq.z.in($$0))
      );
      $$0.registerType(true, biq.H, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", biq.C.in($$0))), "SpawnData", biq.C.in($$0)));
      $$0.registerType(
         false,
         biq.p,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(biq.M.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(biq.B.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(biq.B.in($$0), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(biq.B.in($$0), DSL.constType(DSL.string())))
            )
      );
      $$0.registerType(false, biq.M, () -> DSL.constType(a()));
      $$0.registerType(false, biq.B, () -> DSL.constType(a()));
      $$0.registerType(false, biq.q, DSL::remainder);
      $$0.registerType(false, biq.O, DSL::remainder);
      $$0.registerType(false, biq.r, () -> DSL.optionalFields("Entities", DSL.list(biq.C.in($$0))));
      $$0.registerType(true, biq.w, DSL::remainder);
      $$0.registerType(true, biq.x, () -> DSL.optionalFields("buy", biq.t.in($$0), "buyB", biq.t.in($$0), "sell", biq.t.in($$0)));
      $$0.registerType(true, biq.y, () -> DSL.constType(DSL.string()));
      $$0.registerType(true, biq.z, () -> DSL.constType(DSL.string()));
      $$0.registerType(
         true,
         biq.A,
         () -> DSL.and(
               DSL.optional(DSL.field("ArmorItems", DSL.list(biq.t.in($$0)))),
               new TypeTemplate[]{
                  DSL.optional(DSL.field("HandItems", DSL.list(biq.t.in($$0)))),
                  DSL.optional(DSL.field("body_armor_item", biq.t.in($$0))),
                  DSL.optional(DSL.field("saddle", biq.t.in($$0)))
               }
            )
      );
   }
}
