import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cel<U> {
   public static final cel<Void> a = a("dummy");
   public static final cel<jp> b = a("home", jp.b);
   public static final cel<jp> c = a("job_site", jp.b);
   public static final cel<jp> d = a("potential_job_site", jp.b);
   public static final cel<jp> e = a("meeting_point", jp.b);
   public static final cel<List<jp>> f = a("secondary_job_site");
   public static final cel<List<bvh>> g = a("mobs");
   public static final cel<cen> h = a("visible_mobs");
   public static final cel<List<bvh>> i = a("visible_villager_babies");
   public static final cel<List<cou>> j = a("nearest_players");
   public static final cel<cou> k = a("nearest_visible_player");
   public static final cel<cou> l = a("nearest_visible_targetable_player");
   public static final cel<ceo> m = a("walk_target");
   public static final cel<byo> n = a("look_target");
   public static final cel<bvh> o = a("attack_target");
   public static final cel<Boolean> p = a("attack_cooling_down");
   public static final cel<bvh> q = a("interaction_target");
   public static final cel<buc> r = a("breed_target");
   public static final cel<bul> s = a("ride_target");
   public static final cel<esj> t = a("path");
   public static final cel<List<jp>> u = a("interactable_doors");
   public static final cel<Set<jp>> v = a("doors_to_close");
   public static final cel<jh> w = a("nearest_bed");
   public static final cel<btb> x = a("hurt_by");
   public static final cel<bvh> y = a("hurt_by_entity");
   public static final cel<bvh> z = a("avoid_target");
   public static final cel<bvh> A = a("nearest_hostile");
   public static final cel<bvh> B = a("nearest_attackable");
   public static final cel<jp> C = a("hiding_place");
   public static final cel<Long> D = a("heard_bell_time");
   public static final cel<Long> E = a("cant_reach_walk_target_since");
   public static final cel<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cel<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cel<Long> H = a("last_slept", Codec.LONG);
   public static final cel<Long> I = a("last_woken", Codec.LONG);
   public static final cel<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cel<buc> K = a("nearest_visible_adult");
   public static final cel<clc> L = a("nearest_visible_wanted_item");
   public static final cel<bvj> M = a("nearest_visible_nemesis");
   public static final cel<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cel<cou> O = a("tempting_player");
   public static final cel<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cel<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cel<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cel<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cel<Boolean> T = a("long_jump_mid_jump");
   public static final cel<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cel<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cel<ezy> W = a("ram_target");
   public static final cel<bas> X = a("is_in_water", bas.b);
   public static final cel<bas> Y = a("is_pregnant", bas.b);
   public static final cel<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cel<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cel<UUID> ab = a("angry_at", kk.a);
   public static final cel<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cel<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cel<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cel<Boolean> af = a("disable_walk_to_admire_item");
   public static final cel<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cel<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cel<jh> ai = a("celebrate_location");
   public static final cel<Boolean> aj = a("dancing");
   public static final cel<cnc> ak = a("nearest_visible_huntable_hoglin");
   public static final cel<cnc> al = a("nearest_visible_baby_hoglin");
   public static final cel<cou> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cel<List<cnh>> an = a("nearby_adult_piglins");
   public static final cel<List<cnh>> ao = a("nearest_visible_adult_piglins");
   public static final cel<List<cnc>> ap = a("nearest_visible_adult_hoglins");
   public static final cel<cnh> aq = a("nearest_visible_adult_piglin");
   public static final cel<bvh> ar = a("nearest_visible_zombified");
   public static final cel<Integer> as = a("visible_adult_piglin_count");
   public static final cel<Integer> at = a("visible_adult_hoglin_count");
   public static final cel<cou> au = a("nearest_player_holding_wanted_item");
   public static final cel<Boolean> av = a("ate_recently");
   public static final cel<jh> aw = a("nearest_repellent");
   public static final cel<Boolean> ax = a("pacified");
   public static final cel<bvh> ay = a("roar_target");
   public static final cel<jh> az = a("disturbance_location");
   public static final cel<bas> aA = a("recent_projectile", bas.b);
   public static final cel<bas> aB = a("is_sniffing", bas.b);
   public static final cel<bas> aC = a("is_emerging", bas.b);
   public static final cel<bas> aD = a("roar_sound_delay", bas.b);
   public static final cel<bas> aE = a("dig_cooldown", bas.b);
   public static final cel<bas> aF = a("roar_sound_cooldown", bas.b);
   public static final cel<bas> aG = a("sniff_cooldown", bas.b);
   public static final cel<bas> aH = a("touch_cooldown", bas.b);
   public static final cel<bas> aI = a("vibration_cooldown", bas.b);
   public static final cel<bas> aJ = a("sonic_boom_cooldown", bas.b);
   public static final cel<bas> aK = a("sonic_boom_sound_cooldown", bas.b);
   public static final cel<bas> aL = a("sonic_boom_sound_delay", bas.b);
   public static final cel<UUID> aM = a("liked_player", kk.a);
   public static final cel<jp> aN = a("liked_noteblock", jp.b);
   public static final cel<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cel<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cel<List<jp>> aQ = a("sniffer_explored_positions", Codec.list(jp.b));
   public static final cel<jh> aR = a("sniffer_sniffing_target");
   public static final cel<Boolean> aS = a("sniffer_digging");
   public static final cel<Boolean> aT = a("sniffer_happy");
   public static final cel<bas> aU = a("breeze_jump_cooldown", bas.b);
   public static final cel<bas> aV = a("breeze_shoot", bas.b);
   public static final cel<bas> aW = a("breeze_shoot_charging", bas.b);
   public static final cel<bas> aX = a("breeze_shoot_recover", bas.b);
   public static final cel<bas> aY = a("breeze_shoot_cooldown", bas.b);
   public static final cel<bas> aZ = a("breeze_jump_inhaling", bas.b);
   public static final cel<jh> ba = a("breeze_jump_target", jh.a);
   public static final cel<bas> bb = a("breeze_leaving_water", bas.b);
   private final Optional<Codec<cek<U>>> bc;

   @VisibleForTesting
   public cel(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cek::a);
   }

   @Override
   public String toString() {
      return lz.z.b(this).toString();
   }

   public Optional<Codec<cek<U>>> a() {
      return this.bc;
   }

   private static <U> cel<U> a(String $$0, Codec<U> $$1) {
      return kd.a(lz.z, alj.b($$0), new cel<>(Optional.of($$1)));
   }

   private static <U> cel<U> a(String $$0) {
      return kd.a(lz.z, alj.b($$0), new cel<>(Optional.empty()));
   }
}
