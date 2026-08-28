import com.mojang.serialization.Codec;

public class an {
   public static final Codec<aq<?>> a = lt.an.r();
   public static final cf b = a("impossible", new cf());
   public static final da c = a("player_killed_entity", new da());
   public static final da d = a("entity_killed_player", new da());
   public static final br e = a("enter_block", new br());
   public static final cg f = a("inventory_changed", new cg());
   public static final dt g = a("recipe_unlocked", new dt());
   public static final dm h = a("player_hurt_entity", new dm());
   public static final bu i = a("entity_hurt_player", new bu());
   public static final bp j = a("enchanted_item", new bp());
   public static final ca k = a("filled_bucket", new ca());
   public static final ay l = a("brewed_potion", new ay());
   public static final be m = a("construct_beacon", new be());
   public static final eh n = a("used_ender_eye", new eh());
   public static final ec o = a("summoned_entity", new ec());
   public static final ax p = a("bred_animals", new ax());
   public static final dq q = a("location", new dq());
   public static final dq r = a("slept_in_bed", new dq());
   public static final bi s = a("cured_zombie_villager", new bi());
   public static final eg t = a("villager_trade", new eg());
   public static final cm u = a("item_durability_changed", new cm());
   public static final db v = a("levitation", new db());
   public static final az w = a("changed_dimension", new az());
   public static final dq x = a("tick", new dq());
   public static final ee y = a("tame_animal", new ee());
   public static final cw z = a("placed_block", new cw());
   public static final bf A = a("consume_item", new bf());
   public static final bo B = a("effects_changed", new bo());
   public static final ei C = a("used_totem", new ei());
   public static final bn D = a("nether_travel", new bn());
   public static final cc E = a("fishing_rod_hooked", new cc());
   public static final ba F = a("channeled_lightning", new ba());
   public static final du G = a("shot_crossbow", new du());
   public static final cz H = a("killed_by_crossbow", new cz());
   public static final dq I = a("hero_of_the_village", new dq());
   public static final dq J = a("voluntary_exile", new dq());
   public static final dx K = a("slide_down_block", new dx());
   public static final av L = a("bee_nest_destroyed", new av());
   public static final ef M = a("target_hit", new ef());
   public static final cw N = a("item_used_on_block", new cw());
   public static final bl O = a("default_block_use", new bl());
   public static final au P = a("any_block_use", new au());
   public static final dg Q = a("player_generates_container_loot", new dg());
   public static final dl R = a("thrown_item_picked_up_by_entity", new dl());
   public static final dl S = a("thrown_item_picked_up_by_player", new dl());
   public static final dn T = a("player_interacted_with_entity", new dn());
   public static final ea U = a("started_riding", new ea());
   public static final de V = a("lightning_strike", new de());
   public static final ej W = a("using_item", new ej());
   public static final bn X = a("fall_from_height", new bn());
   public static final bn Y = a("ride_entity_in_lava", new bn());
   public static final da Z = a("kill_mob_near_sculk_catalyst", new da());
   public static final cw aa = a("allay_drop_item_on_block", new cw());
   public static final dq ab = a("avoid_vibration", new dq());
   public static final ds ac = a("recipe_crafted", new ds());
   public static final ds ad = a("crafter_recipe_crafted", new ds());
   public static final bz ae = a("fall_after_explosion", new bz());

   private static <T extends aq<?>> T a(String $$0, T $$1) {
      return jz.a(lt.an, $$0, $$1);
   }

   public static aq<?> a(jz<aq<?>> $$0) {
      return b;
   }
}
