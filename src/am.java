import com.mojang.serialization.Codec;

public class am {
   public static final Codec<ap<?>> a = kf.aq.q();
   public static final bz b = a("impossible", new bz());
   public static final cf c = a("player_killed_entity", new cf());
   public static final cf d = a("entity_killed_player", new cf());
   public static final bn e = a("enter_block", new bn());
   public static final ca f = a("inventory_changed", new ca());
   public static final cv g = a("recipe_unlocked", new cv());
   public static final cq h = a("player_hurt_entity", new cq());
   public static final bq i = a("entity_hurt_player", new bq());
   public static final bl j = a("enchanted_item", new bl());
   public static final bv k = a("filled_bucket", new bv());
   public static final ax l = a("brewed_potion", new ax());
   public static final ba m = a("construct_beacon", new ba());
   public static final dh n = a("used_ender_eye", new dh());
   public static final dc o = a("summoned_entity", new dc());
   public static final aw p = a("bred_animals", new aw());
   public static final ct q = a("location", new ct());
   public static final ct r = a("slept_in_bed", new ct());
   public static final be s = a("cured_zombie_villager", new be());
   public static final dg t = a("villager_trade", new dg());
   public static final cb u = a("item_durability_changed", new cb());
   public static final cg v = a("levitation", new cg());
   public static final ay w = a("changed_dimension", new ay());
   public static final ct x = a("tick", new ct());
   public static final de y = a("tame_animal", new de());
   public static final cd z = a("placed_block", new cd());
   public static final bb A = a("consume_item", new bb());
   public static final bk B = a("effects_changed", new bk());
   public static final di C = a("used_totem", new di());
   public static final bj D = a("nether_travel", new bj());
   public static final bx E = a("fishing_rod_hooked", new bx());
   public static final az F = a("channeled_lightning", new az());
   public static final cw G = a("shot_crossbow", new cw());
   public static final ce H = a("killed_by_crossbow", new ce());
   public static final ct I = a("hero_of_the_village", new ct());
   public static final ct J = a("voluntary_exile", new ct());
   public static final cy K = a("slide_down_block", new cy());
   public static final au L = a("bee_nest_destroyed", new au());
   public static final df M = a("target_hit", new df());
   public static final cd N = a("item_used_on_block", new cd());
   public static final bh O = a("default_block_use", new bh());
   public static final at P = a("any_block_use", new at());
   public static final cl Q = a("player_generates_container_loot", new cl());
   public static final cp R = a("thrown_item_picked_up_by_entity", new cp());
   public static final cp S = a("thrown_item_picked_up_by_player", new cp());
   public static final cr T = a("player_interacted_with_entity", new cr());
   public static final da U = a("started_riding", new da());
   public static final cj V = a("lightning_strike", new cj());
   public static final dj W = a("using_item", new dj());
   public static final bj X = a("fall_from_height", new bj());
   public static final bj Y = a("ride_entity_in_lava", new bj());
   public static final cf Z = a("kill_mob_near_sculk_catalyst", new cf());
   public static final cd aa = a("allay_drop_item_on_block", new cd());
   public static final ct ab = a("avoid_vibration", new ct());
   public static final cu ac = a("recipe_crafted", new cu());

   private static <T extends ap<?>> T a(String $$0, T $$1) {
      return iv.a(kf.aq, $$0, $$1);
   }

   public static ap<?> a(iv<ap<?>> $$0) {
      return b;
   }
}
