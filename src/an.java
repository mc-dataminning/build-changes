import com.mojang.serialization.Codec;

public class an {
   public static final Codec<aq<?>> a = lh.ap.q();
   public static final cb b = a("impossible", new cb());
   public static final cn c = a("player_killed_entity", new cn());
   public static final cn d = a("entity_killed_player", new cn());
   public static final bo e = a("enter_block", new bo());
   public static final cc f = a("inventory_changed", new cc());
   public static final df g = a("recipe_unlocked", new df());
   public static final cy h = a("player_hurt_entity", new cy());
   public static final br i = a("entity_hurt_player", new br());
   public static final bm j = a("enchanted_item", new bm());
   public static final bx k = a("filled_bucket", new bx());
   public static final ay l = a("brewed_potion", new ay());
   public static final bb m = a("construct_beacon", new bb());
   public static final dv n = a("used_ender_eye", new dv());
   public static final dp o = a("summoned_entity", new dp());
   public static final ax p = a("bred_animals", new ax());
   public static final db q = a("location", new db());
   public static final db r = a("slept_in_bed", new db());
   public static final bf s = a("cured_zombie_villager", new bf());
   public static final du t = a("villager_trade", new du());
   public static final cf u = a("item_durability_changed", new cf());
   public static final co v = a("levitation", new co());
   public static final az w = a("changed_dimension", new az());
   public static final db x = a("tick", new db());
   public static final dr y = a("tame_animal", new dr());
   public static final cl z = a("placed_block", new cl());
   public static final bc A = a("consume_item", new bc());
   public static final bl B = a("effects_changed", new bl());
   public static final dw C = a("used_totem", new dw());
   public static final bk D = a("nether_travel", new bk());
   public static final bz E = a("fishing_rod_hooked", new bz());
   public static final ba F = a("channeled_lightning", new ba());
   public static final dg G = a("shot_crossbow", new dg());
   public static final cm H = a("killed_by_crossbow", new cm());
   public static final db I = a("hero_of_the_village", new db());
   public static final db J = a("voluntary_exile", new db());
   public static final dj K = a("slide_down_block", new dj());
   public static final av L = a("bee_nest_destroyed", new av());
   public static final ds M = a("target_hit", new ds());
   public static final cl N = a("item_used_on_block", new cl());
   public static final bi O = a("default_block_use", new bi());
   public static final au P = a("any_block_use", new au());
   public static final ct Q = a("player_generates_container_loot", new ct());
   public static final cx R = a("thrown_item_picked_up_by_entity", new cx());
   public static final cx S = a("thrown_item_picked_up_by_player", new cx());
   public static final cz T = a("player_interacted_with_entity", new cz());
   public static final dm U = a("started_riding", new dm());
   public static final cr V = a("lightning_strike", new cr());
   public static final dx W = a("using_item", new dx());
   public static final bk X = a("fall_from_height", new bk());
   public static final bk Y = a("ride_entity_in_lava", new bk());
   public static final cn Z = a("kill_mob_near_sculk_catalyst", new cn());
   public static final cl aa = a("allay_drop_item_on_block", new cl());
   public static final db ab = a("avoid_vibration", new db());
   public static final de ac = a("recipe_crafted", new de());
   public static final de ad = a("crafter_recipe_crafted", new de());
   public static final bw ae = a("fall_after_explosion", new bw());
   public static final db af = a("get_peeled", new db());
   public static final db ag = a("eat_armor", new db());
   public static final db ah = a("rumble_plant", new db());
   public static final db ai = a("compost_staff", new db());
   public static final dd aj = a("potato_refined", new dd());
   public static final dt ak = a("throw_lubricated", new dt());
   public static final db al = a("said_potato", new db());
   public static final db am = a("bring_home_corruption", new db());
   public static final db an = a("peel_block", new db());
   public static final db ao = a("peel_potato_sheep", new db());
   public static final db ap = a("peel_potato_armor", new db());

   private static <T extends aq<?>> T a(String $$0, T $$1) {
      return jn.a(lh.ap, $$0, $$1);
   }

   public static aq<?> a(jn<aq<?>> $$0) {
      return b;
   }
}
