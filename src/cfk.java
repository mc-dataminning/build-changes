import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cfk<U> {
   public static final cfk<Void> a = a("dummy");
   public static final cfk<jp> b = a("home", jp.b);
   public static final cfk<jp> c = a("job_site", jp.b);
   public static final cfk<jp> d = a("potential_job_site", jp.b);
   public static final cfk<jp> e = a("meeting_point", jp.b);
   public static final cfk<List<jp>> f = a("secondary_job_site");
   public static final cfk<List<bwg>> g = a("mobs");
   public static final cfk<cfm> h = a("visible_mobs");
   public static final cfk<List<bwg>> i = a("visible_villager_babies");
   public static final cfk<List<cpx>> j = a("nearest_players");
   public static final cfk<cpx> k = a("nearest_visible_player");
   public static final cfk<cpx> l = a("nearest_visible_targetable_player");
   public static final cfk<cfn> m = a("walk_target");
   public static final cfk<bzn> n = a("look_target");
   public static final cfk<bwg> o = a("attack_target");
   public static final cfk<Boolean> p = a("attack_cooling_down");
   public static final cfk<bwg> q = a("interaction_target");
   public static final cfk<bvb> r = a("breed_target");
   public static final cfk<bvk> s = a("ride_target");
   public static final cfk<eul> t = a("path");
   public static final cfk<List<jp>> u = a("interactable_doors");
   public static final cfk<Set<jp>> v = a("doors_to_close");
   public static final cfk<jh> w = a("nearest_bed");
   public static final cfk<bua> x = a("hurt_by");
   public static final cfk<bwg> y = a("hurt_by_entity");
   public static final cfk<bwg> z = a("avoid_target");
   public static final cfk<bwg> A = a("nearest_hostile");
   public static final cfk<bwg> B = a("nearest_attackable");
   public static final cfk<jp> C = a("hiding_place");
   public static final cfk<Long> D = a("heard_bell_time");
   public static final cfk<Long> E = a("cant_reach_walk_target_since");
   public static final cfk<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cfk<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cfk<Long> H = a("last_slept", Codec.LONG);
   public static final cfk<Long> I = a("last_woken", Codec.LONG);
   public static final cfk<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cfk<bvb> K = a("nearest_visible_adult");
   public static final cfk<cmb> L = a("nearest_visible_wanted_item");
   public static final cfk<bwi> M = a("nearest_visible_nemesis");
   public static final cfk<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cfk<cpx> O = a("tempting_player");
   public static final cfk<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cfk<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cfk<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cfk<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cfk<Boolean> T = a("long_jump_mid_jump");
   public static final cfk<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cfk<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cfk<fby> W = a("ram_target");
   public static final cfk<bbk> X = a("is_in_water", bbk.b);
   public static final cfk<bbk> Y = a("is_pregnant", bbk.b);
   public static final cfk<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cfk<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cfk<UUID> ab = a("angry_at", kk.a);
   public static final cfk<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cfk<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cfk<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cfk<Boolean> af = a("disable_walk_to_admire_item");
   public static final cfk<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cfk<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cfk<jh> ai = a("celebrate_location");
   public static final cfk<Boolean> aj = a("dancing");
   public static final cfk<cof> ak = a("nearest_visible_huntable_hoglin");
   public static final cfk<cof> al = a("nearest_visible_baby_hoglin");
   public static final cfk<cpx> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cfk<List<cok>> an = a("nearby_adult_piglins");
   public static final cfk<List<cok>> ao = a("nearest_visible_adult_piglins");
   public static final cfk<List<cof>> ap = a("nearest_visible_adult_hoglins");
   public static final cfk<cok> aq = a("nearest_visible_adult_piglin");
   public static final cfk<bwg> ar = a("nearest_visible_zombified");
   public static final cfk<Integer> as = a("visible_adult_piglin_count");
   public static final cfk<Integer> at = a("visible_adult_hoglin_count");
   public static final cfk<cpx> au = a("nearest_player_holding_wanted_item");
   public static final cfk<Boolean> av = a("ate_recently");
   public static final cfk<jh> aw = a("nearest_repellent");
   public static final cfk<Boolean> ax = a("pacified");
   public static final cfk<bwg> ay = a("roar_target");
   public static final cfk<jh> az = a("disturbance_location");
   public static final cfk<bbk> aA = a("recent_projectile", bbk.b);
   public static final cfk<bbk> aB = a("is_sniffing", bbk.b);
   public static final cfk<bbk> aC = a("is_emerging", bbk.b);
   public static final cfk<bbk> aD = a("roar_sound_delay", bbk.b);
   public static final cfk<bbk> aE = a("dig_cooldown", bbk.b);
   public static final cfk<bbk> aF = a("roar_sound_cooldown", bbk.b);
   public static final cfk<bbk> aG = a("sniff_cooldown", bbk.b);
   public static final cfk<bbk> aH = a("touch_cooldown", bbk.b);
   public static final cfk<bbk> aI = a("vibration_cooldown", bbk.b);
   public static final cfk<bbk> aJ = a("sonic_boom_cooldown", bbk.b);
   public static final cfk<bbk> aK = a("sonic_boom_sound_cooldown", bbk.b);
   public static final cfk<bbk> aL = a("sonic_boom_sound_delay", bbk.b);
   public static final cfk<UUID> aM = a("liked_player", kk.a);
   public static final cfk<jp> aN = a("liked_noteblock", jp.b);
   public static final cfk<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cfk<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cfk<List<jp>> aQ = a("sniffer_explored_positions", Codec.list(jp.b));
   public static final cfk<jh> aR = a("sniffer_sniffing_target");
   public static final cfk<Boolean> aS = a("sniffer_digging");
   public static final cfk<Boolean> aT = a("sniffer_happy");
   public static final cfk<bbk> aU = a("breeze_jump_cooldown", bbk.b);
   public static final cfk<bbk> aV = a("breeze_shoot", bbk.b);
   public static final cfk<bbk> aW = a("breeze_shoot_charging", bbk.b);
   public static final cfk<bbk> aX = a("breeze_shoot_recover", bbk.b);
   public static final cfk<bbk> aY = a("breeze_shoot_cooldown", bbk.b);
   public static final cfk<bbk> aZ = a("breeze_jump_inhaling", bbk.b);
   public static final cfk<jh> ba = a("breeze_jump_target", jh.a);
   public static final cfk<bbk> bb = a("breeze_leaving_water", bbk.b);
   private final Optional<Codec<cfj<U>>> bc;

   @VisibleForTesting
   public cfk(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cfj::a);
   }

   @Override
   public String toString() {
      return ma.z.b(this).toString();
   }

   public Optional<Codec<cfj<U>>> a() {
      return this.bc;
   }

   private static <U> cfk<U> a(String $$0, Codec<U> $$1) {
      return kd.a(ma.z, alz.b($$0), new cfk<>(Optional.of($$1)));
   }

   private static <U> cfk<U> a(String $$0) {
      return kd.a(ma.z, alz.b($$0), new cfk<>(Optional.empty()));
   }
}
