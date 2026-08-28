import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjm extends biw {
   public bjm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> bix.a($$0));
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("Items", DSL.list(bhk.t.in($$0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.register($$1, "minecraft:area_effect_cloud", $$1x -> DSL.optionalFields("Particle", bhk.y.in($$0)));
      a($$0, $$1, "minecraft:armor_stand");
      $$0.register($$1, "minecraft:arrow", $$1x -> DSL.optionalFields("inBlockState", bhk.u.in($$0)));
      a($$0, $$1, "minecraft:bat");
      a($$0, $$1, "minecraft:blaze");
      $$0.registerSimple($$1, "minecraft:boat");
      a($$0, $$1, "minecraft:cave_spider");
      $$0.register($$1, "minecraft:chest_minecart", $$1x -> DSL.optionalFields("DisplayState", bhk.u.in($$0), "Items", DSL.list(bhk.t.in($$0))));
      a($$0, $$1, "minecraft:chicken");
      $$0.register($$1, "minecraft:commandblock_minecart", $$1x -> DSL.optionalFields("DisplayState", bhk.u.in($$0)));
      a($$0, $$1, "minecraft:cow");
      a($$0, $$1, "minecraft:creeper");
      $$0.register($$1, "minecraft:donkey", $$1x -> DSL.optionalFields("Items", DSL.list(bhk.t.in($$0)), "SaddleItem", bhk.t.in($$0), bix.a($$0)));
      $$0.registerSimple($$1, "minecraft:dragon_fireball");
      $$0.registerSimple($$1, "minecraft:egg");
      a($$0, $$1, "minecraft:elder_guardian");
      $$0.registerSimple($$1, "minecraft:ender_crystal");
      a($$0, $$1, "minecraft:ender_dragon");
      $$0.register($$1, "minecraft:enderman", $$1x -> DSL.optionalFields("carriedBlockState", bhk.u.in($$0), bix.a($$0)));
      a($$0, $$1, "minecraft:endermite");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:evocation_fangs");
      a($$0, $$1, "minecraft:evocation_illager");
      $$0.registerSimple($$1, "minecraft:eye_of_ender_signal");
      $$0.register($$1, "minecraft:falling_block", $$1x -> DSL.optionalFields("BlockState", bhk.u.in($$0), "TileEntityData", bhk.s.in($$0)));
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:fireworks_rocket", $$1x -> DSL.optionalFields("FireworksItem", bhk.t.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", $$1x -> DSL.optionalFields("DisplayState", bhk.u.in($$0)));
      a($$0, $$1, "minecraft:ghast");
      a($$0, $$1, "minecraft:giant");
      a($$0, $$1, "minecraft:guardian");
      $$0.register($$1, "minecraft:hopper_minecart", $$1x -> DSL.optionalFields("DisplayState", bhk.u.in($$0), "Items", DSL.list(bhk.t.in($$0))));
      $$0.register($$1, "minecraft:horse", $$1x -> DSL.optionalFields("ArmorItem", bhk.t.in($$0), "SaddleItem", bhk.t.in($$0), bix.a($$0)));
      a($$0, $$1, "minecraft:husk");
      $$0.registerSimple($$1, "minecraft:illusion_illager");
      $$0.register($$1, "minecraft:item", $$1x -> DSL.optionalFields("Item", bhk.t.in($$0)));
      $$0.register($$1, "minecraft:item_frame", $$1x -> DSL.optionalFields("Item", bhk.t.in($$0)));
      $$0.registerSimple($$1, "minecraft:leash_knot");
      $$0.register(
         $$1,
         "minecraft:llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(bhk.t.in($$0)), "SaddleItem", bhk.t.in($$0), "DecorItem", bhk.t.in($$0), bix.a($$0))
      );
      $$0.registerSimple($$1, "minecraft:llama_spit");
      a($$0, $$1, "minecraft:magma_cube");
      $$0.register($$1, "minecraft:minecart", $$1x -> DSL.optionalFields("DisplayState", bhk.u.in($$0)));
      a($$0, $$1, "minecraft:mooshroom");
      $$0.register($$1, "minecraft:mule", $$1x -> DSL.optionalFields("Items", DSL.list(bhk.t.in($$0)), "SaddleItem", bhk.t.in($$0), bix.a($$0)));
      a($$0, $$1, "minecraft:ocelot");
      $$0.registerSimple($$1, "minecraft:painting");
      $$0.registerSimple($$1, "minecraft:parrot");
      a($$0, $$1, "minecraft:pig");
      a($$0, $$1, "minecraft:polar_bear");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", bhk.t.in($$0)));
      a($$0, $$1, "minecraft:rabbit");
      a($$0, $$1, "minecraft:sheep");
      a($$0, $$1, "minecraft:shulker");
      $$0.registerSimple($$1, "minecraft:shulker_bullet");
      a($$0, $$1, "minecraft:silverfish");
      a($$0, $$1, "minecraft:skeleton");
      $$0.register($$1, "minecraft:skeleton_horse", $$1x -> DSL.optionalFields("SaddleItem", bhk.t.in($$0), bix.a($$0)));
      a($$0, $$1, "minecraft:slime");
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      a($$0, $$1, "minecraft:snowman");
      $$0.register($$1, "minecraft:spawner_minecart", $$1x -> DSL.optionalFields("DisplayState", bhk.u.in($$0), bhk.F.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", $$1x -> DSL.optionalFields("inBlockState", bhk.u.in($$0)));
      a($$0, $$1, "minecraft:spider");
      a($$0, $$1, "minecraft:squid");
      a($$0, $$1, "minecraft:stray");
      $$0.registerSimple($$1, "minecraft:tnt");
      $$0.register($$1, "minecraft:tnt_minecart", $$1x -> DSL.optionalFields("DisplayState", bhk.u.in($$0)));
      a($$0, $$1, "minecraft:vex");
      $$0.register(
         $$1,
         "minecraft:villager",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(bhk.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(bhk.x.in($$0))), bix.a($$0))
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
      $$0.register($$1, "minecraft:zombie_horse", $$1x -> DSL.optionalFields("SaddleItem", bhk.t.in($$0), bix.a($$0)));
      a($$0, $$1, "minecraft:zombie_pigman");
      $$0.register($$1, "minecraft:zombie_villager", $$1x -> DSL.optionalFields("Offers", DSL.optionalFields("Recipes", DSL.list(bhk.x.in($$0))), bix.a($$0)));
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      b($$0, $$1, "minecraft:furnace");
      b($$0, $$1, "minecraft:chest");
      b($$0, $$1, "minecraft:trapped_chest");
      $$0.registerSimple($$1, "minecraft:ender_chest");
      $$0.register($$1, "minecraft:jukebox", $$1x -> DSL.optionalFields("RecordItem", bhk.t.in($$0)));
      b($$0, $$1, "minecraft:dispenser");
      b($$0, $$1, "minecraft:dropper");
      $$0.registerSimple($$1, "minecraft:sign");
      $$0.register($$1, "minecraft:mob_spawner", $$1x -> bhk.F.in($$0));
      $$0.register($$1, "minecraft:piston", $$1x -> DSL.optionalFields("blockState", bhk.u.in($$0)));
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
      $$0.registerType(false, bhk.a, DSL::remainder);
      $$0.registerType(false, bhk.J, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         bhk.b,
         () -> DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", bhk.A.in($$0))),
                  Pair.of("Inventory", DSL.list(bhk.t.in($$0))),
                  Pair.of("EnderItems", DSL.list(bhk.t.in($$0))),
                  Pair.of("ShoulderEntityLeft", bhk.A.in($$0)),
                  Pair.of("ShoulderEntityRight", bhk.A.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(bhk.J.in($$0)), "toBeDisplayed", DSL.list(bhk.J.in($$0))))
               }
            )
      );
      $$0.registerType(
         false,
         bhk.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bhk.A.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bhk.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bhk.C.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(bhk.u.in($$0))))
               )
            )
      );
      $$0.registerType(true, bhk.s, () -> DSL.optionalFields("components", bhk.w.in($$0), DSL.taggedChoiceLazy("id", a(), $$2)));
      $$0.registerType(true, bhk.A, () -> DSL.optionalFields("Passengers", DSL.list(bhk.A.in($$0)), bhk.B.in($$0)));
      $$0.registerType(true, bhk.B, () -> DSL.taggedChoiceLazy("id", a(), $$1));
      $$0.registerType(
         true,
         bhk.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bhk.D.in($$0),
                  "tag",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("EntityTag", bhk.A.in($$0)),
                        Pair.of("BlockEntityTag", bhk.s.in($$0)),
                        Pair.of("CanDestroy", DSL.list(bhk.C.in($$0))),
                        Pair.of("CanPlaceOn", DSL.list(bhk.C.in($$0))),
                        Pair.of("Items", DSL.list(bhk.t.in($$0))),
                        Pair.of("ChargedProjectiles", DSL.list(bhk.t.in($$0)))
                     }
                  )
               ),
               bme.b,
               HookFunction.IDENTITY
            )
      );
      $$0.registerType(false, bhk.d, () -> DSL.compoundList(DSL.list(bhk.t.in($$0))));
      $$0.registerType(false, bhk.e, DSL::remainder);
      $$0.registerType(
         false,
         bhk.f,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", bhk.A.in($$0))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", bhk.s.in($$0))),
               "palette",
               DSL.list(bhk.u.in($$0))
            )
      );
      $$0.registerType(false, bhk.C, () -> DSL.constType(a()));
      $$0.registerType(false, bhk.D, () -> DSL.constType(a()));
      $$0.registerType(false, bhk.u, DSL::remainder);
      $$0.registerType(false, bhk.v, DSL::remainder);
      Supplier<TypeTemplate> $$3 = () -> DSL.compoundList(bhk.D.in($$0), DSL.constType(DSL.intType()));
      $$0.registerType(
         false,
         bhk.g,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("minecraft:mined", DSL.compoundList(bhk.C.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:crafted", $$3.get()),
                     Pair.of("minecraft:used", $$3.get()),
                     Pair.of("minecraft:broken", $$3.get()),
                     Pair.of("minecraft:picked_up", $$3.get()),
                     Pair.of("minecraft:dropped", $$3.get()),
                     Pair.of("minecraft:killed", DSL.compoundList(bhk.z.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:killed_by", DSL.compoundList(bhk.z.in($$0), DSL.constType(DSL.intType()))),
                     Pair.of("minecraft:custom", DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType())))
                  }
               )
            )
      );
      $$0.registerType(false, bhk.h, DSL::remainder);
      $$0.registerType(false, bhk.i, DSL::remainder);
      $$0.registerType(false, bhk.j, DSL::remainder);
      $$0.registerType(false, bhk.k, DSL::remainder);
      $$0.registerType(false, bhk.l, DSL::remainder);
      $$0.registerType(false, bhk.m, DSL::remainder);
      $$0.registerType(
         false, bhk.o, () -> DSL.optionalFields("data", DSL.optionalFields("Objectives", DSL.list(bhk.H.in($$0)), "Teams", DSL.list(bhk.I.in($$0))))
      );
      $$0.registerType(false, bhk.n, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(bhk.G.in($$0)))));
      $$0.registerType(false, bhk.G, DSL::remainder);
      Map<String, Supplier<TypeTemplate>> $$4 = bjl.a($$0);
      $$0.registerType(false, bhk.H, () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), $$4)), bjl.c, bjl.d));
      $$0.registerType(false, bhk.I, DSL::remainder);
      $$0.registerType(true, bhk.F, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", bhk.A.in($$0))), "SpawnData", bhk.A.in($$0)));
      $$0.registerType(
         false,
         bhk.p,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(bhk.K.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(bhk.z.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(bhk.z.in($$0), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(bhk.z.in($$0), DSL.constType(DSL.string())))
            )
      );
      $$0.registerType(false, bhk.K, () -> DSL.constType(a()));
      $$0.registerType(false, bhk.z, () -> DSL.constType(a()));
      $$0.registerType(false, bhk.q, DSL::remainder);
      $$0.registerType(false, bhk.M, DSL::remainder);
      $$0.registerType(false, bhk.r, () -> DSL.optionalFields("Entities", DSL.list(bhk.A.in($$0))));
      $$0.registerType(true, bhk.w, DSL::remainder);
      $$0.registerType(true, bhk.x, () -> DSL.optionalFields("buy", bhk.t.in($$0), "buyB", bhk.t.in($$0), "sell", bhk.t.in($$0)));
      $$0.registerType(true, bhk.y, () -> DSL.constType(DSL.string()));
   }
}
