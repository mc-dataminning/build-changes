import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjs extends bjc {
   public bjs(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> bjd.a($$0));
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("Items", DSL.list(bho.t.in($$0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.register($$1, "minecraft:area_effect_cloud", $$1x -> DSL.optionalFields("Particle", bho.y.in($$0)));
      a($$0, $$1, "minecraft:armor_stand");
      $$0.register($$1, "minecraft:arrow", $$1x -> DSL.optionalFields("inBlockState", bho.u.in($$0)));
      a($$0, $$1, "minecraft:bat");
      a($$0, $$1, "minecraft:blaze");
      $$0.registerSimple($$1, "minecraft:boat");
      a($$0, $$1, "minecraft:cave_spider");
      $$0.register($$1, "minecraft:chest_minecart", $$1x -> DSL.optionalFields("DisplayState", bho.u.in($$0), "Items", DSL.list(bho.t.in($$0))));
      a($$0, $$1, "minecraft:chicken");
      $$0.register($$1, "minecraft:commandblock_minecart", $$1x -> DSL.optionalFields("DisplayState", bho.u.in($$0)));
      a($$0, $$1, "minecraft:cow");
      a($$0, $$1, "minecraft:creeper");
      $$0.register($$1, "minecraft:donkey", $$1x -> DSL.optionalFields("Items", DSL.list(bho.t.in($$0)), "SaddleItem", bho.t.in($$0), bjd.a($$0)));
      $$0.registerSimple($$1, "minecraft:dragon_fireball");
      $$0.registerSimple($$1, "minecraft:egg");
      a($$0, $$1, "minecraft:elder_guardian");
      $$0.registerSimple($$1, "minecraft:ender_crystal");
      a($$0, $$1, "minecraft:ender_dragon");
      $$0.register($$1, "minecraft:enderman", $$1x -> DSL.optionalFields("carriedBlockState", bho.u.in($$0), bjd.a($$0)));
      a($$0, $$1, "minecraft:endermite");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:evocation_fangs");
      a($$0, $$1, "minecraft:evocation_illager");
      $$0.registerSimple($$1, "minecraft:eye_of_ender_signal");
      $$0.register($$1, "minecraft:falling_block", $$1x -> DSL.optionalFields("BlockState", bho.u.in($$0), "TileEntityData", bho.s.in($$0)));
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:fireworks_rocket", $$1x -> DSL.optionalFields("FireworksItem", bho.t.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", $$1x -> DSL.optionalFields("DisplayState", bho.u.in($$0)));
      a($$0, $$1, "minecraft:ghast");
      a($$0, $$1, "minecraft:giant");
      a($$0, $$1, "minecraft:guardian");
      $$0.register($$1, "minecraft:hopper_minecart", $$1x -> DSL.optionalFields("DisplayState", bho.u.in($$0), "Items", DSL.list(bho.t.in($$0))));
      $$0.register($$1, "minecraft:horse", $$1x -> DSL.optionalFields("ArmorItem", bho.t.in($$0), "SaddleItem", bho.t.in($$0), bjd.a($$0)));
      a($$0, $$1, "minecraft:husk");
      $$0.registerSimple($$1, "minecraft:illusion_illager");
      $$0.register($$1, "minecraft:item", $$1x -> DSL.optionalFields("Item", bho.t.in($$0)));
      $$0.register($$1, "minecraft:item_frame", $$1x -> DSL.optionalFields("Item", bho.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:leash_knot");
      $$0.register(
         $$1,
         "minecraft:llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(bho.t.in($$0)), "SaddleItem", bho.t.in($$0), "DecorItem", bho.t.in($$0), bjd.a($$0))
      );
      $$0.registerSimple($$1, "minecraft:llama_spit");
      a($$0, $$1, "minecraft:magma_cube");
      $$0.register($$1, "minecraft:minecart", $$1x -> DSL.optionalFields("DisplayState", bho.u.in($$0)));
      a($$0, $$1, "minecraft:mooshroom");
      $$0.register($$1, "minecraft:mule", $$1x -> DSL.optionalFields("Items", DSL.list(bho.t.in($$0)), "SaddleItem", bho.t.in($$0), bjd.a($$0)));
      a($$0, $$1, "minecraft:ocelot");
      $$0.registerSimple($$1, "minecraft:painting");
      $$0.registerSimple($$1, "minecraft:parrot");
      a($$0, $$1, "minecraft:pig");
      a($$0, $$1, "minecraft:polar_bear");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", bho.t.in($$0)));
      a($$0, $$1, "minecraft:rabbit");
      a($$0, $$1, "minecraft:sheep");
      a($$0, $$1, "minecraft:shulker");
      $$0.registerSimple($$1, "minecraft:shulker_bullet");
      a($$0, $$1, "minecraft:silverfish");
      a($$0, $$1, "minecraft:skeleton");
      $$0.register($$1, "minecraft:skeleton_horse", $$1x -> DSL.optionalFields("SaddleItem", bho.t.in($$0), bjd.a($$0)));
      a($$0, $$1, "minecraft:slime");
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      a($$0, $$1, "minecraft:snowman");
      $$0.register($$1, "minecraft:spawner_minecart", $$1x -> DSL.optionalFields("DisplayState", bho.u.in($$0), bho.F.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", $$1x -> DSL.optionalFields("inBlockState", bho.u.in($$0)));
      a($$0, $$1, "minecraft:spider");
      a($$0, $$1, "minecraft:squid");
      a($$0, $$1, "minecraft:stray");
      $$0.registerSimple($$1, "minecraft:tnt");
      $$0.register($$1, "minecraft:tnt_minecart", $$1x -> DSL.optionalFields("DisplayState", bho.u.in($$0)));
      a($$0, $$1, "minecraft:vex");
      $$0.register(
         $$1,
         "minecraft:villager",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(bho.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(bho.x.in($$0))), bjd.a($$0))
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
      $$0.register($$1, "minecraft:zombie_horse", $$1x -> DSL.optionalFields("SaddleItem", bho.t.in($$0), bjd.a($$0)));
      a($$0, $$1, "minecraft:zombie_pigman");
      $$0.register($$1, "minecraft:zombie_villager", $$1x -> DSL.optionalFields("Offers", DSL.optionalFields("Recipes", DSL.list(bho.x.in($$0))), bjd.a($$0)));
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      b($$0, $$1, "minecraft:furnace");
      b($$0, $$1, "minecraft:chest");
      b($$0, $$1, "minecraft:trapped_chest");
      $$0.registerSimple($$1, "minecraft:ender_chest");
      $$0.register($$1, "minecraft:jukebox", $$1x -> DSL.optionalFields("RecordItem", bho.t.in($$0)));
      b($$0, $$1, "minecraft:dispenser");
      b($$0, $$1, "minecraft:dropper");
      $$0.registerSimple($$1, "minecraft:sign");
      $$0.register($$1, "minecraft:mob_spawner", $$1x -> bho.F.in($$0));
      $$0.register($$1, "minecraft:piston", $$1x -> DSL.optionalFields("blockState", bho.u.in($$0)));
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
      $$0.registerType(false, bho.a, DSL::remainder);
      $$0.registerType(false, bho.J, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         bho.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bho.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bho.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bho.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bho.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bho.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bho.J.in($$0)), "toBeDisplayed", DSL.list(bho.J.in($$0))))
               }
            )
      );
      $$0.registerType(
         false,
         bho.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bho.A.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bho.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bho.C.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(bho.u.in($$0))))
               )
            )
      );
      $$0.registerType(true, bho.s, () -> DSL.optionalFields("components", bho.w.in($$0), DSL.taggedChoiceLazy("id", a(), $$2)));
      $$0.registerType(true, bho.A, () -> DSL.optionalFields("Passengers", DSL.list(bho.A.in($$0)), bho.B.in($$0)));
      $$0.registerType(true, bho.B, () -> DSL.taggedChoiceLazy("id", a(), $$1));
      $$0.registerType(
         true,
         bho.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bho.D.in($$0),
                  "tag",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("EntityTag", bho.A.in($$0)),
                        Pair.of("BlockEntityTag", bho.s.in($$0)),
                        Pair.of("CanDestroy", DSL.list(bho.C.in($$0))),
                        Pair.of("CanPlaceOn", DSL.list(bho.C.in($$0))),
                        Pair.of("Items", DSL.list(bho.t.in($$0))),
                        Pair.of("ChargedProjectiles", DSL.list(bho.t.in($$0)))
                     }
                  )
               ),
               bml.b,
               HookFunction.IDENTITY
            )
      );
      $$0.registerType(false, bho.d, () -> DSL.compoundList(DSL.list(bho.t.in($$0))));
      $$0.registerType(false, bho.e, DSL::remainder);
      $$0.registerType(
         false,
         bho.f,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", bho.A.in($$0))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", bho.s.in($$0))),
               "palette",
               DSL.list(bho.u.in($$0))
            )
      );
      $$0.registerType(false, bho.C, () -> DSL.constType(a()));
      $$0.registerType(false, bho.D, () -> DSL.constType(a()));
      $$0.registerType(false, bho.u, DSL::remainder);
      $$0.registerType(false, bho.v, DSL::remainder);
      Supplier<TypeTemplate> $$3 = () -> DSL.compoundList(bho.D.in($$0), DSL.constType(DSL.intType()));
      $$0.registerType(
         false,
         bho.g,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("minecraft:mined", DSL.compoundList(bho.C.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:crafted", $$3.get()),
                     Pair.of("minecraft:used", $$3.get()),
                     Pair.of("minecraft:broken", $$3.get()),
                     Pair.of("minecraft:picked_up", $$3.get()),
                     Pair.of("minecraft:dropped", $$3.get()),
                     Pair.of("minecraft:killed", DSL.compoundList(bho.z.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:killed_by", DSL.compoundList(bho.z.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:custom", DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType())))
                  }
               )
            )
      );
      $$0.registerType(false, bho.h, DSL::remainder);
      $$0.registerType(false, bho.i, DSL::remainder);
      $$0.registerType(false, bho.j, DSL::remainder);
      $$0.registerType(false, bho.k, DSL::remainder);
      $$0.registerType(false, bho.l, DSL::remainder);
      $$0.registerType(false, bho.m, DSL::remainder);
      $$0.registerType(
         false, bho.o, () -> DSL.optionalFields("data", DSL.optionalFields("Objectives", DSL.list(bho.H.in($$0)), "Teams", DSL.list(bho.I.in($$0))))
      );
      $$0.registerType(false, bho.n, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(bho.G.in($$0)))));
      $$0.registerType(false, bho.G, DSL::remainder);
      Map<String, Supplier<TypeTemplate>> $$4 = bjr.a($$0);
      $$0.registerType(false, bho.H, () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), $$4)), bjr.c, bjr.d));
      $$0.registerType(false, bho.I, DSL::remainder);
      $$0.registerType(true, bho.F, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", bho.A.in($$0))), "SpawnData", bho.A.in($$0)));
      $$0.registerType(
         false,
         bho.p,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(bho.K.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(bho.z.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(bho.z.in($$0), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(bho.z.in($$0), DSL.constType(DSL.string())))
            )
      );
      $$0.registerType(false, bho.K, () -> DSL.constType(a()));
      $$0.registerType(false, bho.z, () -> DSL.constType(a()));
      $$0.registerType(false, bho.q, DSL::remainder);
      $$0.registerType(false, bho.M, DSL::remainder);
      $$0.registerType(false, bho.r, () -> DSL.optionalFields("Entities", DSL.list(bho.A.in($$0))));
      $$0.registerType(true, bho.w, DSL::remainder);
      $$0.registerType(true, bho.x, () -> DSL.optionalFields("buy", bho.t.in($$0), "buyB", bho.t.in($$0), "sell", bho.t.in($$0)));
      $$0.registerType(true, bho.y, () -> DSL.constType(DSL.string()));
   }
}
