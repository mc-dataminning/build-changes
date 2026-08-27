import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class btz<U> {
   public static final btz<Void> a = a("dummy");
   public static final btz<ia> b = a("home", ia.a);
   public static final btz<ia> c = a("job_site", ia.a);
   public static final btz<ia> d = a("potential_job_site", ia.a);
   public static final btz<ia> e = a("meeting_point", ia.a);
   public static final btz<List<ia>> f = a("secondary_job_site");
   public static final btz<List<bky>> g = a("mobs");
   public static final btz<bub> h = a("visible_mobs");
   public static final btz<List<bky>> i = a("visible_villager_babies");
   public static final btz<List<cdm>> j = a("nearest_players");
   public static final btz<cdm> k = a("nearest_visible_player");
   public static final btz<cdm> l = a("nearest_visible_targetable_player");
   public static final btz<buc> m = a("walk_target");
   public static final btz<boc> n = a("look_target");
   public static final btz<bky> o = a("attack_target");
   public static final btz<Boolean> p = a("attack_cooling_down");
   public static final btz<bky> q = a("interaction_target");
   public static final btz<bkd> r = a("breed_target");
   public static final btz<bki> s = a("ride_target");
   public static final btz<ecv> t = a("path");
   public static final btz<List<ia>> u = a("interactable_doors");
   public static final btz<Set<ia>> v = a("doors_to_close");
   public static final btz<ht> w = a("nearest_bed");
   public static final btz<bjg> x = a("hurt_by");
   public static final btz<bky> y = a("hurt_by_entity");
   public static final btz<bky> z = a("avoid_target");
   public static final btz<bky> A = a("nearest_hostile");
   public static final btz<bky> B = a("nearest_attackable");
   public static final btz<ia> C = a("hiding_place");
   public static final btz<Long> D = a("heard_bell_time");
   public static final btz<Long> E = a("cant_reach_walk_target_since");
   public static final btz<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final btz<Long> G = a("last_slept", Codec.LONG);
   public static final btz<Long> H = a("last_woken", Codec.LONG);
   public static final btz<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final btz<bkd> J = a("nearest_visible_adult");
   public static final btz<caf> K = a("nearest_visible_wanted_item");
   public static final btz<bla> L = a("nearest_visible_nemesis");
   public static final btz<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final btz<cdm> N = a("tempting_player");
   public static final btz<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final btz<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final btz<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final btz<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final btz<Boolean> S = a("long_jump_mid_jump");
   public static final btz<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final btz<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final btz<eji> V = a("ram_target");
   public static final btz<auj> W = a("is_in_water", Codec.unit(auj.a));
   public static final btz<auj> X = a("is_pregnant", Codec.unit(auj.a));
   public static final btz<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final btz<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final btz<UUID> aa = a("angry_at", iv.a);
   public static final btz<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final btz<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final btz<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final btz<Boolean> ae = a("disable_walk_to_admire_item");
   public static final btz<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final btz<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final btz<ht> ah = a("celebrate_location");
   public static final btz<Boolean> ai = a("dancing");
   public static final btz<cbw> aj = a("nearest_visible_huntable_hoglin");
   public static final btz<cbw> ak = a("nearest_visible_baby_hoglin");
   public static final btz<cdm> al = a("nearest_targetable_player_not_wearing_gold");
   public static final btz<List<ccb>> am = a("nearby_adult_piglins");
   public static final btz<List<ccb>> an = a("nearest_visible_adult_piglins");
   public static final btz<List<cbw>> ao = a("nearest_visible_adult_hoglins");
   public static final btz<ccb> ap = a("nearest_visible_adult_piglin");
   public static final btz<bky> aq = a("nearest_visible_zombified");
   public static final btz<Integer> ar = a("visible_adult_piglin_count");
   public static final btz<Integer> as = a("visible_adult_hoglin_count");
   public static final btz<cdm> at = a("nearest_player_holding_wanted_item");
   public static final btz<Boolean> au = a("ate_recently");
   public static final btz<ht> av = a("nearest_repellent");
   public static final btz<Boolean> aw = a("pacified");
   public static final btz<bky> ax = a("roar_target");
   public static final btz<ht> ay = a("disturbance_location");
   public static final btz<auj> az = a("recent_projectile", Codec.unit(auj.a));
   public static final btz<auj> aA = a("is_sniffing", Codec.unit(auj.a));
   public static final btz<auj> aB = a("is_emerging", Codec.unit(auj.a));
   public static final btz<auj> aC = a("roar_sound_delay", Codec.unit(auj.a));
   public static final btz<auj> aD = a("dig_cooldown", Codec.unit(auj.a));
   public static final btz<auj> aE = a("roar_sound_cooldown", Codec.unit(auj.a));
   public static final btz<auj> aF = a("sniff_cooldown", Codec.unit(auj.a));
   public static final btz<auj> aG = a("touch_cooldown", Codec.unit(auj.a));
   public static final btz<auj> aH = a("vibration_cooldown", Codec.unit(auj.a));
   public static final btz<auj> aI = a("sonic_boom_cooldown", Codec.unit(auj.a));
   public static final btz<auj> aJ = a("sonic_boom_sound_cooldown", Codec.unit(auj.a));
   public static final btz<auj> aK = a("sonic_boom_sound_delay", Codec.unit(auj.a));
   public static final btz<UUID> aL = a("liked_player", iv.a);
   public static final btz<ia> aM = a("liked_noteblock", ia.a);
   public static final btz<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final btz<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final btz<List<ia>> aP = a("sniffer_explored_positions", Codec.list(ia.a));
   public static final btz<ht> aQ = a("sniffer_sniffing_target");
   public static final btz<Boolean> aR = a("sniffer_digging");
   public static final btz<Boolean> aS = a("sniffer_happy");
   private final Optional<Codec<bty<U>>> aT;

   @VisibleForTesting
   public btz(Optional<Codec<U>> $$0) {
      this.aT = $$0.map(bty::a);
   }

   @Override
   public String toString() {
      return jy.C.b(this).toString();
   }

   public Optional<Codec<bty<U>>> a() {
      return this.aT;
   }

   private static <U> btz<U> a(String $$0, Codec<U> $$1) {
      return io.a(jy.C, new agg($$0), new btz<>(Optional.of($$1)));
   }

   private static <U> btz<U> a(String $$0) {
      return io.a(jy.C, new agg($$0), new btz<>(Optional.empty()));
   }
}
