import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cff<U> {
   public static final cff<Void> a = a("dummy");
   public static final cff<jp> b = a("home", jp.b);
   public static final cff<jp> c = a("job_site", jp.b);
   public static final cff<jp> d = a("potential_job_site", jp.b);
   public static final cff<jp> e = a("meeting_point", jp.b);
   public static final cff<List<jp>> f = a("secondary_job_site");
   public static final cff<List<bwb>> g = a("mobs");
   public static final cff<cfh> h = a("visible_mobs");
   public static final cff<List<bwb>> i = a("visible_villager_babies");
   public static final cff<List<cps>> j = a("nearest_players");
   public static final cff<cps> k = a("nearest_visible_player");
   public static final cff<cps> l = a("nearest_visible_targetable_player");
   public static final cff<cfi> m = a("walk_target");
   public static final cff<bzi> n = a("look_target");
   public static final cff<bwb> o = a("attack_target");
   public static final cff<Boolean> p = a("attack_cooling_down");
   public static final cff<bwb> q = a("interaction_target");
   public static final cff<buw> r = a("breed_target");
   public static final cff<bvf> s = a("ride_target");
   public static final cff<eud> t = a("path");
   public static final cff<List<jp>> u = a("interactable_doors");
   public static final cff<Set<jp>> v = a("doors_to_close");
   public static final cff<jh> w = a("nearest_bed");
   public static final cff<btv> x = a("hurt_by");
   public static final cff<bwb> y = a("hurt_by_entity");
   public static final cff<bwb> z = a("avoid_target");
   public static final cff<bwb> A = a("nearest_hostile");
   public static final cff<bwb> B = a("nearest_attackable");
   public static final cff<jp> C = a("hiding_place");
   public static final cff<Long> D = a("heard_bell_time");
   public static final cff<Long> E = a("cant_reach_walk_target_since");
   public static final cff<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cff<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cff<Long> H = a("last_slept", Codec.LONG);
   public static final cff<Long> I = a("last_woken", Codec.LONG);
   public static final cff<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cff<buw> K = a("nearest_visible_adult");
   public static final cff<clw> L = a("nearest_visible_wanted_item");
   public static final cff<bwd> M = a("nearest_visible_nemesis");
   public static final cff<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cff<cps> O = a("tempting_player");
   public static final cff<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cff<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cff<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cff<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cff<Boolean> T = a("long_jump_mid_jump");
   public static final cff<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cff<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cff<fbs> W = a("ram_target");
   public static final cff<bbk> X = a("is_in_water", bbk.b);
   public static final cff<bbk> Y = a("is_pregnant", bbk.b);
   public static final cff<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cff<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cff<UUID> ab = a("angry_at", kk.a);
   public static final cff<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cff<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cff<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cff<Boolean> af = a("disable_walk_to_admire_item");
   public static final cff<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cff<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cff<jh> ai = a("celebrate_location");
   public static final cff<Boolean> aj = a("dancing");
   public static final cff<coa> ak = a("nearest_visible_huntable_hoglin");
   public static final cff<coa> al = a("nearest_visible_baby_hoglin");
   public static final cff<cps> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cff<List<cof>> an = a("nearby_adult_piglins");
   public static final cff<List<cof>> ao = a("nearest_visible_adult_piglins");
   public static final cff<List<coa>> ap = a("nearest_visible_adult_hoglins");
   public static final cff<cof> aq = a("nearest_visible_adult_piglin");
   public static final cff<bwb> ar = a("nearest_visible_zombified");
   public static final cff<Integer> as = a("visible_adult_piglin_count");
   public static final cff<Integer> at = a("visible_adult_hoglin_count");
   public static final cff<cps> au = a("nearest_player_holding_wanted_item");
   public static final cff<Boolean> av = a("ate_recently");
   public static final cff<jh> aw = a("nearest_repellent");
   public static final cff<Boolean> ax = a("pacified");
   public static final cff<bwb> ay = a("roar_target");
   public static final cff<jh> az = a("disturbance_location");
   public static final cff<bbk> aA = a("recent_projectile", bbk.b);
   public static final cff<bbk> aB = a("is_sniffing", bbk.b);
   public static final cff<bbk> aC = a("is_emerging", bbk.b);
   public static final cff<bbk> aD = a("roar_sound_delay", bbk.b);
   public static final cff<bbk> aE = a("dig_cooldown", bbk.b);
   public static final cff<bbk> aF = a("roar_sound_cooldown", bbk.b);
   public static final cff<bbk> aG = a("sniff_cooldown", bbk.b);
   public static final cff<bbk> aH = a("touch_cooldown", bbk.b);
   public static final cff<bbk> aI = a("vibration_cooldown", bbk.b);
   public static final cff<bbk> aJ = a("sonic_boom_cooldown", bbk.b);
   public static final cff<bbk> aK = a("sonic_boom_sound_cooldown", bbk.b);
   public static final cff<bbk> aL = a("sonic_boom_sound_delay", bbk.b);
   public static final cff<UUID> aM = a("liked_player", kk.a);
   public static final cff<jp> aN = a("liked_noteblock", jp.b);
   public static final cff<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cff<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cff<List<jp>> aQ = a("sniffer_explored_positions", Codec.list(jp.b));
   public static final cff<jh> aR = a("sniffer_sniffing_target");
   public static final cff<Boolean> aS = a("sniffer_digging");
   public static final cff<Boolean> aT = a("sniffer_happy");
   public static final cff<bbk> aU = a("breeze_jump_cooldown", bbk.b);
   public static final cff<bbk> aV = a("breeze_shoot", bbk.b);
   public static final cff<bbk> aW = a("breeze_shoot_charging", bbk.b);
   public static final cff<bbk> aX = a("breeze_shoot_recover", bbk.b);
   public static final cff<bbk> aY = a("breeze_shoot_cooldown", bbk.b);
   public static final cff<bbk> aZ = a("breeze_jump_inhaling", bbk.b);
   public static final cff<jh> ba = a("breeze_jump_target", jh.a);
   public static final cff<bbk> bb = a("breeze_leaving_water", bbk.b);
   private final Optional<Codec<cfe<U>>> bc;

   @VisibleForTesting
   public cff(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cfe::a);
   }

   @Override
   public String toString() {
      return ma.z.b(this).toString();
   }

   public Optional<Codec<cfe<U>>> a() {
      return this.bc;
   }

   private static <U> cff<U> a(String $$0, Codec<U> $$1) {
      return kd.a(ma.z, alz.b($$0), new cff<>(Optional.of($$1)));
   }

   private static <U> cff<U> a(String $$0) {
      return kd.a(ma.z, alz.b($$0), new cff<>(Optional.empty()));
   }
}
