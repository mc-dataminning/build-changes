import com.mojang.serialization.Codec;

public class am {
   public static final Codec<ap<?>> a = kd.aq.q();
   public static final bx b = a("impossible", new bx());
   public static final cd c = a("player_killed_entity", new cd());
   public static final cd d = a("entity_killed_player", new cd());
   public static final bl e = a("enter_block", new bl());
   public static final by f = a("inventory_changed", new by());
   public static final ct g = a("recipe_unlocked", new ct());
   public static final co h = a("player_hurt_entity", new co());
   public static final bo i = a("entity_hurt_player", new bo());
   public static final bj j = a("enchanted_item", new bj());
   public static final bt k = a("filled_bucket", new bt());
   public static final aw l = a("brewed_potion", new aw());
   public static final az m = a("construct_beacon", new az());
   public static final df n = a("used_ender_eye", new df());
   public static final da o = a("summoned_entity", new da());
   public static final av p = a("bred_animals", new av());
   public static final cr q = a("location", new cr());
   public static final cr r = a("slept_in_bed", new cr());
   public static final bd s = a("cured_zombie_villager", new bd());
   public static final de t = a("villager_trade", new de());
   public static final bz u = a("item_durability_changed", new bz());
   public static final ce v = a("levitation", new ce());
   public static final ax w = a("changed_dimension", new ax());
   public static final cr x = a("tick", new cr());
   public static final dc y = a("tame_animal", new dc());
   public static final cb z = a("placed_block", new cb());
   public static final ba A = a("consume_item", new ba());
   public static final bi B = a("effects_changed", new bi());
   public static final dg C = a("used_totem", new dg());
   public static final bh D = a("nether_travel", new bh());
   public static final bv E = a("fishing_rod_hooked", new bv());
   public static final ay F = a("channeled_lightning", new ay());
   public static final cu G = a("shot_crossbow", new cu());
   public static final cc H = a("killed_by_crossbow", new cc());
   public static final cr I = a("hero_of_the_village", new cr());
   public static final cr J = a("voluntary_exile", new cr());
   public static final cw K = a("slide_down_block", new cw());
   public static final at L = a("bee_nest_destroyed", new at());
   public static final dd M = a("target_hit", new dd());
   public static final cb N = a("item_used_on_block", new cb());
   public static final cj O = a("player_generates_container_loot", new cj());
   public static final cn P = a("thrown_item_picked_up_by_entity", new cn());
   public static final cn Q = a("thrown_item_picked_up_by_player", new cn());
   public static final cp R = a("player_interacted_with_entity", new cp());
   public static final cy S = a("started_riding", new cy());
   public static final ch T = a("lightning_strike", new ch());
   public static final dh U = a("using_item", new dh());
   public static final bh V = a("fall_from_height", new bh());
   public static final bh W = a("ride_entity_in_lava", new bh());
   public static final cd X = a("kill_mob_near_sculk_catalyst", new cd());
   public static final cb Y = a("allay_drop_item_on_block", new cb());
   public static final cr Z = a("avoid_vibration", new cr());
   public static final cs aa = a("recipe_crafted", new cs());

   private static <T extends ap<?>> T a(String $$0, T $$1) {
      return it.a(kd.aq, $$0, $$1);
   }

   public static ap<?> a(it<ap<?>> $$0) {
      return b;
   }
}
