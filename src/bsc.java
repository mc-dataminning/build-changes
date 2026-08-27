import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bsc<U> {
   public static final bsc<Void> a = a("dummy");
   public static final bsc<hf> b = a("home", hf.a);
   public static final bsc<hf> c = a("job_site", hf.a);
   public static final bsc<hf> d = a("potential_job_site", hf.a);
   public static final bsc<hf> e = a("meeting_point", hf.a);
   public static final bsc<List<hf>> f = a("secondary_job_site");
   public static final bsc<List<bjb>> g = a("mobs");
   public static final bsc<bse> h = a("visible_mobs");
   public static final bsc<List<bjb>> i = a("visible_villager_babies");
   public static final bsc<List<cbp>> j = a("nearest_players");
   public static final bsc<cbp> k = a("nearest_visible_player");
   public static final bsc<cbp> l = a("nearest_visible_targetable_player");
   public static final bsc<bsf> m = a("walk_target");
   public static final bsc<bmf> n = a("look_target");
   public static final bsc<bjb> o = a("attack_target");
   public static final bsc<Boolean> p = a("attack_cooling_down");
   public static final bsc<bjb> q = a("interaction_target");
   public static final bsc<big> r = a("breed_target");
   public static final bsc<bil> s = a("ride_target");
   public static final bsc<eaw> t = a("path");
   public static final bsc<List<hf>> u = a("interactable_doors");
   public static final bsc<Set<hf>> v = a("doors_to_close");
   public static final bsc<gw> w = a("nearest_bed");
   public static final bsc<bhj> x = a("hurt_by");
   public static final bsc<bjb> y = a("hurt_by_entity");
   public static final bsc<bjb> z = a("avoid_target");
   public static final bsc<bjb> A = a("nearest_hostile");
   public static final bsc<bjb> B = a("nearest_attackable");
   public static final bsc<hf> C = a("hiding_place");
   public static final bsc<Long> D = a("heard_bell_time");
   public static final bsc<Long> E = a("cant_reach_walk_target_since");
   public static final bsc<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bsc<Long> G = a("last_slept", Codec.LONG);
   public static final bsc<Long> H = a("last_woken", Codec.LONG);
   public static final bsc<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bsc<big> J = a("nearest_visible_adult");
   public static final bsc<byi> K = a("nearest_visible_wanted_item");
   public static final bsc<bjd> L = a("nearest_visible_nemesis");
   public static final bsc<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bsc<cbp> N = a("tempting_player");
   public static final bsc<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bsc<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final bsc<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final bsc<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final bsc<Boolean> S = a("long_jump_mid_jump");
   public static final bsc<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final bsc<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final bsc<ehi> V = a("ram_target");
   public static final bsc<ass> W = a("is_in_water", Codec.unit(ass.a));
   public static final bsc<ass> X = a("is_pregnant", Codec.unit(ass.a));
   public static final bsc<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final bsc<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final bsc<UUID> aa = a("angry_at", ia.a);
   public static final bsc<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final bsc<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final bsc<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final bsc<Boolean> ae = a("disable_walk_to_admire_item");
   public static final bsc<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final bsc<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final bsc<gw> ah = a("celebrate_location");
   public static final bsc<Boolean> ai = a("dancing");
   public static final bsc<bzz> aj = a("nearest_visible_huntable_hoglin");
   public static final bsc<bzz> ak = a("nearest_visible_baby_hoglin");
   public static final bsc<cbp> al = a("nearest_targetable_player_not_wearing_gold");
   public static final bsc<List<cae>> am = a("nearby_adult_piglins");
   public static final bsc<List<cae>> an = a("nearest_visible_adult_piglins");
   public static final bsc<List<bzz>> ao = a("nearest_visible_adult_hoglins");
   public static final bsc<cae> ap = a("nearest_visible_adult_piglin");
   public static final bsc<bjb> aq = a("nearest_visible_zombified");
   public static final bsc<Integer> ar = a("visible_adult_piglin_count");
   public static final bsc<Integer> as = a("visible_adult_hoglin_count");
   public static final bsc<cbp> at = a("nearest_player_holding_wanted_item");
   public static final bsc<Boolean> au = a("ate_recently");
   public static final bsc<gw> av = a("nearest_repellent");
   public static final bsc<Boolean> aw = a("pacified");
   public static final bsc<bjb> ax = a("roar_target");
   public static final bsc<gw> ay = a("disturbance_location");
   public static final bsc<ass> az = a("recent_projectile", Codec.unit(ass.a));
   public static final bsc<ass> aA = a("is_sniffing", Codec.unit(ass.a));
   public static final bsc<ass> aB = a("is_emerging", Codec.unit(ass.a));
   public static final bsc<ass> aC = a("roar_sound_delay", Codec.unit(ass.a));
   public static final bsc<ass> aD = a("dig_cooldown", Codec.unit(ass.a));
   public static final bsc<ass> aE = a("roar_sound_cooldown", Codec.unit(ass.a));
   public static final bsc<ass> aF = a("sniff_cooldown", Codec.unit(ass.a));
   public static final bsc<ass> aG = a("touch_cooldown", Codec.unit(ass.a));
   public static final bsc<ass> aH = a("vibration_cooldown", Codec.unit(ass.a));
   public static final bsc<ass> aI = a("sonic_boom_cooldown", Codec.unit(ass.a));
   public static final bsc<ass> aJ = a("sonic_boom_sound_cooldown", Codec.unit(ass.a));
   public static final bsc<ass> aK = a("sonic_boom_sound_delay", Codec.unit(ass.a));
   public static final bsc<UUID> aL = a("liked_player", ia.a);
   public static final bsc<hf> aM = a("liked_noteblock", hf.a);
   public static final bsc<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bsc<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bsc<List<hf>> aP = a("sniffer_explored_positions", Codec.list(hf.a));
   public static final bsc<gw> aQ = a("sniffer_sniffing_target");
   public static final bsc<Boolean> aR = a("sniffer_digging");
   public static final bsc<Boolean> aS = a("sniffer_happy");
   private final Optional<Codec<bsb<U>>> aT;

   @VisibleForTesting
   public bsc(Optional<Codec<U>> $$0) {
      this.aT = $$0.map(bsb::a);
   }

   @Override
   public String toString() {
      return jd.C.b(this).toString();
   }

   public Optional<Codec<bsb<U>>> a() {
      return this.aT;
   }

   private static <U> bsc<U> a(String $$0, Codec<U> $$1) {
      return ht.a(jd.C, new aeu($$0), new bsc<>(Optional.of($$1)));
   }

   private static <U> bsc<U> a(String $$0) {
      return ht.a(jd.C, new aeu($$0), new bsc<>(Optional.empty()));
   }
}
