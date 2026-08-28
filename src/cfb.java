import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cfb<U> {
   public static final cfb<Void> a = a("dummy");
   public static final cfb<jp> b = a("home", jp.b);
   public static final cfb<jp> c = a("job_site", jp.b);
   public static final cfb<jp> d = a("potential_job_site", jp.b);
   public static final cfb<jp> e = a("meeting_point", jp.b);
   public static final cfb<List<jp>> f = a("secondary_job_site");
   public static final cfb<List<bvx>> g = a("mobs");
   public static final cfb<cfd> h = a("visible_mobs");
   public static final cfb<List<bvx>> i = a("visible_villager_babies");
   public static final cfb<List<cpo>> j = a("nearest_players");
   public static final cfb<cpo> k = a("nearest_visible_player");
   public static final cfb<cpo> l = a("nearest_visible_targetable_player");
   public static final cfb<cfe> m = a("walk_target");
   public static final cfb<bze> n = a("look_target");
   public static final cfb<bvx> o = a("attack_target");
   public static final cfb<Boolean> p = a("attack_cooling_down");
   public static final cfb<bvx> q = a("interaction_target");
   public static final cfb<bus> r = a("breed_target");
   public static final cfb<bvb> s = a("ride_target");
   public static final cfb<eue> t = a("path");
   public static final cfb<List<jp>> u = a("interactable_doors");
   public static final cfb<Set<jp>> v = a("doors_to_close");
   public static final cfb<jh> w = a("nearest_bed");
   public static final cfb<btr> x = a("hurt_by");
   public static final cfb<bvx> y = a("hurt_by_entity");
   public static final cfb<bvx> z = a("avoid_target");
   public static final cfb<bvx> A = a("nearest_hostile");
   public static final cfb<bvx> B = a("nearest_attackable");
   public static final cfb<jp> C = a("hiding_place");
   public static final cfb<Long> D = a("heard_bell_time");
   public static final cfb<Long> E = a("cant_reach_walk_target_since");
   public static final cfb<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cfb<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cfb<Long> H = a("last_slept", Codec.LONG);
   public static final cfb<Long> I = a("last_woken", Codec.LONG);
   public static final cfb<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cfb<bus> K = a("nearest_visible_adult");
   public static final cfb<cls> L = a("nearest_visible_wanted_item");
   public static final cfb<bvz> M = a("nearest_visible_nemesis");
   public static final cfb<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cfb<cpo> O = a("tempting_player");
   public static final cfb<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cfb<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cfb<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cfb<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cfb<Boolean> T = a("long_jump_mid_jump");
   public static final cfb<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cfb<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cfb<fbr> W = a("ram_target");
   public static final cfb<bba> X = a("is_in_water", bba.b);
   public static final cfb<bba> Y = a("is_pregnant", bba.b);
   public static final cfb<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cfb<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cfb<UUID> ab = a("angry_at", kk.a);
   public static final cfb<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cfb<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cfb<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cfb<Boolean> af = a("disable_walk_to_admire_item");
   public static final cfb<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cfb<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cfb<jh> ai = a("celebrate_location");
   public static final cfb<Boolean> aj = a("dancing");
   public static final cfb<cnw> ak = a("nearest_visible_huntable_hoglin");
   public static final cfb<cnw> al = a("nearest_visible_baby_hoglin");
   public static final cfb<cpo> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cfb<List<cob>> an = a("nearby_adult_piglins");
   public static final cfb<List<cob>> ao = a("nearest_visible_adult_piglins");
   public static final cfb<List<cnw>> ap = a("nearest_visible_adult_hoglins");
   public static final cfb<cob> aq = a("nearest_visible_adult_piglin");
   public static final cfb<bvx> ar = a("nearest_visible_zombified");
   public static final cfb<Integer> as = a("visible_adult_piglin_count");
   public static final cfb<Integer> at = a("visible_adult_hoglin_count");
   public static final cfb<cpo> au = a("nearest_player_holding_wanted_item");
   public static final cfb<Boolean> av = a("ate_recently");
   public static final cfb<jh> aw = a("nearest_repellent");
   public static final cfb<Boolean> ax = a("pacified");
   public static final cfb<bvx> ay = a("roar_target");
   public static final cfb<jh> az = a("disturbance_location");
   public static final cfb<bba> aA = a("recent_projectile", bba.b);
   public static final cfb<bba> aB = a("is_sniffing", bba.b);
   public static final cfb<bba> aC = a("is_emerging", bba.b);
   public static final cfb<bba> aD = a("roar_sound_delay", bba.b);
   public static final cfb<bba> aE = a("dig_cooldown", bba.b);
   public static final cfb<bba> aF = a("roar_sound_cooldown", bba.b);
   public static final cfb<bba> aG = a("sniff_cooldown", bba.b);
   public static final cfb<bba> aH = a("touch_cooldown", bba.b);
   public static final cfb<bba> aI = a("vibration_cooldown", bba.b);
   public static final cfb<bba> aJ = a("sonic_boom_cooldown", bba.b);
   public static final cfb<bba> aK = a("sonic_boom_sound_cooldown", bba.b);
   public static final cfb<bba> aL = a("sonic_boom_sound_delay", bba.b);
   public static final cfb<UUID> aM = a("liked_player", kk.a);
   public static final cfb<jp> aN = a("liked_noteblock", jp.b);
   public static final cfb<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cfb<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cfb<List<jp>> aQ = a("sniffer_explored_positions", Codec.list(jp.b));
   public static final cfb<jh> aR = a("sniffer_sniffing_target");
   public static final cfb<Boolean> aS = a("sniffer_digging");
   public static final cfb<Boolean> aT = a("sniffer_happy");
   public static final cfb<bba> aU = a("breeze_jump_cooldown", bba.b);
   public static final cfb<bba> aV = a("breeze_shoot", bba.b);
   public static final cfb<bba> aW = a("breeze_shoot_charging", bba.b);
   public static final cfb<bba> aX = a("breeze_shoot_recover", bba.b);
   public static final cfb<bba> aY = a("breeze_shoot_cooldown", bba.b);
   public static final cfb<bba> aZ = a("breeze_jump_inhaling", bba.b);
   public static final cfb<jh> ba = a("breeze_jump_target", jh.a);
   public static final cfb<bba> bb = a("breeze_leaving_water", bba.b);
   private final Optional<Codec<cfa<U>>> bc;

   @VisibleForTesting
   public cfb(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cfa::a);
   }

   @Override
   public String toString() {
      return ma.z.b(this).toString();
   }

   public Optional<Codec<cfa<U>>> a() {
      return this.bc;
   }

   private static <U> cfb<U> a(String $$0, Codec<U> $$1) {
      return kd.a(ma.z, alp.b($$0), new cfb<>(Optional.of($$1)));
   }

   private static <U> cfb<U> a(String $$0) {
      return kd.a(ma.z, alp.b($$0), new cfb<>(Optional.empty()));
   }
}
