import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cgb<U> {
   public static final cgb<Void> a = a("dummy");
   public static final cgb<jd> b = a("home", jd.b);
   public static final cgb<jd> c = a("job_site", jd.b);
   public static final cgb<jd> d = a("potential_job_site", jd.b);
   public static final cgb<jd> e = a("meeting_point", jd.b);
   public static final cgb<List<jd>> f = a("secondary_job_site");
   public static final cgb<List<bwz>> g = a("mobs");
   public static final cgb<cgd> h = a("visible_mobs");
   public static final cgb<List<bwz>> i = a("visible_villager_babies");
   public static final cgb<List<cqs>> j = a("nearest_players");
   public static final cgb<cqs> k = a("nearest_visible_player");
   public static final cgb<cqs> l = a("nearest_visible_targetable_player");
   public static final cgb<List<cqs>> m = a("nearest_visible_targetable_players");
   public static final cgb<cge> n = a("walk_target");
   public static final cgb<cae> o = a("look_target");
   public static final cgb<bwz> p = a("attack_target");
   public static final cgb<Boolean> q = a("attack_cooling_down");
   public static final cgb<bwz> r = a("interaction_target");
   public static final cgb<bvq> s = a("breed_target");
   public static final cgb<bwa> t = a("ride_target");
   public static final cgb<ewj> u = a("path");
   public static final cgb<List<jd>> v = a("interactable_doors");
   public static final cgb<Set<jd>> w = a("doors_to_close");
   public static final cgb<iu> x = a("nearest_bed");
   public static final cgb<bup> y = a("hurt_by");
   public static final cgb<bwz> z = a("hurt_by_entity");
   public static final cgb<bwz> A = a("avoid_target");
   public static final cgb<bwz> B = a("nearest_hostile");
   public static final cgb<bwz> C = a("nearest_attackable");
   public static final cgb<jd> D = a("hiding_place");
   public static final cgb<Long> E = a("heard_bell_time");
   public static final cgb<Long> F = a("cant_reach_walk_target_since");
   public static final cgb<Boolean> G = a("golem_detected_recently", Codec.BOOL);
   public static final cgb<Boolean> H = a("danger_detected_recently", Codec.BOOL);
   public static final cgb<Long> I = a("last_slept", Codec.LONG);
   public static final cgb<Long> J = a("last_woken", Codec.LONG);
   public static final cgb<Long> K = a("last_worked_at_poi", Codec.LONG);
   public static final cgb<bvq> L = a("nearest_visible_adult");
   public static final cgb<cmx> M = a("nearest_visible_wanted_item");
   public static final cgb<bxb> N = a("nearest_visible_nemesis");
   public static final cgb<Integer> O = a("play_dead_ticks", Codec.INT);
   public static final cgb<cqs> P = a("tempting_player");
   public static final cgb<Integer> Q = a("temptation_cooldown_ticks", Codec.INT);
   public static final cgb<Integer> R = a("gaze_cooldown_ticks", Codec.INT);
   public static final cgb<Boolean> S = a("is_tempted", Codec.BOOL);
   public static final cgb<Integer> T = a("long_jump_cooling_down", Codec.INT);
   public static final cgb<Boolean> U = a("long_jump_mid_jump");
   public static final cgb<Boolean> V = a("has_hunting_cooldown", Codec.BOOL);
   public static final cgb<Integer> W = a("ram_cooldown_ticks", Codec.INT);
   public static final cgb<fdw> X = a("ram_target");
   public static final cgb<bas> Y = a("is_in_water", bas.b);
   public static final cgb<bas> Z = a("is_pregnant", bas.b);
   public static final cgb<Boolean> aa = a("is_panicking", Codec.BOOL);
   public static final cgb<List<UUID>> ab = a("unreachable_tongue_targets");
   public static final cgb<UUID> ac = a("angry_at", jy.a);
   public static final cgb<Boolean> ad = a("universal_anger", Codec.BOOL);
   public static final cgb<Boolean> ae = a("admiring_item", Codec.BOOL);
   public static final cgb<Integer> af = a("time_trying_to_reach_admire_item");
   public static final cgb<Boolean> ag = a("disable_walk_to_admire_item");
   public static final cgb<Boolean> ah = a("admiring_disabled", Codec.BOOL);
   public static final cgb<Boolean> ai = a("hunted_recently", Codec.BOOL);
   public static final cgb<iu> aj = a("celebrate_location");
   public static final cgb<Boolean> ak = a("dancing");
   public static final cgb<cpb> al = a("nearest_visible_huntable_hoglin");
   public static final cgb<cpb> am = a("nearest_visible_baby_hoglin");
   public static final cgb<cqs> an = a("nearest_targetable_player_not_wearing_gold");
   public static final cgb<List<cpg>> ao = a("nearby_adult_piglins");
   public static final cgb<List<cpg>> ap = a("nearest_visible_adult_piglins");
   public static final cgb<List<cpb>> aq = a("nearest_visible_adult_hoglins");
   public static final cgb<cpg> ar = a("nearest_visible_adult_piglin");
   public static final cgb<bwz> as = a("nearest_visible_zombified");
   public static final cgb<Integer> at = a("visible_adult_piglin_count");
   public static final cgb<Integer> au = a("visible_adult_hoglin_count");
   public static final cgb<cqs> av = a("nearest_player_holding_wanted_item");
   public static final cgb<Boolean> aw = a("ate_recently");
   public static final cgb<iu> ax = a("nearest_repellent");
   public static final cgb<Boolean> ay = a("pacified");
   public static final cgb<bwz> az = a("roar_target");
   public static final cgb<iu> aA = a("disturbance_location");
   public static final cgb<bas> aB = a("recent_projectile", bas.b);
   public static final cgb<bas> aC = a("is_sniffing", bas.b);
   public static final cgb<bas> aD = a("is_emerging", bas.b);
   public static final cgb<bas> aE = a("roar_sound_delay", bas.b);
   public static final cgb<bas> aF = a("dig_cooldown", bas.b);
   public static final cgb<bas> aG = a("roar_sound_cooldown", bas.b);
   public static final cgb<bas> aH = a("sniff_cooldown", bas.b);
   public static final cgb<bas> aI = a("touch_cooldown", bas.b);
   public static final cgb<bas> aJ = a("vibration_cooldown", bas.b);
   public static final cgb<bas> aK = a("sonic_boom_cooldown", bas.b);
   public static final cgb<bas> aL = a("sonic_boom_sound_cooldown", bas.b);
   public static final cgb<bas> aM = a("sonic_boom_sound_delay", bas.b);
   public static final cgb<UUID> aN = a("liked_player", jy.a);
   public static final cgb<jd> aO = a("liked_noteblock", jd.b);
   public static final cgb<Integer> aP = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cgb<Integer> aQ = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cgb<List<jd>> aR = a("sniffer_explored_positions", Codec.list(jd.b));
   public static final cgb<iu> aS = a("sniffer_sniffing_target");
   public static final cgb<Boolean> aT = a("sniffer_digging");
   public static final cgb<Boolean> aU = a("sniffer_happy");
   public static final cgb<bas> aV = a("breeze_jump_cooldown", bas.b);
   public static final cgb<bas> aW = a("breeze_shoot", bas.b);
   public static final cgb<bas> aX = a("breeze_shoot_charging", bas.b);
   public static final cgb<bas> aY = a("breeze_shoot_recover", bas.b);
   public static final cgb<bas> aZ = a("breeze_shoot_cooldown", bas.b);
   public static final cgb<bas> ba = a("breeze_jump_inhaling", bas.b);
   public static final cgb<iu> bb = a("breeze_jump_target", iu.a);
   public static final cgb<bas> bc = a("breeze_leaving_water", bas.b);
   private final Optional<Codec<cga<U>>> bd;

   @VisibleForTesting
   public cgb(Optional<Codec<U>> $$0) {
      this.bd = $$0.map(cga::a);
   }

   @Override
   public String toString() {
      return mf.z.b(this).toString();
   }

   public Optional<Codec<cga<U>>> a() {
      return this.bd;
   }

   private static <U> cgb<U> a(String $$0, Codec<U> $$1) {
      return jr.a(mf.z, ale.b($$0), new cgb<>(Optional.of($$1)));
   }

   private static <U> cgb<U> a(String $$0) {
      return jr.a(mf.z, ale.b($$0), new cgb<>(Optional.empty()));
   }
}
