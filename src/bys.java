import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bys<U> {
   public static final bys<Void> a = a("dummy");
   public static final bys<ik> b = a("home", ik.a);
   public static final bys<ik> c = a("job_site", ik.a);
   public static final bys<ik> d = a("potential_job_site", ik.a);
   public static final bys<ik> e = a("meeting_point", ik.a);
   public static final bys<List<ik>> f = a("secondary_job_site");
   public static final bys<List<bpp>> g = a("mobs");
   public static final bys<byu> h = a("visible_mobs");
   public static final bys<List<bpp>> i = a("visible_villager_babies");
   public static final bys<List<ciu>> j = a("nearest_players");
   public static final bys<ciu> k = a("nearest_visible_player");
   public static final bys<ciu> l = a("nearest_visible_targetable_player");
   public static final bys<byv> m = a("walk_target");
   public static final bys<bsv> n = a("look_target");
   public static final bys<bpp> o = a("attack_target");
   public static final bys<Boolean> p = a("attack_cooling_down");
   public static final bys<bpp> q = a("interaction_target");
   public static final bys<bos> r = a("breed_target");
   public static final bys<box> s = a("ride_target");
   public static final bys<ejd> t = a("path");
   public static final bys<List<ik>> u = a("interactable_doors");
   public static final bys<Set<ik>> v = a("doors_to_close");
   public static final bys<ib> w = a("nearest_bed");
   public static final bys<bnw> x = a("hurt_by");
   public static final bys<bpp> y = a("hurt_by_entity");
   public static final bys<bpp> z = a("avoid_target");
   public static final bys<bpp> A = a("nearest_hostile");
   public static final bys<bpp> B = a("nearest_attackable");
   public static final bys<ik> C = a("hiding_place");
   public static final bys<Long> D = a("heard_bell_time");
   public static final bys<Long> E = a("cant_reach_walk_target_since");
   public static final bys<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bys<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final bys<Long> H = a("last_slept", Codec.LONG);
   public static final bys<Long> I = a("last_woken", Codec.LONG);
   public static final bys<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final bys<bos> K = a("nearest_visible_adult");
   public static final bys<cfe> L = a("nearest_visible_wanted_item");
   public static final bys<bpr> M = a("nearest_visible_nemesis");
   public static final bys<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final bys<ciu> O = a("tempting_player");
   public static final bys<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final bys<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final bys<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final bys<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final bys<Boolean> T = a("long_jump_mid_jump");
   public static final bys<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final bys<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final bys<ept> W = a("ram_target");
   public static final bys<axy> X = a("is_in_water", Codec.unit(axy.a));
   public static final bys<axy> Y = a("is_pregnant", Codec.unit(axy.a));
   public static final bys<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final bys<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final bys<UUID> ab = a("angry_at", jf.a);
   public static final bys<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final bys<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final bys<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final bys<Boolean> af = a("disable_walk_to_admire_item");
   public static final bys<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final bys<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final bys<ib> ai = a("celebrate_location");
   public static final bys<Boolean> aj = a("dancing");
   public static final bys<che> ak = a("nearest_visible_huntable_hoglin");
   public static final bys<che> al = a("nearest_visible_baby_hoglin");
   public static final bys<ciu> am = a("nearest_targetable_player_not_wearing_gold");
   public static final bys<List<chj>> an = a("nearby_adult_piglins");
   public static final bys<List<chj>> ao = a("nearest_visible_adult_piglins");
   public static final bys<List<che>> ap = a("nearest_visible_adult_hoglins");
   public static final bys<chj> aq = a("nearest_visible_adult_piglin");
   public static final bys<bpp> ar = a("nearest_visible_zombified");
   public static final bys<Integer> as = a("visible_adult_piglin_count");
   public static final bys<Integer> at = a("visible_adult_hoglin_count");
   public static final bys<ciu> au = a("nearest_player_holding_wanted_item");
   public static final bys<Boolean> av = a("ate_recently");
   public static final bys<ib> aw = a("nearest_repellent");
   public static final bys<Boolean> ax = a("pacified");
   public static final bys<bpp> ay = a("roar_target");
   public static final bys<ib> az = a("disturbance_location");
   public static final bys<axy> aA = a("recent_projectile", Codec.unit(axy.a));
   public static final bys<axy> aB = a("is_sniffing", Codec.unit(axy.a));
   public static final bys<axy> aC = a("is_emerging", Codec.unit(axy.a));
   public static final bys<axy> aD = a("roar_sound_delay", Codec.unit(axy.a));
   public static final bys<axy> aE = a("dig_cooldown", Codec.unit(axy.a));
   public static final bys<axy> aF = a("roar_sound_cooldown", Codec.unit(axy.a));
   public static final bys<axy> aG = a("sniff_cooldown", Codec.unit(axy.a));
   public static final bys<axy> aH = a("touch_cooldown", Codec.unit(axy.a));
   public static final bys<axy> aI = a("vibration_cooldown", Codec.unit(axy.a));
   public static final bys<axy> aJ = a("sonic_boom_cooldown", Codec.unit(axy.a));
   public static final bys<axy> aK = a("sonic_boom_sound_cooldown", Codec.unit(axy.a));
   public static final bys<axy> aL = a("sonic_boom_sound_delay", Codec.unit(axy.a));
   public static final bys<UUID> aM = a("liked_player", jf.a);
   public static final bys<ik> aN = a("liked_noteblock", ik.a);
   public static final bys<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bys<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bys<List<ik>> aQ = a("sniffer_explored_positions", Codec.list(ik.a));
   public static final bys<ib> aR = a("sniffer_sniffing_target");
   public static final bys<Boolean> aS = a("sniffer_digging");
   public static final bys<Boolean> aT = a("sniffer_happy");
   public static final bys<axy> aU = a("breeze_jump_cooldown", Codec.unit(axy.a));
   public static final bys<axy> aV = a("breeze_shoot", Codec.unit(axy.a));
   public static final bys<axy> aW = a("breeze_shoot_charging", Codec.unit(axy.a));
   public static final bys<axy> aX = a("breeze_shoot_recover", Codec.unit(axy.a));
   public static final bys<axy> aY = a("breeze_shoot_cooldown", Codec.unit(axy.a));
   public static final bys<axy> aZ = a("breeze_jump_inhaling", Codec.unit(axy.a));
   public static final bys<ib> ba = a("breeze_jump_target", ib.a);
   public static final bys<axy> bb = a("breeze_leaving_water", Codec.unit(axy.a));
   private final Optional<Codec<byr<U>>> bc;

   @VisibleForTesting
   public bys(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(byr::a);
   }

   @Override
   public String toString() {
      return ki.B.b(this).toString();
   }

   public Optional<Codec<byr<U>>> a() {
      return this.bc;
   }

   private static <U> bys<U> a(String $$0, Codec<U> $$1) {
      return iy.a(ki.B, new ajh($$0), new bys<>(Optional.of($$1)));
   }

   private static <U> bys<U> a(String $$0) {
      return iy.a(ki.B, new ajh($$0), new bys<>(Optional.empty()));
   }
}
