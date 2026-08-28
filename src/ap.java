import com.mojang.serialization.Codec;

public class ap {
   public static final Codec<as<?>> a = md.am.q();
   public static final ch b = a("impossible", new ch());
   public static final dd c = a("player_killed_entity", new dd());
   public static final dd d = a("entity_killed_player", new dd());
   public static final bt e = a("enter_block", new bt());
   public static final cj f = a("inventory_changed", new cj());
   public static final dw g = a("recipe_unlocked", new dw());
   public static final dq h = a("player_hurt_entity", new dq());
   public static final bw i = a("entity_hurt_player", new bw());
   public static final br j = a("enchanted_item", new br());
   public static final cc k = a("filled_bucket", new cc());
   public static final ba l = a("brewed_potion", new ba());
   public static final bg m = a("construct_beacon", new bg());
   public static final el n = a("used_ender_eye", new el());
   public static final eg o = a("summoned_entity", new eg());
   public static final az p = a("bred_animals", new az());
   public static final dt q = a("location", new dt());
   public static final dt r = a("slept_in_bed", new dt());
   public static final bk s = a("cured_zombie_villager", new bk());
   public static final ek t = a("villager_trade", new ek());
   public static final cp u = a("item_durability_changed", new cp());
   public static final de v = a("levitation", new de());
   public static final bb w = a("changed_dimension", new bb());
   public static final dt x = a("tick", new dt());
   public static final ei y = a("tame_animal", new ei());
   public static final cz z = a("placed_block", new cz());
   public static final bh A = a("consume_item", new bh());
   public static final bq B = a("effects_changed", new bq());
   public static final em C = a("used_totem", new em());
   public static final bp D = a("nether_travel", new bp());
   public static final ce E = a("fishing_rod_hooked", new ce());
   public static final bc F = a("channeled_lightning", new bc());
   public static final dy G = a("shot_crossbow", new dy());
   public static final dc H = a("killed_by_arrow", new dc());
   public static final dt I = a("hero_of_the_village", new dt());
   public static final dt J = a("voluntary_exile", new dt());
   public static final eb K = a("slide_down_block", new eb());
   public static final ax L = a("bee_nest_destroyed", new ax());
   public static final ej M = a("target_hit", new ej());
   public static final cz N = a("item_used_on_block", new cz());
   public static final bn O = a("default_block_use", new bn());
   public static final aw P = a("any_block_use", new aw());
   public static final dj Q = a("player_generates_container_loot", new dj());
   public static final dp R = a("thrown_item_picked_up_by_entity", new dp());
   public static final dp S = a("thrown_item_picked_up_by_player", new dp());
   public static final dr T = a("player_interacted_with_entity", new dr());
   public static final ee U = a("started_riding", new ee());
   public static final dh V = a("lightning_strike", new dh());
   public static final en W = a("using_item", new en());
   public static final bp X = a("fall_from_height", new bp());
   public static final bp Y = a("ride_entity_in_lava", new bp());
   public static final dd Z = a("kill_mob_near_sculk_catalyst", new dd());
   public static final cz aa = a("allay_drop_item_on_block", new cz());
   public static final dt ab = a("avoid_vibration", new dt());
   public static final dv ac = a("recipe_crafted", new dv());
   public static final dv ad = a("crafter_recipe_crafted", new dv());
   public static final cb ae = a("fall_after_explosion", new cb());

   private static <T extends as<?>> T a(String $$0, T $$1) {
      return kf.a(md.am, $$0, $$1);
   }

   public static as<?> a(kf<as<?>> $$0) {
      return b;
   }
}
