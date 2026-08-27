import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bpb<U> {
   public static final bpb<Void> a = a("dummy");
   public static final bpb<hd> b = a("home", hd.a);
   public static final bpb<hd> c = a("job_site", hd.a);
   public static final bpb<hd> d = a("potential_job_site", hd.a);
   public static final bpb<hd> e = a("meeting_point", hd.a);
   public static final bpb<List<hd>> f = a("secondary_job_site");
   public static final bpb<List<bfz>> g = a("mobs");
   public static final bpb<bpd> h = a("visible_mobs");
   public static final bpb<List<bfz>> i = a("visible_villager_babies");
   public static final bpb<List<byo>> j = a("nearest_players");
   public static final bpb<byo> k = a("nearest_visible_player");
   public static final bpb<byo> l = a("nearest_visible_targetable_player");
   public static final bpb<bpe> m = a("walk_target");
   public static final bpb<bje> n = a("look_target");
   public static final bpb<bfz> o = a("attack_target");
   public static final bpb<Boolean> p = a("attack_cooling_down");
   public static final bpb<bfz> q = a("interaction_target");
   public static final bpb<bfe> r = a("breed_target");
   public static final bpb<bfj> s = a("ride_target");
   public static final bpb<dxt> t = a("path");
   public static final bpb<List<hd>> u = a("interactable_doors");
   public static final bpb<Set<hd>> v = a("doors_to_close");
   public static final bpb<gu> w = a("nearest_bed");
   public static final bpb<ben> x = a("hurt_by");
   public static final bpb<bfz> y = a("hurt_by_entity");
   public static final bpb<bfz> z = a("avoid_target");
   public static final bpb<bfz> A = a("nearest_hostile");
   public static final bpb<bfz> B = a("nearest_attackable");
   public static final bpb<hd> C = a("hiding_place");
   public static final bpb<Long> D = a("heard_bell_time");
   public static final bpb<Long> E = a("cant_reach_walk_target_since");
   public static final bpb<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bpb<Long> G = a("last_slept", Codec.LONG);
   public static final bpb<Long> H = a("last_woken", Codec.LONG);
   public static final bpb<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bpb<bfe> J = a("nearest_visible_adult");
   public static final bpb<bvh> K = a("nearest_visible_wanted_item");
   public static final bpb<bgb> L = a("nearest_visible_nemesis");
   public static final bpb<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bpb<byo> N = a("tempting_player");
   public static final bpb<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bpb<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final bpb<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final bpb<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final bpb<Boolean> S = a("long_jump_mid_jump");
   public static final bpb<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final bpb<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final bpb<eei> V = a("ram_target");
   public static final bpb<apz> W = a("is_in_water", Codec.unit(apz.a));
   public static final bpb<apz> X = a("is_pregnant", Codec.unit(apz.a));
   public static final bpb<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final bpb<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final bpb<UUID> aa = a("angry_at", hy.a);
   public static final bpb<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final bpb<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final bpb<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final bpb<Boolean> ae = a("disable_walk_to_admire_item");
   public static final bpb<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final bpb<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final bpb<gu> ah = a("celebrate_location");
   public static final bpb<Boolean> ai = a("dancing");
   public static final bpb<bwy> aj = a("nearest_visible_huntable_hoglin");
   public static final bpb<bwy> ak = a("nearest_visible_baby_hoglin");
   public static final bpb<byo> al = a("nearest_targetable_player_not_wearing_gold");
   public static final bpb<List<bxd>> am = a("nearby_adult_piglins");
   public static final bpb<List<bxd>> an = a("nearest_visible_adult_piglins");
   public static final bpb<List<bwy>> ao = a("nearest_visible_adult_hoglins");
   public static final bpb<bxd> ap = a("nearest_visible_adult_piglin");
   public static final bpb<bfz> aq = a("nearest_visible_zombified");
   public static final bpb<Integer> ar = a("visible_adult_piglin_count");
   public static final bpb<Integer> as = a("visible_adult_hoglin_count");
   public static final bpb<byo> at = a("nearest_player_holding_wanted_item");
   public static final bpb<Boolean> au = a("ate_recently");
   public static final bpb<gu> av = a("nearest_repellent");
   public static final bpb<Boolean> aw = a("pacified");
   public static final bpb<bfz> ax = a("roar_target");
   public static final bpb<gu> ay = a("disturbance_location");
   public static final bpb<apz> az = a("recent_projectile", Codec.unit(apz.a));
   public static final bpb<apz> aA = a("is_sniffing", Codec.unit(apz.a));
   public static final bpb<apz> aB = a("is_emerging", Codec.unit(apz.a));
   public static final bpb<apz> aC = a("roar_sound_delay", Codec.unit(apz.a));
   public static final bpb<apz> aD = a("dig_cooldown", Codec.unit(apz.a));
   public static final bpb<apz> aE = a("roar_sound_cooldown", Codec.unit(apz.a));
   public static final bpb<apz> aF = a("sniff_cooldown", Codec.unit(apz.a));
   public static final bpb<apz> aG = a("touch_cooldown", Codec.unit(apz.a));
   public static final bpb<apz> aH = a("vibration_cooldown", Codec.unit(apz.a));
   public static final bpb<apz> aI = a("sonic_boom_cooldown", Codec.unit(apz.a));
   public static final bpb<apz> aJ = a("sonic_boom_sound_cooldown", Codec.unit(apz.a));
   public static final bpb<apz> aK = a("sonic_boom_sound_delay", Codec.unit(apz.a));
   public static final bpb<UUID> aL = a("liked_player", hy.a);
   public static final bpb<hd> aM = a("liked_noteblock", hd.a);
   public static final bpb<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bpb<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bpb<List<hd>> aP = a("sniffer_explored_positions", Codec.list(hd.a));
   public static final bpb<gu> aQ = a("sniffer_sniffing_target");
   public static final bpb<Boolean> aR = a("sniffer_digging");
   public static final bpb<Boolean> aS = a("sniffer_happy");
   private final Optional<Codec<bpa<U>>> aT;

   @VisibleForTesting
   public bpb(Optional<Codec<U>> $$0) {
      this.aT = $$0.map(bpa::a);
   }

   @Override
   public String toString() {
      return jb.C.b(this).toString();
   }

   public Optional<Codec<bpa<U>>> a() {
      return this.aT;
   }

   private static <U> bpb<U> a(String $$0, Codec<U> $$1) {
      return hr.a(jb.C, new acq($$0), new bpb<>(Optional.of($$1)));
   }

   private static <U> bpb<U> a(String $$0) {
      return hr.a(jb.C, new acq($$0), new bpb<>(Optional.empty()));
   }
}
