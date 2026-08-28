import com.mojang.serialization.Codec;

public class aq {
   public static final Codec<at<?>> a = mh.ak.q();
   public static final cj b = a("impossible", new cj());
   public static final cq c = a("player_killed_entity", new cq());
   public static final cq d = a("entity_killed_player", new cq());
   public static final bv e = a("enter_block", new bv());
   public static final cl f = a("inventory_changed", new cl());
   public static final di g = a("recipe_unlocked", new di());
   public static final dc h = a("player_hurt_entity", new dc());
   public static final by i = a("entity_hurt_player", new by());
   public static final bt j = a("enchanted_item", new bt());
   public static final ce k = a("filled_bucket", new ce());
   public static final bb l = a("brewed_potion", new bb());
   public static final bh m = a("construct_beacon", new bh());
   public static final dy n = a("used_ender_eye", new dy());
   public static final dt o = a("summoned_entity", new dt());
   public static final ba p = a("bred_animals", new ba());
   public static final df q = a("location", new df());
   public static final df r = a("slept_in_bed", new df());
   public static final bl s = a("cured_zombie_villager", new bl());
   public static final dx t = a("villager_trade", new dx());
   public static final cm u = a("item_durability_changed", new cm());
   public static final cr v = a("levitation", new cr());
   public static final bc w = a("changed_dimension", new bc());
   public static final df x = a("tick", new df());
   public static final dv y = a("tame_animal", new dv());
   public static final co z = a("placed_block", new co());
   public static final bi A = a("consume_item", new bi());
   public static final bs B = a("effects_changed", new bs());
   public static final dz C = a("used_totem", new dz());
   public static final br D = a("nether_travel", new br());
   public static final cg E = a("fishing_rod_hooked", new cg());
   public static final bd F = a("channeled_lightning", new bd());
   public static final dk G = a("shot_crossbow", new dk());
   public static final cp H = a("killed_by_arrow", new cp());
   public static final df I = a("hero_of_the_village", new df());
   public static final df J = a("voluntary_exile", new df());
   public static final dn K = a("slide_down_block", new dn());
   public static final ay L = a("bee_nest_destroyed", new ay());
   public static final dw M = a("target_hit", new dw());
   public static final co N = a("item_used_on_block", new co());
   public static final bp O = a("default_block_use", new bp());
   public static final ax P = a("any_block_use", new ax());
   public static final cw Q = a("player_generates_container_loot", new cw());
   public static final db R = a("thrown_item_picked_up_by_entity", new db());
   public static final db S = a("thrown_item_picked_up_by_player", new db());
   public static final dd T = a("player_interacted_with_entity", new dd());
   public static final dr U = a("started_riding", new dr());
   public static final cu V = a("lightning_strike", new cu());
   public static final ea W = a("using_item", new ea());
   public static final br X = a("fall_from_height", new br());
   public static final br Y = a("ride_entity_in_lava", new br());
   public static final cq Z = a("kill_mob_near_sculk_catalyst", new cq());
   public static final co aa = a("allay_drop_item_on_block", new co());
   public static final df ab = a("avoid_vibration", new df());
   public static final dh ac = a("recipe_crafted", new dh());
   public static final dh ad = a("crafter_recipe_crafted", new dh());
   public static final cd ae = a("fall_after_explosion", new cd());

   private static <T extends at<?>> T a(String $$0, T $$1) {
      return jt.a(mh.ak, $$0, $$1);
   }

   public static at<?> a(jt<at<?>> $$0) {
      return b;
   }
}
