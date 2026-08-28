import com.mojang.serialization.Codec;

public class an {
   public static final Codec<aq<?>> a = lx.am.q();
   public static final cf b = a("impossible", new cf());
   public static final db c = a("player_killed_entity", new db());
   public static final db d = a("entity_killed_player", new db());
   public static final br e = a("enter_block", new br());
   public static final ch f = a("inventory_changed", new ch());
   public static final du g = a("recipe_unlocked", new du());
   public static final dn h = a("player_hurt_entity", new dn());
   public static final bu i = a("entity_hurt_player", new bu());
   public static final bp j = a("enchanted_item", new bp());
   public static final ca k = a("filled_bucket", new ca());
   public static final ay l = a("brewed_potion", new ay());
   public static final be m = a("construct_beacon", new be());
   public static final ej n = a("used_ender_eye", new ej());
   public static final ee o = a("summoned_entity", new ee());
   public static final ax p = a("bred_animals", new ax());
   public static final dr q = a("location", new dr());
   public static final dr r = a("slept_in_bed", new dr());
   public static final bi s = a("cured_zombie_villager", new bi());
   public static final ei t = a("villager_trade", new ei());
   public static final cn u = a("item_durability_changed", new cn());
   public static final dc v = a("levitation", new dc());
   public static final az w = a("changed_dimension", new az());
   public static final dr x = a("tick", new dr());
   public static final eg y = a("tame_animal", new eg());
   public static final cx z = a("placed_block", new cx());
   public static final bf A = a("consume_item", new bf());
   public static final bo B = a("effects_changed", new bo());
   public static final ek C = a("used_totem", new ek());
   public static final bn D = a("nether_travel", new bn());
   public static final cc E = a("fishing_rod_hooked", new cc());
   public static final ba F = a("channeled_lightning", new ba());
   public static final dw G = a("shot_crossbow", new dw());
   public static final da H = a("killed_by_crossbow", new da());
   public static final dr I = a("hero_of_the_village", new dr());
   public static final dr J = a("voluntary_exile", new dr());
   public static final dz K = a("slide_down_block", new dz());
   public static final av L = a("bee_nest_destroyed", new av());
   public static final eh M = a("target_hit", new eh());
   public static final cx N = a("item_used_on_block", new cx());
   public static final bl O = a("default_block_use", new bl());
   public static final au P = a("any_block_use", new au());
   public static final dh Q = a("player_generates_container_loot", new dh());
   public static final dm R = a("thrown_item_picked_up_by_entity", new dm());
   public static final dm S = a("thrown_item_picked_up_by_player", new dm());
   public static final dp T = a("player_interacted_with_entity", new dp());
   public static final ec U = a("started_riding", new ec());
   public static final df V = a("lightning_strike", new df());
   public static final el W = a("using_item", new el());
   public static final bn X = a("fall_from_height", new bn());
   public static final bn Y = a("ride_entity_in_lava", new bn());
   public static final db Z = a("kill_mob_near_sculk_catalyst", new db());
   public static final cx aa = a("allay_drop_item_on_block", new cx());
   public static final dr ab = a("avoid_vibration", new dr());
   public static final dt ac = a("recipe_crafted", new dt());
   public static final dt ad = a("crafter_recipe_crafted", new dt());
   public static final bz ae = a("fall_after_explosion", new bz());

   private static <T extends aq<?>> T a(String $$0, T $$1) {
      return kc.a(lx.am, $$0, $$1);
   }

   public static aq<?> a(kc<aq<?>> $$0) {
      return b;
   }
}
