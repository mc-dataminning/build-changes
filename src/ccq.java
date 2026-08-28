import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class ccq<U> {
   public static final ccq<Void> a = a("dummy");
   public static final ccq<jl> b = a("home", jl.b);
   public static final ccq<jl> c = a("job_site", jl.b);
   public static final ccq<jl> d = a("potential_job_site", jl.b);
   public static final ccq<jl> e = a("meeting_point", jl.b);
   public static final ccq<List<jl>> f = a("secondary_job_site");
   public static final ccq<List<btl>> g = a("mobs");
   public static final ccq<ccs> h = a("visible_mobs");
   public static final ccq<List<btl>> i = a("visible_villager_babies");
   public static final ccq<List<cmv>> j = a("nearest_players");
   public static final ccq<cmv> k = a("nearest_visible_player");
   public static final ccq<cmv> l = a("nearest_visible_targetable_player");
   public static final ccq<cct> m = a("walk_target");
   public static final ccq<bwt> n = a("look_target");
   public static final ccq<btl> o = a("attack_target");
   public static final ccq<Boolean> p = a("attack_cooling_down");
   public static final ccq<btl> q = a("interaction_target");
   public static final ccq<bsk> r = a("breed_target");
   public static final ccq<bsq> s = a("ride_target");
   public static final ccq<epm> t = a("path");
   public static final ccq<List<jl>> u = a("interactable_doors");
   public static final ccq<Set<jl>> v = a("doors_to_close");
   public static final ccq<jd> w = a("nearest_bed");
   public static final ccq<brj> x = a("hurt_by");
   public static final ccq<btl> y = a("hurt_by_entity");
   public static final ccq<btl> z = a("avoid_target");
   public static final ccq<btl> A = a("nearest_hostile");
   public static final ccq<btl> B = a("nearest_attackable");
   public static final ccq<jl> C = a("hiding_place");
   public static final ccq<Long> D = a("heard_bell_time");
   public static final ccq<Long> E = a("cant_reach_walk_target_since");
   public static final ccq<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final ccq<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final ccq<Long> H = a("last_slept", Codec.LONG);
   public static final ccq<Long> I = a("last_woken", Codec.LONG);
   public static final ccq<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final ccq<bsk> K = a("nearest_visible_adult");
   public static final ccq<cjf> L = a("nearest_visible_wanted_item");
   public static final ccq<btn> M = a("nearest_visible_nemesis");
   public static final ccq<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final ccq<cmv> O = a("tempting_player");
   public static final ccq<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final ccq<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final ccq<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final ccq<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final ccq<Boolean> T = a("long_jump_mid_jump");
   public static final ccq<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final ccq<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final ccq<eww> W = a("ram_target");
   public static final ccq<azr> X = a("is_in_water", azr.b);
   public static final ccq<azr> Y = a("is_pregnant", azr.b);
   public static final ccq<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final ccq<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final ccq<UUID> ab = a("angry_at", kg.a);
   public static final ccq<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final ccq<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final ccq<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final ccq<Boolean> af = a("disable_walk_to_admire_item");
   public static final ccq<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final ccq<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final ccq<jd> ai = a("celebrate_location");
   public static final ccq<Boolean> aj = a("dancing");
   public static final ccq<clf> ak = a("nearest_visible_huntable_hoglin");
   public static final ccq<clf> al = a("nearest_visible_baby_hoglin");
   public static final ccq<cmv> am = a("nearest_targetable_player_not_wearing_gold");
   public static final ccq<List<clk>> an = a("nearby_adult_piglins");
   public static final ccq<List<clk>> ao = a("nearest_visible_adult_piglins");
   public static final ccq<List<clf>> ap = a("nearest_visible_adult_hoglins");
   public static final ccq<clk> aq = a("nearest_visible_adult_piglin");
   public static final ccq<btl> ar = a("nearest_visible_zombified");
   public static final ccq<Integer> as = a("visible_adult_piglin_count");
   public static final ccq<Integer> at = a("visible_adult_hoglin_count");
   public static final ccq<cmv> au = a("nearest_player_holding_wanted_item");
   public static final ccq<Boolean> av = a("ate_recently");
   public static final ccq<jd> aw = a("nearest_repellent");
   public static final ccq<Boolean> ax = a("pacified");
   public static final ccq<btl> ay = a("roar_target");
   public static final ccq<jd> az = a("disturbance_location");
   public static final ccq<azr> aA = a("recent_projectile", azr.b);
   public static final ccq<azr> aB = a("is_sniffing", azr.b);
   public static final ccq<azr> aC = a("is_emerging", azr.b);
   public static final ccq<azr> aD = a("roar_sound_delay", azr.b);
   public static final ccq<azr> aE = a("dig_cooldown", azr.b);
   public static final ccq<azr> aF = a("roar_sound_cooldown", azr.b);
   public static final ccq<azr> aG = a("sniff_cooldown", azr.b);
   public static final ccq<azr> aH = a("touch_cooldown", azr.b);
   public static final ccq<azr> aI = a("vibration_cooldown", azr.b);
   public static final ccq<azr> aJ = a("sonic_boom_cooldown", azr.b);
   public static final ccq<azr> aK = a("sonic_boom_sound_cooldown", azr.b);
   public static final ccq<azr> aL = a("sonic_boom_sound_delay", azr.b);
   public static final ccq<UUID> aM = a("liked_player", kg.a);
   public static final ccq<jl> aN = a("liked_noteblock", jl.b);
   public static final ccq<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final ccq<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final ccq<List<jl>> aQ = a("sniffer_explored_positions", Codec.list(jl.b));
   public static final ccq<jd> aR = a("sniffer_sniffing_target");
   public static final ccq<Boolean> aS = a("sniffer_digging");
   public static final ccq<Boolean> aT = a("sniffer_happy");
   public static final ccq<azr> aU = a("breeze_jump_cooldown", azr.b);
   public static final ccq<azr> aV = a("breeze_shoot", azr.b);
   public static final ccq<azr> aW = a("breeze_shoot_charging", azr.b);
   public static final ccq<azr> aX = a("breeze_shoot_recover", azr.b);
   public static final ccq<azr> aY = a("breeze_shoot_cooldown", azr.b);
   public static final ccq<azr> aZ = a("breeze_jump_inhaling", azr.b);
   public static final ccq<jd> ba = a("breeze_jump_target", jd.a);
   public static final ccq<azr> bb = a("breeze_leaving_water", azr.b);
   private final Optional<Codec<ccp<U>>> bc;

   @VisibleForTesting
   public ccq(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(ccp::a);
   }

   @Override
   public String toString() {
      return lt.z.b(this).toString();
   }

   public Optional<Codec<ccp<U>>> a() {
      return this.bc;
   }

   private static <U> ccq<U> a(String $$0, Codec<U> $$1) {
      return jz.a(lt.z, akq.b($$0), new ccq<>(Optional.of($$1)));
   }

   private static <U> ccq<U> a(String $$0) {
      return jz.a(lt.z, akq.b($$0), new ccq<>(Optional.empty()));
   }
}
