import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class ccs<U> {
   public static final ccs<Void> a = a("dummy");
   public static final ccs<jl> b = a("home", jl.b);
   public static final ccs<jl> c = a("job_site", jl.b);
   public static final ccs<jl> d = a("potential_job_site", jl.b);
   public static final ccs<jl> e = a("meeting_point", jl.b);
   public static final ccs<List<jl>> f = a("secondary_job_site");
   public static final ccs<List<btn>> g = a("mobs");
   public static final ccs<ccu> h = a("visible_mobs");
   public static final ccs<List<btn>> i = a("visible_villager_babies");
   public static final ccs<List<cmx>> j = a("nearest_players");
   public static final ccs<cmx> k = a("nearest_visible_player");
   public static final ccs<cmx> l = a("nearest_visible_targetable_player");
   public static final ccs<ccv> m = a("walk_target");
   public static final ccs<bwv> n = a("look_target");
   public static final ccs<btn> o = a("attack_target");
   public static final ccs<Boolean> p = a("attack_cooling_down");
   public static final ccs<btn> q = a("interaction_target");
   public static final ccs<bsl> r = a("breed_target");
   public static final ccs<bsr> s = a("ride_target");
   public static final ccs<eps> t = a("path");
   public static final ccs<List<jl>> u = a("interactable_doors");
   public static final ccs<Set<jl>> v = a("doors_to_close");
   public static final ccs<jd> w = a("nearest_bed");
   public static final ccs<brk> x = a("hurt_by");
   public static final ccs<btn> y = a("hurt_by_entity");
   public static final ccs<btn> z = a("avoid_target");
   public static final ccs<btn> A = a("nearest_hostile");
   public static final ccs<btn> B = a("nearest_attackable");
   public static final ccs<jl> C = a("hiding_place");
   public static final ccs<Long> D = a("heard_bell_time");
   public static final ccs<Long> E = a("cant_reach_walk_target_since");
   public static final ccs<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final ccs<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final ccs<Long> H = a("last_slept", Codec.LONG);
   public static final ccs<Long> I = a("last_woken", Codec.LONG);
   public static final ccs<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final ccs<bsl> K = a("nearest_visible_adult");
   public static final ccs<cjh> L = a("nearest_visible_wanted_item");
   public static final ccs<btp> M = a("nearest_visible_nemesis");
   public static final ccs<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final ccs<cmx> O = a("tempting_player");
   public static final ccs<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final ccs<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final ccs<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final ccs<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final ccs<Boolean> T = a("long_jump_mid_jump");
   public static final ccs<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final ccs<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final ccs<exc> W = a("ram_target");
   public static final ccs<azs> X = a("is_in_water", azs.b);
   public static final ccs<azs> Y = a("is_pregnant", azs.b);
   public static final ccs<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final ccs<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final ccs<UUID> ab = a("angry_at", kg.a);
   public static final ccs<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final ccs<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final ccs<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final ccs<Boolean> af = a("disable_walk_to_admire_item");
   public static final ccs<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final ccs<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final ccs<jd> ai = a("celebrate_location");
   public static final ccs<Boolean> aj = a("dancing");
   public static final ccs<clh> ak = a("nearest_visible_huntable_hoglin");
   public static final ccs<clh> al = a("nearest_visible_baby_hoglin");
   public static final ccs<cmx> am = a("nearest_targetable_player_not_wearing_gold");
   public static final ccs<List<clm>> an = a("nearby_adult_piglins");
   public static final ccs<List<clm>> ao = a("nearest_visible_adult_piglins");
   public static final ccs<List<clh>> ap = a("nearest_visible_adult_hoglins");
   public static final ccs<clm> aq = a("nearest_visible_adult_piglin");
   public static final ccs<btn> ar = a("nearest_visible_zombified");
   public static final ccs<Integer> as = a("visible_adult_piglin_count");
   public static final ccs<Integer> at = a("visible_adult_hoglin_count");
   public static final ccs<cmx> au = a("nearest_player_holding_wanted_item");
   public static final ccs<Boolean> av = a("ate_recently");
   public static final ccs<jd> aw = a("nearest_repellent");
   public static final ccs<Boolean> ax = a("pacified");
   public static final ccs<btn> ay = a("roar_target");
   public static final ccs<jd> az = a("disturbance_location");
   public static final ccs<azs> aA = a("recent_projectile", azs.b);
   public static final ccs<azs> aB = a("is_sniffing", azs.b);
   public static final ccs<azs> aC = a("is_emerging", azs.b);
   public static final ccs<azs> aD = a("roar_sound_delay", azs.b);
   public static final ccs<azs> aE = a("dig_cooldown", azs.b);
   public static final ccs<azs> aF = a("roar_sound_cooldown", azs.b);
   public static final ccs<azs> aG = a("sniff_cooldown", azs.b);
   public static final ccs<azs> aH = a("touch_cooldown", azs.b);
   public static final ccs<azs> aI = a("vibration_cooldown", azs.b);
   public static final ccs<azs> aJ = a("sonic_boom_cooldown", azs.b);
   public static final ccs<azs> aK = a("sonic_boom_sound_cooldown", azs.b);
   public static final ccs<azs> aL = a("sonic_boom_sound_delay", azs.b);
   public static final ccs<UUID> aM = a("liked_player", kg.a);
   public static final ccs<jl> aN = a("liked_noteblock", jl.b);
   public static final ccs<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final ccs<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final ccs<List<jl>> aQ = a("sniffer_explored_positions", Codec.list(jl.b));
   public static final ccs<jd> aR = a("sniffer_sniffing_target");
   public static final ccs<Boolean> aS = a("sniffer_digging");
   public static final ccs<Boolean> aT = a("sniffer_happy");
   public static final ccs<azs> aU = a("breeze_jump_cooldown", azs.b);
   public static final ccs<azs> aV = a("breeze_shoot", azs.b);
   public static final ccs<azs> aW = a("breeze_shoot_charging", azs.b);
   public static final ccs<azs> aX = a("breeze_shoot_recover", azs.b);
   public static final ccs<azs> aY = a("breeze_shoot_cooldown", azs.b);
   public static final ccs<azs> aZ = a("breeze_jump_inhaling", azs.b);
   public static final ccs<jd> ba = a("breeze_jump_target", jd.a);
   public static final ccs<azs> bb = a("breeze_leaving_water", azs.b);
   private final Optional<Codec<ccr<U>>> bc;

   @VisibleForTesting
   public ccs(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(ccr::a);
   }

   @Override
   public String toString() {
      return lt.z.b(this).toString();
   }

   public Optional<Codec<ccr<U>>> a() {
      return this.bc;
   }

   private static <U> ccs<U> a(String $$0, Codec<U> $$1) {
      return jz.a(lt.z, akr.b($$0), new ccs<>(Optional.of($$1)));
   }

   private static <U> ccs<U> a(String $$0) {
      return jz.a(lt.z, akr.b($$0), new ccs<>(Optional.empty()));
   }
}
