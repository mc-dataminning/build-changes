import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bry<U> {
   public static final bry<Void> a = a("dummy");
   public static final bry<he> b = a("home", he.a);
   public static final bry<he> c = a("job_site", he.a);
   public static final bry<he> d = a("potential_job_site", he.a);
   public static final bry<he> e = a("meeting_point", he.a);
   public static final bry<List<he>> f = a("secondary_job_site");
   public static final bry<List<biw>> g = a("mobs");
   public static final bry<bsa> h = a("visible_mobs");
   public static final bry<List<biw>> i = a("visible_villager_babies");
   public static final bry<List<cbl>> j = a("nearest_players");
   public static final bry<cbl> k = a("nearest_visible_player");
   public static final bry<cbl> l = a("nearest_visible_targetable_player");
   public static final bry<bsb> m = a("walk_target");
   public static final bry<bmb> n = a("look_target");
   public static final bry<biw> o = a("attack_target");
   public static final bry<Boolean> p = a("attack_cooling_down");
   public static final bry<biw> q = a("interaction_target");
   public static final bry<bib> r = a("breed_target");
   public static final bry<big> s = a("ride_target");
   public static final bry<eaq> t = a("path");
   public static final bry<List<he>> u = a("interactable_doors");
   public static final bry<Set<he>> v = a("doors_to_close");
   public static final bry<gv> w = a("nearest_bed");
   public static final bry<bhe> x = a("hurt_by");
   public static final bry<biw> y = a("hurt_by_entity");
   public static final bry<biw> z = a("avoid_target");
   public static final bry<biw> A = a("nearest_hostile");
   public static final bry<biw> B = a("nearest_attackable");
   public static final bry<he> C = a("hiding_place");
   public static final bry<Long> D = a("heard_bell_time");
   public static final bry<Long> E = a("cant_reach_walk_target_since");
   public static final bry<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bry<Long> G = a("last_slept", Codec.LONG);
   public static final bry<Long> H = a("last_woken", Codec.LONG);
   public static final bry<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bry<bib> J = a("nearest_visible_adult");
   public static final bry<bye> K = a("nearest_visible_wanted_item");
   public static final bry<biy> L = a("nearest_visible_nemesis");
   public static final bry<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bry<cbl> N = a("tempting_player");
   public static final bry<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bry<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final bry<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final bry<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final bry<Boolean> S = a("long_jump_mid_jump");
   public static final bry<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final bry<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final bry<ehf> V = a("ram_target");
   public static final bry<asn> W = a("is_in_water", Codec.unit(asn.a));
   public static final bry<asn> X = a("is_pregnant", Codec.unit(asn.a));
   public static final bry<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final bry<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final bry<UUID> aa = a("angry_at", hz.a);
   public static final bry<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final bry<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final bry<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final bry<Boolean> ae = a("disable_walk_to_admire_item");
   public static final bry<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final bry<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final bry<gv> ah = a("celebrate_location");
   public static final bry<Boolean> ai = a("dancing");
   public static final bry<bzv> aj = a("nearest_visible_huntable_hoglin");
   public static final bry<bzv> ak = a("nearest_visible_baby_hoglin");
   public static final bry<cbl> al = a("nearest_targetable_player_not_wearing_gold");
   public static final bry<List<caa>> am = a("nearby_adult_piglins");
   public static final bry<List<caa>> an = a("nearest_visible_adult_piglins");
   public static final bry<List<bzv>> ao = a("nearest_visible_adult_hoglins");
   public static final bry<caa> ap = a("nearest_visible_adult_piglin");
   public static final bry<biw> aq = a("nearest_visible_zombified");
   public static final bry<Integer> ar = a("visible_adult_piglin_count");
   public static final bry<Integer> as = a("visible_adult_hoglin_count");
   public static final bry<cbl> at = a("nearest_player_holding_wanted_item");
   public static final bry<Boolean> au = a("ate_recently");
   public static final bry<gv> av = a("nearest_repellent");
   public static final bry<Boolean> aw = a("pacified");
   public static final bry<biw> ax = a("roar_target");
   public static final bry<gv> ay = a("disturbance_location");
   public static final bry<asn> az = a("recent_projectile", Codec.unit(asn.a));
   public static final bry<asn> aA = a("is_sniffing", Codec.unit(asn.a));
   public static final bry<asn> aB = a("is_emerging", Codec.unit(asn.a));
   public static final bry<asn> aC = a("roar_sound_delay", Codec.unit(asn.a));
   public static final bry<asn> aD = a("dig_cooldown", Codec.unit(asn.a));
   public static final bry<asn> aE = a("roar_sound_cooldown", Codec.unit(asn.a));
   public static final bry<asn> aF = a("sniff_cooldown", Codec.unit(asn.a));
   public static final bry<asn> aG = a("touch_cooldown", Codec.unit(asn.a));
   public static final bry<asn> aH = a("vibration_cooldown", Codec.unit(asn.a));
   public static final bry<asn> aI = a("sonic_boom_cooldown", Codec.unit(asn.a));
   public static final bry<asn> aJ = a("sonic_boom_sound_cooldown", Codec.unit(asn.a));
   public static final bry<asn> aK = a("sonic_boom_sound_delay", Codec.unit(asn.a));
   public static final bry<UUID> aL = a("liked_player", hz.a);
   public static final bry<he> aM = a("liked_noteblock", he.a);
   public static final bry<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bry<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bry<List<he>> aP = a("sniffer_explored_positions", Codec.list(he.a));
   public static final bry<gv> aQ = a("sniffer_sniffing_target");
   public static final bry<Boolean> aR = a("sniffer_digging");
   public static final bry<Boolean> aS = a("sniffer_happy");
   private final Optional<Codec<brx<U>>> aT;

   @VisibleForTesting
   public bry(Optional<Codec<U>> $$0) {
      this.aT = $$0.map(brx::a);
   }

   @Override
   public String toString() {
      return jc.C.b(this).toString();
   }

   public Optional<Codec<brx<U>>> a() {
      return this.aT;
   }

   private static <U> bry<U> a(String $$0, Codec<U> $$1) {
      return hs.a(jc.C, new aep($$0), new bry<>(Optional.of($$1)));
   }

   private static <U> bry<U> a(String $$0) {
      return hs.a(jc.C, new aep($$0), new bry<>(Optional.empty()));
   }
}
