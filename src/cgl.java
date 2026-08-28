import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cgl<U> {
   public static final cgl<Void> a = a("dummy");
   public static final cgl<je> b = a("home", je.b);
   public static final cgl<je> c = a("job_site", je.b);
   public static final cgl<je> d = a("potential_job_site", je.b);
   public static final cgl<je> e = a("meeting_point", je.b);
   public static final cgl<List<je>> f = a("secondary_job_site");
   public static final cgl<List<bxj>> g = a("mobs");
   public static final cgl<cgn> h = a("visible_mobs");
   public static final cgl<List<bxj>> i = a("visible_villager_babies");
   public static final cgl<List<crj>> j = a("nearest_players");
   public static final cgl<crj> k = a("nearest_visible_player");
   public static final cgl<crj> l = a("nearest_visible_targetable_player");
   public static final cgl<List<crj>> m = a("nearest_visible_targetable_players");
   public static final cgl<cgo> n = a("walk_target");
   public static final cgl<cao> o = a("look_target");
   public static final cgl<bxj> p = a("attack_target");
   public static final cgl<Boolean> q = a("attack_cooling_down");
   public static final cgl<bxj> r = a("interaction_target");
   public static final cgl<bvy> s = a("breed_target");
   public static final cgl<bwi> t = a("ride_target");
   public static final cgl<exj> u = a("path");
   public static final cgl<List<je>> v = a("interactable_doors");
   public static final cgl<Set<je>> w = a("doors_to_close");
   public static final cgl<iv> x = a("nearest_bed");
   public static final cgl<bux> y = a("hurt_by");
   public static final cgl<bxj> z = a("hurt_by_entity");
   public static final cgl<bxj> A = a("avoid_target");
   public static final cgl<bxj> B = a("nearest_hostile");
   public static final cgl<bxj> C = a("nearest_attackable");
   public static final cgl<je> D = a("hiding_place");
   public static final cgl<Long> E = a("heard_bell_time");
   public static final cgl<Long> F = a("cant_reach_walk_target_since");
   public static final cgl<Boolean> G = a("golem_detected_recently", Codec.BOOL);
   public static final cgl<Boolean> H = a("danger_detected_recently", Codec.BOOL);
   public static final cgl<Long> I = a("last_slept", Codec.LONG);
   public static final cgl<Long> J = a("last_woken", Codec.LONG);
   public static final cgl<Long> K = a("last_worked_at_poi", Codec.LONG);
   public static final cgl<bvy> L = a("nearest_visible_adult");
   public static final cgl<cno> M = a("nearest_visible_wanted_item");
   public static final cgl<bxl> N = a("nearest_visible_nemesis");
   public static final cgl<Integer> O = a("play_dead_ticks", Codec.INT);
   public static final cgl<crj> P = a("tempting_player");
   public static final cgl<Integer> Q = a("temptation_cooldown_ticks", Codec.INT);
   public static final cgl<Integer> R = a("gaze_cooldown_ticks", Codec.INT);
   public static final cgl<Boolean> S = a("is_tempted", Codec.BOOL);
   public static final cgl<Integer> T = a("long_jump_cooling_down", Codec.INT);
   public static final cgl<Boolean> U = a("long_jump_mid_jump");
   public static final cgl<Boolean> V = a("has_hunting_cooldown", Codec.BOOL);
   public static final cgl<Integer> W = a("ram_cooldown_ticks", Codec.INT);
   public static final cgl<fex> X = a("ram_target");
   public static final cgl<bau> Y = a("is_in_water", bau.b);
   public static final cgl<bau> Z = a("is_pregnant", bau.b);
   public static final cgl<Boolean> aa = a("is_panicking", Codec.BOOL);
   public static final cgl<List<UUID>> ab = a("unreachable_tongue_targets");
   public static final cgl<UUID> ac = a("angry_at", jz.a);
   public static final cgl<Boolean> ad = a("universal_anger", Codec.BOOL);
   public static final cgl<Boolean> ae = a("admiring_item", Codec.BOOL);
   public static final cgl<Integer> af = a("time_trying_to_reach_admire_item");
   public static final cgl<Boolean> ag = a("disable_walk_to_admire_item");
   public static final cgl<Boolean> ah = a("admiring_disabled", Codec.BOOL);
   public static final cgl<Boolean> ai = a("hunted_recently", Codec.BOOL);
   public static final cgl<iv> aj = a("celebrate_location");
   public static final cgl<Boolean> ak = a("dancing");
   public static final cgl<cps> al = a("nearest_visible_huntable_hoglin");
   public static final cgl<cps> am = a("nearest_visible_baby_hoglin");
   public static final cgl<crj> an = a("nearest_targetable_player_not_wearing_gold");
   public static final cgl<List<cpx>> ao = a("nearby_adult_piglins");
   public static final cgl<List<cpx>> ap = a("nearest_visible_adult_piglins");
   public static final cgl<List<cps>> aq = a("nearest_visible_adult_hoglins");
   public static final cgl<cpx> ar = a("nearest_visible_adult_piglin");
   public static final cgl<bxj> as = a("nearest_visible_zombified");
   public static final cgl<Integer> at = a("visible_adult_piglin_count");
   public static final cgl<Integer> au = a("visible_adult_hoglin_count");
   public static final cgl<crj> av = a("nearest_player_holding_wanted_item");
   public static final cgl<Boolean> aw = a("ate_recently");
   public static final cgl<iv> ax = a("nearest_repellent");
   public static final cgl<Boolean> ay = a("pacified");
   public static final cgl<bxj> az = a("roar_target");
   public static final cgl<iv> aA = a("disturbance_location");
   public static final cgl<bau> aB = a("recent_projectile", bau.b);
   public static final cgl<bau> aC = a("is_sniffing", bau.b);
   public static final cgl<bau> aD = a("is_emerging", bau.b);
   public static final cgl<bau> aE = a("roar_sound_delay", bau.b);
   public static final cgl<bau> aF = a("dig_cooldown", bau.b);
   public static final cgl<bau> aG = a("roar_sound_cooldown", bau.b);
   public static final cgl<bau> aH = a("sniff_cooldown", bau.b);
   public static final cgl<bau> aI = a("touch_cooldown", bau.b);
   public static final cgl<bau> aJ = a("vibration_cooldown", bau.b);
   public static final cgl<bau> aK = a("sonic_boom_cooldown", bau.b);
   public static final cgl<bau> aL = a("sonic_boom_sound_cooldown", bau.b);
   public static final cgl<bau> aM = a("sonic_boom_sound_delay", bau.b);
   public static final cgl<UUID> aN = a("liked_player", jz.a);
   public static final cgl<je> aO = a("liked_noteblock", je.b);
   public static final cgl<Integer> aP = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cgl<Integer> aQ = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cgl<List<je>> aR = a("sniffer_explored_positions", Codec.list(je.b));
   public static final cgl<iv> aS = a("sniffer_sniffing_target");
   public static final cgl<Boolean> aT = a("sniffer_digging");
   public static final cgl<Boolean> aU = a("sniffer_happy");
   public static final cgl<bau> aV = a("breeze_jump_cooldown", bau.b);
   public static final cgl<bau> aW = a("breeze_shoot", bau.b);
   public static final cgl<bau> aX = a("breeze_shoot_charging", bau.b);
   public static final cgl<bau> aY = a("breeze_shoot_recover", bau.b);
   public static final cgl<bau> aZ = a("breeze_shoot_cooldown", bau.b);
   public static final cgl<bau> ba = a("breeze_jump_inhaling", bau.b);
   public static final cgl<iv> bb = a("breeze_jump_target", iv.a);
   public static final cgl<bau> bc = a("breeze_leaving_water", bau.b);
   private final Optional<Codec<cgk<U>>> bd;

   @VisibleForTesting
   public cgl(Optional<Codec<U>> $$0) {
      this.bd = $$0.map(cgk::a);
   }

   @Override
   public String toString() {
      return mg.z.b(this).toString();
   }

   public Optional<Codec<cgk<U>>> a() {
      return this.bd;
   }

   private static <U> cgl<U> a(String $$0, Codec<U> $$1) {
      return js.a(mg.z, alg.b($$0), new cgl<>(Optional.of($$1)));
   }

   private static <U> cgl<U> a(String $$0) {
      return js.a(mg.z, alg.b($$0), new cgl<>(Optional.empty()));
   }
}
