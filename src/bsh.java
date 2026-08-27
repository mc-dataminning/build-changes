import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bsh<U> {
   public static final bsh<Void> a = a("dummy");
   public static final bsh<hd> b = a("home", hd.a);
   public static final bsh<hd> c = a("job_site", hd.a);
   public static final bsh<hd> d = a("potential_job_site", hd.a);
   public static final bsh<hd> e = a("meeting_point", hd.a);
   public static final bsh<List<hd>> f = a("secondary_job_site");
   public static final bsh<List<bjg>> g = a("mobs");
   public static final bsh<bsj> h = a("visible_mobs");
   public static final bsh<List<bjg>> i = a("visible_villager_babies");
   public static final bsh<List<cbu>> j = a("nearest_players");
   public static final bsh<cbu> k = a("nearest_visible_player");
   public static final bsh<cbu> l = a("nearest_visible_targetable_player");
   public static final bsh<bsk> m = a("walk_target");
   public static final bsh<bmk> n = a("look_target");
   public static final bsh<bjg> o = a("attack_target");
   public static final bsh<Boolean> p = a("attack_cooling_down");
   public static final bsh<bjg> q = a("interaction_target");
   public static final bsh<bil> r = a("breed_target");
   public static final bsh<biq> s = a("ride_target");
   public static final bsh<ebb> t = a("path");
   public static final bsh<List<hd>> u = a("interactable_doors");
   public static final bsh<Set<hd>> v = a("doors_to_close");
   public static final bsh<gw> w = a("nearest_bed");
   public static final bsh<bho> x = a("hurt_by");
   public static final bsh<bjg> y = a("hurt_by_entity");
   public static final bsh<bjg> z = a("avoid_target");
   public static final bsh<bjg> A = a("nearest_hostile");
   public static final bsh<bjg> B = a("nearest_attackable");
   public static final bsh<hd> C = a("hiding_place");
   public static final bsh<Long> D = a("heard_bell_time");
   public static final bsh<Long> E = a("cant_reach_walk_target_since");
   public static final bsh<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bsh<Long> G = a("last_slept", Codec.LONG);
   public static final bsh<Long> H = a("last_woken", Codec.LONG);
   public static final bsh<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bsh<bil> J = a("nearest_visible_adult");
   public static final bsh<byn> K = a("nearest_visible_wanted_item");
   public static final bsh<bji> L = a("nearest_visible_nemesis");
   public static final bsh<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bsh<cbu> N = a("tempting_player");
   public static final bsh<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bsh<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final bsh<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final bsh<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final bsh<Boolean> S = a("long_jump_mid_jump");
   public static final bsh<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final bsh<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final bsh<ehn> V = a("ram_target");
   public static final bsh<asx> W = a("is_in_water", Codec.unit(asx.a));
   public static final bsh<asx> X = a("is_pregnant", Codec.unit(asx.a));
   public static final bsh<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final bsh<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final bsh<UUID> aa = a("angry_at", hx.a);
   public static final bsh<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final bsh<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final bsh<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final bsh<Boolean> ae = a("disable_walk_to_admire_item");
   public static final bsh<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final bsh<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final bsh<gw> ah = a("celebrate_location");
   public static final bsh<Boolean> ai = a("dancing");
   public static final bsh<cae> aj = a("nearest_visible_huntable_hoglin");
   public static final bsh<cae> ak = a("nearest_visible_baby_hoglin");
   public static final bsh<cbu> al = a("nearest_targetable_player_not_wearing_gold");
   public static final bsh<List<caj>> am = a("nearby_adult_piglins");
   public static final bsh<List<caj>> an = a("nearest_visible_adult_piglins");
   public static final bsh<List<cae>> ao = a("nearest_visible_adult_hoglins");
   public static final bsh<caj> ap = a("nearest_visible_adult_piglin");
   public static final bsh<bjg> aq = a("nearest_visible_zombified");
   public static final bsh<Integer> ar = a("visible_adult_piglin_count");
   public static final bsh<Integer> as = a("visible_adult_hoglin_count");
   public static final bsh<cbu> at = a("nearest_player_holding_wanted_item");
   public static final bsh<Boolean> au = a("ate_recently");
   public static final bsh<gw> av = a("nearest_repellent");
   public static final bsh<Boolean> aw = a("pacified");
   public static final bsh<bjg> ax = a("roar_target");
   public static final bsh<gw> ay = a("disturbance_location");
   public static final bsh<asx> az = a("recent_projectile", Codec.unit(asx.a));
   public static final bsh<asx> aA = a("is_sniffing", Codec.unit(asx.a));
   public static final bsh<asx> aB = a("is_emerging", Codec.unit(asx.a));
   public static final bsh<asx> aC = a("roar_sound_delay", Codec.unit(asx.a));
   public static final bsh<asx> aD = a("dig_cooldown", Codec.unit(asx.a));
   public static final bsh<asx> aE = a("roar_sound_cooldown", Codec.unit(asx.a));
   public static final bsh<asx> aF = a("sniff_cooldown", Codec.unit(asx.a));
   public static final bsh<asx> aG = a("touch_cooldown", Codec.unit(asx.a));
   public static final bsh<asx> aH = a("vibration_cooldown", Codec.unit(asx.a));
   public static final bsh<asx> aI = a("sonic_boom_cooldown", Codec.unit(asx.a));
   public static final bsh<asx> aJ = a("sonic_boom_sound_cooldown", Codec.unit(asx.a));
   public static final bsh<asx> aK = a("sonic_boom_sound_delay", Codec.unit(asx.a));
   public static final bsh<UUID> aL = a("liked_player", hx.a);
   public static final bsh<hd> aM = a("liked_noteblock", hd.a);
   public static final bsh<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bsh<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bsh<List<hd>> aP = a("sniffer_explored_positions", Codec.list(hd.a));
   public static final bsh<gw> aQ = a("sniffer_sniffing_target");
   public static final bsh<Boolean> aR = a("sniffer_digging");
   public static final bsh<Boolean> aS = a("sniffer_happy");
   private final Optional<Codec<bsg<U>>> aT;

   @VisibleForTesting
   public bsh(Optional<Codec<U>> $$0) {
      this.aT = $$0.map(bsg::a);
   }

   @Override
   public String toString() {
      return jb.C.b(this).toString();
   }

   public Optional<Codec<bsg<U>>> a() {
      return this.aT;
   }

   private static <U> bsh<U> a(String $$0, Codec<U> $$1) {
      return hq.a(jb.C, new aew($$0), new bsh<>(Optional.of($$1)));
   }

   private static <U> bsh<U> a(String $$0) {
      return hq.a(jb.C, new aew($$0), new bsh<>(Optional.empty()));
   }
}
