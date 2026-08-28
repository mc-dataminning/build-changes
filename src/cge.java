import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cge<U> {
   public static final cge<Void> a = a("dummy");
   public static final cge<jd> b = a("home", jd.b);
   public static final cge<jd> c = a("job_site", jd.b);
   public static final cge<jd> d = a("potential_job_site", jd.b);
   public static final cge<jd> e = a("meeting_point", jd.b);
   public static final cge<List<jd>> f = a("secondary_job_site");
   public static final cge<List<bxc>> g = a("mobs");
   public static final cge<cgg> h = a("visible_mobs");
   public static final cge<List<bxc>> i = a("visible_villager_babies");
   public static final cge<List<cqy>> j = a("nearest_players");
   public static final cge<cqy> k = a("nearest_visible_player");
   public static final cge<cqy> l = a("nearest_visible_targetable_player");
   public static final cge<List<cqy>> m = a("nearest_visible_targetable_players");
   public static final cge<cgh> n = a("walk_target");
   public static final cge<cah> o = a("look_target");
   public static final cge<bxc> p = a("attack_target");
   public static final cge<Boolean> q = a("attack_cooling_down");
   public static final cge<bxc> r = a("interaction_target");
   public static final cge<bvt> s = a("breed_target");
   public static final cge<bwd> t = a("ride_target");
   public static final cge<ewu> u = a("path");
   public static final cge<List<jd>> v = a("interactable_doors");
   public static final cge<Set<jd>> w = a("doors_to_close");
   public static final cge<iu> x = a("nearest_bed");
   public static final cge<bus> y = a("hurt_by");
   public static final cge<bxc> z = a("hurt_by_entity");
   public static final cge<bxc> A = a("avoid_target");
   public static final cge<bxc> B = a("nearest_hostile");
   public static final cge<bxc> C = a("nearest_attackable");
   public static final cge<jd> D = a("hiding_place");
   public static final cge<Long> E = a("heard_bell_time");
   public static final cge<Long> F = a("cant_reach_walk_target_since");
   public static final cge<Boolean> G = a("golem_detected_recently", Codec.BOOL);
   public static final cge<Boolean> H = a("danger_detected_recently", Codec.BOOL);
   public static final cge<Long> I = a("last_slept", Codec.LONG);
   public static final cge<Long> J = a("last_woken", Codec.LONG);
   public static final cge<Long> K = a("last_worked_at_poi", Codec.LONG);
   public static final cge<bvt> L = a("nearest_visible_adult");
   public static final cge<cnd> M = a("nearest_visible_wanted_item");
   public static final cge<bxe> N = a("nearest_visible_nemesis");
   public static final cge<Integer> O = a("play_dead_ticks", Codec.INT);
   public static final cge<cqy> P = a("tempting_player");
   public static final cge<Integer> Q = a("temptation_cooldown_ticks", Codec.INT);
   public static final cge<Integer> R = a("gaze_cooldown_ticks", Codec.INT);
   public static final cge<Boolean> S = a("is_tempted", Codec.BOOL);
   public static final cge<Integer> T = a("long_jump_cooling_down", Codec.INT);
   public static final cge<Boolean> U = a("long_jump_mid_jump");
   public static final cge<Boolean> V = a("has_hunting_cooldown", Codec.BOOL);
   public static final cge<Integer> W = a("ram_cooldown_ticks", Codec.INT);
   public static final cge<fei> X = a("ram_target");
   public static final cge<bau> Y = a("is_in_water", bau.b);
   public static final cge<bau> Z = a("is_pregnant", bau.b);
   public static final cge<Boolean> aa = a("is_panicking", Codec.BOOL);
   public static final cge<List<UUID>> ab = a("unreachable_tongue_targets");
   public static final cge<UUID> ac = a("angry_at", jy.a);
   public static final cge<Boolean> ad = a("universal_anger", Codec.BOOL);
   public static final cge<Boolean> ae = a("admiring_item", Codec.BOOL);
   public static final cge<Integer> af = a("time_trying_to_reach_admire_item");
   public static final cge<Boolean> ag = a("disable_walk_to_admire_item");
   public static final cge<Boolean> ah = a("admiring_disabled", Codec.BOOL);
   public static final cge<Boolean> ai = a("hunted_recently", Codec.BOOL);
   public static final cge<iu> aj = a("celebrate_location");
   public static final cge<Boolean> ak = a("dancing");
   public static final cge<cph> al = a("nearest_visible_huntable_hoglin");
   public static final cge<cph> am = a("nearest_visible_baby_hoglin");
   public static final cge<cqy> an = a("nearest_targetable_player_not_wearing_gold");
   public static final cge<List<cpm>> ao = a("nearby_adult_piglins");
   public static final cge<List<cpm>> ap = a("nearest_visible_adult_piglins");
   public static final cge<List<cph>> aq = a("nearest_visible_adult_hoglins");
   public static final cge<cpm> ar = a("nearest_visible_adult_piglin");
   public static final cge<bxc> as = a("nearest_visible_zombified");
   public static final cge<Integer> at = a("visible_adult_piglin_count");
   public static final cge<Integer> au = a("visible_adult_hoglin_count");
   public static final cge<cqy> av = a("nearest_player_holding_wanted_item");
   public static final cge<Boolean> aw = a("ate_recently");
   public static final cge<iu> ax = a("nearest_repellent");
   public static final cge<Boolean> ay = a("pacified");
   public static final cge<bxc> az = a("roar_target");
   public static final cge<iu> aA = a("disturbance_location");
   public static final cge<bau> aB = a("recent_projectile", bau.b);
   public static final cge<bau> aC = a("is_sniffing", bau.b);
   public static final cge<bau> aD = a("is_emerging", bau.b);
   public static final cge<bau> aE = a("roar_sound_delay", bau.b);
   public static final cge<bau> aF = a("dig_cooldown", bau.b);
   public static final cge<bau> aG = a("roar_sound_cooldown", bau.b);
   public static final cge<bau> aH = a("sniff_cooldown", bau.b);
   public static final cge<bau> aI = a("touch_cooldown", bau.b);
   public static final cge<bau> aJ = a("vibration_cooldown", bau.b);
   public static final cge<bau> aK = a("sonic_boom_cooldown", bau.b);
   public static final cge<bau> aL = a("sonic_boom_sound_cooldown", bau.b);
   public static final cge<bau> aM = a("sonic_boom_sound_delay", bau.b);
   public static final cge<UUID> aN = a("liked_player", jy.a);
   public static final cge<jd> aO = a("liked_noteblock", jd.b);
   public static final cge<Integer> aP = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cge<Integer> aQ = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cge<List<jd>> aR = a("sniffer_explored_positions", Codec.list(jd.b));
   public static final cge<iu> aS = a("sniffer_sniffing_target");
   public static final cge<Boolean> aT = a("sniffer_digging");
   public static final cge<Boolean> aU = a("sniffer_happy");
   public static final cge<bau> aV = a("breeze_jump_cooldown", bau.b);
   public static final cge<bau> aW = a("breeze_shoot", bau.b);
   public static final cge<bau> aX = a("breeze_shoot_charging", bau.b);
   public static final cge<bau> aY = a("breeze_shoot_recover", bau.b);
   public static final cge<bau> aZ = a("breeze_shoot_cooldown", bau.b);
   public static final cge<bau> ba = a("breeze_jump_inhaling", bau.b);
   public static final cge<iu> bb = a("breeze_jump_target", iu.a);
   public static final cge<bau> bc = a("breeze_leaving_water", bau.b);
   private final Optional<Codec<cgd<U>>> bd;

   @VisibleForTesting
   public cge(Optional<Codec<U>> $$0) {
      this.bd = $$0.map(cgd::a);
   }

   @Override
   public String toString() {
      return mf.z.b(this).toString();
   }

   public Optional<Codec<cgd<U>>> a() {
      return this.bd;
   }

   private static <U> cge<U> a(String $$0, Codec<U> $$1) {
      return jr.a(mf.z, alg.b($$0), new cge<>(Optional.of($$1)));
   }

   private static <U> cge<U> a(String $$0) {
      return jr.a(mf.z, alg.b($$0), new cge<>(Optional.empty()));
   }
}
