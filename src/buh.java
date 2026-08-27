import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class buh<U> {
   public static final buh<Void> a = a("dummy");
   public static final buh<ia> b = a("home", ia.a);
   public static final buh<ia> c = a("job_site", ia.a);
   public static final buh<ia> d = a("potential_job_site", ia.a);
   public static final buh<ia> e = a("meeting_point", ia.a);
   public static final buh<List<ia>> f = a("secondary_job_site");
   public static final buh<List<blg>> g = a("mobs");
   public static final buh<buj> h = a("visible_mobs");
   public static final buh<List<blg>> i = a("visible_villager_babies");
   public static final buh<List<cdu>> j = a("nearest_players");
   public static final buh<cdu> k = a("nearest_visible_player");
   public static final buh<cdu> l = a("nearest_visible_targetable_player");
   public static final buh<buk> m = a("walk_target");
   public static final buh<bok> n = a("look_target");
   public static final buh<blg> o = a("attack_target");
   public static final buh<Boolean> p = a("attack_cooling_down");
   public static final buh<blg> q = a("interaction_target");
   public static final buh<bkl> r = a("breed_target");
   public static final buh<bkq> s = a("ride_target");
   public static final buh<edh> t = a("path");
   public static final buh<List<ia>> u = a("interactable_doors");
   public static final buh<Set<ia>> v = a("doors_to_close");
   public static final buh<ht> w = a("nearest_bed");
   public static final buh<bjo> x = a("hurt_by");
   public static final buh<blg> y = a("hurt_by_entity");
   public static final buh<blg> z = a("avoid_target");
   public static final buh<blg> A = a("nearest_hostile");
   public static final buh<blg> B = a("nearest_attackable");
   public static final buh<ia> C = a("hiding_place");
   public static final buh<Long> D = a("heard_bell_time");
   public static final buh<Long> E = a("cant_reach_walk_target_since");
   public static final buh<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final buh<Long> G = a("last_slept", Codec.LONG);
   public static final buh<Long> H = a("last_woken", Codec.LONG);
   public static final buh<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final buh<bkl> J = a("nearest_visible_adult");
   public static final buh<can> K = a("nearest_visible_wanted_item");
   public static final buh<bli> L = a("nearest_visible_nemesis");
   public static final buh<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final buh<cdu> N = a("tempting_player");
   public static final buh<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final buh<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final buh<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final buh<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final buh<Boolean> S = a("long_jump_mid_jump");
   public static final buh<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final buh<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final buh<eju> V = a("ram_target");
   public static final buh<auo> W = a("is_in_water", Codec.unit(auo.a));
   public static final buh<auo> X = a("is_pregnant", Codec.unit(auo.a));
   public static final buh<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final buh<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final buh<UUID> aa = a("angry_at", iv.a);
   public static final buh<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final buh<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final buh<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final buh<Boolean> ae = a("disable_walk_to_admire_item");
   public static final buh<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final buh<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final buh<ht> ah = a("celebrate_location");
   public static final buh<Boolean> ai = a("dancing");
   public static final buh<cce> aj = a("nearest_visible_huntable_hoglin");
   public static final buh<cce> ak = a("nearest_visible_baby_hoglin");
   public static final buh<cdu> al = a("nearest_targetable_player_not_wearing_gold");
   public static final buh<List<ccj>> am = a("nearby_adult_piglins");
   public static final buh<List<ccj>> an = a("nearest_visible_adult_piglins");
   public static final buh<List<cce>> ao = a("nearest_visible_adult_hoglins");
   public static final buh<ccj> ap = a("nearest_visible_adult_piglin");
   public static final buh<blg> aq = a("nearest_visible_zombified");
   public static final buh<Integer> ar = a("visible_adult_piglin_count");
   public static final buh<Integer> as = a("visible_adult_hoglin_count");
   public static final buh<cdu> at = a("nearest_player_holding_wanted_item");
   public static final buh<Boolean> au = a("ate_recently");
   public static final buh<ht> av = a("nearest_repellent");
   public static final buh<Boolean> aw = a("pacified");
   public static final buh<blg> ax = a("roar_target");
   public static final buh<ht> ay = a("disturbance_location");
   public static final buh<auo> az = a("recent_projectile", Codec.unit(auo.a));
   public static final buh<auo> aA = a("is_sniffing", Codec.unit(auo.a));
   public static final buh<auo> aB = a("is_emerging", Codec.unit(auo.a));
   public static final buh<auo> aC = a("roar_sound_delay", Codec.unit(auo.a));
   public static final buh<auo> aD = a("dig_cooldown", Codec.unit(auo.a));
   public static final buh<auo> aE = a("roar_sound_cooldown", Codec.unit(auo.a));
   public static final buh<auo> aF = a("sniff_cooldown", Codec.unit(auo.a));
   public static final buh<auo> aG = a("touch_cooldown", Codec.unit(auo.a));
   public static final buh<auo> aH = a("vibration_cooldown", Codec.unit(auo.a));
   public static final buh<auo> aI = a("sonic_boom_cooldown", Codec.unit(auo.a));
   public static final buh<auo> aJ = a("sonic_boom_sound_cooldown", Codec.unit(auo.a));
   public static final buh<auo> aK = a("sonic_boom_sound_delay", Codec.unit(auo.a));
   public static final buh<UUID> aL = a("liked_player", iv.a);
   public static final buh<ia> aM = a("liked_noteblock", ia.a);
   public static final buh<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final buh<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final buh<List<ia>> aP = a("sniffer_explored_positions", Codec.list(ia.a));
   public static final buh<ht> aQ = a("sniffer_sniffing_target");
   public static final buh<Boolean> aR = a("sniffer_digging");
   public static final buh<Boolean> aS = a("sniffer_happy");
   private final Optional<Codec<bug<U>>> aT;

   @VisibleForTesting
   public buh(Optional<Codec<U>> $$0) {
      this.aT = $$0.map(bug::a);
   }

   @Override
   public String toString() {
      return jy.C.b(this).toString();
   }

   public Optional<Codec<bug<U>>> a() {
      return this.aT;
   }

   private static <U> buh<U> a(String $$0, Codec<U> $$1) {
      return io.a(jy.C, new agi($$0), new buh<>(Optional.of($$1)));
   }

   private static <U> buh<U> a(String $$0) {
      return io.a(jy.C, new agi($$0), new buh<>(Optional.empty()));
   }
}
