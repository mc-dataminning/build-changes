import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cgg<U> {
   public static final cgg<Void> a = a("dummy");
   public static final cgg<jd> b = a("home", jd.b);
   public static final cgg<jd> c = a("job_site", jd.b);
   public static final cgg<jd> d = a("potential_job_site", jd.b);
   public static final cgg<jd> e = a("meeting_point", jd.b);
   public static final cgg<List<jd>> f = a("secondary_job_site");
   public static final cgg<List<bxe>> g = a("mobs");
   public static final cgg<cgi> h = a("visible_mobs");
   public static final cgg<List<bxe>> i = a("visible_villager_babies");
   public static final cgg<List<crc>> j = a("nearest_players");
   public static final cgg<crc> k = a("nearest_visible_player");
   public static final cgg<crc> l = a("nearest_visible_targetable_player");
   public static final cgg<List<crc>> m = a("nearest_visible_targetable_players");
   public static final cgg<cgj> n = a("walk_target");
   public static final cgg<caj> o = a("look_target");
   public static final cgg<bxe> p = a("attack_target");
   public static final cgg<Boolean> q = a("attack_cooling_down");
   public static final cgg<bxe> r = a("interaction_target");
   public static final cgg<bvv> s = a("breed_target");
   public static final cgg<bwf> t = a("ride_target");
   public static final cgg<exc> u = a("path");
   public static final cgg<List<jd>> v = a("interactable_doors");
   public static final cgg<Set<jd>> w = a("doors_to_close");
   public static final cgg<iu> x = a("nearest_bed");
   public static final cgg<buu> y = a("hurt_by");
   public static final cgg<bxe> z = a("hurt_by_entity");
   public static final cgg<bxe> A = a("avoid_target");
   public static final cgg<bxe> B = a("nearest_hostile");
   public static final cgg<bxe> C = a("nearest_attackable");
   public static final cgg<jd> D = a("hiding_place");
   public static final cgg<Long> E = a("heard_bell_time");
   public static final cgg<Long> F = a("cant_reach_walk_target_since");
   public static final cgg<Boolean> G = a("golem_detected_recently", Codec.BOOL);
   public static final cgg<Boolean> H = a("danger_detected_recently", Codec.BOOL);
   public static final cgg<Long> I = a("last_slept", Codec.LONG);
   public static final cgg<Long> J = a("last_woken", Codec.LONG);
   public static final cgg<Long> K = a("last_worked_at_poi", Codec.LONG);
   public static final cgg<bvv> L = a("nearest_visible_adult");
   public static final cgg<cnh> M = a("nearest_visible_wanted_item");
   public static final cgg<bxg> N = a("nearest_visible_nemesis");
   public static final cgg<Integer> O = a("play_dead_ticks", Codec.INT);
   public static final cgg<crc> P = a("tempting_player");
   public static final cgg<Integer> Q = a("temptation_cooldown_ticks", Codec.INT);
   public static final cgg<Integer> R = a("gaze_cooldown_ticks", Codec.INT);
   public static final cgg<Boolean> S = a("is_tempted", Codec.BOOL);
   public static final cgg<Integer> T = a("long_jump_cooling_down", Codec.INT);
   public static final cgg<Boolean> U = a("long_jump_mid_jump");
   public static final cgg<Boolean> V = a("has_hunting_cooldown", Codec.BOOL);
   public static final cgg<Integer> W = a("ram_cooldown_ticks", Codec.INT);
   public static final cgg<feq> X = a("ram_target");
   public static final cgg<bau> Y = a("is_in_water", bau.b);
   public static final cgg<bau> Z = a("is_pregnant", bau.b);
   public static final cgg<Boolean> aa = a("is_panicking", Codec.BOOL);
   public static final cgg<List<UUID>> ab = a("unreachable_tongue_targets");
   public static final cgg<UUID> ac = a("angry_at", jy.a);
   public static final cgg<Boolean> ad = a("universal_anger", Codec.BOOL);
   public static final cgg<Boolean> ae = a("admiring_item", Codec.BOOL);
   public static final cgg<Integer> af = a("time_trying_to_reach_admire_item");
   public static final cgg<Boolean> ag = a("disable_walk_to_admire_item");
   public static final cgg<Boolean> ah = a("admiring_disabled", Codec.BOOL);
   public static final cgg<Boolean> ai = a("hunted_recently", Codec.BOOL);
   public static final cgg<iu> aj = a("celebrate_location");
   public static final cgg<Boolean> ak = a("dancing");
   public static final cgg<cpl> al = a("nearest_visible_huntable_hoglin");
   public static final cgg<cpl> am = a("nearest_visible_baby_hoglin");
   public static final cgg<crc> an = a("nearest_targetable_player_not_wearing_gold");
   public static final cgg<List<cpq>> ao = a("nearby_adult_piglins");
   public static final cgg<List<cpq>> ap = a("nearest_visible_adult_piglins");
   public static final cgg<List<cpl>> aq = a("nearest_visible_adult_hoglins");
   public static final cgg<cpq> ar = a("nearest_visible_adult_piglin");
   public static final cgg<bxe> as = a("nearest_visible_zombified");
   public static final cgg<Integer> at = a("visible_adult_piglin_count");
   public static final cgg<Integer> au = a("visible_adult_hoglin_count");
   public static final cgg<crc> av = a("nearest_player_holding_wanted_item");
   public static final cgg<Boolean> aw = a("ate_recently");
   public static final cgg<iu> ax = a("nearest_repellent");
   public static final cgg<Boolean> ay = a("pacified");
   public static final cgg<bxe> az = a("roar_target");
   public static final cgg<iu> aA = a("disturbance_location");
   public static final cgg<bau> aB = a("recent_projectile", bau.b);
   public static final cgg<bau> aC = a("is_sniffing", bau.b);
   public static final cgg<bau> aD = a("is_emerging", bau.b);
   public static final cgg<bau> aE = a("roar_sound_delay", bau.b);
   public static final cgg<bau> aF = a("dig_cooldown", bau.b);
   public static final cgg<bau> aG = a("roar_sound_cooldown", bau.b);
   public static final cgg<bau> aH = a("sniff_cooldown", bau.b);
   public static final cgg<bau> aI = a("touch_cooldown", bau.b);
   public static final cgg<bau> aJ = a("vibration_cooldown", bau.b);
   public static final cgg<bau> aK = a("sonic_boom_cooldown", bau.b);
   public static final cgg<bau> aL = a("sonic_boom_sound_cooldown", bau.b);
   public static final cgg<bau> aM = a("sonic_boom_sound_delay", bau.b);
   public static final cgg<UUID> aN = a("liked_player", jy.a);
   public static final cgg<jd> aO = a("liked_noteblock", jd.b);
   public static final cgg<Integer> aP = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cgg<Integer> aQ = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cgg<List<jd>> aR = a("sniffer_explored_positions", Codec.list(jd.b));
   public static final cgg<iu> aS = a("sniffer_sniffing_target");
   public static final cgg<Boolean> aT = a("sniffer_digging");
   public static final cgg<Boolean> aU = a("sniffer_happy");
   public static final cgg<bau> aV = a("breeze_jump_cooldown", bau.b);
   public static final cgg<bau> aW = a("breeze_shoot", bau.b);
   public static final cgg<bau> aX = a("breeze_shoot_charging", bau.b);
   public static final cgg<bau> aY = a("breeze_shoot_recover", bau.b);
   public static final cgg<bau> aZ = a("breeze_shoot_cooldown", bau.b);
   public static final cgg<bau> ba = a("breeze_jump_inhaling", bau.b);
   public static final cgg<iu> bb = a("breeze_jump_target", iu.a);
   public static final cgg<bau> bc = a("breeze_leaving_water", bau.b);
   private final Optional<Codec<cgf<U>>> bd;

   @VisibleForTesting
   public cgg(Optional<Codec<U>> $$0) {
      this.bd = $$0.map(cgf::a);
   }

   @Override
   public String toString() {
      return mf.z.b(this).toString();
   }

   public Optional<Codec<cgf<U>>> a() {
      return this.bd;
   }

   private static <U> cgg<U> a(String $$0, Codec<U> $$1) {
      return jr.a(mf.z, alg.b($$0), new cgg<>(Optional.of($$1)));
   }

   private static <U> cgg<U> a(String $$0) {
      return jr.a(mf.z, alg.b($$0), new cgg<>(Optional.empty()));
   }
}
