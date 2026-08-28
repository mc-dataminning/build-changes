import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cfj<U> {
   public static final cfj<Void> a = a("dummy");
   public static final cfj<jp> b = a("home", jp.b);
   public static final cfj<jp> c = a("job_site", jp.b);
   public static final cfj<jp> d = a("potential_job_site", jp.b);
   public static final cfj<jp> e = a("meeting_point", jp.b);
   public static final cfj<List<jp>> f = a("secondary_job_site");
   public static final cfj<List<bwf>> g = a("mobs");
   public static final cfj<cfl> h = a("visible_mobs");
   public static final cfj<List<bwf>> i = a("visible_villager_babies");
   public static final cfj<List<cpw>> j = a("nearest_players");
   public static final cfj<cpw> k = a("nearest_visible_player");
   public static final cfj<cpw> l = a("nearest_visible_targetable_player");
   public static final cfj<cfm> m = a("walk_target");
   public static final cfj<bzm> n = a("look_target");
   public static final cfj<bwf> o = a("attack_target");
   public static final cfj<Boolean> p = a("attack_cooling_down");
   public static final cfj<bwf> q = a("interaction_target");
   public static final cfj<bva> r = a("breed_target");
   public static final cfj<bvj> s = a("ride_target");
   public static final cfj<euk> t = a("path");
   public static final cfj<List<jp>> u = a("interactable_doors");
   public static final cfj<Set<jp>> v = a("doors_to_close");
   public static final cfj<jh> w = a("nearest_bed");
   public static final cfj<btz> x = a("hurt_by");
   public static final cfj<bwf> y = a("hurt_by_entity");
   public static final cfj<bwf> z = a("avoid_target");
   public static final cfj<bwf> A = a("nearest_hostile");
   public static final cfj<bwf> B = a("nearest_attackable");
   public static final cfj<jp> C = a("hiding_place");
   public static final cfj<Long> D = a("heard_bell_time");
   public static final cfj<Long> E = a("cant_reach_walk_target_since");
   public static final cfj<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cfj<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cfj<Long> H = a("last_slept", Codec.LONG);
   public static final cfj<Long> I = a("last_woken", Codec.LONG);
   public static final cfj<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cfj<bva> K = a("nearest_visible_adult");
   public static final cfj<cma> L = a("nearest_visible_wanted_item");
   public static final cfj<bwh> M = a("nearest_visible_nemesis");
   public static final cfj<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cfj<cpw> O = a("tempting_player");
   public static final cfj<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cfj<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cfj<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cfj<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cfj<Boolean> T = a("long_jump_mid_jump");
   public static final cfj<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cfj<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cfj<fbx> W = a("ram_target");
   public static final cfj<bbk> X = a("is_in_water", bbk.b);
   public static final cfj<bbk> Y = a("is_pregnant", bbk.b);
   public static final cfj<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cfj<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cfj<UUID> ab = a("angry_at", kk.a);
   public static final cfj<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cfj<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cfj<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cfj<Boolean> af = a("disable_walk_to_admire_item");
   public static final cfj<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cfj<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cfj<jh> ai = a("celebrate_location");
   public static final cfj<Boolean> aj = a("dancing");
   public static final cfj<coe> ak = a("nearest_visible_huntable_hoglin");
   public static final cfj<coe> al = a("nearest_visible_baby_hoglin");
   public static final cfj<cpw> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cfj<List<coj>> an = a("nearby_adult_piglins");
   public static final cfj<List<coj>> ao = a("nearest_visible_adult_piglins");
   public static final cfj<List<coe>> ap = a("nearest_visible_adult_hoglins");
   public static final cfj<coj> aq = a("nearest_visible_adult_piglin");
   public static final cfj<bwf> ar = a("nearest_visible_zombified");
   public static final cfj<Integer> as = a("visible_adult_piglin_count");
   public static final cfj<Integer> at = a("visible_adult_hoglin_count");
   public static final cfj<cpw> au = a("nearest_player_holding_wanted_item");
   public static final cfj<Boolean> av = a("ate_recently");
   public static final cfj<jh> aw = a("nearest_repellent");
   public static final cfj<Boolean> ax = a("pacified");
   public static final cfj<bwf> ay = a("roar_target");
   public static final cfj<jh> az = a("disturbance_location");
   public static final cfj<bbk> aA = a("recent_projectile", bbk.b);
   public static final cfj<bbk> aB = a("is_sniffing", bbk.b);
   public static final cfj<bbk> aC = a("is_emerging", bbk.b);
   public static final cfj<bbk> aD = a("roar_sound_delay", bbk.b);
   public static final cfj<bbk> aE = a("dig_cooldown", bbk.b);
   public static final cfj<bbk> aF = a("roar_sound_cooldown", bbk.b);
   public static final cfj<bbk> aG = a("sniff_cooldown", bbk.b);
   public static final cfj<bbk> aH = a("touch_cooldown", bbk.b);
   public static final cfj<bbk> aI = a("vibration_cooldown", bbk.b);
   public static final cfj<bbk> aJ = a("sonic_boom_cooldown", bbk.b);
   public static final cfj<bbk> aK = a("sonic_boom_sound_cooldown", bbk.b);
   public static final cfj<bbk> aL = a("sonic_boom_sound_delay", bbk.b);
   public static final cfj<UUID> aM = a("liked_player", kk.a);
   public static final cfj<jp> aN = a("liked_noteblock", jp.b);
   public static final cfj<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cfj<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cfj<List<jp>> aQ = a("sniffer_explored_positions", Codec.list(jp.b));
   public static final cfj<jh> aR = a("sniffer_sniffing_target");
   public static final cfj<Boolean> aS = a("sniffer_digging");
   public static final cfj<Boolean> aT = a("sniffer_happy");
   public static final cfj<bbk> aU = a("breeze_jump_cooldown", bbk.b);
   public static final cfj<bbk> aV = a("breeze_shoot", bbk.b);
   public static final cfj<bbk> aW = a("breeze_shoot_charging", bbk.b);
   public static final cfj<bbk> aX = a("breeze_shoot_recover", bbk.b);
   public static final cfj<bbk> aY = a("breeze_shoot_cooldown", bbk.b);
   public static final cfj<bbk> aZ = a("breeze_jump_inhaling", bbk.b);
   public static final cfj<jh> ba = a("breeze_jump_target", jh.a);
   public static final cfj<bbk> bb = a("breeze_leaving_water", bbk.b);
   private final Optional<Codec<cfi<U>>> bc;

   @VisibleForTesting
   public cfj(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cfi::a);
   }

   @Override
   public String toString() {
      return ma.z.b(this).toString();
   }

   public Optional<Codec<cfi<U>>> a() {
      return this.bc;
   }

   private static <U> cfj<U> a(String $$0, Codec<U> $$1) {
      return kd.a(ma.z, alz.b($$0), new cfj<>(Optional.of($$1)));
   }

   private static <U> cfj<U> a(String $$0) {
      return kd.a(ma.z, alz.b($$0), new cfj<>(Optional.empty()));
   }
}
