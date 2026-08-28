import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cdi<U> {
   public static final cdi<Void> a = a("dummy");
   public static final cdi<jm> b = a("home", jm.b);
   public static final cdi<jm> c = a("job_site", jm.b);
   public static final cdi<jm> d = a("potential_job_site", jm.b);
   public static final cdi<jm> e = a("meeting_point", jm.b);
   public static final cdi<List<jm>> f = a("secondary_job_site");
   public static final cdi<List<buf>> g = a("mobs");
   public static final cdi<cdk> h = a("visible_mobs");
   public static final cdi<List<buf>> i = a("visible_villager_babies");
   public static final cdi<List<cnp>> j = a("nearest_players");
   public static final cdi<cnp> k = a("nearest_visible_player");
   public static final cdi<cnp> l = a("nearest_visible_targetable_player");
   public static final cdi<cdl> m = a("walk_target");
   public static final cdi<bxl> n = a("look_target");
   public static final cdi<buf> o = a("attack_target");
   public static final cdi<Boolean> p = a("attack_cooling_down");
   public static final cdi<buf> q = a("interaction_target");
   public static final cdi<btc> r = a("breed_target");
   public static final cdi<btj> s = a("ride_target");
   public static final cdi<eqp> t = a("path");
   public static final cdi<List<jm>> u = a("interactable_doors");
   public static final cdi<Set<jm>> v = a("doors_to_close");
   public static final cdi<je> w = a("nearest_bed");
   public static final cdi<bsb> x = a("hurt_by");
   public static final cdi<buf> y = a("hurt_by_entity");
   public static final cdi<buf> z = a("avoid_target");
   public static final cdi<buf> A = a("nearest_hostile");
   public static final cdi<buf> B = a("nearest_attackable");
   public static final cdi<jm> C = a("hiding_place");
   public static final cdi<Long> D = a("heard_bell_time");
   public static final cdi<Long> E = a("cant_reach_walk_target_since");
   public static final cdi<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cdi<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cdi<Long> H = a("last_slept", Codec.LONG);
   public static final cdi<Long> I = a("last_woken", Codec.LONG);
   public static final cdi<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cdi<btc> K = a("nearest_visible_adult");
   public static final cdi<cjz> L = a("nearest_visible_wanted_item");
   public static final cdi<buh> M = a("nearest_visible_nemesis");
   public static final cdi<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cdi<cnp> O = a("tempting_player");
   public static final cdi<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cdi<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cdi<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cdi<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cdi<Boolean> T = a("long_jump_mid_jump");
   public static final cdi<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cdi<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cdi<eye> W = a("ram_target");
   public static final cdi<bah> X = a("is_in_water", bah.b);
   public static final cdi<bah> Y = a("is_pregnant", bah.b);
   public static final cdi<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cdi<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cdi<UUID> ab = a("angry_at", kh.a);
   public static final cdi<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cdi<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cdi<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cdi<Boolean> af = a("disable_walk_to_admire_item");
   public static final cdi<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cdi<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cdi<je> ai = a("celebrate_location");
   public static final cdi<Boolean> aj = a("dancing");
   public static final cdi<clz> ak = a("nearest_visible_huntable_hoglin");
   public static final cdi<clz> al = a("nearest_visible_baby_hoglin");
   public static final cdi<cnp> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cdi<List<cme>> an = a("nearby_adult_piglins");
   public static final cdi<List<cme>> ao = a("nearest_visible_adult_piglins");
   public static final cdi<List<clz>> ap = a("nearest_visible_adult_hoglins");
   public static final cdi<cme> aq = a("nearest_visible_adult_piglin");
   public static final cdi<buf> ar = a("nearest_visible_zombified");
   public static final cdi<Integer> as = a("visible_adult_piglin_count");
   public static final cdi<Integer> at = a("visible_adult_hoglin_count");
   public static final cdi<cnp> au = a("nearest_player_holding_wanted_item");
   public static final cdi<Boolean> av = a("ate_recently");
   public static final cdi<je> aw = a("nearest_repellent");
   public static final cdi<Boolean> ax = a("pacified");
   public static final cdi<buf> ay = a("roar_target");
   public static final cdi<je> az = a("disturbance_location");
   public static final cdi<bah> aA = a("recent_projectile", bah.b);
   public static final cdi<bah> aB = a("is_sniffing", bah.b);
   public static final cdi<bah> aC = a("is_emerging", bah.b);
   public static final cdi<bah> aD = a("roar_sound_delay", bah.b);
   public static final cdi<bah> aE = a("dig_cooldown", bah.b);
   public static final cdi<bah> aF = a("roar_sound_cooldown", bah.b);
   public static final cdi<bah> aG = a("sniff_cooldown", bah.b);
   public static final cdi<bah> aH = a("touch_cooldown", bah.b);
   public static final cdi<bah> aI = a("vibration_cooldown", bah.b);
   public static final cdi<bah> aJ = a("sonic_boom_cooldown", bah.b);
   public static final cdi<bah> aK = a("sonic_boom_sound_cooldown", bah.b);
   public static final cdi<bah> aL = a("sonic_boom_sound_delay", bah.b);
   public static final cdi<UUID> aM = a("liked_player", kh.a);
   public static final cdi<jm> aN = a("liked_noteblock", jm.b);
   public static final cdi<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cdi<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cdi<List<jm>> aQ = a("sniffer_explored_positions", Codec.list(jm.b));
   public static final cdi<je> aR = a("sniffer_sniffing_target");
   public static final cdi<Boolean> aS = a("sniffer_digging");
   public static final cdi<Boolean> aT = a("sniffer_happy");
   public static final cdi<bah> aU = a("breeze_jump_cooldown", bah.b);
   public static final cdi<bah> aV = a("breeze_shoot", bah.b);
   public static final cdi<bah> aW = a("breeze_shoot_charging", bah.b);
   public static final cdi<bah> aX = a("breeze_shoot_recover", bah.b);
   public static final cdi<bah> aY = a("breeze_shoot_cooldown", bah.b);
   public static final cdi<bah> aZ = a("breeze_jump_inhaling", bah.b);
   public static final cdi<je> ba = a("breeze_jump_target", je.a);
   public static final cdi<bah> bb = a("breeze_leaving_water", bah.b);
   private final Optional<Codec<cdh<U>>> bc;

   @VisibleForTesting
   public cdi(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cdh::a);
   }

   @Override
   public String toString() {
      return lu.z.b(this).toString();
   }

   public Optional<Codec<cdh<U>>> a() {
      return this.bc;
   }

   private static <U> cdi<U> a(String $$0, Codec<U> $$1) {
      return ka.a(lu.z, alb.b($$0), new cdi<>(Optional.of($$1)));
   }

   private static <U> cdi<U> a(String $$0) {
      return ka.a(lu.z, alb.b($$0), new cdi<>(Optional.empty()));
   }
}
