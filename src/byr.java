import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class byr<U> {
   public static final byr<Void> a = a("dummy");
   public static final byr<ik> b = a("home", ik.a);
   public static final byr<ik> c = a("job_site", ik.a);
   public static final byr<ik> d = a("potential_job_site", ik.a);
   public static final byr<ik> e = a("meeting_point", ik.a);
   public static final byr<List<ik>> f = a("secondary_job_site");
   public static final byr<List<bpo>> g = a("mobs");
   public static final byr<byt> h = a("visible_mobs");
   public static final byr<List<bpo>> i = a("visible_villager_babies");
   public static final byr<List<cis>> j = a("nearest_players");
   public static final byr<cis> k = a("nearest_visible_player");
   public static final byr<cis> l = a("nearest_visible_targetable_player");
   public static final byr<byu> m = a("walk_target");
   public static final byr<bsu> n = a("look_target");
   public static final byr<bpo> o = a("attack_target");
   public static final byr<Boolean> p = a("attack_cooling_down");
   public static final byr<bpo> q = a("interaction_target");
   public static final byr<bor> r = a("breed_target");
   public static final byr<bow> s = a("ride_target");
   public static final byr<ejc> t = a("path");
   public static final byr<List<ik>> u = a("interactable_doors");
   public static final byr<Set<ik>> v = a("doors_to_close");
   public static final byr<ib> w = a("nearest_bed");
   public static final byr<bnv> x = a("hurt_by");
   public static final byr<bpo> y = a("hurt_by_entity");
   public static final byr<bpo> z = a("avoid_target");
   public static final byr<bpo> A = a("nearest_hostile");
   public static final byr<bpo> B = a("nearest_attackable");
   public static final byr<ik> C = a("hiding_place");
   public static final byr<Long> D = a("heard_bell_time");
   public static final byr<Long> E = a("cant_reach_walk_target_since");
   public static final byr<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final byr<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final byr<Long> H = a("last_slept", Codec.LONG);
   public static final byr<Long> I = a("last_woken", Codec.LONG);
   public static final byr<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final byr<bor> K = a("nearest_visible_adult");
   public static final byr<cfd> L = a("nearest_visible_wanted_item");
   public static final byr<bpq> M = a("nearest_visible_nemesis");
   public static final byr<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final byr<cis> O = a("tempting_player");
   public static final byr<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final byr<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final byr<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final byr<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final byr<Boolean> T = a("long_jump_mid_jump");
   public static final byr<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final byr<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final byr<epr> W = a("ram_target");
   public static final byr<axy> X = a("is_in_water", Codec.unit(axy.a));
   public static final byr<axy> Y = a("is_pregnant", Codec.unit(axy.a));
   public static final byr<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final byr<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final byr<UUID> ab = a("angry_at", jf.a);
   public static final byr<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final byr<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final byr<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final byr<Boolean> af = a("disable_walk_to_admire_item");
   public static final byr<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final byr<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final byr<ib> ai = a("celebrate_location");
   public static final byr<Boolean> aj = a("dancing");
   public static final byr<chc> ak = a("nearest_visible_huntable_hoglin");
   public static final byr<chc> al = a("nearest_visible_baby_hoglin");
   public static final byr<cis> am = a("nearest_targetable_player_not_wearing_gold");
   public static final byr<List<chh>> an = a("nearby_adult_piglins");
   public static final byr<List<chh>> ao = a("nearest_visible_adult_piglins");
   public static final byr<List<chc>> ap = a("nearest_visible_adult_hoglins");
   public static final byr<chh> aq = a("nearest_visible_adult_piglin");
   public static final byr<bpo> ar = a("nearest_visible_zombified");
   public static final byr<Integer> as = a("visible_adult_piglin_count");
   public static final byr<Integer> at = a("visible_adult_hoglin_count");
   public static final byr<cis> au = a("nearest_player_holding_wanted_item");
   public static final byr<Boolean> av = a("ate_recently");
   public static final byr<ib> aw = a("nearest_repellent");
   public static final byr<Boolean> ax = a("pacified");
   public static final byr<bpo> ay = a("roar_target");
   public static final byr<ib> az = a("disturbance_location");
   public static final byr<axy> aA = a("recent_projectile", Codec.unit(axy.a));
   public static final byr<axy> aB = a("is_sniffing", Codec.unit(axy.a));
   public static final byr<axy> aC = a("is_emerging", Codec.unit(axy.a));
   public static final byr<axy> aD = a("roar_sound_delay", Codec.unit(axy.a));
   public static final byr<axy> aE = a("dig_cooldown", Codec.unit(axy.a));
   public static final byr<axy> aF = a("roar_sound_cooldown", Codec.unit(axy.a));
   public static final byr<axy> aG = a("sniff_cooldown", Codec.unit(axy.a));
   public static final byr<axy> aH = a("touch_cooldown", Codec.unit(axy.a));
   public static final byr<axy> aI = a("vibration_cooldown", Codec.unit(axy.a));
   public static final byr<axy> aJ = a("sonic_boom_cooldown", Codec.unit(axy.a));
   public static final byr<axy> aK = a("sonic_boom_sound_cooldown", Codec.unit(axy.a));
   public static final byr<axy> aL = a("sonic_boom_sound_delay", Codec.unit(axy.a));
   public static final byr<UUID> aM = a("liked_player", jf.a);
   public static final byr<ik> aN = a("liked_noteblock", ik.a);
   public static final byr<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final byr<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final byr<List<ik>> aQ = a("sniffer_explored_positions", Codec.list(ik.a));
   public static final byr<ib> aR = a("sniffer_sniffing_target");
   public static final byr<Boolean> aS = a("sniffer_digging");
   public static final byr<Boolean> aT = a("sniffer_happy");
   public static final byr<axy> aU = a("breeze_jump_cooldown", Codec.unit(axy.a));
   public static final byr<axy> aV = a("breeze_shoot", Codec.unit(axy.a));
   public static final byr<axy> aW = a("breeze_shoot_charging", Codec.unit(axy.a));
   public static final byr<axy> aX = a("breeze_shoot_recover", Codec.unit(axy.a));
   public static final byr<axy> aY = a("breeze_shoot_cooldown", Codec.unit(axy.a));
   public static final byr<axy> aZ = a("breeze_jump_inhaling", Codec.unit(axy.a));
   public static final byr<ib> ba = a("breeze_jump_target", ib.a);
   public static final byr<axy> bb = a("breeze_leaving_water", Codec.unit(axy.a));
   private final Optional<Codec<byq<U>>> bc;

   @VisibleForTesting
   public byr(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(byq::a);
   }

   @Override
   public String toString() {
      return ki.B.b(this).toString();
   }

   public Optional<Codec<byq<U>>> a() {
      return this.bc;
   }

   private static <U> byr<U> a(String $$0, Codec<U> $$1) {
      return iy.a(ki.B, new ajh($$0), new byr<>(Optional.of($$1)));
   }

   private static <U> byr<U> a(String $$0) {
      return iy.a(ki.B, new ajh($$0), new byr<>(Optional.empty()));
   }
}
