import com.mojang.serialization.Codec;

public class ap {
   public static final Codec<as<?>> a = mf.ak.q();
   public static final ch b = a("impossible", new ch());
   public static final co c = a("player_killed_entity", new co());
   public static final co d = a("entity_killed_player", new co());
   public static final bt e = a("enter_block", new bt());
   public static final cj f = a("inventory_changed", new cj());
   public static final dg g = a("recipe_unlocked", new dg());
   public static final da h = a("player_hurt_entity", new da());
   public static final bw i = a("entity_hurt_player", new bw());
   public static final br j = a("enchanted_item", new br());
   public static final cc k = a("filled_bucket", new cc());
   public static final ba l = a("brewed_potion", new ba());
   public static final bg m = a("construct_beacon", new bg());
   public static final dw n = a("used_ender_eye", new dw());
   public static final dr o = a("summoned_entity", new dr());
   public static final az p = a("bred_animals", new az());
   public static final dd q = a("location", new dd());
   public static final dd r = a("slept_in_bed", new dd());
   public static final bk s = a("cured_zombie_villager", new bk());
   public static final dv t = a("villager_trade", new dv());
   public static final ck u = a("item_durability_changed", new ck());
   public static final cp v = a("levitation", new cp());
   public static final bb w = a("changed_dimension", new bb());
   public static final dd x = a("tick", new dd());
   public static final dt y = a("tame_animal", new dt());
   public static final cm z = a("placed_block", new cm());
   public static final bh A = a("consume_item", new bh());
   public static final bq B = a("effects_changed", new bq());
   public static final dx C = a("used_totem", new dx());
   public static final bp D = a("nether_travel", new bp());
   public static final ce E = a("fishing_rod_hooked", new ce());
   public static final bc F = a("channeled_lightning", new bc());
   public static final di G = a("shot_crossbow", new di());
   public static final cn H = a("killed_by_arrow", new cn());
   public static final dd I = a("hero_of_the_village", new dd());
   public static final dd J = a("voluntary_exile", new dd());
   public static final dl K = a("slide_down_block", new dl());
   public static final ax L = a("bee_nest_destroyed", new ax());
   public static final du M = a("target_hit", new du());
   public static final cm N = a("item_used_on_block", new cm());
   public static final bn O = a("default_block_use", new bn());
   public static final aw P = a("any_block_use", new aw());
   public static final cu Q = a("player_generates_container_loot", new cu());
   public static final cz R = a("thrown_item_picked_up_by_entity", new cz());
   public static final cz S = a("thrown_item_picked_up_by_player", new cz());
   public static final db T = a("player_interacted_with_entity", new db());
   public static final dp U = a("started_riding", new dp());
   public static final cs V = a("lightning_strike", new cs());
   public static final dy W = a("using_item", new dy());
   public static final bp X = a("fall_from_height", new bp());
   public static final bp Y = a("ride_entity_in_lava", new bp());
   public static final co Z = a("kill_mob_near_sculk_catalyst", new co());
   public static final cm aa = a("allay_drop_item_on_block", new cm());
   public static final dd ab = a("avoid_vibration", new dd());
   public static final df ac = a("recipe_crafted", new df());
   public static final df ad = a("crafter_recipe_crafted", new df());
   public static final cb ae = a("fall_after_explosion", new cb());

   private static <T extends as<?>> T a(String $$0, T $$1) {
      return jr.a(mf.ak, $$0, $$1);
   }

   public static as<?> a(jr<as<?>> $$0) {
      return b;
   }
}
