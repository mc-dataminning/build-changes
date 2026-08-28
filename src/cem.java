import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cem<U> {
   public static final cem<Void> a = a("dummy");
   public static final cem<jq> b = a("home", jq.b);
   public static final cem<jq> c = a("job_site", jq.b);
   public static final cem<jq> d = a("potential_job_site", jq.b);
   public static final cem<jq> e = a("meeting_point", jq.b);
   public static final cem<List<jq>> f = a("secondary_job_site");
   public static final cem<List<bvi>> g = a("mobs");
   public static final cem<ceo> h = a("visible_mobs");
   public static final cem<List<bvi>> i = a("visible_villager_babies");
   public static final cem<List<coy>> j = a("nearest_players");
   public static final cem<coy> k = a("nearest_visible_player");
   public static final cem<coy> l = a("nearest_visible_targetable_player");
   public static final cem<cep> m = a("walk_target");
   public static final cem<byp> n = a("look_target");
   public static final cem<bvi> o = a("attack_target");
   public static final cem<Boolean> p = a("attack_cooling_down");
   public static final cem<bvi> q = a("interaction_target");
   public static final cem<bud> r = a("breed_target");
   public static final cem<bum> s = a("ride_target");
   public static final cem<eto> t = a("path");
   public static final cem<List<jq>> u = a("interactable_doors");
   public static final cem<Set<jq>> v = a("doors_to_close");
   public static final cem<ji> w = a("nearest_bed");
   public static final cem<btc> x = a("hurt_by");
   public static final cem<bvi> y = a("hurt_by_entity");
   public static final cem<bvi> z = a("avoid_target");
   public static final cem<bvi> A = a("nearest_hostile");
   public static final cem<bvi> B = a("nearest_attackable");
   public static final cem<jq> C = a("hiding_place");
   public static final cem<Long> D = a("heard_bell_time");
   public static final cem<Long> E = a("cant_reach_walk_target_since");
   public static final cem<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cem<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cem<Long> H = a("last_slept", Codec.LONG);
   public static final cem<Long> I = a("last_woken", Codec.LONG);
   public static final cem<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cem<bud> K = a("nearest_visible_adult");
   public static final cem<cld> L = a("nearest_visible_wanted_item");
   public static final cem<bvk> M = a("nearest_visible_nemesis");
   public static final cem<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cem<coy> O = a("tempting_player");
   public static final cem<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cem<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cem<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cem<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cem<Boolean> T = a("long_jump_mid_jump");
   public static final cem<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cem<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cem<fbb> W = a("ram_target");
   public static final cem<baf> X = a("is_in_water", baf.b);
   public static final cem<baf> Y = a("is_pregnant", baf.b);
   public static final cem<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cem<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cem<UUID> ab = a("angry_at", kl.a);
   public static final cem<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cem<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cem<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cem<Boolean> af = a("disable_walk_to_admire_item");
   public static final cem<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cem<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cem<ji> ai = a("celebrate_location");
   public static final cem<Boolean> aj = a("dancing");
   public static final cem<cng> ak = a("nearest_visible_huntable_hoglin");
   public static final cem<cng> al = a("nearest_visible_baby_hoglin");
   public static final cem<coy> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cem<List<cnl>> an = a("nearby_adult_piglins");
   public static final cem<List<cnl>> ao = a("nearest_visible_adult_piglins");
   public static final cem<List<cng>> ap = a("nearest_visible_adult_hoglins");
   public static final cem<cnl> aq = a("nearest_visible_adult_piglin");
   public static final cem<bvi> ar = a("nearest_visible_zombified");
   public static final cem<Integer> as = a("visible_adult_piglin_count");
   public static final cem<Integer> at = a("visible_adult_hoglin_count");
   public static final cem<coy> au = a("nearest_player_holding_wanted_item");
   public static final cem<Boolean> av = a("ate_recently");
   public static final cem<ji> aw = a("nearest_repellent");
   public static final cem<Boolean> ax = a("pacified");
   public static final cem<bvi> ay = a("roar_target");
   public static final cem<ji> az = a("disturbance_location");
   public static final cem<baf> aA = a("recent_projectile", baf.b);
   public static final cem<baf> aB = a("is_sniffing", baf.b);
   public static final cem<baf> aC = a("is_emerging", baf.b);
   public static final cem<baf> aD = a("roar_sound_delay", baf.b);
   public static final cem<baf> aE = a("dig_cooldown", baf.b);
   public static final cem<baf> aF = a("roar_sound_cooldown", baf.b);
   public static final cem<baf> aG = a("sniff_cooldown", baf.b);
   public static final cem<baf> aH = a("touch_cooldown", baf.b);
   public static final cem<baf> aI = a("vibration_cooldown", baf.b);
   public static final cem<baf> aJ = a("sonic_boom_cooldown", baf.b);
   public static final cem<baf> aK = a("sonic_boom_sound_cooldown", baf.b);
   public static final cem<baf> aL = a("sonic_boom_sound_delay", baf.b);
   public static final cem<UUID> aM = a("liked_player", kl.a);
   public static final cem<jq> aN = a("liked_noteblock", jq.b);
   public static final cem<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cem<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cem<List<jq>> aQ = a("sniffer_explored_positions", Codec.list(jq.b));
   public static final cem<ji> aR = a("sniffer_sniffing_target");
   public static final cem<Boolean> aS = a("sniffer_digging");
   public static final cem<Boolean> aT = a("sniffer_happy");
   public static final cem<baf> aU = a("breeze_jump_cooldown", baf.b);
   public static final cem<baf> aV = a("breeze_shoot", baf.b);
   public static final cem<baf> aW = a("breeze_shoot_charging", baf.b);
   public static final cem<baf> aX = a("breeze_shoot_recover", baf.b);
   public static final cem<baf> aY = a("breeze_shoot_cooldown", baf.b);
   public static final cem<baf> aZ = a("breeze_jump_inhaling", baf.b);
   public static final cem<ji> ba = a("breeze_jump_target", ji.a);
   public static final cem<baf> bb = a("breeze_leaving_water", baf.b);
   private final Optional<Codec<cel<U>>> bc;

   @VisibleForTesting
   public cem(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cel::a);
   }

   @Override
   public String toString() {
      return mb.z.b(this).toString();
   }

   public Optional<Codec<cel<U>>> a() {
      return this.bc;
   }

   private static <U> cem<U> a(String $$0, Codec<U> $$1) {
      return ke.a(mb.z, akv.b($$0), new cem<>(Optional.of($$1)));
   }

   private static <U> cem<U> a(String $$0) {
      return ke.a(mb.z, akv.b($$0), new cem<>(Optional.empty()));
   }
}
