import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cdn<U> {
   public static final cdn<Void> a = a("dummy");
   public static final cdn<jm> b = a("home", jm.b);
   public static final cdn<jm> c = a("job_site", jm.b);
   public static final cdn<jm> d = a("potential_job_site", jm.b);
   public static final cdn<jm> e = a("meeting_point", jm.b);
   public static final cdn<List<jm>> f = a("secondary_job_site");
   public static final cdn<List<buk>> g = a("mobs");
   public static final cdn<cdp> h = a("visible_mobs");
   public static final cdn<List<buk>> i = a("visible_villager_babies");
   public static final cdn<List<cnu>> j = a("nearest_players");
   public static final cdn<cnu> k = a("nearest_visible_player");
   public static final cdn<cnu> l = a("nearest_visible_targetable_player");
   public static final cdn<cdq> m = a("walk_target");
   public static final cdn<bxq> n = a("look_target");
   public static final cdn<buk> o = a("attack_target");
   public static final cdn<Boolean> p = a("attack_cooling_down");
   public static final cdn<buk> q = a("interaction_target");
   public static final cdn<bth> r = a("breed_target");
   public static final cdn<bto> s = a("ride_target");
   public static final cdn<erd> t = a("path");
   public static final cdn<List<jm>> u = a("interactable_doors");
   public static final cdn<Set<jm>> v = a("doors_to_close");
   public static final cdn<je> w = a("nearest_bed");
   public static final cdn<bsg> x = a("hurt_by");
   public static final cdn<buk> y = a("hurt_by_entity");
   public static final cdn<buk> z = a("avoid_target");
   public static final cdn<buk> A = a("nearest_hostile");
   public static final cdn<buk> B = a("nearest_attackable");
   public static final cdn<jm> C = a("hiding_place");
   public static final cdn<Long> D = a("heard_bell_time");
   public static final cdn<Long> E = a("cant_reach_walk_target_since");
   public static final cdn<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cdn<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cdn<Long> H = a("last_slept", Codec.LONG);
   public static final cdn<Long> I = a("last_woken", Codec.LONG);
   public static final cdn<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cdn<bth> K = a("nearest_visible_adult");
   public static final cdn<cke> L = a("nearest_visible_wanted_item");
   public static final cdn<bum> M = a("nearest_visible_nemesis");
   public static final cdn<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cdn<cnu> O = a("tempting_player");
   public static final cdn<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cdn<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cdn<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cdn<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cdn<Boolean> T = a("long_jump_mid_jump");
   public static final cdn<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cdn<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cdn<eys> W = a("ram_target");
   public static final cdn<bai> X = a("is_in_water", bai.b);
   public static final cdn<bai> Y = a("is_pregnant", bai.b);
   public static final cdn<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cdn<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cdn<UUID> ab = a("angry_at", kh.a);
   public static final cdn<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cdn<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cdn<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cdn<Boolean> af = a("disable_walk_to_admire_item");
   public static final cdn<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cdn<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cdn<je> ai = a("celebrate_location");
   public static final cdn<Boolean> aj = a("dancing");
   public static final cdn<cme> ak = a("nearest_visible_huntable_hoglin");
   public static final cdn<cme> al = a("nearest_visible_baby_hoglin");
   public static final cdn<cnu> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cdn<List<cmj>> an = a("nearby_adult_piglins");
   public static final cdn<List<cmj>> ao = a("nearest_visible_adult_piglins");
   public static final cdn<List<cme>> ap = a("nearest_visible_adult_hoglins");
   public static final cdn<cmj> aq = a("nearest_visible_adult_piglin");
   public static final cdn<buk> ar = a("nearest_visible_zombified");
   public static final cdn<Integer> as = a("visible_adult_piglin_count");
   public static final cdn<Integer> at = a("visible_adult_hoglin_count");
   public static final cdn<cnu> au = a("nearest_player_holding_wanted_item");
   public static final cdn<Boolean> av = a("ate_recently");
   public static final cdn<je> aw = a("nearest_repellent");
   public static final cdn<Boolean> ax = a("pacified");
   public static final cdn<buk> ay = a("roar_target");
   public static final cdn<je> az = a("disturbance_location");
   public static final cdn<bai> aA = a("recent_projectile", bai.b);
   public static final cdn<bai> aB = a("is_sniffing", bai.b);
   public static final cdn<bai> aC = a("is_emerging", bai.b);
   public static final cdn<bai> aD = a("roar_sound_delay", bai.b);
   public static final cdn<bai> aE = a("dig_cooldown", bai.b);
   public static final cdn<bai> aF = a("roar_sound_cooldown", bai.b);
   public static final cdn<bai> aG = a("sniff_cooldown", bai.b);
   public static final cdn<bai> aH = a("touch_cooldown", bai.b);
   public static final cdn<bai> aI = a("vibration_cooldown", bai.b);
   public static final cdn<bai> aJ = a("sonic_boom_cooldown", bai.b);
   public static final cdn<bai> aK = a("sonic_boom_sound_cooldown", bai.b);
   public static final cdn<bai> aL = a("sonic_boom_sound_delay", bai.b);
   public static final cdn<UUID> aM = a("liked_player", kh.a);
   public static final cdn<jm> aN = a("liked_noteblock", jm.b);
   public static final cdn<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cdn<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cdn<List<jm>> aQ = a("sniffer_explored_positions", Codec.list(jm.b));
   public static final cdn<je> aR = a("sniffer_sniffing_target");
   public static final cdn<Boolean> aS = a("sniffer_digging");
   public static final cdn<Boolean> aT = a("sniffer_happy");
   public static final cdn<bai> aU = a("breeze_jump_cooldown", bai.b);
   public static final cdn<bai> aV = a("breeze_shoot", bai.b);
   public static final cdn<bai> aW = a("breeze_shoot_charging", bai.b);
   public static final cdn<bai> aX = a("breeze_shoot_recover", bai.b);
   public static final cdn<bai> aY = a("breeze_shoot_cooldown", bai.b);
   public static final cdn<bai> aZ = a("breeze_jump_inhaling", bai.b);
   public static final cdn<je> ba = a("breeze_jump_target", je.a);
   public static final cdn<bai> bb = a("breeze_leaving_water", bai.b);
   private final Optional<Codec<cdm<U>>> bc;

   @VisibleForTesting
   public cdn(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cdm::a);
   }

   @Override
   public String toString() {
      return lu.z.b(this).toString();
   }

   public Optional<Codec<cdm<U>>> a() {
      return this.bc;
   }

   private static <U> cdn<U> a(String $$0, Codec<U> $$1) {
      return ka.a(lu.z, alc.b($$0), new cdn<>(Optional.of($$1)));
   }

   private static <U> cdn<U> a(String $$0) {
      return ka.a(lu.z, alc.b($$0), new cdn<>(Optional.empty()));
   }
}
