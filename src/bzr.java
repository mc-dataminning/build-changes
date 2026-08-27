import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bzr<U> {
   public static final bzr<Void> a = a("dummy");
   public static final bzr<ik> b = a("home", ik.b);
   public static final bzr<ik> c = a("job_site", ik.b);
   public static final bzr<ik> d = a("potential_job_site", ik.b);
   public static final bzr<ik> e = a("meeting_point", ik.b);
   public static final bzr<List<ik>> f = a("secondary_job_site");
   public static final bzr<List<bqo>> g = a("mobs");
   public static final bzr<bzt> h = a("visible_mobs");
   public static final bzr<List<bqo>> i = a("visible_villager_babies");
   public static final bzr<List<cjt>> j = a("nearest_players");
   public static final bzr<cjt> k = a("nearest_visible_player");
   public static final bzr<cjt> l = a("nearest_visible_targetable_player");
   public static final bzr<bzu> m = a("walk_target");
   public static final bzr<btu> n = a("look_target");
   public static final bzr<bqo> o = a("attack_target");
   public static final bzr<Boolean> p = a("attack_cooling_down");
   public static final bzr<bqo> q = a("interaction_target");
   public static final bzr<bpp> r = a("breed_target");
   public static final bzr<bpv> s = a("ride_target");
   public static final bzr<elg> t = a("path");
   public static final bzr<List<ik>> u = a("interactable_doors");
   public static final bzr<Set<ik>> v = a("doors_to_close");
   public static final bzr<ib> w = a("nearest_bed");
   public static final bzr<bot> x = a("hurt_by");
   public static final bzr<bqo> y = a("hurt_by_entity");
   public static final bzr<bqo> z = a("avoid_target");
   public static final bzr<bqo> A = a("nearest_hostile");
   public static final bzr<bqo> B = a("nearest_attackable");
   public static final bzr<ik> C = a("hiding_place");
   public static final bzr<Long> D = a("heard_bell_time");
   public static final bzr<Long> E = a("cant_reach_walk_target_since");
   public static final bzr<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bzr<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final bzr<Long> H = a("last_slept", Codec.LONG);
   public static final bzr<Long> I = a("last_woken", Codec.LONG);
   public static final bzr<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final bzr<bpp> K = a("nearest_visible_adult");
   public static final bzr<cgd> L = a("nearest_visible_wanted_item");
   public static final bzr<bqq> M = a("nearest_visible_nemesis");
   public static final bzr<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final bzr<cjt> O = a("tempting_player");
   public static final bzr<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final bzr<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final bzr<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final bzr<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final bzr<Boolean> T = a("long_jump_mid_jump");
   public static final bzr<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final bzr<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final bzr<esa> W = a("ram_target");
   public static final bzr<aym> X = a("is_in_water", Codec.unit(aym.a));
   public static final bzr<aym> Y = a("is_pregnant", Codec.unit(aym.a));
   public static final bzr<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final bzr<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final bzr<UUID> ab = a("angry_at", jf.a);
   public static final bzr<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final bzr<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final bzr<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final bzr<Boolean> af = a("disable_walk_to_admire_item");
   public static final bzr<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final bzr<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final bzr<ib> ai = a("celebrate_location");
   public static final bzr<Boolean> aj = a("dancing");
   public static final bzr<cid> ak = a("nearest_visible_huntable_hoglin");
   public static final bzr<cid> al = a("nearest_visible_baby_hoglin");
   public static final bzr<cjt> am = a("nearest_targetable_player_not_wearing_gold");
   public static final bzr<List<cii>> an = a("nearby_adult_piglins");
   public static final bzr<List<cii>> ao = a("nearest_visible_adult_piglins");
   public static final bzr<List<cid>> ap = a("nearest_visible_adult_hoglins");
   public static final bzr<cii> aq = a("nearest_visible_adult_piglin");
   public static final bzr<bqo> ar = a("nearest_visible_zombified");
   public static final bzr<Integer> as = a("visible_adult_piglin_count");
   public static final bzr<Integer> at = a("visible_adult_hoglin_count");
   public static final bzr<cjt> au = a("nearest_player_holding_wanted_item");
   public static final bzr<Boolean> av = a("ate_recently");
   public static final bzr<ib> aw = a("nearest_repellent");
   public static final bzr<Boolean> ax = a("pacified");
   public static final bzr<bqo> ay = a("roar_target");
   public static final bzr<ib> az = a("disturbance_location");
   public static final bzr<aym> aA = a("recent_projectile", Codec.unit(aym.a));
   public static final bzr<aym> aB = a("is_sniffing", Codec.unit(aym.a));
   public static final bzr<aym> aC = a("is_emerging", Codec.unit(aym.a));
   public static final bzr<aym> aD = a("roar_sound_delay", Codec.unit(aym.a));
   public static final bzr<aym> aE = a("dig_cooldown", Codec.unit(aym.a));
   public static final bzr<aym> aF = a("roar_sound_cooldown", Codec.unit(aym.a));
   public static final bzr<aym> aG = a("sniff_cooldown", Codec.unit(aym.a));
   public static final bzr<aym> aH = a("touch_cooldown", Codec.unit(aym.a));
   public static final bzr<aym> aI = a("vibration_cooldown", Codec.unit(aym.a));
   public static final bzr<aym> aJ = a("sonic_boom_cooldown", Codec.unit(aym.a));
   public static final bzr<aym> aK = a("sonic_boom_sound_cooldown", Codec.unit(aym.a));
   public static final bzr<aym> aL = a("sonic_boom_sound_delay", Codec.unit(aym.a));
   public static final bzr<UUID> aM = a("liked_player", jf.a);
   public static final bzr<ik> aN = a("liked_noteblock", ik.b);
   public static final bzr<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bzr<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bzr<List<ik>> aQ = a("sniffer_explored_positions", Codec.list(ik.b));
   public static final bzr<ib> aR = a("sniffer_sniffing_target");
   public static final bzr<Boolean> aS = a("sniffer_digging");
   public static final bzr<Boolean> aT = a("sniffer_happy");
   public static final bzr<aym> aU = a("breeze_jump_cooldown", Codec.unit(aym.a));
   public static final bzr<aym> aV = a("breeze_shoot", Codec.unit(aym.a));
   public static final bzr<aym> aW = a("breeze_shoot_charging", Codec.unit(aym.a));
   public static final bzr<aym> aX = a("breeze_shoot_recover", Codec.unit(aym.a));
   public static final bzr<aym> aY = a("breeze_shoot_cooldown", Codec.unit(aym.a));
   public static final bzr<aym> aZ = a("breeze_jump_inhaling", Codec.unit(aym.a));
   public static final bzr<ib> ba = a("breeze_jump_target", ib.a);
   public static final bzr<aym> bb = a("breeze_leaving_water", Codec.unit(aym.a));
   private final Optional<Codec<bzq<U>>> bc;

   @VisibleForTesting
   public bzr(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(bzq::a);
   }

   @Override
   public String toString() {
      return kr.B.b(this).toString();
   }

   public Optional<Codec<bzq<U>>> a() {
      return this.bc;
   }

   private static <U> bzr<U> a(String $$0, Codec<U> $$1) {
      return iy.a(kr.B, new ajt($$0), new bzr<>(Optional.of($$1)));
   }

   private static <U> bzr<U> a(String $$0) {
      return iy.a(kr.B, new ajt($$0), new bzr<>(Optional.empty()));
   }
}
