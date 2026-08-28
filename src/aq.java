import com.mojang.serialization.Codec;

public class aq {
   public static final Codec<at<?>> a = mg.ak.q();
   public static final ci b = a("impossible", new ci());
   public static final cp c = a("player_killed_entity", new cp());
   public static final cp d = a("entity_killed_player", new cp());
   public static final bu e = a("enter_block", new bu());
   public static final ck f = a("inventory_changed", new ck());
   public static final dh g = a("recipe_unlocked", new dh());
   public static final db h = a("player_hurt_entity", new db());
   public static final bx i = a("entity_hurt_player", new bx());
   public static final bs j = a("enchanted_item", new bs());
   public static final cd k = a("filled_bucket", new cd());
   public static final bb l = a("brewed_potion", new bb());
   public static final bh m = a("construct_beacon", new bh());
   public static final dx n = a("used_ender_eye", new dx());
   public static final ds o = a("summoned_entity", new ds());
   public static final ba p = a("bred_animals", new ba());
   public static final de q = a("location", new de());
   public static final de r = a("slept_in_bed", new de());
   public static final bl s = a("cured_zombie_villager", new bl());
   public static final dw t = a("villager_trade", new dw());
   public static final cl u = a("item_durability_changed", new cl());
   public static final cq v = a("levitation", new cq());
   public static final bc w = a("changed_dimension", new bc());
   public static final de x = a("tick", new de());
   public static final du y = a("tame_animal", new du());
   public static final cn z = a("placed_block", new cn());
   public static final bi A = a("consume_item", new bi());
   public static final br B = a("effects_changed", new br());
   public static final dy C = a("used_totem", new dy());
   public static final bq D = a("nether_travel", new bq());
   public static final cf E = a("fishing_rod_hooked", new cf());
   public static final bd F = a("channeled_lightning", new bd());
   public static final dj G = a("shot_crossbow", new dj());
   public static final co H = a("killed_by_arrow", new co());
   public static final de I = a("hero_of_the_village", new de());
   public static final de J = a("voluntary_exile", new de());
   public static final dm K = a("slide_down_block", new dm());
   public static final ay L = a("bee_nest_destroyed", new ay());
   public static final dv M = a("target_hit", new dv());
   public static final cn N = a("item_used_on_block", new cn());
   public static final bo O = a("default_block_use", new bo());
   public static final ax P = a("any_block_use", new ax());
   public static final cv Q = a("player_generates_container_loot", new cv());
   public static final da R = a("thrown_item_picked_up_by_entity", new da());
   public static final da S = a("thrown_item_picked_up_by_player", new da());
   public static final dc T = a("player_interacted_with_entity", new dc());
   public static final dq U = a("started_riding", new dq());
   public static final ct V = a("lightning_strike", new ct());
   public static final dz W = a("using_item", new dz());
   public static final bq X = a("fall_from_height", new bq());
   public static final bq Y = a("ride_entity_in_lava", new bq());
   public static final cp Z = a("kill_mob_near_sculk_catalyst", new cp());
   public static final cn aa = a("allay_drop_item_on_block", new cn());
   public static final de ab = a("avoid_vibration", new de());
   public static final dg ac = a("recipe_crafted", new dg());
   public static final dg ad = a("crafter_recipe_crafted", new dg());
   public static final cc ae = a("fall_after_explosion", new cc());

   private static <T extends at<?>> T a(String $$0, T $$1) {
      return js.a(mg.ak, $$0, $$1);
   }

   public static at<?> a(js<at<?>> $$0) {
      return b;
   }
}
