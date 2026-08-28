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

public class bll extends Schema {
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
         return bll.a(new Dynamic($$0, $$1), bll.d, bll.a);
      }
   };

   public bll(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static TypeTemplate a(Schema $$0) {
      return DSL.optionalFields("Equipment", DSL.list(bgs.t.in($$0)));
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> a($$0));
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("inTile", bgs.C.in($$0)));
   }

   protected static void c(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("DisplayTile", bgs.C.in($$0)));
   }

   protected static void d(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("Items", DSL.list(bgs.t.in($$0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.register($$1, "Item", $$1x -> DSL.optionalFields("Item", bgs.t.in($$0)));
      $$0.registerSimple($$1, "XPOrb");
      b($$0, $$1, "ThrownEgg");
      $$0.registerSimple($$1, "LeashKnot");
      $$0.registerSimple($$1, "Painting");
      $$0.register($$1, "Arrow", $$1x -> DSL.optionalFields("inTile", bgs.C.in($$0)));
      $$0.register($$1, "TippedArrow", $$1x -> DSL.optionalFields("inTile", bgs.C.in($$0)));
      $$0.register($$1, "SpectralArrow", $$1x -> DSL.optionalFields("inTile", bgs.C.in($$0)));
      b($$0, $$1, "Snowball");
      b($$0, $$1, "Fireball");
      b($$0, $$1, "SmallFireball");
      b($$0, $$1, "ThrownEnderpearl");
      $$0.registerSimple($$1, "EyeOfEnderSignal");
      $$0.register($$1, "ThrownPotion", $$1x -> DSL.optionalFields("inTile", bgs.C.in($$0), "Potion", bgs.t.in($$0)));
      b($$0, $$1, "ThrownExpBottle");
      $$0.register($$1, "ItemFrame", $$1x -> DSL.optionalFields("Item", bgs.t.in($$0)));
      b($$0, $$1, "WitherSkull");
      $$0.registerSimple($$1, "PrimedTnt");
      $$0.register($$1, "FallingSand", $$1x -> DSL.optionalFields("Block", bgs.C.in($$0), "TileEntityData", bgs.s.in($$0)));
      $$0.register($$1, "FireworksRocketEntity", $$1x -> DSL.optionalFields("FireworksItem", bgs.t.in($$0)));
      $$0.registerSimple($$1, "Boat");
      $$0.register($$1, "Minecart", () -> DSL.optionalFields("DisplayTile", bgs.C.in($$0), "Items", DSL.list(bgs.t.in($$0))));
      c($$0, $$1, "MinecartRideable");
      $$0.register($$1, "MinecartChest", $$1x -> DSL.optionalFields("DisplayTile", bgs.C.in($$0), "Items", DSL.list(bgs.t.in($$0))));
      c($$0, $$1, "MinecartFurnace");
      c($$0, $$1, "MinecartTNT");
      $$0.register($$1, "MinecartSpawner", () -> DSL.optionalFields("DisplayTile", bgs.C.in($$0), bgs.F.in($$0)));
      $$0.register($$1, "MinecartHopper", $$1x -> DSL.optionalFields("DisplayTile", bgs.C.in($$0), "Items", DSL.list(bgs.t.in($$0))));
      c($$0, $$1, "MinecartCommandBlock");
      a($$0, $$1, "ArmorStand");
      a($$0, $$1, "Creeper");
      a($$0, $$1, "Skeleton");
      a($$0, $$1, "Spider");
      a($$0, $$1, "Giant");
      a($$0, $$1, "Zombie");
      a($$0, $$1, "Slime");
      a($$0, $$1, "Ghast");
      a($$0, $$1, "PigZombie");
      $$0.register($$1, "Enderman", $$1x -> DSL.optionalFields("carried", bgs.C.in($$0), a($$0)));
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
         $$1, "EntityHorse", $$1x -> DSL.optionalFields("Items", DSL.list(bgs.t.in($$0)), "ArmorItem", bgs.t.in($$0), "SaddleItem", bgs.t.in($$0), a($$0))
      );
      a($$0, $$1, "Rabbit");
      $$0.register(
         $$1,
         "Villager",
         $$1x -> DSL.optionalFields("Inventory", DSL.list(bgs.t.in($$0)), "Offers", DSL.optionalFields("Recipes", DSL.list(bgs.x.in($$0))), a($$0))
      );
      $$0.registerSimple($$1, "EnderCrystal");
      $$0.register($$1, "AreaEffectCloud", $$1x -> DSL.optionalFields("Particle", bgs.y.in($$0)));
      $$0.registerSimple($$1, "ShulkerBullet");
      a($$0, $$1, "Shulker");
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      d($$0, $$1, "Furnace");
      d($$0, $$1, "Chest");
      $$0.registerSimple($$1, "EnderChest");
      $$0.register($$1, "RecordPlayer", $$1x -> DSL.optionalFields("RecordItem", bgs.t.in($$0)));
      d($$0, $$1, "Trap");
      d($$0, $$1, "Dropper");
      $$0.registerSimple($$1, "Sign");
      $$0.register($$1, "MobSpawner", $$1x -> bgs.F.in($$0));
      $$0.registerSimple($$1, "Music");
      $$0.registerSimple($$1, "Piston");
      d($$0, $$1, "Cauldron");
      $$0.registerSimple($$1, "EnchantTable");
      $$0.registerSimple($$1, "Airportal");
      $$0.registerSimple($$1, "Control");
      $$0.registerSimple($$1, "Beacon");
      $$0.registerSimple($$1, "Skull");
      $$0.registerSimple($$1, "DLDetector");
      d($$0, $$1, "Hopper");
      $$0.registerSimple($$1, "Comparator");
      $$0.register($$1, "FlowerPot", $$1x -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), bgs.D.in($$0))));
      $$0.registerSimple($$1, "Banner");
      $$0.registerSimple($$1, "Structure");
      $$0.registerSimple($$1, "EndGateway");
      return $$1;
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      $$0.registerType(false, bgs.a, DSL::remainder);
      $$0.registerType(false, bgs.b, () -> DSL.optionalFields("Inventory", DSL.list(bgs.t.in($$0)), "EnderItems", DSL.list(bgs.t.in($$0))));
      $$0.registerType(
         false,
         bgs.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bgs.A.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bgs.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bgs.C.in($$0)))
               )
            )
      );
      $$0.registerType(true, bgs.s, () -> DSL.optionalFields("components", bgs.w.in($$0), DSL.taggedChoiceLazy("id", DSL.string(), $$2)));
      $$0.registerType(true, bgs.A, () -> DSL.optionalFields("Riding", bgs.A.in($$0), bgs.B.in($$0)));
      $$0.registerType(false, bgs.z, () -> DSL.constType(bid.a()));
      $$0.registerType(true, bgs.B, () -> DSL.taggedChoiceLazy("id", DSL.string(), $$1));
      $$0.registerType(
         true,
         bgs.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  DSL.or(DSL.constType(DSL.intType()), bgs.D.in($$0)),
                  "tag",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("EntityTag", bgs.A.in($$0)),
                        Pair.of("BlockEntityTag", bgs.s.in($$0)),
                        Pair.of("CanDestroy", DSL.list(bgs.C.in($$0))),
                        Pair.of("CanPlaceOn", DSL.list(bgs.C.in($$0))),
                        Pair.of("Items", DSL.list(bgs.t.in($$0))),
                        Pair.of("ChargedProjectiles", DSL.list(bgs.t.in($$0)))
                     }
                  )
               ),
               b,
               HookFunction.IDENTITY
            )
      );
      $$0.registerType(false, bgs.e, DSL::remainder);
      $$0.registerType(false, bgs.C, () -> DSL.or(DSL.constType(DSL.intType()), DSL.constType(bid.a())));
      $$0.registerType(false, bgs.D, () -> DSL.constType(bid.a()));
      $$0.registerType(false, bgs.g, DSL::remainder);
      $$0.registerType(false, bgs.h, DSL::remainder);
      $$0.registerType(false, bgs.i, DSL::remainder);
      $$0.registerType(false, bgs.j, DSL::remainder);
      $$0.registerType(false, bgs.k, DSL::remainder);
      $$0.registerType(false, bgs.l, DSL::remainder);
      $$0.registerType(false, bgs.m, DSL::remainder);
      $$0.registerType(
         false, bgs.o, () -> DSL.optionalFields("data", DSL.optionalFields("Objectives", DSL.list(bgs.H.in($$0)), "Teams", DSL.list(bgs.I.in($$0))))
      );
      $$0.registerType(false, bgs.n, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(bgs.G.in($$0)))));
      $$0.registerType(false, bgs.G, DSL::remainder);
      $$0.registerType(false, bgs.H, DSL::remainder);
      $$0.registerType(false, bgs.I, DSL::remainder);
      $$0.registerType(true, bgs.F, DSL::remainder);
      $$0.registerType(false, bgs.q, DSL::remainder);
      $$0.registerType(false, bgs.M, DSL::remainder);
      $$0.registerType(false, bgs.r, () -> DSL.optionalFields("Entities", DSL.list(bgs.A.in($$0))));
      $$0.registerType(true, bgs.w, DSL::remainder);
      $$0.registerType(true, bgs.x, () -> DSL.optionalFields("buy", bgs.t.in($$0), "buyB", bgs.t.in($$0), "sell", bgs.t.in($$0)));
      $$0.registerType(true, bgs.y, () -> DSL.constType(DSL.string()));
   }

   protected static <T> T a(Dynamic<T> $$0, Map<String, String> $$1, Map<String, String> $$2) {
      return (T)$$0.update("tag", $$3 -> $$3.update("BlockEntityTag", $$2xx -> {
            String $$3x = $$0.get("id").asString().result().map(bid::a).orElse("minecraft:air");
            if (!"minecraft:air".equals($$3x)) {
               String $$4 = $$1.get($$3x);
               if ($$4 != null) {
                  return $$2xx.set("id", $$0.createString($$4));
               }

               c.warn("Unable to resolve BlockEntity for ItemStack: {}", $$3x);
            }

            return $$2xx;
         }).update("EntityTag", $$2xx -> {
            String $$3x = bid.a($$0.get("id").asString(""));
            String $$4 = $$2.get($$3x);
            return $$4 != null ? $$2xx.set("id", $$0.createString($$4)) : $$2xx;
         })).getValue();
   }
}
