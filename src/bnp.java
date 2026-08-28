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

public class bnp extends Schema {
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
         return bnp.a(new Dynamic($$0, $$1), bnp.d, bnp.a);
      }
   };

   public bnp(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static TypeTemplate a(Schema $$0) {
      return DSL.optionalFields("Equipment", DSL.list(bic.t.in($$0)));
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> a($$0));
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("inTile", bic.D.in($$0)));
   }

   protected static void c(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("DisplayTile", bic.D.in($$0)));
   }

   protected static void d(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("Items", DSL.list(bic.t.in($$0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.register($$1, "Item", $$1x -> DSL.optionalFields("Item", bic.t.in($$0)));
      $$0.registerSimple($$1, "XPOrb");
      b($$0, $$1, "ThrownEgg");
      $$0.registerSimple($$1, "LeashKnot");
      $$0.registerSimple($$1, "Painting");
      $$0.register($$1, "Arrow", $$1x -> DSL.optionalFields("inTile", bic.D.in($$0)));
      $$0.register($$1, "TippedArrow", $$1x -> DSL.optionalFields("inTile", bic.D.in($$0)));
      $$0.register($$1, "SpectralArrow", $$1x -> DSL.optionalFields("inTile", bic.D.in($$0)));
      b($$0, $$1, "Snowball");
      b($$0, $$1, "Fireball");
      b($$0, $$1, "SmallFireball");
      b($$0, $$1, "ThrownEnderpearl");
      $$0.registerSimple($$1, "EyeOfEnderSignal");
      $$0.register($$1, "ThrownPotion", $$1x -> DSL.optionalFields("inTile", bic.D.in($$0), "Potion", bic.t.in($$0)));
      b($$0, $$1, "ThrownExpBottle");
      $$0.register($$1, "ItemFrame", $$1x -> DSL.optionalFields("Item", bic.t.in($$0)));
      b($$0, $$1, "WitherSkull");
      $$0.registerSimple($$1, "PrimedTnt");
      $$0.register($$1, "FallingSand", $$1x -> DSL.optionalFields("Block", bic.D.in($$0), "TileEntityData", bic.s.in($$0)));
      $$0.register($$1, "FireworksRocketEntity", $$1x -> DSL.optionalFields("FireworksItem", bic.t.in($$0)));
      $$0.registerSimple($$1, "Boat");
      $$0.register($$1, "Minecart", () -> DSL.optionalFields("DisplayTile", bic.D.in($$0), "Items", DSL.list(bic.t.in($$0))));
      c($$0, $$1, "MinecartRideable");
      $$0.register($$1, "MinecartChest", $$1x -> DSL.optionalFields("DisplayTile", bic.D.in($$0), "Items", DSL.list(bic.t.in($$0))));
      c($$0, $$1, "MinecartFurnace");
      c($$0, $$1, "MinecartTNT");
      $$0.register($$1, "MinecartSpawner", () -> DSL.optionalFields("DisplayTile", bic.D.in($$0), bic.G.in($$0)));
      $$0.register($$1, "MinecartHopper", $$1x -> DSL.optionalFields("DisplayTile", bic.D.in($$0), "Items", DSL.list(bic.t.in($$0))));
      $$0.register($$1, "MinecartCommandBlock", () -> DSL.optionalFields("DisplayTile", bic.D.in($$0), "LastOutput", bic.z.in($$0)));
      a($$0, $$1, "ArmorStand");
      a($$0, $$1, "Creeper");
      a($$0, $$1, "Skeleton");
      a($$0, $$1, "Spider");
      a($$0, $$1, "Giant");
      a($$0, $$1, "Zombie");
      a($$0, $$1, "Slime");
      a($$0, $$1, "Ghast");
      a($$0, $$1, "PigZombie");
      $$0.register($$1, "Enderman", $$1x -> DSL.optionalFields("carried", bic.D.in($$0), a($$0)));
      a($$0, $$1, "CaveSpider");
      a($$0, $$1, "Silverfish");
      a($$0, $$1, "Blaze");
      a($$0, $$1, "LavaSlime");
      a($$0, $$1, "EnderDragon");
      a($$0, $$1, "WitherBoss");
      a($$0, $$1, "Bat");
      a($$0, $$1, "Witch");
      a($$0, $$1, "Endermite");
      a($$0, $$1, "Guardian");
      a($$0, $$1, "Pig");
      a($$0, $$1, "Sheep");
      a($$0, $$1, "Cow");
      a($$0, $$1, "Chicken");
      a($$0, $$1, "Squid");
      a($$0, $$1, "Wolf");
      a($$0, $$1, "MushroomCow");
      a($$0, $$1, "SnowMan");
      a($$0, $$1, "Ozelot");
      a($$0, $$1, "VillagerGolem");
      $$0.register(
         $$1, "EntityHorse", $$1x -> DSL.optionalFields("Items", DSL.list(bic.t.in($$0)), "ArmorItem", bic.t.in($$0), "SaddleItem", bic.t.in($$0), a($$0))
      );
      a($$0, $$1, "Rabbit");
      $$0.register(
         $$1,
         "Villager",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(bic.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(bic.x.in($$0))), a($$0))
      );
      $$0.registerSimple($$1, "EnderCrystal");
      $$0.register($$1, "AreaEffectCloud", $$1x -> DSL.optionalFields("Particle", bic.y.in($$0)));
      $$0.registerSimple($$1, "ShulkerBullet");
      $$0.registerSimple($$1, "DragonFireball");
      a($$0, $$1, "Shulker");
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      d($$0, $$1, "Furnace");
      d($$0, $$1, "Chest");
      $$0.registerSimple($$1, "EnderChest");
      $$0.register($$1, "RecordPlayer", $$1x -> DSL.optionalFields("RecordItem", bic.t.in($$0)));
      d($$0, $$1, "Trap");
      d($$0, $$1, "Dropper");
      $$0.register($$1, "Sign", () -> b($$0));
      $$0.register($$1, "MobSpawner", $$1x -> bic.G.in($$0));
      $$0.registerSimple($$1, "Music");
      $$0.registerSimple($$1, "Piston");
      d($$0, $$1, "Cauldron");
      $$0.registerSimple($$1, "EnchantTable");
      $$0.registerSimple($$1, "Airportal");
      $$0.register($$1, "Control", () -> DSL.optionalFields("LastOutput", bic.z.in($$0)));
      $$0.registerSimple($$1, "Beacon");
      $$0.register($$1, "Skull", () -> DSL.optionalFields("custom_name", bic.z.in($$0)));
      $$0.registerSimple($$1, "DLDetector");
      d($$0, $$1, "Hopper");
      $$0.registerSimple($$1, "Comparator");
      $$0.register($$1, "FlowerPot", $$1x -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), bic.E.in($$0))));
      $$0.register($$1, "Banner", () -> DSL.optionalFields("CustomName", bic.z.in($$0)));
      $$0.registerSimple($$1, "Structure");
      $$0.registerSimple($$1, "EndGateway");
      return $$1;
   }

   public static TypeTemplate b(Schema $$0) {
      return DSL.optionalFields(
         new Pair[]{
            Pair.of("Text1", bic.z.in($$0)),
            Pair.of("Text2", bic.z.in($$0)),
            Pair.of("Text3", bic.z.in($$0)),
            Pair.of("Text4", bic.z.in($$0)),
            Pair.of("FilteredText1", bic.z.in($$0)),
            Pair.of("FilteredText2", bic.z.in($$0)),
            Pair.of("FilteredText3", bic.z.in($$0)),
            Pair.of("FilteredText4", bic.z.in($$0))
         }
      );
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      $$0.registerType(false, bic.a, () -> DSL.optionalFields("CustomBossEvents", DSL.compoundList(DSL.optionalFields("Name", bic.z.in($$0)))));
      $$0.registerType(false, bic.b, () -> DSL.optionalFields("Inventory", DSL.list(bic.t.in($$0)), "EnderItems", DSL.list(bic.t.in($$0))));
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
                  DSL.list(DSL.fields("i", bic.D.in($$0)))
               )
            )
      );
      $$0.registerType(true, bic.s, () -> DSL.optionalFields("components", bic.w.in($$0), DSL.taggedChoiceLazy("id", DSL.string(), $$2)));
      $$0.registerType(true, bic.B, () -> DSL.optionalFields("Riding", bic.B.in($$0), bic.C.in($$0)));
      $$0.registerType(false, bic.A, () -> DSL.constType(bju.a()));
      $$0.registerType(true, bic.C, () -> DSL.optionalFields("CustomName", DSL.constType(DSL.string()), DSL.taggedChoiceLazy("id", DSL.string(), $$1)));
      $$0.registerType(
         true, bic.t, () -> DSL.hook(DSL.optionalFields("id", DSL.or(DSL.constType(DSL.intType()), bic.E.in($$0)), "tag", c($$0)), b, HookFunction.IDENTITY)
      );
      $$0.registerType(false, bic.e, DSL::remainder);
      $$0.registerType(false, bic.D, () -> DSL.or(DSL.constType(DSL.intType()), DSL.constType(bju.a())));
      $$0.registerType(false, bic.E, () -> DSL.constType(bju.a()));
      $$0.registerType(false, bic.g, DSL::remainder);
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
      $$0.registerType(false, bic.I, DSL::remainder);
      $$0.registerType(
         false, bic.J, () -> DSL.optionalFields("MemberNamePrefix", bic.z.in($$0), "MemberNameSuffix", bic.z.in($$0), "DisplayName", bic.z.in($$0))
      );
      $$0.registerType(true, bic.G, DSL::remainder);
      $$0.registerType(false, bic.q, DSL::remainder);
      $$0.registerType(false, bic.N, DSL::remainder);
      $$0.registerType(false, bic.r, () -> DSL.optionalFields("Entities", DSL.list(bic.B.in($$0))));
      $$0.registerType(true, bic.w, DSL::remainder);
      $$0.registerType(true, bic.x, () -> DSL.optionalFields("buy", bic.t.in($$0), "buyB", bic.t.in($$0), "sell", bic.t.in($$0)));
      $$0.registerType(true, bic.y, () -> DSL.constType(DSL.string()));
      $$0.registerType(true, bic.z, () -> DSL.constType(DSL.string()));
   }

   public static TypeTemplate c(Schema $$0) {
      return DSL.optionalFields(
         new Pair[]{
            Pair.of("EntityTag", bic.B.in($$0)),
            Pair.of("BlockEntityTag", bic.s.in($$0)),
            Pair.of("CanDestroy", DSL.list(bic.D.in($$0))),
            Pair.of("CanPlaceOn", DSL.list(bic.D.in($$0))),
            Pair.of("Items", DSL.list(bic.t.in($$0))),
            Pair.of("ChargedProjectiles", DSL.list(bic.t.in($$0))),
            Pair.of("pages", DSL.list(bic.z.in($$0))),
            Pair.of("filtered_pages", DSL.compoundList(bic.z.in($$0))),
            Pair.of("display", DSL.optionalFields("Name", bic.z.in($$0), "Lore", DSL.list(bic.z.in($$0))))
         }
      );
   }

   protected static <T> T a(Dynamic<T> $$0, Map<String, String> $$1, Map<String, String> $$2) {
      return (T)$$0.update("tag", $$3 -> $$3.update("BlockEntityTag", $$2xx -> {
            String $$3x = $$0.get("id").asString().result().map(bju::a).orElse("minecraft:air");
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
               String $$3x = bju.a($$0.get("id").asString(""));
               String $$4 = $$2.get($$3x);
               return $$4 != null ? $$2xx.set("id", $$0.createString($$4)) : $$2xx;
            }
         })).getValue();
   }
}
