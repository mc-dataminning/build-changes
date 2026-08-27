import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bhf extends bgp {
   public bhf(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> bgq.a($$0));
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("Items", DSL.list(bff.t.in($$0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.registerSimple($$1, "minecraft:area_effect_cloud");
      a($$0, $$1, "minecraft:armor_stand");
      $$0.register($$1, "minecraft:arrow", $$1x -> DSL.optionalFields("inBlockState", bff.u.in($$0)));
      a($$0, $$1, "minecraft:bat");
      a($$0, $$1, "minecraft:blaze");
      $$0.registerSimple($$1, "minecraft:boat");
      a($$0, $$1, "minecraft:cave_spider");
      $$0.register($$1, "minecraft:chest_minecart", $$1x -> DSL.optionalFields("DisplayState", bff.u.in($$0), "Items", DSL.list(bff.t.in($$0))));
      a($$0, $$1, "minecraft:chicken");
      $$0.register($$1, "minecraft:commandblock_minecart", $$1x -> DSL.optionalFields("DisplayState", bff.u.in($$0)));
      a($$0, $$1, "minecraft:cow");
      a($$0, $$1, "minecraft:creeper");
      $$0.register($$1, "minecraft:donkey", $$1x -> DSL.optionalFields("Items", DSL.list(bff.t.in($$0)), "SaddleItem", bff.t.in($$0), bgq.a($$0)));
      $$0.registerSimple($$1, "minecraft:dragon_fireball");
      $$0.registerSimple($$1, "minecraft:egg");
      a($$0, $$1, "minecraft:elder_guardian");
      $$0.registerSimple($$1, "minecraft:ender_crystal");
      a($$0, $$1, "minecraft:ender_dragon");
      $$0.register($$1, "minecraft:enderman", $$1x -> DSL.optionalFields("carriedBlockState", bff.u.in($$0), bgq.a($$0)));
      a($$0, $$1, "minecraft:endermite");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:evocation_fangs");
      a($$0, $$1, "minecraft:evocation_illager");
      $$0.registerSimple($$1, "minecraft:eye_of_ender_signal");
      $$0.register($$1, "minecraft:falling_block", $$1x -> DSL.optionalFields("BlockState", bff.u.in($$0), "TileEntityData", bff.s.in($$0)));
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:fireworks_rocket", $$1x -> DSL.optionalFields("FireworksItem", bff.t.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", $$1x -> DSL.optionalFields("DisplayState", bff.u.in($$0)));
      a($$0, $$1, "minecraft:ghast");
      a($$0, $$1, "minecraft:giant");
      a($$0, $$1, "minecraft:guardian");
      $$0.register($$1, "minecraft:hopper_minecart", $$1x -> DSL.optionalFields("DisplayState", bff.u.in($$0), "Items", DSL.list(bff.t.in($$0))));
      $$0.register($$1, "minecraft:horse", $$1x -> DSL.optionalFields("ArmorItem", bff.t.in($$0), "SaddleItem", bff.t.in($$0), bgq.a($$0)));
      a($$0, $$1, "minecraft:husk");
      $$0.registerSimple($$1, "minecraft:illusion_illager");
      $$0.register($$1, "minecraft:item", $$1x -> DSL.optionalFields("Item", bff.t.in($$0)));
      $$0.register($$1, "minecraft:item_frame", $$1x -> DSL.optionalFields("Item", bff.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:leash_knot");
      $$0.register(
         $$1,
         "minecraft:llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(bff.t.in($$0)), "SaddleItem", bff.t.in($$0), "DecorItem", bff.t.in($$0), bgq.a($$0))
      );
      $$0.registerSimple($$1, "minecraft:llama_spit");
      a($$0, $$1, "minecraft:magma_cube");
      $$0.register($$1, "minecraft:minecart", $$1x -> DSL.optionalFields("DisplayState", bff.u.in($$0)));
      a($$0, $$1, "minecraft:mooshroom");
      $$0.register($$1, "minecraft:mule", $$1x -> DSL.optionalFields("Items", DSL.list(bff.t.in($$0)), "SaddleItem", bff.t.in($$0), bgq.a($$0)));
      a($$0, $$1, "minecraft:ocelot");
      $$0.registerSimple($$1, "minecraft:painting");
      $$0.registerSimple($$1, "minecraft:parrot");
      a($$0, $$1, "minecraft:pig");
      a($$0, $$1, "minecraft:polar_bear");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", bff.t.in($$0)));
      a($$0, $$1, "minecraft:rabbit");
      a($$0, $$1, "minecraft:sheep");
      a($$0, $$1, "minecraft:shulker");
      $$0.registerSimple($$1, "minecraft:shulker_bullet");
      a($$0, $$1, "minecraft:silverfish");
      a($$0, $$1, "minecraft:skeleton");
      $$0.register($$1, "minecraft:skeleton_horse", $$1x -> DSL.optionalFields("SaddleItem", bff.t.in($$0), bgq.a($$0)));
      a($$0, $$1, "minecraft:slime");
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      a($$0, $$1, "minecraft:snowman");
      $$0.register($$1, "minecraft:spawner_minecart", $$1x -> DSL.optionalFields("DisplayState", bff.u.in($$0), bff.D.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", $$1x -> DSL.optionalFields("inBlockState", bff.u.in($$0)));
      a($$0, $$1, "minecraft:spider");
      a($$0, $$1, "minecraft:squid");
      a($$0, $$1, "minecraft:stray");
      $$0.registerSimple($$1, "minecraft:tnt");
      $$0.register($$1, "minecraft:tnt_minecart", $$1x -> DSL.optionalFields("DisplayState", bff.u.in($$0)));
      a($$0, $$1, "minecraft:vex");
      $$0.register(
         $$1,
         "minecraft:villager",
         $$1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(bff.t.in($$0)),
               "Offers",
               DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", bff.t.in($$0), "buyB", bff.t.in($$0), "sell", bff.t.in($$0)))),
               bgq.a($$0)
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
      $$0.register($$1, "minecraft:zombie_horse", $$1x -> DSL.optionalFields("SaddleItem", bff.t.in($$0), bgq.a($$0)));
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
      $$0.register($$1, "minecraft:jukebox", $$1x -> DSL.optionalFields("RecordItem", bff.t.in($$0)));
      b($$0, $$1, "minecraft:dispenser");
      b($$0, $$1, "minecraft:dropper");
      $$0.registerSimple($$1, "minecraft:sign");
      $$0.register($$1, "minecraft:mob_spawner", $$1x -> bff.D.in($$0));
      $$0.register($$1, "minecraft:piston", $$1x -> DSL.optionalFields("blockState", bff.u.in($$0)));
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
      $$0.registerType(false, bff.a, DSL::remainder);
      $$0.registerType(false, bff.H, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         bff.b,
         () -> ayu.a(
               Pair.of("RootVehicle", DSL.optionalFields("Entity", bff.y.in($$0))),
               Pair.of("Inventory", DSL.list(bff.t.in($$0))),
               Pair.of("EnderItems", DSL.list(bff.t.in($$0))),
               Pair.of("ShoulderEntityLeft", bff.y.in($$0)),
               Pair.of("ShoulderEntityRight", bff.y.in($$0)),
               Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bff.H.in($$0)), "toBeDisplayed", DSL.list(bff.H.in($$0))))
            )
      );
      $$0.registerType(
         false,
         bff.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bff.y.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bff.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bff.A.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(bff.u.in($$0))))
               )
            )
      );
      $$0.registerType(true, bff.s, () -> DSL.taggedChoiceLazy("id", a(), $$2));
      $$0.registerType(true, bff.y, () -> DSL.optionalFields("Passengers", DSL.list(bff.y.in($$0)), bff.z.in($$0)));
      $$0.registerType(true, bff.z, () -> DSL.taggedChoiceLazy("id", a(), $$1));
      $$0.registerType(
         true,
         bff.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bff.B.in($$0),
                  "tag",
                  ayu.a(
                     Pair.of("EntityTag", bff.y.in($$0)),
                     Pair.of("BlockEntityTag", bff.s.in($$0)),
                     Pair.of("CanDestroy", DSL.list(bff.A.in($$0))),
                     Pair.of("CanPlaceOn", DSL.list(bff.A.in($$0))),
                     Pair.of("Items", DSL.list(bff.t.in($$0))),
                     Pair.of("ChargedProjectiles", DSL.list(bff.t.in($$0)))
                  )
               ),
               bjt.b,
               HookFunction.IDENTITY
            )
      );
      $$0.registerType(false, bff.d, () -> DSL.compoundList(DSL.list(bff.t.in($$0))));
      $$0.registerType(false, bff.e, DSL::remainder);
      $$0.registerType(
         false,
         bff.f,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", bff.y.in($$0))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", bff.s.in($$0))),
               "palette",
               DSL.list(bff.u.in($$0))
            )
      );
      $$0.registerType(false, bff.A, () -> DSL.constType(a()));
      $$0.registerType(false, bff.B, () -> DSL.constType(a()));
      $$0.registerType(false, bff.u, DSL::remainder);
      $$0.registerType(false, bff.v, DSL::remainder);
      Supplier<TypeTemplate> $$3 = () -> DSL.compoundList(bff.B.in($$0), DSL.constType(DSL.intType()));
      $$0.registerType(
         false,
         bff.g,
         () -> DSL.optionalFields(
               "stats",
               ayu.a(
                  Pair.of("minecraft:mined", DSL.compoundList(bff.A.in($$0), DSL.constType(DSL.intType()))),
                  Pair.of("minecraft:crafted", $$3.get()),
                  Pair.of("minecraft:used", $$3.get()),
                  Pair.of("minecraft:broken", $$3.get()),
                  Pair.of("minecraft:picked_up", $$3.get()),
                  Pair.of("minecraft:dropped", $$3.get()),
                  Pair.of("minecraft:killed", DSL.compoundList(bff.x.in($$0), DSL.constType(DSL.intType()))),
                  Pair.of("minecraft:killed_by", DSL.compoundList(bff.x.in($$0), DSL.constType(DSL.intType()))),
                  Pair.of("minecraft:custom", DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType())))
               )
            )
      );
      $$0.registerType(false, bff.h, DSL::remainder);
      $$0.registerType(false, bff.i, DSL::remainder);
      $$0.registerType(false, bff.j, DSL::remainder);
      $$0.registerType(false, bff.k, DSL::remainder);
      $$0.registerType(false, bff.l, DSL::remainder);
      $$0.registerType(false, bff.m, DSL::remainder);
      $$0.registerType(
         false, bff.o, () -> DSL.optionalFields("data", DSL.optionalFields("Objectives", DSL.list(bff.F.in($$0)), "Teams", DSL.list(bff.G.in($$0))))
      );
      $$0.registerType(false, bff.n, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(bff.E.in($$0)))));
      $$0.registerType(false, bff.E, DSL::remainder);
      Map<String, Supplier<TypeTemplate>> $$4 = bhe.a($$0);
      $$0.registerType(false, bff.F, () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), $$4)), bhe.c, bhe.d));
      $$0.registerType(false, bff.G, DSL::remainder);
      $$0.registerType(true, bff.D, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", bff.y.in($$0))), "SpawnData", bff.y.in($$0)));
      $$0.registerType(
         false,
         bff.p,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(bff.I.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(bff.x.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(bff.x.in($$0), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(bff.x.in($$0), DSL.constType(DSL.string())))
            )
      );
      $$0.registerType(false, bff.I, () -> DSL.constType(a()));
      $$0.registerType(false, bff.x, () -> DSL.constType(a()));
      $$0.registerType(false, bff.q, DSL::remainder);
      $$0.registerType(false, bff.K, DSL::remainder);
      $$0.registerType(false, bff.r, () -> DSL.optionalFields("Entities", DSL.list(bff.y.in($$0))));
      $$0.registerType(true, bff.w, DSL::remainder);
   }
}
