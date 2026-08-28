import com.mojang.serialization.Codec;

public class am {
   public static final Codec<ap<?>> a = lp.ap.q();
   public static final cd b = a("impossible", new cd());
   public static final cx c = a("player_killed_entity", new cx());
   public static final cx d = a("entity_killed_player", new cx());
   public static final bq e = a("enter_block", new bq());
   public static final ce f = a("inventory_changed", new ce());
   public static final dp g = a("recipe_unlocked", new dp());
   public static final di h = a("player_hurt_entity", new di());
   public static final bt i = a("entity_hurt_player", new bt());
   public static final bo j = a("enchanted_item", new bo());
   public static final bz k = a("filled_bucket", new bz());
   public static final ax l = a("brewed_potion", new ax());
   public static final bd m = a("construct_beacon", new bd());
   public static final ed n = a("used_ender_eye", new ed());
   public static final dy o = a("summoned_entity", new dy());
   public static final aw p = a("bred_animals", new aw());
   public static final dl q = a("location", new dl());
   public static final dl r = a("slept_in_bed", new dl());
   public static final bh s = a("cured_zombie_villager", new bh());
   public static final ec t = a("villager_trade", new ec());
   public static final ck u = a("item_durability_changed", new ck());
   public static final cy v = a("levitation", new cy());
   public static final ay w = a("changed_dimension", new ay());
   public static final dl x = a("tick", new dl());
   public static final ea y = a("tame_animal", new ea());
   public static final ct z = a("placed_block", new ct());
   public static final be A = a("consume_item", new be());
   public static final bn B = a("effects_changed", new bn());
   public static final ee C = a("used_totem", new ee());
   public static final bm D = a("nether_travel", new bm());
   public static final cb E = a("fishing_rod_hooked", new cb());
   public static final az F = a("channeled_lightning", new az());
   public static final dq G = a("shot_crossbow", new dq());
   public static final cw H = a("killed_by_crossbow", new cw());
   public static final dl I = a("hero_of_the_village", new dl());
   public static final dl J = a("voluntary_exile", new dl());
   public static final dt K = a("slide_down_block", new dt());
   public static final au L = a("bee_nest_destroyed", new au());
   public static final eb M = a("target_hit", new eb());
   public static final ct N = a("item_used_on_block", new ct());
   public static final bk O = a("default_block_use", new bk());
   public static final at P = a("any_block_use", new at());
   public static final dd Q = a("player_generates_container_loot", new dd());
   public static final dh R = a("thrown_item_picked_up_by_entity", new dh());
   public static final dh S = a("thrown_item_picked_up_by_player", new dh());
   public static final dj T = a("player_interacted_with_entity", new dj());
   public static final dw U = a("started_riding", new dw());
   public static final db V = a("lightning_strike", new db());
   public static final ef W = a("using_item", new ef());
   public static final bm X = a("fall_from_height", new bm());
   public static final bm Y = a("ride_entity_in_lava", new bm());
   public static final cx Z = a("kill_mob_near_sculk_catalyst", new cx());
   public static final ct aa = a("allay_drop_item_on_block", new ct());
   public static final dl ab = a("avoid_vibration", new dl());
   public static final dn ac = a("recipe_crafted", new dn());
   public static final dn ad = a("crafter_recipe_crafted", new dn());
   public static final by ae = a("fall_after_explosion", new by());

   private static <T extends ap<?>> T a(String $$0, T $$1) {
      return jv.a(lp.ap, $$0, $$1);
   }

   public static ap<?> a(jv<ap<?>> $$0) {
      return b;
   }
}
