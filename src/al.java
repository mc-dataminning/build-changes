import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import javax.annotation.Nullable;

public class al {
   private static final BiMap<aey, ao<?>> aa = HashBiMap.create();
   public static final by a = a("impossible", new by());
   public static final ce b = a("player_killed_entity", new ce());
   public static final ce c = a("entity_killed_player", new ce());
   public static final bm d = a("enter_block", new bm());
   public static final bz e = a("inventory_changed", new bz());
   public static final cu f = a("recipe_unlocked", new cu());
   public static final cp g = a("player_hurt_entity", new cp());
   public static final bp h = a("entity_hurt_player", new bp());
   public static final bk i = a("enchanted_item", new bk());
   public static final bu j = a("filled_bucket", new bu());
   public static final ax k = a("brewed_potion", new ax());
   public static final ba l = a("construct_beacon", new ba());
   public static final dg m = a("used_ender_eye", new dg());
   public static final db n = a("summoned_entity", new db());
   public static final aw o = a("bred_animals", new aw());
   public static final cs p = a("location", new cs());
   public static final cs q = a("slept_in_bed", new cs());
   public static final bd r = a("cured_zombie_villager", new bd());
   public static final df s = a("villager_trade", new df());
   public static final ca t = a("item_durability_changed", new ca());
   public static final cf u = a("levitation", new cf());
   public static final ay v = a("changed_dimension", new ay());
   public static final cs w = a("tick", new cs());
   public static final dd x = a("tame_animal", new dd());
   public static final cc y = a("placed_block", new cc());
   public static final bb z = a("consume_item", new bb());
   public static final bj A = a("effects_changed", new bj());
   public static final dh B = a("used_totem", new dh());
   public static final bi C = a("nether_travel", new bi());
   public static final bw D = a("fishing_rod_hooked", new bw());
   public static final az E = a("channeled_lightning", new az());
   public static final cv F = a("shot_crossbow", new cv());
   public static final cd G = a("killed_by_crossbow", new cd());
   public static final cs H = a("hero_of_the_village", new cs());
   public static final cs I = a("voluntary_exile", new cs());
   public static final cx J = a("slide_down_block", new cx());
   public static final au K = a("bee_nest_destroyed", new au());
   public static final de L = a("target_hit", new de());
   public static final cc M = a("item_used_on_block", new cc());
   public static final ck N = a("player_generates_container_loot", new ck());
   public static final co O = a("thrown_item_picked_up_by_entity", new co());
   public static final co P = a("thrown_item_picked_up_by_player", new co());
   public static final cq Q = a("player_interacted_with_entity", new cq());
   public static final cz R = a("started_riding", new cz());
   public static final ci S = a("lightning_strike", new ci());
   public static final di T = a("using_item", new di());
   public static final bi U = a("fall_from_height", new bi());
   public static final bi V = a("ride_entity_in_lava", new bi());
   public static final ce W = a("kill_mob_near_sculk_catalyst", new ce());
   public static final cc X = a("allay_drop_item_on_block", new cc());
   public static final cs Y = a("avoid_vibration", new cs());
   public static final ct Z = a("recipe_crafted", new ct());

   private static <T extends ao<?>> T a(String $$0, T $$1) {
      aey $$2 = new aey($$0);
      if (aa.putIfAbsent($$2, $$1) != null) {
         throw new IllegalArgumentException("Duplicate criterion id " + $$2);
      } else {
         return $$1;
      }
   }

   @Nullable
   public static <T extends ap> ao<T> a(aey $$0) {
      return (ao<T>)aa.get($$0);
   }

   @Nullable
   public static aey a(ao<?> $$0) {
      return (aey)aa.inverse().get($$0);
   }

   public static Iterable<? extends ao<?>> a() {
      return aa.values();
   }
}
