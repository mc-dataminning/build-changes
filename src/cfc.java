import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cfc<U> {
   public static final cfc<Void> a = a("dummy");
   public static final cfc<jq> b = a("home", jq.b);
   public static final cfc<jq> c = a("job_site", jq.b);
   public static final cfc<jq> d = a("potential_job_site", jq.b);
   public static final cfc<jq> e = a("meeting_point", jq.b);
   public static final cfc<List<jq>> f = a("secondary_job_site");
   public static final cfc<List<bvy>> g = a("mobs");
   public static final cfc<cfe> h = a("visible_mobs");
   public static final cfc<List<bvy>> i = a("visible_villager_babies");
   public static final cfc<List<cpr>> j = a("nearest_players");
   public static final cfc<cpr> k = a("nearest_visible_player");
   public static final cfc<cpr> l = a("nearest_visible_targetable_player");
   public static final cfc<cff> m = a("walk_target");
   public static final cfc<bzf> n = a("look_target");
   public static final cfc<bvy> o = a("attack_target");
   public static final cfc<Boolean> p = a("attack_cooling_down");
   public static final cfc<bvy> q = a("interaction_target");
   public static final cfc<buq> r = a("breed_target");
   public static final cfc<bva> s = a("ride_target");
   public static final cfc<euk> t = a("path");
   public static final cfc<List<jq>> u = a("interactable_doors");
   public static final cfc<Set<jq>> v = a("doors_to_close");
   public static final cfc<ji> w = a("nearest_bed");
   public static final cfc<btp> x = a("hurt_by");
   public static final cfc<bvy> y = a("hurt_by_entity");
   public static final cfc<bvy> z = a("avoid_target");
   public static final cfc<bvy> A = a("nearest_hostile");
   public static final cfc<bvy> B = a("nearest_attackable");
   public static final cfc<jq> C = a("hiding_place");
   public static final cfc<Long> D = a("heard_bell_time");
   public static final cfc<Long> E = a("cant_reach_walk_target_since");
   public static final cfc<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cfc<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cfc<Long> H = a("last_slept", Codec.LONG);
   public static final cfc<Long> I = a("last_woken", Codec.LONG);
   public static final cfc<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cfc<buq> K = a("nearest_visible_adult");
   public static final cfc<clw> L = a("nearest_visible_wanted_item");
   public static final cfc<bwa> M = a("nearest_visible_nemesis");
   public static final cfc<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cfc<cpr> O = a("tempting_player");
   public static final cfc<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cfc<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cfc<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cfc<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cfc<Boolean> T = a("long_jump_mid_jump");
   public static final cfc<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cfc<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cfc<fbx> W = a("ram_target");
   public static final cfc<baf> X = a("is_in_water", baf.b);
   public static final cfc<baf> Y = a("is_pregnant", baf.b);
   public static final cfc<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cfc<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cfc<UUID> ab = a("angry_at", kl.a);
   public static final cfc<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cfc<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cfc<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cfc<Boolean> af = a("disable_walk_to_admire_item");
   public static final cfc<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cfc<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cfc<ji> ai = a("celebrate_location");
   public static final cfc<Boolean> aj = a("dancing");
   public static final cfc<cnz> ak = a("nearest_visible_huntable_hoglin");
   public static final cfc<cnz> al = a("nearest_visible_baby_hoglin");
   public static final cfc<cpr> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cfc<List<coe>> an = a("nearby_adult_piglins");
   public static final cfc<List<coe>> ao = a("nearest_visible_adult_piglins");
   public static final cfc<List<cnz>> ap = a("nearest_visible_adult_hoglins");
   public static final cfc<coe> aq = a("nearest_visible_adult_piglin");
   public static final cfc<bvy> ar = a("nearest_visible_zombified");
   public static final cfc<Integer> as = a("visible_adult_piglin_count");
   public static final cfc<Integer> at = a("visible_adult_hoglin_count");
   public static final cfc<cpr> au = a("nearest_player_holding_wanted_item");
   public static final cfc<Boolean> av = a("ate_recently");
   public static final cfc<ji> aw = a("nearest_repellent");
   public static final cfc<Boolean> ax = a("pacified");
   public static final cfc<bvy> ay = a("roar_target");
   public static final cfc<ji> az = a("disturbance_location");
   public static final cfc<baf> aA = a("recent_projectile", baf.b);
   public static final cfc<baf> aB = a("is_sniffing", baf.b);
   public static final cfc<baf> aC = a("is_emerging", baf.b);
   public static final cfc<baf> aD = a("roar_sound_delay", baf.b);
   public static final cfc<baf> aE = a("dig_cooldown", baf.b);
   public static final cfc<baf> aF = a("roar_sound_cooldown", baf.b);
   public static final cfc<baf> aG = a("sniff_cooldown", baf.b);
   public static final cfc<baf> aH = a("touch_cooldown", baf.b);
   public static final cfc<baf> aI = a("vibration_cooldown", baf.b);
   public static final cfc<baf> aJ = a("sonic_boom_cooldown", baf.b);
   public static final cfc<baf> aK = a("sonic_boom_sound_cooldown", baf.b);
   public static final cfc<baf> aL = a("sonic_boom_sound_delay", baf.b);
   public static final cfc<UUID> aM = a("liked_player", kl.a);
   public static final cfc<jq> aN = a("liked_noteblock", jq.b);
   public static final cfc<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cfc<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cfc<List<jq>> aQ = a("sniffer_explored_positions", Codec.list(jq.b));
   public static final cfc<ji> aR = a("sniffer_sniffing_target");
   public static final cfc<Boolean> aS = a("sniffer_digging");
   public static final cfc<Boolean> aT = a("sniffer_happy");
   public static final cfc<baf> aU = a("breeze_jump_cooldown", baf.b);
   public static final cfc<baf> aV = a("breeze_shoot", baf.b);
   public static final cfc<baf> aW = a("breeze_shoot_charging", baf.b);
   public static final cfc<baf> aX = a("breeze_shoot_recover", baf.b);
   public static final cfc<baf> aY = a("breeze_shoot_cooldown", baf.b);
   public static final cfc<baf> aZ = a("breeze_jump_inhaling", baf.b);
   public static final cfc<ji> ba = a("breeze_jump_target", ji.a);
   public static final cfc<baf> bb = a("breeze_leaving_water", baf.b);
   private final Optional<Codec<cfb<U>>> bc;

   @VisibleForTesting
   public cfc(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cfb::a);
   }

   @Override
   public String toString() {
      return mb.z.b(this).toString();
   }

   public Optional<Codec<cfb<U>>> a() {
      return this.bc;
   }

   private static <U> cfc<U> a(String $$0, Codec<U> $$1) {
      return ke.a(mb.z, aku.b($$0), new cfc<>(Optional.of($$1)));
   }

   private static <U> cfc<U> a(String $$0) {
      return ke.a(mb.z, aku.b($$0), new cfc<>(Optional.empty()));
   }
}
