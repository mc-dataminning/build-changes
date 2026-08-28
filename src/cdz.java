import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cdz<U> {
   public static final cdz<Void> a = a("dummy");
   public static final cdz<jo> b = a("home", jo.b);
   public static final cdz<jo> c = a("job_site", jo.b);
   public static final cdz<jo> d = a("potential_job_site", jo.b);
   public static final cdz<jo> e = a("meeting_point", jo.b);
   public static final cdz<List<jo>> f = a("secondary_job_site");
   public static final cdz<List<buv>> g = a("mobs");
   public static final cdz<ceb> h = a("visible_mobs");
   public static final cdz<List<buv>> i = a("visible_villager_babies");
   public static final cdz<List<coh>> j = a("nearest_players");
   public static final cdz<coh> k = a("nearest_visible_player");
   public static final cdz<coh> l = a("nearest_visible_targetable_player");
   public static final cdz<cec> m = a("walk_target");
   public static final cdz<byc> n = a("look_target");
   public static final cdz<buv> o = a("attack_target");
   public static final cdz<Boolean> p = a("attack_cooling_down");
   public static final cdz<buv> q = a("interaction_target");
   public static final cdz<btq> r = a("breed_target");
   public static final cdz<btz> s = a("ride_target");
   public static final cdz<ers> t = a("path");
   public static final cdz<List<jo>> u = a("interactable_doors");
   public static final cdz<Set<jo>> v = a("doors_to_close");
   public static final cdz<jg> w = a("nearest_bed");
   public static final cdz<bsp> x = a("hurt_by");
   public static final cdz<buv> y = a("hurt_by_entity");
   public static final cdz<buv> z = a("avoid_target");
   public static final cdz<buv> A = a("nearest_hostile");
   public static final cdz<buv> B = a("nearest_attackable");
   public static final cdz<jo> C = a("hiding_place");
   public static final cdz<Long> D = a("heard_bell_time");
   public static final cdz<Long> E = a("cant_reach_walk_target_since");
   public static final cdz<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cdz<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cdz<Long> H = a("last_slept", Codec.LONG);
   public static final cdz<Long> I = a("last_woken", Codec.LONG);
   public static final cdz<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cdz<btq> K = a("nearest_visible_adult");
   public static final cdz<ckq> L = a("nearest_visible_wanted_item");
   public static final cdz<bux> M = a("nearest_visible_nemesis");
   public static final cdz<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cdz<coh> O = a("tempting_player");
   public static final cdz<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cdz<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cdz<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cdz<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cdz<Boolean> T = a("long_jump_mid_jump");
   public static final cdz<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cdz<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cdz<ezh> W = a("ram_target");
   public static final cdz<bao> X = a("is_in_water", bao.b);
   public static final cdz<bao> Y = a("is_pregnant", bao.b);
   public static final cdz<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cdz<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cdz<UUID> ab = a("angry_at", kj.a);
   public static final cdz<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cdz<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cdz<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cdz<Boolean> af = a("disable_walk_to_admire_item");
   public static final cdz<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cdz<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cdz<jg> ai = a("celebrate_location");
   public static final cdz<Boolean> aj = a("dancing");
   public static final cdz<cmq> ak = a("nearest_visible_huntable_hoglin");
   public static final cdz<cmq> al = a("nearest_visible_baby_hoglin");
   public static final cdz<coh> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cdz<List<cmv>> an = a("nearby_adult_piglins");
   public static final cdz<List<cmv>> ao = a("nearest_visible_adult_piglins");
   public static final cdz<List<cmq>> ap = a("nearest_visible_adult_hoglins");
   public static final cdz<cmv> aq = a("nearest_visible_adult_piglin");
   public static final cdz<buv> ar = a("nearest_visible_zombified");
   public static final cdz<Integer> as = a("visible_adult_piglin_count");
   public static final cdz<Integer> at = a("visible_adult_hoglin_count");
   public static final cdz<coh> au = a("nearest_player_holding_wanted_item");
   public static final cdz<Boolean> av = a("ate_recently");
   public static final cdz<jg> aw = a("nearest_repellent");
   public static final cdz<Boolean> ax = a("pacified");
   public static final cdz<buv> ay = a("roar_target");
   public static final cdz<jg> az = a("disturbance_location");
   public static final cdz<bao> aA = a("recent_projectile", bao.b);
   public static final cdz<bao> aB = a("is_sniffing", bao.b);
   public static final cdz<bao> aC = a("is_emerging", bao.b);
   public static final cdz<bao> aD = a("roar_sound_delay", bao.b);
   public static final cdz<bao> aE = a("dig_cooldown", bao.b);
   public static final cdz<bao> aF = a("roar_sound_cooldown", bao.b);
   public static final cdz<bao> aG = a("sniff_cooldown", bao.b);
   public static final cdz<bao> aH = a("touch_cooldown", bao.b);
   public static final cdz<bao> aI = a("vibration_cooldown", bao.b);
   public static final cdz<bao> aJ = a("sonic_boom_cooldown", bao.b);
   public static final cdz<bao> aK = a("sonic_boom_sound_cooldown", bao.b);
   public static final cdz<bao> aL = a("sonic_boom_sound_delay", bao.b);
   public static final cdz<UUID> aM = a("liked_player", kj.a);
   public static final cdz<jo> aN = a("liked_noteblock", jo.b);
   public static final cdz<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cdz<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cdz<List<jo>> aQ = a("sniffer_explored_positions", Codec.list(jo.b));
   public static final cdz<jg> aR = a("sniffer_sniffing_target");
   public static final cdz<Boolean> aS = a("sniffer_digging");
   public static final cdz<Boolean> aT = a("sniffer_happy");
   public static final cdz<bao> aU = a("breeze_jump_cooldown", bao.b);
   public static final cdz<bao> aV = a("breeze_shoot", bao.b);
   public static final cdz<bao> aW = a("breeze_shoot_charging", bao.b);
   public static final cdz<bao> aX = a("breeze_shoot_recover", bao.b);
   public static final cdz<bao> aY = a("breeze_shoot_cooldown", bao.b);
   public static final cdz<bao> aZ = a("breeze_jump_inhaling", bao.b);
   public static final cdz<jg> ba = a("breeze_jump_target", jg.a);
   public static final cdz<bao> bb = a("breeze_leaving_water", bao.b);
   private final Optional<Codec<cdy<U>>> bc;

   @VisibleForTesting
   public cdz(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cdy::a);
   }

   @Override
   public String toString() {
      return lx.z.b(this).toString();
   }

   public Optional<Codec<cdy<U>>> a() {
      return this.bc;
   }

   private static <U> cdz<U> a(String $$0, Codec<U> $$1) {
      return kc.a(lx.z, alh.b($$0), new cdz<>(Optional.of($$1)));
   }

   private static <U> cdz<U> a(String $$0) {
      return kc.a(lx.z, alh.b($$0), new cdz<>(Optional.empty()));
   }
}
