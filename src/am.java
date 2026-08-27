import com.mojang.serialization.Codec;

public class am {
   public static final Codec<ap<?>> a = lc.ap.q();
   public static final bz b = a("impossible", new bz());
   public static final cl c = a("player_killed_entity", new cl());
   public static final cl d = a("entity_killed_player", new cl());
   public static final bn e = a("enter_block", new bn());
   public static final ca f = a("inventory_changed", new ca());
   public static final db g = a("recipe_unlocked", new db());
   public static final cw h = a("player_hurt_entity", new cw());
   public static final bq i = a("entity_hurt_player", new bq());
   public static final bl j = a("enchanted_item", new bl());
   public static final bv k = a("filled_bucket", new bv());
   public static final ax l = a("brewed_potion", new ax());
   public static final ba m = a("construct_beacon", new ba());
   public static final dq n = a("used_ender_eye", new dq());
   public static final dk o = a("summoned_entity", new dk());
   public static final aw p = a("bred_animals", new aw());
   public static final cz q = a("location", new cz());
   public static final cz r = a("slept_in_bed", new cz());
   public static final be s = a("cured_zombie_villager", new be());
   public static final dp t = a("villager_trade", new dp());
   public static final cd u = a("item_durability_changed", new cd());
   public static final cm v = a("levitation", new cm());
   public static final ay w = a("changed_dimension", new ay());
   public static final cz x = a("tick", new cz());
   public static final dm y = a("tame_animal", new dm());
   public static final cj z = a("placed_block", new cj());
   public static final bb A = a("consume_item", new bb());
   public static final bk B = a("effects_changed", new bk());
   public static final dr C = a("used_totem", new dr());
   public static final bj D = a("nether_travel", new bj());
   public static final bx E = a("fishing_rod_hooked", new bx());
   public static final az F = a("channeled_lightning", new az());
   public static final dc G = a("shot_crossbow", new dc());
   public static final ck H = a("killed_by_crossbow", new ck());
   public static final cz I = a("hero_of_the_village", new cz());
   public static final cz J = a("voluntary_exile", new cz());
   public static final df K = a("slide_down_block", new df());
   public static final au L = a("bee_nest_destroyed", new au());
   public static final dn M = a("target_hit", new dn());
   public static final cj N = a("item_used_on_block", new cj());
   public static final bh O = a("default_block_use", new bh());
   public static final at P = a("any_block_use", new at());
   public static final cr Q = a("player_generates_container_loot", new cr());
   public static final cv R = a("thrown_item_picked_up_by_entity", new cv());
   public static final cv S = a("thrown_item_picked_up_by_player", new cv());
   public static final cx T = a("player_interacted_with_entity", new cx());
   public static final di U = a("started_riding", new di());
   public static final cp V = a("lightning_strike", new cp());
   public static final ds W = a("using_item", new ds());
   public static final bj X = a("fall_from_height", new bj());
   public static final bj Y = a("ride_entity_in_lava", new bj());
   public static final cl Z = a("kill_mob_near_sculk_catalyst", new cl());
   public static final cj aa = a("allay_drop_item_on_block", new cj());
   public static final cz ab = a("avoid_vibration", new cz());
   public static final da ac = a("recipe_crafted", new da());

   private static <T extends ap<?>> T a(String $$0, T $$1) {
      return ji.a(lc.ap, $$0, $$1);
   }

   public static ap<?> a(ji<ap<?>> $$0) {
      return b;
   }
}
