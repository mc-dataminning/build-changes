import com.mojang.serialization.Codec;

public class ao {
   public static final Codec<ar<?>> a = ly.am.q();
   public static final cg b = a("impossible", new cg());
   public static final dc c = a("player_killed_entity", new dc());
   public static final dc d = a("entity_killed_player", new dc());
   public static final bs e = a("enter_block", new bs());
   public static final ci f = a("inventory_changed", new ci());
   public static final dv g = a("recipe_unlocked", new dv());
   public static final dp h = a("player_hurt_entity", new dp());
   public static final bv i = a("entity_hurt_player", new bv());
   public static final bq j = a("enchanted_item", new bq());
   public static final cb k = a("filled_bucket", new cb());
   public static final az l = a("brewed_potion", new az());
   public static final bf m = a("construct_beacon", new bf());
   public static final ek n = a("used_ender_eye", new ek());
   public static final ef o = a("summoned_entity", new ef());
   public static final ay p = a("bred_animals", new ay());
   public static final ds q = a("location", new ds());
   public static final ds r = a("slept_in_bed", new ds());
   public static final bj s = a("cured_zombie_villager", new bj());
   public static final ej t = a("villager_trade", new ej());
   public static final co u = a("item_durability_changed", new co());
   public static final dd v = a("levitation", new dd());
   public static final ba w = a("changed_dimension", new ba());
   public static final ds x = a("tick", new ds());
   public static final eh y = a("tame_animal", new eh());
   public static final cy z = a("placed_block", new cy());
   public static final bg A = a("consume_item", new bg());
   public static final bp B = a("effects_changed", new bp());
   public static final el C = a("used_totem", new el());
   public static final bo D = a("nether_travel", new bo());
   public static final cd E = a("fishing_rod_hooked", new cd());
   public static final bb F = a("channeled_lightning", new bb());
   public static final dx G = a("shot_crossbow", new dx());
   public static final db H = a("killed_by_arrow", new db());
   public static final ds I = a("hero_of_the_village", new ds());
   public static final ds J = a("voluntary_exile", new ds());
   public static final ea K = a("slide_down_block", new ea());
   public static final aw L = a("bee_nest_destroyed", new aw());
   public static final ei M = a("target_hit", new ei());
   public static final cy N = a("item_used_on_block", new cy());
   public static final bm O = a("default_block_use", new bm());
   public static final av P = a("any_block_use", new av());
   public static final di Q = a("player_generates_container_loot", new di());
   public static final dn R = a("thrown_item_picked_up_by_entity", new dn());
   public static final dn S = a("thrown_item_picked_up_by_player", new dn());
   public static final dq T = a("player_interacted_with_entity", new dq());
   public static final ed U = a("started_riding", new ed());
   public static final dg V = a("lightning_strike", new dg());
   public static final em W = a("using_item", new em());
   public static final bo X = a("fall_from_height", new bo());
   public static final bo Y = a("ride_entity_in_lava", new bo());
   public static final dc Z = a("kill_mob_near_sculk_catalyst", new dc());
   public static final cy aa = a("allay_drop_item_on_block", new cy());
   public static final ds ab = a("avoid_vibration", new ds());
   public static final du ac = a("recipe_crafted", new du());
   public static final du ad = a("crafter_recipe_crafted", new du());
   public static final ca ae = a("fall_after_explosion", new ca());

   private static <T extends ar<?>> T a(String $$0, T $$1) {
      return kd.a(ly.am, $$0, $$1);
   }

   public static ar<?> a(kd<ar<?>> $$0) {
      return b;
   }
}
