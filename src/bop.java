import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Map;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class bop extends Schema {
   private static final Logger c = LogUtils.getLogger();
   static final Map<String, String> d = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), $$0 -> {
      $$0.put("minecraft:furnace", "Furnace");
      $$0.put("minecraft:lit_furnace", "Furnace");
      $$0.put("minecraft:chest", "Chest");
      $$0.put("minecraft:trapped_chest", "Chest");
      $$0.put("minecraft:ender_chest", "EnderChest");
      $$0.put("minecraft:jukebox", "RecordPlayer");
      $$0.put("minecraft:dispenser", "Trap");
      $$0.put("minecraft:dropper", "Dropper");
      $$0.put("minecraft:sign", "Sign");
      $$0.put("minecraft:mob_spawner", "MobSpawner");
      $$0.put("minecraft:noteblock", "Music");
      $$0.put("minecraft:brewing_stand", "Cauldron");
      $$0.put("minecraft:enhanting_table", "EnchantTable");
      $$0.put("minecraft:command_block", "CommandBlock");
      $$0.put("minecraft:beacon", "Beacon");
      $$0.put("minecraft:skull", "Skull");
      $$0.put("minecraft:daylight_detector", "DLDetector");
      $$0.put("minecraft:hopper", "Hopper");
      $$0.put("minecraft:banner", "Banner");
      $$0.put("minecraft:flower_pot", "FlowerPot");
      $$0.put("minecraft:repeating_command_block", "CommandBlock");
      $$0.put("minecraft:chain_command_block", "CommandBlock");
      $$0.put("minecraft:standing_sign", "Sign");
      $$0.put("minecraft:wall_sign", "Sign");
      $$0.put("minecraft:piston_head", "Piston");
      $$0.put("minecraft:daylight_detector_inverted", "DLDetector");
      $$0.put("minecraft:unpowered_comparator", "Comparator");
      $$0.put("minecraft:powered_comparator", "Comparator");
      $$0.put("minecraft:wall_banner", "Banner");
      $$0.put("minecraft:standing_banner", "Banner");
      $$0.put("minecraft:structure_block", "Structure");
      $$0.put("minecraft:end_portal", "Airportal");
      $$0.put("minecraft:end_gateway", "EndGateway");
      $$0.put("minecraft:shield", "Banner");
   });
   public static final Map<String, String> a = Map.of("minecraft:armor_stand", "ArmorStand", "minecraft:painting", "Painting");
   protected static final HookFunction b = new HookFunction() {
      public <T> T apply(DynamicOps<T> $$0, T $$1) {
         return bop.a(new Dynamic($$0, $$1), bop.d, bop.a);
      }
   };

   public bop(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("inTile", bit.E.in($$0)));
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("DisplayTile", bit.E.in($$0)));
   }

   protected static void c(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("Items", DSL.list(bit.t.in($$0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.register($$1, "Item", $$1x -> DSL.optionalFields("Item", bit.t.in($$0)));
      $$0.registerSimple($$1, "XPOrb");
      a($$0, $$1, "ThrownEgg");
      $$0.registerSimple($$1, "LeashKnot");
      $$0.registerSimple($$1, "Painting");
      $$0.register($$1, "Arrow", $$1x -> DSL.optionalFields("inTile", bit.E.in($$0)));
      $$0.register($$1, "TippedArrow", $$1x -> DSL.optionalFields("inTile", bit.E.in($$0)));
      $$0.register($$1, "SpectralArrow", $$1x -> DSL.optionalFields("inTile", bit.E.in($$0)));
      a($$0, $$1, "Snowball");
      a($$0, $$1, "Fireball");
      a($$0, $$1, "SmallFireball");
      a($$0, $$1, "ThrownEnderpearl");
      $$0.registerSimple($$1, "EyeOfEnderSignal");
      $$0.register($$1, "ThrownPotion", $$1x -> DSL.optionalFields("inTile", bit.E.in($$0), "Potion", bit.t.in($$0)));
      a($$0, $$1, "ThrownExpBottle");
      $$0.register($$1, "ItemFrame", $$1x -> DSL.optionalFields("Item", bit.t.in($$0)));
      a($$0, $$1, "WitherSkull");
      $$0.registerSimple($$1, "PrimedTnt");
      $$0.register($$1, "FallingSand", $$1x -> DSL.optionalFields("Block", bit.E.in($$0), "TileEntityData", bit.s.in($$0)));
      $$0.register($$1, "FireworksRocketEntity", $$1x -> DSL.optionalFields("FireworksItem", bit.t.in($$0)));
      $$0.registerSimple($$1, "Boat");
      $$0.register($$1, "Minecart", () -> DSL.optionalFields("DisplayTile", bit.E.in($$0), "Items", DSL.list(bit.t.in($$0))));
      b($$0, $$1, "MinecartRideable");
      $$0.register($$1, "MinecartChest", $$1x -> DSL.optionalFields("DisplayTile", bit.E.in($$0), "Items", DSL.list(bit.t.in($$0))));
      b($$0, $$1, "MinecartFurnace");
      b($$0, $$1, "MinecartTNT");
      $$0.register($$1, "MinecartSpawner", () -> DSL.optionalFields("DisplayTile", bit.E.in($$0), bit.H.in($$0)));
      $$0.register($$1, "MinecartHopper", $$1x -> DSL.optionalFields("DisplayTile", bit.E.in($$0), "Items", DSL.list(bit.t.in($$0))));
      $$0.register($$1, "MinecartCommandBlock", () -> DSL.optionalFields("DisplayTile", bit.E.in($$0), "LastOutput", bit.z.in($$0)));
      $$0.registerSimple($$1, "ArmorStand");
      $$0.registerSimple($$1, "Creeper");
      $$0.registerSimple($$1, "Skeleton");
      $$0.registerSimple($$1, "Spider");
      $$0.registerSimple($$1, "Giant");
      $$0.registerSimple($$1, "Zombie");
      $$0.registerSimple($$1, "Slime");
      $$0.registerSimple($$1, "Ghast");
      $$0.registerSimple($$1, "PigZombie");
      $$0.register($$1, "Enderman", $$1x -> DSL.optionalFields("carried", bit.E.in($$0)));
      $$0.registerSimple($$1, "CaveSpider");
      $$0.registerSimple($$1, "Silverfish");
      $$0.registerSimple($$1, "Blaze");
      $$0.registerSimple($$1, "LavaSlime");
      $$0.registerSimple($$1, "EnderDragon");
      $$0.registerSimple($$1, "WitherBoss");
      $$0.registerSimple($$1, "Bat");
      $$0.registerSimple($$1, "Witch");
      $$0.registerSimple($$1, "Endermite");
      $$0.registerSimple($$1, "Guardian");
      $$0.registerSimple($$1, "Pig");
      $$0.registerSimple($$1, "Sheep");
      $$0.registerSimple($$1, "Cow");
      $$0.registerSimple($$1, "Chicken");
      $$0.registerSimple($$1, "Squid");
      $$0.registerSimple($$1, "Wolf");
      $$0.registerSimple($$1, "MushroomCow");
      $$0.registerSimple($$1, "SnowMan");
      $$0.registerSimple($$1, "Ozelot");
      $$0.registerSimple($$1, "VillagerGolem");
      $$0.register($$1, "EntityHorse", $$1x -> DSL.optionalFields("Items", DSL.list(bit.t.in($$0)), "ArmorItem", bit.t.in($$0), "SaddleItem", bit.t.in($$0)));
      $$0.registerSimple($$1, "Rabbit");
      $$0.register(
         $$1, "Villager", $$1x -> DSL.optionalFields("Inventory", DSL.list(bit.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(bit.x.in($$0))))
      );
      $$0.registerSimple($$1, "EnderCrystal");
      $$0.register($$1, "AreaEffectCloud", $$1x -> DSL.optionalFields("Particle", bit.y.in($$0)));
      $$0.registerSimple($$1, "ShulkerBullet");
      $$0.registerSimple($$1, "DragonFireball");
      $$0.registerSimple($$1, "Shulker");
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      c($$0, $$1, "Furnace");
      c($$0, $$1, "Chest");
      $$0.registerSimple($$1, "EnderChest");
      $$0.register($$1, "RecordPlayer", $$1x -> DSL.optionalFields("RecordItem", bit.t.in($$0)));
      c($$0, $$1, "Trap");
      c($$0, $$1, "Dropper");
      $$0.register($$1, "Sign", () -> a($$0));
      $$0.register($$1, "MobSpawner", $$1x -> bit.H.in($$0));
      $$0.registerSimple($$1, "Music");
      $$0.registerSimple($$1, "Piston");
      c($$0, $$1, "Cauldron");
      $$0.registerSimple($$1, "EnchantTable");
      $$0.registerSimple($$1, "Airportal");
      $$0.register($$1, "Control", () -> DSL.optionalFields("LastOutput", bit.z.in($$0)));
      $$0.registerSimple($$1, "Beacon");
      $$0.register($$1, "Skull", () -> DSL.optionalFields("custom_name", bit.z.in($$0)));
      $$0.registerSimple($$1, "DLDetector");
      c($$0, $$1, "Hopper");
      $$0.registerSimple($$1, "Comparator");
      $$0.register($$1, "FlowerPot", $$1x -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), bit.F.in($$0))));
      $$0.register($$1, "Banner", () -> DSL.optionalFields("CustomName", bit.z.in($$0)));
      $$0.registerSimple($$1, "Structure");
      $$0.registerSimple($$1, "EndGateway");
      return $$1;
   }

   public static TypeTemplate a(Schema $$0) {
      return DSL.optionalFields(
         new Pair[]{
            Pair.of("Text1", bit.z.in($$0)),
            Pair.of("Text2", bit.z.in($$0)),
            Pair.of("Text3", bit.z.in($$0)),
            Pair.of("Text4", bit.z.in($$0)),
            Pair.of("FilteredText1", bit.z.in($$0)),
            Pair.of("FilteredText2", bit.z.in($$0)),
            Pair.of("FilteredText3", bit.z.in($$0)),
            Pair.of("FilteredText4", bit.z.in($$0))
         }
      );
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      $$0.registerType(false, bit.a, () -> DSL.optionalFields("CustomBossEvents", DSL.compoundList(DSL.optionalFields("Name", bit.z.in($$0)))));
      $$0.registerType(false, bit.b, () -> DSL.optionalFields("Inventory", DSL.list(bit.t.in($$0)), "EnderItems", DSL.list(bit.t.in($$0))));
      $$0.registerType(
         false,
         bit.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bit.C.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bit.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bit.E.in($$0)))
               )
            )
      );
      $$0.registerType(true, bit.s, () -> DSL.optionalFields("components", bit.w.in($$0), DSL.taggedChoiceLazy("id", DSL.string(), $$2)));
      $$0.registerType(true, bit.C, () -> DSL.optionalFields("Riding", bit.C.in($$0), bit.D.in($$0)));
      $$0.registerType(false, bit.B, () -> DSL.constType(bko.a()));
      $$0.registerType(
         true,
         bit.D,
         () -> DSL.and(bit.A.in($$0), DSL.optionalFields("CustomName", DSL.constType(DSL.string()), DSL.taggedChoiceLazy("id", DSL.string(), $$1)))
      );
      $$0.registerType(
         true, bit.t, () -> DSL.hook(DSL.optionalFields("id", DSL.or(DSL.constType(DSL.intType()), bit.F.in($$0)), "tag", b($$0)), b, HookFunction.IDENTITY)
      );
      $$0.registerType(false, bit.e, DSL::remainder);
      $$0.registerType(false, bit.E, () -> DSL.or(DSL.constType(DSL.intType()), DSL.constType(bko.a())));
      $$0.registerType(false, bit.F, () -> DSL.constType(bko.a()));
      $$0.registerType(false, bit.g, DSL::remainder);
      $$0.registerType(false, bit.h, DSL::remainder);
      $$0.registerType(false, bit.i, DSL::remainder);
      $$0.registerType(false, bit.j, () -> DSL.optionalFields("banners", DSL.list(DSL.optionalFields("Name", bit.z.in($$0)))));
      $$0.registerType(false, bit.k, DSL::remainder);
      $$0.registerType(false, bit.l, DSL::remainder);
      $$0.registerType(false, bit.m, DSL::remainder);
      $$0.registerType(
         false,
         bit.o,
         () -> DSL.optionalFields(
               "data",
               DSL.optionalFields(
                  "Objectives",
                  DSL.list(bit.J.in($$0)),
                  "Teams",
                  DSL.list(bit.K.in($$0)),
                  "PlayerScores",
                  DSL.list(DSL.optionalFields("display", bit.z.in($$0)))
               )
            )
      );
      $$0.registerType(false, bit.n, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(bit.I.in($$0)))));
      $$0.registerType(false, bit.I, DSL::remainder);
      $$0.registerType(false, bit.J, DSL::remainder);
      $$0.registerType(
         false, bit.K, () -> DSL.optionalFields("MemberNamePrefix", bit.z.in($$0), "MemberNameSuffix", bit.z.in($$0), "DisplayName", bit.z.in($$0))
      );
      $$0.registerType(true, bit.H, DSL::remainder);
      $$0.registerType(false, bit.q, DSL::remainder);
      $$0.registerType(false, bit.O, DSL::remainder);
      $$0.registerType(false, bit.r, () -> DSL.optionalFields("Entities", DSL.list(bit.C.in($$0))));
      $$0.registerType(true, bit.w, DSL::remainder);
      $$0.registerType(true, bit.x, () -> DSL.optionalFields("buy", bit.t.in($$0), "buyB", bit.t.in($$0), "sell", bit.t.in($$0)));
      $$0.registerType(true, bit.y, () -> DSL.constType(DSL.string()));
      $$0.registerType(true, bit.z, () -> DSL.constType(DSL.string()));
      $$0.registerType(
         false,
         bit.f,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", bit.C.in($$0))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", bit.s.in($$0))),
               "palette",
               DSL.list(bit.u.in($$0))
            )
      );
      $$0.registerType(false, bit.u, DSL::remainder);
      $$0.registerType(false, bit.v, DSL::remainder);
      $$0.registerType(true, bit.A, () -> DSL.optional(DSL.field("Equipment", DSL.list(bit.t.in($$0)))));
   }

   public static TypeTemplate b(Schema $$0) {
      return DSL.optionalFields(
         new Pair[]{
            Pair.of("EntityTag", bit.C.in($$0)),
            Pair.of("BlockEntityTag", bit.s.in($$0)),
            Pair.of("CanDestroy", DSL.list(bit.E.in($$0))),
            Pair.of("CanPlaceOn", DSL.list(bit.E.in($$0))),
            Pair.of("Items", DSL.list(bit.t.in($$0))),
            Pair.of("ChargedProjectiles", DSL.list(bit.t.in($$0))),
            Pair.of("pages", DSL.list(bit.z.in($$0))),
            Pair.of("filtered_pages", DSL.compoundList(bit.z.in($$0))),
            Pair.of("display", DSL.optionalFields("Name", bit.z.in($$0), "Lore", DSL.list(bit.z.in($$0))))
         }
      );
   }

   protected static <T> T a(Dynamic<T> $$0, Map<String, String> $$1, Map<String, String> $$2) {
      return (T)$$0.update("tag", $$3 -> $$3.update("BlockEntityTag", $$2xx -> {
            String $$3x = $$0.get("id").asString().result().map(bko::a).orElse("minecraft:air");
            if (!"minecraft:air".equals($$3x)) {
               String $$4 = $$1.get($$3x);
               if ($$4 != null) {
                  return $$2xx.set("id", $$0.createString($$4));
               }

               c.warn("Unable to resolve BlockEntity for ItemStack: {}", $$3x);
            }

            return $$2xx;
         }).update("EntityTag", $$2xx -> {
            if ($$2xx.get("id").result().isPresent()) {
               return $$2xx;
            } else {
               String $$3x = bko.a($$0.get("id").asString(""));
               String $$4 = $$2.get($$3x);
               return $$4 != null ? $$2xx.set("id", $$0.createString($$4)) : $$2xx;
            }
         })).getValue();
   }
}
