import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class ccg<U> {
   public static final ccg<Void> a = a("dummy");
   public static final ccg<ji> b = a("home", ji.b);
   public static final ccg<ji> c = a("job_site", ji.b);
   public static final ccg<ji> d = a("potential_job_site", ji.b);
   public static final ccg<ji> e = a("meeting_point", ji.b);
   public static final ccg<List<ji>> f = a("secondary_job_site");
   public static final ccg<List<btc>> g = a("mobs");
   public static final ccg<cci> h = a("visible_mobs");
   public static final ccg<List<btc>> i = a("visible_villager_babies");
   public static final ccg<List<cml>> j = a("nearest_players");
   public static final ccg<cml> k = a("nearest_visible_player");
   public static final ccg<cml> l = a("nearest_visible_targetable_player");
   public static final ccg<ccj> m = a("walk_target");
   public static final ccg<bwj> n = a("look_target");
   public static final ccg<btc> o = a("attack_target");
   public static final ccg<Boolean> p = a("attack_cooling_down");
   public static final ccg<btc> q = a("interaction_target");
   public static final ccg<bsb> r = a("breed_target");
   public static final ccg<bsh> s = a("ride_target");
   public static final ccg<eox> t = a("path");
   public static final ccg<List<ji>> u = a("interactable_doors");
   public static final ccg<Set<ji>> v = a("doors_to_close");
   public static final ccg<ja> w = a("nearest_bed");
   public static final ccg<bra> x = a("hurt_by");
   public static final ccg<btc> y = a("hurt_by_entity");
   public static final ccg<btc> z = a("avoid_target");
   public static final ccg<btc> A = a("nearest_hostile");
   public static final ccg<btc> B = a("nearest_attackable");
   public static final ccg<ji> C = a("hiding_place");
   public static final ccg<Long> D = a("heard_bell_time");
   public static final ccg<Long> E = a("cant_reach_walk_target_since");
   public static final ccg<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final ccg<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final ccg<Long> H = a("last_slept", Codec.LONG);
   public static final ccg<Long> I = a("last_woken", Codec.LONG);
   public static final ccg<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final ccg<bsb> K = a("nearest_visible_adult");
   public static final ccg<civ> L = a("nearest_visible_wanted_item");
   public static final ccg<bte> M = a("nearest_visible_nemesis");
   public static final ccg<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final ccg<cml> O = a("tempting_player");
   public static final ccg<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final ccg<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final ccg<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final ccg<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final ccg<Boolean> T = a("long_jump_mid_jump");
   public static final ccg<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final ccg<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final ccg<ewh> W = a("ram_target");
   public static final ccg<azk> X = a("is_in_water", azk.b);
   public static final ccg<azk> Y = a("is_pregnant", azk.b);
   public static final ccg<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final ccg<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final ccg<UUID> ab = a("angry_at", kd.a);
   public static final ccg<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final ccg<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final ccg<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final ccg<Boolean> af = a("disable_walk_to_admire_item");
   public static final ccg<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final ccg<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final ccg<ja> ai = a("celebrate_location");
   public static final ccg<Boolean> aj = a("dancing");
   public static final ccg<ckv> ak = a("nearest_visible_huntable_hoglin");
   public static final ccg<ckv> al = a("nearest_visible_baby_hoglin");
   public static final ccg<cml> am = a("nearest_targetable_player_not_wearing_gold");
   public static final ccg<List<cla>> an = a("nearby_adult_piglins");
   public static final ccg<List<cla>> ao = a("nearest_visible_adult_piglins");
   public static final ccg<List<ckv>> ap = a("nearest_visible_adult_hoglins");
   public static final ccg<cla> aq = a("nearest_visible_adult_piglin");
   public static final ccg<btc> ar = a("nearest_visible_zombified");
   public static final ccg<Integer> as = a("visible_adult_piglin_count");
   public static final ccg<Integer> at = a("visible_adult_hoglin_count");
   public static final ccg<cml> au = a("nearest_player_holding_wanted_item");
   public static final ccg<Boolean> av = a("ate_recently");
   public static final ccg<ja> aw = a("nearest_repellent");
   public static final ccg<Boolean> ax = a("pacified");
   public static final ccg<btc> ay = a("roar_target");
   public static final ccg<ja> az = a("disturbance_location");
   public static final ccg<azk> aA = a("recent_projectile", azk.b);
   public static final ccg<azk> aB = a("is_sniffing", azk.b);
   public static final ccg<azk> aC = a("is_emerging", azk.b);
   public static final ccg<azk> aD = a("roar_sound_delay", azk.b);
   public static final ccg<azk> aE = a("dig_cooldown", azk.b);
   public static final ccg<azk> aF = a("roar_sound_cooldown", azk.b);
   public static final ccg<azk> aG = a("sniff_cooldown", azk.b);
   public static final ccg<azk> aH = a("touch_cooldown", azk.b);
   public static final ccg<azk> aI = a("vibration_cooldown", azk.b);
   public static final ccg<azk> aJ = a("sonic_boom_cooldown", azk.b);
   public static final ccg<azk> aK = a("sonic_boom_sound_cooldown", azk.b);
   public static final ccg<azk> aL = a("sonic_boom_sound_delay", azk.b);
   public static final ccg<UUID> aM = a("liked_player", kd.a);
   public static final ccg<ji> aN = a("liked_noteblock", ji.b);
   public static final ccg<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final ccg<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final ccg<List<ji>> aQ = a("sniffer_explored_positions", Codec.list(ji.b));
   public static final ccg<ja> aR = a("sniffer_sniffing_target");
   public static final ccg<Boolean> aS = a("sniffer_digging");
   public static final ccg<Boolean> aT = a("sniffer_happy");
   public static final ccg<azk> aU = a("breeze_jump_cooldown", azk.b);
   public static final ccg<azk> aV = a("breeze_shoot", azk.b);
   public static final ccg<azk> aW = a("breeze_shoot_charging", azk.b);
   public static final ccg<azk> aX = a("breeze_shoot_recover", azk.b);
   public static final ccg<azk> aY = a("breeze_shoot_cooldown", azk.b);
   public static final ccg<azk> aZ = a("breeze_jump_inhaling", azk.b);
   public static final ccg<ja> ba = a("breeze_jump_target", ja.a);
   public static final ccg<azk> bb = a("breeze_leaving_water", azk.b);
   private final Optional<Codec<ccf<U>>> bc;

   @VisibleForTesting
   public ccg(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(ccf::a);
   }

   @Override
   public String toString() {
      return lq.z.b(this).toString();
   }

   public Optional<Codec<ccf<U>>> a() {
      return this.bc;
   }

   private static <U> ccg<U> a(String $$0, Codec<U> $$1) {
      return jw.a(lq.z, new akk($$0), new ccg<>(Optional.of($$1)));
   }

   private static <U> ccg<U> a(String $$0) {
      return jw.a(lq.z, new akk($$0), new ccg<>(Optional.empty()));
   }
}
