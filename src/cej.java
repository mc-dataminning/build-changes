import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cej<U> {
   public static final cej<Void> a = a("dummy");
   public static final cej<jq> b = a("home", jq.b);
   public static final cej<jq> c = a("job_site", jq.b);
   public static final cej<jq> d = a("potential_job_site", jq.b);
   public static final cej<jq> e = a("meeting_point", jq.b);
   public static final cej<List<jq>> f = a("secondary_job_site");
   public static final cej<List<bvf>> g = a("mobs");
   public static final cej<cel> h = a("visible_mobs");
   public static final cej<List<bvf>> i = a("visible_villager_babies");
   public static final cej<List<cov>> j = a("nearest_players");
   public static final cej<cov> k = a("nearest_visible_player");
   public static final cej<cov> l = a("nearest_visible_targetable_player");
   public static final cej<cem> m = a("walk_target");
   public static final cej<bym> n = a("look_target");
   public static final cej<bvf> o = a("attack_target");
   public static final cej<Boolean> p = a("attack_cooling_down");
   public static final cej<bvf> q = a("interaction_target");
   public static final cej<bua> r = a("breed_target");
   public static final cej<buj> s = a("ride_target");
   public static final cej<etl> t = a("path");
   public static final cej<List<jq>> u = a("interactable_doors");
   public static final cej<Set<jq>> v = a("doors_to_close");
   public static final cej<ji> w = a("nearest_bed");
   public static final cej<bsz> x = a("hurt_by");
   public static final cej<bvf> y = a("hurt_by_entity");
   public static final cej<bvf> z = a("avoid_target");
   public static final cej<bvf> A = a("nearest_hostile");
   public static final cej<bvf> B = a("nearest_attackable");
   public static final cej<jq> C = a("hiding_place");
   public static final cej<Long> D = a("heard_bell_time");
   public static final cej<Long> E = a("cant_reach_walk_target_since");
   public static final cej<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cej<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cej<Long> H = a("last_slept", Codec.LONG);
   public static final cej<Long> I = a("last_woken", Codec.LONG);
   public static final cej<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cej<bua> K = a("nearest_visible_adult");
   public static final cej<cla> L = a("nearest_visible_wanted_item");
   public static final cej<bvh> M = a("nearest_visible_nemesis");
   public static final cej<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cej<cov> O = a("tempting_player");
   public static final cej<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cej<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cej<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cej<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cej<Boolean> T = a("long_jump_mid_jump");
   public static final cej<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cej<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cej<fay> W = a("ram_target");
   public static final cej<bae> X = a("is_in_water", bae.b);
   public static final cej<bae> Y = a("is_pregnant", bae.b);
   public static final cej<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cej<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cej<UUID> ab = a("angry_at", kl.a);
   public static final cej<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cej<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cej<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cej<Boolean> af = a("disable_walk_to_admire_item");
   public static final cej<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cej<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cej<ji> ai = a("celebrate_location");
   public static final cej<Boolean> aj = a("dancing");
   public static final cej<cnd> ak = a("nearest_visible_huntable_hoglin");
   public static final cej<cnd> al = a("nearest_visible_baby_hoglin");
   public static final cej<cov> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cej<List<cni>> an = a("nearby_adult_piglins");
   public static final cej<List<cni>> ao = a("nearest_visible_adult_piglins");
   public static final cej<List<cnd>> ap = a("nearest_visible_adult_hoglins");
   public static final cej<cni> aq = a("nearest_visible_adult_piglin");
   public static final cej<bvf> ar = a("nearest_visible_zombified");
   public static final cej<Integer> as = a("visible_adult_piglin_count");
   public static final cej<Integer> at = a("visible_adult_hoglin_count");
   public static final cej<cov> au = a("nearest_player_holding_wanted_item");
   public static final cej<Boolean> av = a("ate_recently");
   public static final cej<ji> aw = a("nearest_repellent");
   public static final cej<Boolean> ax = a("pacified");
   public static final cej<bvf> ay = a("roar_target");
   public static final cej<ji> az = a("disturbance_location");
   public static final cej<bae> aA = a("recent_projectile", bae.b);
   public static final cej<bae> aB = a("is_sniffing", bae.b);
   public static final cej<bae> aC = a("is_emerging", bae.b);
   public static final cej<bae> aD = a("roar_sound_delay", bae.b);
   public static final cej<bae> aE = a("dig_cooldown", bae.b);
   public static final cej<bae> aF = a("roar_sound_cooldown", bae.b);
   public static final cej<bae> aG = a("sniff_cooldown", bae.b);
   public static final cej<bae> aH = a("touch_cooldown", bae.b);
   public static final cej<bae> aI = a("vibration_cooldown", bae.b);
   public static final cej<bae> aJ = a("sonic_boom_cooldown", bae.b);
   public static final cej<bae> aK = a("sonic_boom_sound_cooldown", bae.b);
   public static final cej<bae> aL = a("sonic_boom_sound_delay", bae.b);
   public static final cej<UUID> aM = a("liked_player", kl.a);
   public static final cej<jq> aN = a("liked_noteblock", jq.b);
   public static final cej<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cej<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cej<List<jq>> aQ = a("sniffer_explored_positions", Codec.list(jq.b));
   public static final cej<ji> aR = a("sniffer_sniffing_target");
   public static final cej<Boolean> aS = a("sniffer_digging");
   public static final cej<Boolean> aT = a("sniffer_happy");
   public static final cej<bae> aU = a("breeze_jump_cooldown", bae.b);
   public static final cej<bae> aV = a("breeze_shoot", bae.b);
   public static final cej<bae> aW = a("breeze_shoot_charging", bae.b);
   public static final cej<bae> aX = a("breeze_shoot_recover", bae.b);
   public static final cej<bae> aY = a("breeze_shoot_cooldown", bae.b);
   public static final cej<bae> aZ = a("breeze_jump_inhaling", bae.b);
   public static final cej<ji> ba = a("breeze_jump_target", ji.a);
   public static final cej<bae> bb = a("breeze_leaving_water", bae.b);
   private final Optional<Codec<cei<U>>> bc;

   @VisibleForTesting
   public cej(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cei::a);
   }

   @Override
   public String toString() {
      return mb.z.b(this).toString();
   }

   public Optional<Codec<cei<U>>> a() {
      return this.bc;
   }

   private static <U> cej<U> a(String $$0, Codec<U> $$1) {
      return ke.a(mb.z, aku.b($$0), new cej<>(Optional.of($$1)));
   }

   private static <U> cej<U> a(String $$0) {
      return ke.a(mb.z, aku.b($$0), new cej<>(Optional.empty()));
   }
}
