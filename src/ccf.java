import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class ccf<U> {
   public static final ccf<Void> a = a("dummy");
   public static final ccf<ji> b = a("home", ji.b);
   public static final ccf<ji> c = a("job_site", ji.b);
   public static final ccf<ji> d = a("potential_job_site", ji.b);
   public static final ccf<ji> e = a("meeting_point", ji.b);
   public static final ccf<List<ji>> f = a("secondary_job_site");
   public static final ccf<List<btb>> g = a("mobs");
   public static final ccf<cch> h = a("visible_mobs");
   public static final ccf<List<btb>> i = a("visible_villager_babies");
   public static final ccf<List<cmk>> j = a("nearest_players");
   public static final ccf<cmk> k = a("nearest_visible_player");
   public static final ccf<cmk> l = a("nearest_visible_targetable_player");
   public static final ccf<cci> m = a("walk_target");
   public static final ccf<bwi> n = a("look_target");
   public static final ccf<btb> o = a("attack_target");
   public static final ccf<Boolean> p = a("attack_cooling_down");
   public static final ccf<btb> q = a("interaction_target");
   public static final ccf<bsa> r = a("breed_target");
   public static final ccf<bsg> s = a("ride_target");
   public static final ccf<eov> t = a("path");
   public static final ccf<List<ji>> u = a("interactable_doors");
   public static final ccf<Set<ji>> v = a("doors_to_close");
   public static final ccf<ja> w = a("nearest_bed");
   public static final ccf<bqz> x = a("hurt_by");
   public static final ccf<btb> y = a("hurt_by_entity");
   public static final ccf<btb> z = a("avoid_target");
   public static final ccf<btb> A = a("nearest_hostile");
   public static final ccf<btb> B = a("nearest_attackable");
   public static final ccf<ji> C = a("hiding_place");
   public static final ccf<Long> D = a("heard_bell_time");
   public static final ccf<Long> E = a("cant_reach_walk_target_since");
   public static final ccf<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final ccf<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final ccf<Long> H = a("last_slept", Codec.LONG);
   public static final ccf<Long> I = a("last_woken", Codec.LONG);
   public static final ccf<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final ccf<bsa> K = a("nearest_visible_adult");
   public static final ccf<ciu> L = a("nearest_visible_wanted_item");
   public static final ccf<btd> M = a("nearest_visible_nemesis");
   public static final ccf<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final ccf<cmk> O = a("tempting_player");
   public static final ccf<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final ccf<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final ccf<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final ccf<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final ccf<Boolean> T = a("long_jump_mid_jump");
   public static final ccf<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final ccf<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final ccf<ewf> W = a("ram_target");
   public static final ccf<azk> X = a("is_in_water", azk.b);
   public static final ccf<azk> Y = a("is_pregnant", azk.b);
   public static final ccf<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final ccf<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final ccf<UUID> ab = a("angry_at", kd.a);
   public static final ccf<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final ccf<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final ccf<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final ccf<Boolean> af = a("disable_walk_to_admire_item");
   public static final ccf<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final ccf<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final ccf<ja> ai = a("celebrate_location");
   public static final ccf<Boolean> aj = a("dancing");
   public static final ccf<cku> ak = a("nearest_visible_huntable_hoglin");
   public static final ccf<cku> al = a("nearest_visible_baby_hoglin");
   public static final ccf<cmk> am = a("nearest_targetable_player_not_wearing_gold");
   public static final ccf<List<ckz>> an = a("nearby_adult_piglins");
   public static final ccf<List<ckz>> ao = a("nearest_visible_adult_piglins");
   public static final ccf<List<cku>> ap = a("nearest_visible_adult_hoglins");
   public static final ccf<ckz> aq = a("nearest_visible_adult_piglin");
   public static final ccf<btb> ar = a("nearest_visible_zombified");
   public static final ccf<Integer> as = a("visible_adult_piglin_count");
   public static final ccf<Integer> at = a("visible_adult_hoglin_count");
   public static final ccf<cmk> au = a("nearest_player_holding_wanted_item");
   public static final ccf<Boolean> av = a("ate_recently");
   public static final ccf<ja> aw = a("nearest_repellent");
   public static final ccf<Boolean> ax = a("pacified");
   public static final ccf<btb> ay = a("roar_target");
   public static final ccf<ja> az = a("disturbance_location");
   public static final ccf<azk> aA = a("recent_projectile", azk.b);
   public static final ccf<azk> aB = a("is_sniffing", azk.b);
   public static final ccf<azk> aC = a("is_emerging", azk.b);
   public static final ccf<azk> aD = a("roar_sound_delay", azk.b);
   public static final ccf<azk> aE = a("dig_cooldown", azk.b);
   public static final ccf<azk> aF = a("roar_sound_cooldown", azk.b);
   public static final ccf<azk> aG = a("sniff_cooldown", azk.b);
   public static final ccf<azk> aH = a("touch_cooldown", azk.b);
   public static final ccf<azk> aI = a("vibration_cooldown", azk.b);
   public static final ccf<azk> aJ = a("sonic_boom_cooldown", azk.b);
   public static final ccf<azk> aK = a("sonic_boom_sound_cooldown", azk.b);
   public static final ccf<azk> aL = a("sonic_boom_sound_delay", azk.b);
   public static final ccf<UUID> aM = a("liked_player", kd.a);
   public static final ccf<ji> aN = a("liked_noteblock", ji.b);
   public static final ccf<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final ccf<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final ccf<List<ji>> aQ = a("sniffer_explored_positions", Codec.list(ji.b));
   public static final ccf<ja> aR = a("sniffer_sniffing_target");
   public static final ccf<Boolean> aS = a("sniffer_digging");
   public static final ccf<Boolean> aT = a("sniffer_happy");
   public static final ccf<azk> aU = a("breeze_jump_cooldown", azk.b);
   public static final ccf<azk> aV = a("breeze_shoot", azk.b);
   public static final ccf<azk> aW = a("breeze_shoot_charging", azk.b);
   public static final ccf<azk> aX = a("breeze_shoot_recover", azk.b);
   public static final ccf<azk> aY = a("breeze_shoot_cooldown", azk.b);
   public static final ccf<azk> aZ = a("breeze_jump_inhaling", azk.b);
   public static final ccf<ja> ba = a("breeze_jump_target", ja.a);
   public static final ccf<azk> bb = a("breeze_leaving_water", azk.b);
   private final Optional<Codec<cce<U>>> bc;

   @VisibleForTesting
   public ccf(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cce::a);
   }

   @Override
   public String toString() {
      return lq.z.b(this).toString();
   }

   public Optional<Codec<cce<U>>> a() {
      return this.bc;
   }

   private static <U> ccf<U> a(String $$0, Codec<U> $$1) {
      return jw.a(lq.z, new akk($$0), new ccf<>(Optional.of($$1)));
   }

   private static <U> ccf<U> a(String $$0) {
      return jw.a(lq.z, new akk($$0), new ccf<>(Optional.empty()));
   }
}
