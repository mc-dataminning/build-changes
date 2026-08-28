import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bkl extends bju {
   public bkl(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> bjv.a($$0));
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> bkk.a($$0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.register($$1, "minecraft:area_effect_cloud", $$1x -> DSL.optionalFields("Particle", bic.y.in($$0)));
      a($$0, $$1, "minecraft:armor_stand");
      $$0.register($$1, "minecraft:arrow", $$1x -> DSL.optionalFields("inBlockState", bic.u.in($$0)));
      a($$0, $$1, "minecraft:bat");
      a($$0, $$1, "minecraft:blaze");
      $$0.registerSimple($$1, "minecraft:boat");
      a($$0, $$1, "minecraft:cave_spider");
      $$0.register($$1, "minecraft:chest_minecart", $$1x -> DSL.optionalFields("DisplayState", bic.u.in($$0), "Items", DSL.list(bic.t.in($$0))));
      a($$0, $$1, "minecraft:chicken");
      $$0.register($$1, "minecraft:commandblock_minecart", $$1x -> DSL.optionalFields("DisplayState", bic.u.in($$0), "LastOutput", bic.z.in($$0)));
      a($$0, $$1, "minecraft:cow");
      a($$0, $$1, "minecraft:creeper");
      $$0.register($$1, "minecraft:donkey", $$1x -> DSL.optionalFields("Items", DSL.list(bic.t.in($$0)), "SaddleItem", bic.t.in($$0), bjv.a($$0)));
      $$0.registerSimple($$1, "minecraft:dragon_fireball");
      $$0.registerSimple($$1, "minecraft:egg");
      a($$0, $$1, "minecraft:elder_guardian");
      $$0.registerSimple($$1, "minecraft:ender_crystal");
      a($$0, $$1, "minecraft:ender_dragon");
      $$0.register($$1, "minecraft:enderman", $$1x -> DSL.optionalFields("carriedBlockState", bic.u.in($$0), bjv.a($$0)));
      a($$0, $$1, "minecraft:endermite");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:evocation_fangs");
      a($$0, $$1, "minecraft:evocation_illager");
      $$0.registerSimple($$1, "minecraft:eye_of_ender_signal");
      $$0.register($$1, "minecraft:falling_block", $$1x -> DSL.optionalFields("BlockState", bic.u.in($$0), "TileEntityData", bic.s.in($$0)));
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:fireworks_rocket", $$1x -> DSL.optionalFields("FireworksItem", bic.t.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", $$1x -> DSL.optionalFields("DisplayState", bic.u.in($$0)));
      a($$0, $$1, "minecraft:ghast");
      a($$0, $$1, "minecraft:giant");
      a($$0, $$1, "minecraft:guardian");
      $$0.register($$1, "minecraft:hopper_minecart", $$1x -> DSL.optionalFields("DisplayState", bic.u.in($$0), "Items", DSL.list(bic.t.in($$0))));
      $$0.register($$1, "minecraft:horse", $$1x -> DSL.optionalFields("ArmorItem", bic.t.in($$0), "SaddleItem", bic.t.in($$0), bjv.a($$0)));
      a($$0, $$1, "minecraft:husk");
      $$0.registerSimple($$1, "minecraft:illusion_illager");
      $$0.register($$1, "minecraft:item", $$1x -> DSL.optionalFields("Item", bic.t.in($$0)));
      $$0.register($$1, "minecraft:item_frame", $$1x -> DSL.optionalFields("Item", bic.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:leash_knot");
      $$0.register(
         $$1,
         "minecraft:llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(bic.t.in($$0)), "SaddleItem", bic.t.in($$0), "DecorItem", bic.t.in($$0), bjv.a($$0))
      );
      $$0.registerSimple($$1, "minecraft:llama_spit");
      a($$0, $$1, "minecraft:magma_cube");
      $$0.register($$1, "minecraft:minecart", $$1x -> DSL.optionalFields("DisplayState", bic.u.in($$0)));
      a($$0, $$1, "minecraft:mooshroom");
      $$0.register($$1, "minecraft:mule", $$1x -> DSL.optionalFields("Items", DSL.list(bic.t.in($$0)), "SaddleItem", bic.t.in($$0), bjv.a($$0)));
      a($$0, $$1, "minecraft:ocelot");
      $$0.registerSimple($$1, "minecraft:painting");
      $$0.registerSimple($$1, "minecraft:parrot");
      a($$0, $$1, "minecraft:pig");
      a($$0, $$1, "minecraft:polar_bear");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", bic.t.in($$0)));
      a($$0, $$1, "minecraft:rabbit");
      a($$0, $$1, "minecraft:sheep");
      a($$0, $$1, "minecraft:shulker");
      $$0.registerSimple($$1, "minecraft:shulker_bullet");
      a($$0, $$1, "minecraft:silverfish");
      a($$0, $$1, "minecraft:skeleton");
      $$0.register($$1, "minecraft:skeleton_horse", $$1x -> DSL.optionalFields("SaddleItem", bic.t.in($$0), bjv.a($$0)));
      a($$0, $$1, "minecraft:slime");
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      a($$0, $$1, "minecraft:snowman");
      $$0.register($$1, "minecraft:spawner_minecart", $$1x -> DSL.optionalFields("DisplayState", bic.u.in($$0), bic.G.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", $$1x -> DSL.optionalFields("inBlockState", bic.u.in($$0)));
      a($$0, $$1, "minecraft:spider");
      a($$0, $$1, "minecraft:squid");
      a($$0, $$1, "minecraft:stray");
      $$0.registerSimple($$1, "minecraft:tnt");
      $$0.register($$1, "minecraft:tnt_minecart", $$1x -> DSL.optionalFields("DisplayState", bic.u.in($$0)));
      a($$0, $$1, "minecraft:vex");
      $$0.register(
         $$1,
         "minecraft:villager",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(bic.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(bic.x.in($$0))), bjv.a($$0))
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
      $$0.register($$1, "minecraft:zombie_horse", $$1x -> DSL.optionalFields("SaddleItem", bic.t.in($$0), bjv.a($$0)));
      a($$0, $$1, "minecraft:zombie_pigman");
      $$0.register($$1, "minecraft:zombie_villager", $$1x -> DSL.optionalFields("Offers", DSL.optionalFields("Recipes", DSL.list(bic.x.in($$0))), bjv.a($$0)));
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      b($$0, $$1, "minecraft:furnace");
      b($$0, $$1, "minecraft:chest");
      b($$0, $$1, "minecraft:trapped_chest");
      $$0.registerSimple($$1, "minecraft:ender_chest");
      $$0.register($$1, "minecraft:jukebox", $$1x -> DSL.optionalFields("RecordItem", bic.t.in($$0)));
      b($$0, $$1, "minecraft:dispenser");
      b($$0, $$1, "minecraft:dropper");
      $$0.register($$1, "minecraft:sign", () -> bnp.b($$0));
      $$0.register($$1, "minecraft:mob_spawner", $$1x -> bic.G.in($$0));
      $$0.register($$1, "minecraft:piston", $$1x -> DSL.optionalFields("blockState", bic.u.in($$0)));
      b($$0, $$1, "minecraft:brewing_stand");
      $$0.register($$1, "minecraft:enchanting_table", () -> bkk.b($$0));
      $$0.registerSimple($$1, "minecraft:end_portal");
      $$0.register($$1, "minecraft:beacon", () -> bkk.b($$0));
      $$0.register($$1, "minecraft:skull", () -> DSL.optionalFields("custom_name", bic.z.in($$0)));
      $$0.registerSimple($$1, "minecraft:daylight_detector");
      b($$0, $$1, "minecraft:hopper");
      $$0.registerSimple($$1, "minecraft:comparator");
      $$0.register($$1, "minecraft:banner", () -> bkk.b($$0));
      $$0.registerSimple($$1, "minecraft:structure_block");
      $$0.registerSimple($$1, "minecraft:end_gateway");
      $$0.register($$1, "minecraft:command_block", () -> DSL.optionalFields("LastOutput", bic.z.in($$0)));
      b($$0, $$1, "minecraft:shulker_box");
      $$0.registerSimple($$1, "minecraft:bed");
      return $$1;
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      $$0.registerType(false, bic.a, () -> DSL.optionalFields("CustomBossEvents", DSL.compoundList(DSL.optionalFields("Name", bic.z.in($$0)))));
      $$0.registerType(false, bic.K, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         bic.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bic.B.in($$0))),
                  Pair.of("ender_pearls", DSL.list(bic.B.in($$0))),
                  Pair.of("Inventory", DSL.list(bic.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bic.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bic.B.in($$0)),
                  Pair.of("ShoulderEntityRight", bic.B.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bic.K.in($$0)), "toBeDisplayed", DSL.list(bic.K.in($$0))))
               }
            )
      );
      $$0.registerType(
         false,
         bic.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bic.B.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bic.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bic.D.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(bic.u.in($$0))))
               )
            )
      );
      $$0.registerType(true, bic.s, () -> DSL.optionalFields("components", bic.w.in($$0), DSL.taggedChoiceLazy("id", a(), $$2)));
      $$0.registerType(true, bic.B, () -> DSL.optionalFields("Passengers", DSL.list(bic.B.in($$0)), bic.C.in($$0)));
      $$0.registerType(true, bic.C, () -> DSL.optionalFields("CustomName", bic.z.in($$0), DSL.taggedChoiceLazy("id", a(), $$1)));
      $$0.registerType(true, bic.t, () -> DSL.hook(DSL.optionalFields("id", bic.E.in($$0), "tag", bnp.c($$0)), bnn.b, HookFunction.IDENTITY));
      $$0.registerType(false, bic.d, () -> DSL.compoundList(DSL.list(bic.t.in($$0))));
      $$0.registerType(false, bic.e, DSL::remainder);
      $$0.registerType(
         false,
         bic.f,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", bic.B.in($$0))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", bic.s.in($$0))),
               "palette",
               DSL.list(bic.u.in($$0))
            )
      );
      $$0.registerType(false, bic.D, () -> DSL.constType(a()));
      $$0.registerType(false, bic.E, () -> DSL.constType(a()));
      $$0.registerType(false, bic.u, DSL::remainder);
      $$0.registerType(false, bic.v, DSL::remainder);
      Supplier<TypeTemplate> $$3 = () -> DSL.compoundList(bic.E.in($$0), DSL.constType(DSL.intType()));
      $$0.registerType(
         false,
         bic.g,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("minecraft:mined", DSL.compoundList(bic.D.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:crafted", $$3.get()),
                     Pair.of("minecraft:used", $$3.get()),
                     Pair.of("minecraft:broken", $$3.get()),
                     Pair.of("minecraft:picked_up", $$3.get()),
                     Pair.of("minecraft:dropped", $$3.get()),
                     Pair.of("minecraft:killed", DSL.compoundList(bic.A.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:killed_by", DSL.compoundList(bic.A.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:custom", DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType())))
                  }
               )
            )
      );
      $$0.registerType(false, bic.h, DSL::remainder);
      $$0.registerType(false, bic.i, DSL::remainder);
      $$0.registerType(false, bic.j, () -> DSL.optionalFields("banners", DSL.list(DSL.optionalFields("Name", bic.z.in($$0)))));
      $$0.registerType(false, bic.k, DSL::remainder);
      $$0.registerType(false, bic.l, DSL::remainder);
      $$0.registerType(false, bic.m, DSL::remainder);
      $$0.registerType(
         false,
         bic.o,
         () -> DSL.optionalFields(
               "data",
               DSL.optionalFields(
                  "Objectives",
                  DSL.list(bic.I.in($$0)),
                  "Teams",
                  DSL.list(bic.J.in($$0)),
                  "PlayerScores",
                  DSL.list(DSL.optionalFields("display", bic.z.in($$0)))
               )
            )
      );
      $$0.registerType(false, bic.n, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(bic.H.in($$0)))));
      $$0.registerType(false, bic.H, DSL::remainder);
      Map<String, Supplier<TypeTemplate>> $$4 = bkj.a($$0);
      $$0.registerType(
         false,
         bic.I,
         () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), $$4), "DisplayName", bic.z.in($$0)), bkj.c, bkj.d)
      );
      $$0.registerType(
         false, bic.J, () -> DSL.optionalFields("MemberNamePrefix", bic.z.in($$0), "MemberNameSuffix", bic.z.in($$0), "DisplayName", bic.z.in($$0))
      );
      $$0.registerType(true, bic.G, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", bic.B.in($$0))), "SpawnData", bic.B.in($$0)));
      $$0.registerType(
         false,
         bic.p,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(bic.L.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(bic.A.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(bic.A.in($$0), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(bic.A.in($$0), DSL.constType(DSL.string())))
            )
      );
      $$0.registerType(false, bic.L, () -> DSL.constType(a()));
      $$0.registerType(false, bic.A, () -> DSL.constType(a()));
      $$0.registerType(false, bic.q, DSL::remainder);
      $$0.registerType(false, bic.N, DSL::remainder);
      $$0.registerType(false, bic.r, () -> DSL.optionalFields("Entities", DSL.list(bic.B.in($$0))));
      $$0.registerType(true, bic.w, DSL::remainder);
      $$0.registerType(true, bic.x, () -> DSL.optionalFields("buy", bic.t.in($$0), "buyB", bic.t.in($$0), "sell", bic.t.in($$0)));
      $$0.registerType(true, bic.y, () -> DSL.constType(DSL.string()));
      $$0.registerType(true, bic.z, () -> DSL.constType(DSL.string()));
   }
}
