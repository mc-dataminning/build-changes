import com.mojang.serialization.Codec;

public class am {
   public static final Codec<ap<?>> a = ld.ap.q();
   public static final ca b = a("impossible", new ca());
   public static final cm c = a("player_killed_entity", new cm());
   public static final cm d = a("entity_killed_player", new cm());
   public static final bn e = a("enter_block", new bn());
   public static final cb f = a("inventory_changed", new cb());
   public static final dc g = a("recipe_unlocked", new dc());
   public static final cx h = a("player_hurt_entity", new cx());
   public static final bq i = a("entity_hurt_player", new bq());
   public static final bl j = a("enchanted_item", new bl());
   public static final bw k = a("filled_bucket", new bw());
   public static final ax l = a("brewed_potion", new ax());
   public static final ba m = a("construct_beacon", new ba());
   public static final dr n = a("used_ender_eye", new dr());
   public static final dl o = a("summoned_entity", new dl());
   public static final aw p = a("bred_animals", new aw());
   public static final da q = a("location", new da());
   public static final da r = a("slept_in_bed", new da());
   public static final be s = a("cured_zombie_villager", new be());
   public static final dq t = a("villager_trade", new dq());
   public static final ce u = a("item_durability_changed", new ce());
   public static final cn v = a("levitation", new cn());
   public static final ay w = a("changed_dimension", new ay());
   public static final da x = a("tick", new da());
   public static final dn y = a("tame_animal", new dn());
   public static final ck z = a("placed_block", new ck());
   public static final bb A = a("consume_item", new bb());
   public static final bk B = a("effects_changed", new bk());
   public static final ds C = a("used_totem", new ds());
   public static final bj D = a("nether_travel", new bj());
   public static final by E = a("fishing_rod_hooked", new by());
   public static final az F = a("channeled_lightning", new az());
   public static final dd G = a("shot_crossbow", new dd());
   public static final cl H = a("killed_by_crossbow", new cl());
   public static final da I = a("hero_of_the_village", new da());
   public static final da J = a("voluntary_exile", new da());
   public static final dg K = a("slide_down_block", new dg());
   public static final au L = a("bee_nest_destroyed", new au());
   public static final dp M = a("target_hit", new dp());
   public static final ck N = a("item_used_on_block", new ck());
   public static final bh O = a("default_block_use", new bh());
   public static final at P = a("any_block_use", new at());
   public static final cs Q = a("player_generates_container_loot", new cs());
   public static final cw R = a("thrown_item_picked_up_by_entity", new cw());
   public static final cw S = a("thrown_item_picked_up_by_player", new cw());
   public static final cy T = a("player_interacted_with_entity", new cy());
   public static final dj U = a("started_riding", new dj());
   public static final cq V = a("lightning_strike", new cq());
   public static final dt W = a("using_item", new dt());
   public static final bj X = a("fall_from_height", new bj());
   public static final bj Y = a("ride_entity_in_lava", new bj());
   public static final cm Z = a("kill_mob_near_sculk_catalyst", new cm());
   public static final ck aa = a("allay_drop_item_on_block", new ck());
   public static final da ab = a("avoid_vibration", new da());
   public static final db ac = a("recipe_crafted", new db());
   public static final db ad = a("crafter_recipe_crafted", new db());
   public static final bv ae = a("fall_after_explosion", new bv());

   private static <T extends ap<?>> T a(String $$0, T $$1) {
      return jj.a(ld.ap, $$0, $$1);
   }

   public static ap<?> a(jj<ap<?>> $$0) {
      return b;
   }
}
