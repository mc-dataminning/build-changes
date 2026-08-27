import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class bdu extends bde {
   public bdu(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> bdf.a($$0));
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("Items", DSL.list(bbw.t.in($$0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.registerSimple($$1, "minecraft:area_effect_cloud");
      a($$0, $$1, "minecraft:armor_stand");
      $$0.register($$1, "minecraft:arrow", $$1x -> DSL.optionalFields("inBlockState", bbw.u.in($$0)));
      a($$0, $$1, "minecraft:bat");
      a($$0, $$1, "minecraft:blaze");
      $$0.registerSimple($$1, "minecraft:boat");
      a($$0, $$1, "minecraft:cave_spider");
      $$0.register($$1, "minecraft:chest_minecart", $$1x -> DSL.optionalFields("DisplayState", bbw.u.in($$0), "Items", DSL.list(bbw.t.in($$0))));
      a($$0, $$1, "minecraft:chicken");
      $$0.register($$1, "minecraft:commandblock_minecart", $$1x -> DSL.optionalFields("DisplayState", bbw.u.in($$0)));
      a($$0, $$1, "minecraft:cow");
      a($$0, $$1, "minecraft:creeper");
      $$0.register($$1, "minecraft:donkey", $$1x -> DSL.optionalFields("Items", DSL.list(bbw.t.in($$0)), "SaddleItem", bbw.t.in($$0), bdf.a($$0)));
      $$0.registerSimple($$1, "minecraft:dragon_fireball");
      $$0.registerSimple($$1, "minecraft:egg");
      a($$0, $$1, "minecraft:elder_guardian");
      $$0.registerSimple($$1, "minecraft:ender_crystal");
      a($$0, $$1, "minecraft:ender_dragon");
      $$0.register($$1, "minecraft:enderman", $$1x -> DSL.optionalFields("carriedBlockState", bbw.u.in($$0), bdf.a($$0)));
      a($$0, $$1, "minecraft:endermite");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:evocation_fangs");
      a($$0, $$1, "minecraft:evocation_illager");
      $$0.registerSimple($$1, "minecraft:eye_of_ender_signal");
      $$0.register($$1, "minecraft:falling_block", $$1x -> DSL.optionalFields("BlockState", bbw.u.in($$0), "TileEntityData", bbw.s.in($$0)));
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:fireworks_rocket", $$1x -> DSL.optionalFields("FireworksItem", bbw.t.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", $$1x -> DSL.optionalFields("DisplayState", bbw.u.in($$0)));
      a($$0, $$1, "minecraft:ghast");
      a($$0, $$1, "minecraft:giant");
      a($$0, $$1, "minecraft:guardian");
      $$0.register($$1, "minecraft:hopper_minecart", $$1x -> DSL.optionalFields("DisplayState", bbw.u.in($$0), "Items", DSL.list(bbw.t.in($$0))));
      $$0.register($$1, "minecraft:horse", $$1x -> DSL.optionalFields("ArmorItem", bbw.t.in($$0), "SaddleItem", bbw.t.in($$0), bdf.a($$0)));
      a($$0, $$1, "minecraft:husk");
      $$0.registerSimple($$1, "minecraft:illusion_illager");
      $$0.register($$1, "minecraft:item", $$1x -> DSL.optionalFields("Item", bbw.t.in($$0)));
      $$0.register($$1, "minecraft:item_frame", $$1x -> DSL.optionalFields("Item", bbw.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:leash_knot");
      $$0.register(
         $$1,
         "minecraft:llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(bbw.t.in($$0)), "SaddleItem", bbw.t.in($$0), "DecorItem", bbw.t.in($$0), bdf.a($$0))
      );
      $$0.registerSimple($$1, "minecraft:llama_spit");
      a($$0, $$1, "minecraft:magma_cube");
      $$0.register($$1, "minecraft:minecart", $$1x -> DSL.optionalFields("DisplayState", bbw.u.in($$0)));
      a($$0, $$1, "minecraft:mooshroom");
      $$0.register($$1, "minecraft:mule", $$1x -> DSL.optionalFields("Items", DSL.list(bbw.t.in($$0)), "SaddleItem", bbw.t.in($$0), bdf.a($$0)));
      a($$0, $$1, "minecraft:ocelot");
      $$0.registerSimple($$1, "minecraft:painting");
      $$0.registerSimple($$1, "minecraft:parrot");
      a($$0, $$1, "minecraft:pig");
      a($$0, $$1, "minecraft:polar_bear");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", bbw.t.in($$0)));
      a($$0, $$1, "minecraft:rabbit");
      a($$0, $$1, "minecraft:sheep");
      a($$0, $$1, "minecraft:shulker");
      $$0.registerSimple($$1, "minecraft:shulker_bullet");
      a($$0, $$1, "minecraft:silverfish");
      a($$0, $$1, "minecraft:skeleton");
      $$0.register($$1, "minecraft:skeleton_horse", $$1x -> DSL.optionalFields("SaddleItem", bbw.t.in($$0), bdf.a($$0)));
      a($$0, $$1, "minecraft:slime");
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      a($$0, $$1, "minecraft:snowman");
      $$0.register($$1, "minecraft:spawner_minecart", $$1x -> DSL.optionalFields("DisplayState", bbw.u.in($$0), bbw.C.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", $$1x -> DSL.optionalFields("inBlockState", bbw.u.in($$0)));
      a($$0, $$1, "minecraft:spider");
      a($$0, $$1, "minecraft:squid");
      a($$0, $$1, "minecraft:stray");
      $$0.registerSimple($$1, "minecraft:tnt");
      $$0.register($$1, "minecraft:tnt_minecart", $$1x -> DSL.optionalFields("DisplayState", bbw.u.in($$0)));
      a($$0, $$1, "minecraft:vex");
      $$0.register(
         $$1,
         "minecraft:villager",
         $$1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(bbw.t.in($$0)),
               "Offers",
               DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", bbw.t.in($$0), "buyB", bbw.t.in($$0), "sell", bbw.t.in($$0)))),
               bdf.a($$0)
            )
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
      $$0.register($$1, "minecraft:zombie_horse", $$1x -> DSL.optionalFields("SaddleItem", bbw.t.in($$0), bdf.a($$0)));
      a($$0, $$1, "minecraft:zombie_pigman");
      a($$0, $$1, "minecraft:zombie_villager");
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      b($$0, $$1, "minecraft:furnace");
      b($$0, $$1, "minecraft:chest");
      b($$0, $$1, "minecraft:trapped_chest");
      $$0.registerSimple($$1, "minecraft:ender_chest");
      $$0.register($$1, "minecraft:jukebox", $$1x -> DSL.optionalFields("RecordItem", bbw.t.in($$0)));
      b($$0, $$1, "minecraft:dispenser");
      b($$0, $$1, "minecraft:dropper");
      $$0.registerSimple($$1, "minecraft:sign");
      $$0.register($$1, "minecraft:mob_spawner", $$1x -> bbw.C.in($$0));
      $$0.register($$1, "minecraft:piston", $$1x -> DSL.optionalFields("blockState", bbw.u.in($$0)));
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
      $$0.registerType(false, bbw.a, DSL::remainder);
      $$0.registerType(false, bbw.G, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         bbw.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", bbw.x.in($$0)),
               "Inventory",
               DSL.list(bbw.t.in($$0)),
               "EnderItems",
               DSL.list(bbw.t.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  bbw.x.in($$0),
                  "ShoulderEntityRight",
                  bbw.x.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(bbw.G.in($$0)), "toBeDisplayed", DSL.list(bbw.G.in($$0)))
               )
            )
      );
      $$0.registerType(
         false,
         bbw.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bbw.x.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bbw.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bbw.z.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(bbw.u.in($$0))))
               )
            )
      );
      $$0.registerType(true, bbw.s, () -> DSL.taggedChoiceLazy("id", a(), $$2));
      $$0.registerType(true, bbw.x, () -> DSL.optionalFields("Passengers", DSL.list(bbw.x.in($$0)), bbw.y.in($$0)));
      $$0.registerType(true, bbw.y, () -> DSL.taggedChoiceLazy("id", a(), $$1));
      $$0.registerType(
         true,
         bbw.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bbw.A.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     bbw.x.in($$0),
                     "BlockEntityTag",
                     bbw.s.in($$0),
                     "CanDestroy",
                     DSL.list(bbw.z.in($$0)),
                     "CanPlaceOn",
                     DSL.list(bbw.z.in($$0)),
                     "Items",
                     DSL.list(bbw.t.in($$0))
                  )
               ),
               bgb.b,
               HookFunction.IDENTITY
            )
      );
      $$0.registerType(false, bbw.d, () -> DSL.compoundList(DSL.list(bbw.t.in($$0))));
      $$0.registerType(false, bbw.e, DSL::remainder);
      $$0.registerType(
         false,
         bbw.f,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", bbw.x.in($$0))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", bbw.s.in($$0))),
               "palette",
               DSL.list(bbw.u.in($$0))
            )
      );
      $$0.registerType(false, bbw.z, () -> DSL.constType(a()));
      $$0.registerType(false, bbw.A, () -> DSL.constType(a()));
      $$0.registerType(false, bbw.u, DSL::remainder);
      $$0.registerType(false, bbw.v, DSL::remainder);
      Supplier<TypeTemplate> $$3 = () -> DSL.compoundList(bbw.A.in($$0), DSL.constType(DSL.intType()));
      $$0.registerType(
         false,
         bbw.g,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  "minecraft:mined",
                  DSL.compoundList(bbw.z.in($$0), DSL.constType(DSL.intType())),
                  "minecraft:crafted",
                  $$3.get(),
                  "minecraft:used",
                  $$3.get(),
                  "minecraft:broken",
                  $$3.get(),
                  "minecraft:picked_up",
                  $$3.get(),
                  DSL.optionalFields(
                     "minecraft:dropped",
                     $$3.get(),
                     "minecraft:killed",
                     DSL.compoundList(bbw.w.in($$0), DSL.constType(DSL.intType())),
                     "minecraft:killed_by",
                     DSL.compoundList(bbw.w.in($$0), DSL.constType(DSL.intType())),
                     "minecraft:custom",
                     DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType()))
                  )
               )
            )
      );
      $$0.registerType(false, bbw.h, DSL::remainder);
      $$0.registerType(false, bbw.i, DSL::remainder);
      $$0.registerType(false, bbw.j, DSL::remainder);
      $$0.registerType(false, bbw.k, DSL::remainder);
      $$0.registerType(false, bbw.l, DSL::remainder);
      $$0.registerType(false, bbw.m, DSL::remainder);
      $$0.registerType(
         false, bbw.o, () -> DSL.optionalFields("data", DSL.optionalFields("Objectives", DSL.list(bbw.E.in($$0)), "Teams", DSL.list(bbw.F.in($$0))))
      );
      $$0.registerType(false, bbw.n, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(bbw.D.in($$0)))));
      $$0.registerType(false, bbw.D, DSL::remainder);
      Map<String, Supplier<TypeTemplate>> $$4 = bdt.a($$0);
      $$0.registerType(false, bbw.E, () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), $$4)), bdt.c, bdt.d));
      $$0.registerType(false, bbw.F, DSL::remainder);
      $$0.registerType(true, bbw.C, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", bbw.x.in($$0))), "SpawnData", bbw.x.in($$0)));
      $$0.registerType(
         false,
         bbw.p,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(bbw.H.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(bbw.w.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(bbw.w.in($$0), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(bbw.w.in($$0), DSL.constType(DSL.string())))
            )
      );
      $$0.registerType(false, bbw.H, () -> DSL.constType(a()));
      $$0.registerType(false, bbw.w, () -> DSL.constType(a()));
      $$0.registerType(false, bbw.q, DSL::remainder);
      $$0.registerType(false, bbw.J, DSL::remainder);
      $$0.registerType(false, bbw.r, () -> DSL.optionalFields("Entities", DSL.list(bbw.x.in($$0))));
   }
}
