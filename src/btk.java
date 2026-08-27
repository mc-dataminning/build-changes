import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class btk<U> {
   public static final btk<Void> a = a("dummy");
   public static final btk<ia> b = a("home", ia.a);
   public static final btk<ia> c = a("job_site", ia.a);
   public static final btk<ia> d = a("potential_job_site", ia.a);
   public static final btk<ia> e = a("meeting_point", ia.a);
   public static final btk<List<ia>> f = a("secondary_job_site");
   public static final btk<List<bkj>> g = a("mobs");
   public static final btk<btm> h = a("visible_mobs");
   public static final btk<List<bkj>> i = a("visible_villager_babies");
   public static final btk<List<ccx>> j = a("nearest_players");
   public static final btk<ccx> k = a("nearest_visible_player");
   public static final btk<ccx> l = a("nearest_visible_targetable_player");
   public static final btk<btn> m = a("walk_target");
   public static final btk<bnn> n = a("look_target");
   public static final btk<bkj> o = a("attack_target");
   public static final btk<Boolean> p = a("attack_cooling_down");
   public static final btk<bkj> q = a("interaction_target");
   public static final btk<bjo> r = a("breed_target");
   public static final btk<bjt> s = a("ride_target");
   public static final btk<ebt> t = a("path");
   public static final btk<List<ia>> u = a("interactable_doors");
   public static final btk<Set<ia>> v = a("doors_to_close");
   public static final btk<ht> w = a("nearest_bed");
   public static final btk<bir> x = a("hurt_by");
   public static final btk<bkj> y = a("hurt_by_entity");
   public static final btk<bkj> z = a("avoid_target");
   public static final btk<bkj> A = a("nearest_hostile");
   public static final btk<bkj> B = a("nearest_attackable");
   public static final btk<ia> C = a("hiding_place");
   public static final btk<Long> D = a("heard_bell_time");
   public static final btk<Long> E = a("cant_reach_walk_target_since");
   public static final btk<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final btk<Long> G = a("last_slept", Codec.LONG);
   public static final btk<Long> H = a("last_woken", Codec.LONG);
   public static final btk<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final btk<bjo> J = a("nearest_visible_adult");
   public static final btk<bzq> K = a("nearest_visible_wanted_item");
   public static final btk<bkl> L = a("nearest_visible_nemesis");
   public static final btk<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final btk<ccx> N = a("tempting_player");
   public static final btk<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final btk<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final btk<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final btk<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final btk<Boolean> S = a("long_jump_mid_jump");
   public static final btk<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final btk<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final btk<eif> V = a("ram_target");
   public static final btk<atz> W = a("is_in_water", Codec.unit(atz.a));
   public static final btk<atz> X = a("is_pregnant", Codec.unit(atz.a));
   public static final btk<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final btk<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final btk<UUID> aa = a("angry_at", iv.a);
   public static final btk<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final btk<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final btk<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final btk<Boolean> ae = a("disable_walk_to_admire_item");
   public static final btk<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final btk<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final btk<ht> ah = a("celebrate_location");
   public static final btk<Boolean> ai = a("dancing");
   public static final btk<cbh> aj = a("nearest_visible_huntable_hoglin");
   public static final btk<cbh> ak = a("nearest_visible_baby_hoglin");
   public static final btk<ccx> al = a("nearest_targetable_player_not_wearing_gold");
   public static final btk<List<cbm>> am = a("nearby_adult_piglins");
   public static final btk<List<cbm>> an = a("nearest_visible_adult_piglins");
   public static final btk<List<cbh>> ao = a("nearest_visible_adult_hoglins");
   public static final btk<cbm> ap = a("nearest_visible_adult_piglin");
   public static final btk<bkj> aq = a("nearest_visible_zombified");
   public static final btk<Integer> ar = a("visible_adult_piglin_count");
   public static final btk<Integer> as = a("visible_adult_hoglin_count");
   public static final btk<ccx> at = a("nearest_player_holding_wanted_item");
   public static final btk<Boolean> au = a("ate_recently");
   public static final btk<ht> av = a("nearest_repellent");
   public static final btk<Boolean> aw = a("pacified");
   public static final btk<bkj> ax = a("roar_target");
   public static final btk<ht> ay = a("disturbance_location");
   public static final btk<atz> az = a("recent_projectile", Codec.unit(atz.a));
   public static final btk<atz> aA = a("is_sniffing", Codec.unit(atz.a));
   public static final btk<atz> aB = a("is_emerging", Codec.unit(atz.a));
   public static final btk<atz> aC = a("roar_sound_delay", Codec.unit(atz.a));
   public static final btk<atz> aD = a("dig_cooldown", Codec.unit(atz.a));
   public static final btk<atz> aE = a("roar_sound_cooldown", Codec.unit(atz.a));
   public static final btk<atz> aF = a("sniff_cooldown", Codec.unit(atz.a));
   public static final btk<atz> aG = a("touch_cooldown", Codec.unit(atz.a));
   public static final btk<atz> aH = a("vibration_cooldown", Codec.unit(atz.a));
   public static final btk<atz> aI = a("sonic_boom_cooldown", Codec.unit(atz.a));
   public static final btk<atz> aJ = a("sonic_boom_sound_cooldown", Codec.unit(atz.a));
   public static final btk<atz> aK = a("sonic_boom_sound_delay", Codec.unit(atz.a));
   public static final btk<UUID> aL = a("liked_player", iv.a);
   public static final btk<ia> aM = a("liked_noteblock", ia.a);
   public static final btk<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final btk<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final btk<List<ia>> aP = a("sniffer_explored_positions", Codec.list(ia.a));
   public static final btk<ht> aQ = a("sniffer_sniffing_target");
   public static final btk<Boolean> aR = a("sniffer_digging");
   public static final btk<Boolean> aS = a("sniffer_happy");
   private final Optional<Codec<btj<U>>> aT;

   @VisibleForTesting
   public btk(Optional<Codec<U>> $$0) {
      this.aT = $$0.map(btj::a);
   }

   @Override
   public String toString() {
      return jy.C.b(this).toString();
   }

   public Optional<Codec<btj<U>>> a() {
      return this.aT;
   }

   private static <U> btk<U> a(String $$0, Codec<U> $$1) {
      return io.a(jy.C, new afw($$0), new btk<>(Optional.of($$1)));
   }

   private static <U> btk<U> a(String $$0) {
      return io.a(jy.C, new afw($$0), new btk<>(Optional.empty()));
   }
}
