import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bij extends bht {
   public bij(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> bhu.a($$0));
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("Items", DSL.list(bgh.t.in($$0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.register($$1, "minecraft:area_effect_cloud", $$1x -> DSL.optionalFields("Particle", bgh.y.in($$0)));
      a($$0, $$1, "minecraft:armor_stand");
      $$0.register($$1, "minecraft:arrow", $$1x -> DSL.optionalFields("inBlockState", bgh.u.in($$0)));
      a($$0, $$1, "minecraft:bat");
      a($$0, $$1, "minecraft:blaze");
      $$0.registerSimple($$1, "minecraft:boat");
      a($$0, $$1, "minecraft:cave_spider");
      $$0.register($$1, "minecraft:chest_minecart", $$1x -> DSL.optionalFields("DisplayState", bgh.u.in($$0), "Items", DSL.list(bgh.t.in($$0))));
      a($$0, $$1, "minecraft:chicken");
      $$0.register($$1, "minecraft:commandblock_minecart", $$1x -> DSL.optionalFields("DisplayState", bgh.u.in($$0)));
      a($$0, $$1, "minecraft:cow");
      a($$0, $$1, "minecraft:creeper");
      $$0.register($$1, "minecraft:donkey", $$1x -> DSL.optionalFields("Items", DSL.list(bgh.t.in($$0)), "SaddleItem", bgh.t.in($$0), bhu.a($$0)));
      $$0.registerSimple($$1, "minecraft:dragon_fireball");
      $$0.registerSimple($$1, "minecraft:egg");
      a($$0, $$1, "minecraft:elder_guardian");
      $$0.registerSimple($$1, "minecraft:ender_crystal");
      a($$0, $$1, "minecraft:ender_dragon");
      $$0.register($$1, "minecraft:enderman", $$1x -> DSL.optionalFields("carriedBlockState", bgh.u.in($$0), bhu.a($$0)));
      a($$0, $$1, "minecraft:endermite");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:evocation_fangs");
      a($$0, $$1, "minecraft:evocation_illager");
      $$0.registerSimple($$1, "minecraft:eye_of_ender_signal");
      $$0.register($$1, "minecraft:falling_block", $$1x -> DSL.optionalFields("BlockState", bgh.u.in($$0), "TileEntityData", bgh.s.in($$0)));
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:fireworks_rocket", $$1x -> DSL.optionalFields("FireworksItem", bgh.t.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", $$1x -> DSL.optionalFields("DisplayState", bgh.u.in($$0)));
      a($$0, $$1, "minecraft:ghast");
      a($$0, $$1, "minecraft:giant");
      a($$0, $$1, "minecraft:guardian");
      $$0.register($$1, "minecraft:hopper_minecart", $$1x -> DSL.optionalFields("DisplayState", bgh.u.in($$0), "Items", DSL.list(bgh.t.in($$0))));
      $$0.register($$1, "minecraft:horse", $$1x -> DSL.optionalFields("ArmorItem", bgh.t.in($$0), "SaddleItem", bgh.t.in($$0), bhu.a($$0)));
      a($$0, $$1, "minecraft:husk");
      $$0.registerSimple($$1, "minecraft:illusion_illager");
      $$0.register($$1, "minecraft:item", $$1x -> DSL.optionalFields("Item", bgh.t.in($$0)));
      $$0.register($$1, "minecraft:item_frame", $$1x -> DSL.optionalFields("Item", bgh.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:leash_knot");
      $$0.register(
         $$1,
         "minecraft:llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(bgh.t.in($$0)), "SaddleItem", bgh.t.in($$0), "DecorItem", bgh.t.in($$0), bhu.a($$0))
      );
      $$0.registerSimple($$1, "minecraft:llama_spit");
      a($$0, $$1, "minecraft:magma_cube");
      $$0.register($$1, "minecraft:minecart", $$1x -> DSL.optionalFields("DisplayState", bgh.u.in($$0)));
      a($$0, $$1, "minecraft:mooshroom");
      $$0.register($$1, "minecraft:mule", $$1x -> DSL.optionalFields("Items", DSL.list(bgh.t.in($$0)), "SaddleItem", bgh.t.in($$0), bhu.a($$0)));
      a($$0, $$1, "minecraft:ocelot");
      $$0.registerSimple($$1, "minecraft:painting");
      $$0.registerSimple($$1, "minecraft:parrot");
      a($$0, $$1, "minecraft:pig");
      a($$0, $$1, "minecraft:polar_bear");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", bgh.t.in($$0)));
      a($$0, $$1, "minecraft:rabbit");
      a($$0, $$1, "minecraft:sheep");
      a($$0, $$1, "minecraft:shulker");
      $$0.registerSimple($$1, "minecraft:shulker_bullet");
      a($$0, $$1, "minecraft:silverfish");
      a($$0, $$1, "minecraft:skeleton");
      $$0.register($$1, "minecraft:skeleton_horse", $$1x -> DSL.optionalFields("SaddleItem", bgh.t.in($$0), bhu.a($$0)));
      a($$0, $$1, "minecraft:slime");
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      a($$0, $$1, "minecraft:snowman");
      $$0.register($$1, "minecraft:spawner_minecart", $$1x -> DSL.optionalFields("DisplayState", bgh.u.in($$0), bgh.F.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", $$1x -> DSL.optionalFields("inBlockState", bgh.u.in($$0)));
      a($$0, $$1, "minecraft:spider");
      a($$0, $$1, "minecraft:squid");
      a($$0, $$1, "minecraft:stray");
      $$0.registerSimple($$1, "minecraft:tnt");
      $$0.register($$1, "minecraft:tnt_minecart", $$1x -> DSL.optionalFields("DisplayState", bgh.u.in($$0)));
      a($$0, $$1, "minecraft:vex");
      $$0.register(
         $$1,
         "minecraft:villager",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(bgh.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(bgh.x.in($$0))), bhu.a($$0))
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
      $$0.register($$1, "minecraft:zombie_horse", $$1x -> DSL.optionalFields("SaddleItem", bgh.t.in($$0), bhu.a($$0)));
      a($$0, $$1, "minecraft:zombie_pigman");
      $$0.register($$1, "minecraft:zombie_villager", $$1x -> DSL.optionalFields("Offers", DSL.optionalFields("Recipes", DSL.list(bgh.x.in($$0))), bhu.a($$0)));
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      b($$0, $$1, "minecraft:furnace");
      b($$0, $$1, "minecraft:chest");
      b($$0, $$1, "minecraft:trapped_chest");
      $$0.registerSimple($$1, "minecraft:ender_chest");
      $$0.register($$1, "minecraft:jukebox", $$1x -> DSL.optionalFields("RecordItem", bgh.t.in($$0)));
      b($$0, $$1, "minecraft:dispenser");
      b($$0, $$1, "minecraft:dropper");
      $$0.registerSimple($$1, "minecraft:sign");
      $$0.register($$1, "minecraft:mob_spawner", $$1x -> bgh.F.in($$0));
      $$0.register($$1, "minecraft:piston", $$1x -> DSL.optionalFields("blockState", bgh.u.in($$0)));
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
      $$0.registerType(false, bgh.a, DSL::remainder);
      $$0.registerType(false, bgh.J, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         bgh.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bgh.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bgh.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bgh.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bgh.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bgh.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bgh.J.in($$0)), "toBeDisplayed", DSL.list(bgh.J.in($$0))))
               }
            )
      );
      $$0.registerType(
         false,
         bgh.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bgh.A.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bgh.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bgh.C.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(bgh.u.in($$0))))
               )
            )
      );
      $$0.registerType(true, bgh.s, () -> DSL.optionalFields("components", bgh.w.in($$0), DSL.taggedChoiceLazy("id", a(), $$2)));
      $$0.registerType(true, bgh.A, () -> DSL.optionalFields("Passengers", DSL.list(bgh.A.in($$0)), bgh.B.in($$0)));
      $$0.registerType(true, bgh.B, () -> DSL.taggedChoiceLazy("id", a(), $$1));
      $$0.registerType(
         true,
         bgh.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bgh.D.in($$0),
                  "tag",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("EntityTag", bgh.A.in($$0)),
                        Pair.of("BlockEntityTag", bgh.s.in($$0)),
                        Pair.of("CanDestroy", DSL.list(bgh.C.in($$0))),
                        Pair.of("CanPlaceOn", DSL.list(bgh.C.in($$0))),
                        Pair.of("Items", DSL.list(bgh.t.in($$0))),
                        Pair.of("ChargedProjectiles", DSL.list(bgh.t.in($$0)))
                     }
                  )
               ),
               blb.b,
               HookFunction.IDENTITY
            )
      );
      $$0.registerType(false, bgh.d, () -> DSL.compoundList(DSL.list(bgh.t.in($$0))));
      $$0.registerType(false, bgh.e, DSL::remainder);
      $$0.registerType(
         false,
         bgh.f,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", bgh.A.in($$0))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", bgh.s.in($$0))),
               "palette",
               DSL.list(bgh.u.in($$0))
            )
      );
      $$0.registerType(false, bgh.C, () -> DSL.constType(a()));
      $$0.registerType(false, bgh.D, () -> DSL.constType(a()));
      $$0.registerType(false, bgh.u, DSL::remainder);
      $$0.registerType(false, bgh.v, DSL::remainder);
      Supplier<TypeTemplate> $$3 = () -> DSL.compoundList(bgh.D.in($$0), DSL.constType(DSL.intType()));
      $$0.registerType(
         false,
         bgh.g,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("minecraft:mined", DSL.compoundList(bgh.C.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:crafted", $$3.get()),
                     Pair.of("minecraft:used", $$3.get()),
                     Pair.of("minecraft:broken", $$3.get()),
                     Pair.of("minecraft:picked_up", $$3.get()),
                     Pair.of("minecraft:dropped", $$3.get()),
                     Pair.of("minecraft:killed", DSL.compoundList(bgh.z.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:killed_by", DSL.compoundList(bgh.z.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:custom", DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType())))
                  }
               )
            )
      );
      $$0.registerType(false, bgh.h, DSL::remainder);
      $$0.registerType(false, bgh.i, DSL::remainder);
      $$0.registerType(false, bgh.j, DSL::remainder);
      $$0.registerType(false, bgh.k, DSL::remainder);
      $$0.registerType(false, bgh.l, DSL::remainder);
      $$0.registerType(false, bgh.m, DSL::remainder);
      $$0.registerType(
         false, bgh.o, () -> DSL.optionalFields("data", DSL.optionalFields("Objectives", DSL.list(bgh.H.in($$0)), "Teams", DSL.list(bgh.I.in($$0))))
      );
      $$0.registerType(false, bgh.n, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(bgh.G.in($$0)))));
      $$0.registerType(false, bgh.G, DSL::remainder);
      Map<String, Supplier<TypeTemplate>> $$4 = bii.a($$0);
      $$0.registerType(false, bgh.H, () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), $$4)), bii.c, bii.d));
      $$0.registerType(false, bgh.I, DSL::remainder);
      $$0.registerType(true, bgh.F, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", bgh.A.in($$0))), "SpawnData", bgh.A.in($$0)));
      $$0.registerType(
         false,
         bgh.p,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(bgh.K.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(bgh.z.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(bgh.z.in($$0), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(bgh.z.in($$0), DSL.constType(DSL.string())))
            )
      );
      $$0.registerType(false, bgh.K, () -> DSL.constType(a()));
      $$0.registerType(false, bgh.z, () -> DSL.constType(a()));
      $$0.registerType(false, bgh.q, DSL::remainder);
      $$0.registerType(false, bgh.M, DSL::remainder);
      $$0.registerType(false, bgh.r, () -> DSL.optionalFields("Entities", DSL.list(bgh.A.in($$0))));
      $$0.registerType(true, bgh.w, DSL::remainder);
      $$0.registerType(true, bgh.x, () -> DSL.optionalFields("buy", bgh.t.in($$0), "buyB", bgh.t.in($$0), "sell", bgh.t.in($$0)));
      $$0.registerType(true, bgh.y, () -> DSL.constType(DSL.string()));
   }
}
