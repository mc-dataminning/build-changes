import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bvn<U> {
   public static final bvn<Void> a = a("dummy");
   public static final bvn<ig> b = a("home", ig.a);
   public static final bvn<ig> c = a("job_site", ig.a);
   public static final bvn<ig> d = a("potential_job_site", ig.a);
   public static final bvn<ig> e = a("meeting_point", ig.a);
   public static final bvn<List<ig>> f = a("secondary_job_site");
   public static final bvn<List<bml>> g = a("mobs");
   public static final bvn<bvp> h = a("visible_mobs");
   public static final bvn<List<bml>> i = a("visible_villager_babies");
   public static final bvn<List<cfi>> j = a("nearest_players");
   public static final bvn<cfi> k = a("nearest_visible_player");
   public static final bvn<cfi> l = a("nearest_visible_targetable_player");
   public static final bvn<bvq> m = a("walk_target");
   public static final bvn<bpq> n = a("look_target");
   public static final bvn<bml> o = a("attack_target");
   public static final bvn<Boolean> p = a("attack_cooling_down");
   public static final bvn<bml> q = a("interaction_target");
   public static final bvn<blq> r = a("breed_target");
   public static final bvn<blv> s = a("ride_target");
   public static final bvn<efg> t = a("path");
   public static final bvn<List<ig>> u = a("interactable_doors");
   public static final bvn<Set<ig>> v = a("doors_to_close");
   public static final bvn<hx> w = a("nearest_bed");
   public static final bvn<bkt> x = a("hurt_by");
   public static final bvn<bml> y = a("hurt_by_entity");
   public static final bvn<bml> z = a("avoid_target");
   public static final bvn<bml> A = a("nearest_hostile");
   public static final bvn<bml> B = a("nearest_attackable");
   public static final bvn<ig> C = a("hiding_place");
   public static final bvn<Long> D = a("heard_bell_time");
   public static final bvn<Long> E = a("cant_reach_walk_target_since");
   public static final bvn<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bvn<Long> G = a("last_slept", Codec.LONG);
   public static final bvn<Long> H = a("last_woken", Codec.LONG);
   public static final bvn<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bvn<blq> J = a("nearest_visible_adult");
   public static final bvn<cbu> K = a("nearest_visible_wanted_item");
   public static final bvn<bmn> L = a("nearest_visible_nemesis");
   public static final bvn<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bvn<cfi> N = a("tempting_player");
   public static final bvn<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bvn<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final bvn<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final bvn<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final bvn<Boolean> S = a("long_jump_mid_jump");
   public static final bvn<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final bvn<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final bvn<elt> V = a("ram_target");
   public static final bvn<avs> W = a("is_in_water", Codec.unit(avs.a));
   public static final bvn<avs> X = a("is_pregnant", Codec.unit(avs.a));
   public static final bvn<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final bvn<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final bvn<UUID> aa = a("angry_at", ja.a);
   public static final bvn<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final bvn<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final bvn<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final bvn<Boolean> ae = a("disable_walk_to_admire_item");
   public static final bvn<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final bvn<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final bvn<hx> ah = a("celebrate_location");
   public static final bvn<Boolean> ai = a("dancing");
   public static final bvn<cds> aj = a("nearest_visible_huntable_hoglin");
   public static final bvn<cds> ak = a("nearest_visible_baby_hoglin");
   public static final bvn<cfi> al = a("nearest_targetable_player_not_wearing_gold");
   public static final bvn<List<cdx>> am = a("nearby_adult_piglins");
   public static final bvn<List<cdx>> an = a("nearest_visible_adult_piglins");
   public static final bvn<List<cds>> ao = a("nearest_visible_adult_hoglins");
   public static final bvn<cdx> ap = a("nearest_visible_adult_piglin");
   public static final bvn<bml> aq = a("nearest_visible_zombified");
   public static final bvn<Integer> ar = a("visible_adult_piglin_count");
   public static final bvn<Integer> as = a("visible_adult_hoglin_count");
   public static final bvn<cfi> at = a("nearest_player_holding_wanted_item");
   public static final bvn<Boolean> au = a("ate_recently");
   public static final bvn<hx> av = a("nearest_repellent");
   public static final bvn<Boolean> aw = a("pacified");
   public static final bvn<bml> ax = a("roar_target");
   public static final bvn<hx> ay = a("disturbance_location");
   public static final bvn<avs> az = a("recent_projectile", Codec.unit(avs.a));
   public static final bvn<avs> aA = a("is_sniffing", Codec.unit(avs.a));
   public static final bvn<avs> aB = a("is_emerging", Codec.unit(avs.a));
   public static final bvn<avs> aC = a("roar_sound_delay", Codec.unit(avs.a));
   public static final bvn<avs> aD = a("dig_cooldown", Codec.unit(avs.a));
   public static final bvn<avs> aE = a("roar_sound_cooldown", Codec.unit(avs.a));
   public static final bvn<avs> aF = a("sniff_cooldown", Codec.unit(avs.a));
   public static final bvn<avs> aG = a("touch_cooldown", Codec.unit(avs.a));
   public static final bvn<avs> aH = a("vibration_cooldown", Codec.unit(avs.a));
   public static final bvn<avs> aI = a("sonic_boom_cooldown", Codec.unit(avs.a));
   public static final bvn<avs> aJ = a("sonic_boom_sound_cooldown", Codec.unit(avs.a));
   public static final bvn<avs> aK = a("sonic_boom_sound_delay", Codec.unit(avs.a));
   public static final bvn<UUID> aL = a("liked_player", ja.a);
   public static final bvn<ig> aM = a("liked_noteblock", ig.a);
   public static final bvn<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bvn<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bvn<List<ig>> aP = a("sniffer_explored_positions", Codec.list(ig.a));
   public static final bvn<hx> aQ = a("sniffer_sniffing_target");
   public static final bvn<Boolean> aR = a("sniffer_digging");
   public static final bvn<Boolean> aS = a("sniffer_happy");
   public static final bvn<avs> aT = a("breeze_jump_cooldown", Codec.unit(avs.a));
   public static final bvn<avs> aU = a("breeze_shoot", Codec.unit(avs.a));
   public static final bvn<avs> aV = a("breeze_shoot_charging", Codec.unit(avs.a));
   public static final bvn<avs> aW = a("breeze_shoot_recover", Codec.unit(avs.a));
   public static final bvn<avs> aX = a("breeze_shoot_cooldown", Codec.unit(avs.a));
   public static final bvn<avs> aY = a("breeze_jump_inhaling", Codec.unit(avs.a));
   public static final bvn<hx> aZ = a("breeze_jump_target", hx.a);
   private final Optional<Codec<bvm<U>>> ba;

   @VisibleForTesting
   public bvn(Optional<Codec<U>> $$0) {
      this.ba = $$0.map(bvm::a);
   }

   @Override
   public String toString() {
      return kd.B.b(this).toString();
   }

   public Optional<Codec<bvm<U>>> a() {
      return this.ba;
   }

   private static <U> bvn<U> a(String $$0, Codec<U> $$1) {
      return it.a(kd.B, new ahg($$0), new bvn<>(Optional.of($$1)));
   }

   private static <U> bvn<U> a(String $$0) {
      return it.a(kd.B, new ahg($$0), new bvn<>(Optional.empty()));
   }
}
