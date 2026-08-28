import com.mojang.serialization.Codec;

public class am {
   public static final Codec<ap<?>> a = lq.an.r();
   public static final cd b = a("impossible", new cd());
   public static final cx c = a("player_killed_entity", new cx());
   public static final cx d = a("entity_killed_player", new cx());
   public static final bq e = a("enter_block", new bq());
   public static final ce f = a("inventory_changed", new ce());
   public static final dq g = a("recipe_unlocked", new dq());
   public static final dj h = a("player_hurt_entity", new dj());
   public static final bt i = a("entity_hurt_player", new bt());
   public static final bo j = a("enchanted_item", new bo());
   public static final bz k = a("filled_bucket", new bz());
   public static final ax l = a("brewed_potion", new ax());
   public static final bd m = a("construct_beacon", new bd());
   public static final ee n = a("used_ender_eye", new ee());
   public static final dz o = a("summoned_entity", new dz());
   public static final aw p = a("bred_animals", new aw());
   public static final dm q = a("location", new dm());
   public static final dm r = a("slept_in_bed", new dm());
   public static final bh s = a("cured_zombie_villager", new bh());
   public static final ed t = a("villager_trade", new ed());
   public static final ck u = a("item_durability_changed", new ck());
   public static final cy v = a("levitation", new cy());
   public static final ay w = a("changed_dimension", new ay());
   public static final dm x = a("tick", new dm());
   public static final eb y = a("tame_animal", new eb());
   public static final ct z = a("placed_block", new ct());
   public static final be A = a("consume_item", new be());
   public static final bn B = a("effects_changed", new bn());
   public static final ef C = a("used_totem", new ef());
   public static final bm D = a("nether_travel", new bm());
   public static final cb E = a("fishing_rod_hooked", new cb());
   public static final az F = a("channeled_lightning", new az());
   public static final dr G = a("shot_crossbow", new dr());
   public static final cw H = a("killed_by_crossbow", new cw());
   public static final dm I = a("hero_of_the_village", new dm());
   public static final dm J = a("voluntary_exile", new dm());
   public static final du K = a("slide_down_block", new du());
   public static final au L = a("bee_nest_destroyed", new au());
   public static final ec M = a("target_hit", new ec());
   public static final ct N = a("item_used_on_block", new ct());
   public static final bk O = a("default_block_use", new bk());
   public static final at P = a("any_block_use", new at());
   public static final dd Q = a("player_generates_container_loot", new dd());
   public static final di R = a("thrown_item_picked_up_by_entity", new di());
   public static final di S = a("thrown_item_picked_up_by_player", new di());
   public static final dk T = a("player_interacted_with_entity", new dk());
   public static final dx U = a("started_riding", new dx());
   public static final db V = a("lightning_strike", new db());
   public static final eg W = a("using_item", new eg());
   public static final bm X = a("fall_from_height", new bm());
   public static final bm Y = a("ride_entity_in_lava", new bm());
   public static final cx Z = a("kill_mob_near_sculk_catalyst", new cx());
   public static final ct aa = a("allay_drop_item_on_block", new ct());
   public static final dm ab = a("avoid_vibration", new dm());
   public static final dp ac = a("recipe_crafted", new dp());
   public static final dp ad = a("crafter_recipe_crafted", new dp());
   public static final by ae = a("fall_after_explosion", new by());

   private static <T extends ap<?>> T a(String $$0, T $$1) {
      return jw.a(lq.an, $$0, $$1);
   }

   public static ap<?> a(jw<ap<?>> $$0) {
      return b;
   }
}
