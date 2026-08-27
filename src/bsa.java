import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bsa<U> {
   public static final bsa<Void> a = a("dummy");
   public static final bsa<hd> b = a("home", hd.a);
   public static final bsa<hd> c = a("job_site", hd.a);
   public static final bsa<hd> d = a("potential_job_site", hd.a);
   public static final bsa<hd> e = a("meeting_point", hd.a);
   public static final bsa<List<hd>> f = a("secondary_job_site");
   public static final bsa<List<biy>> g = a("mobs");
   public static final bsa<bsc> h = a("visible_mobs");
   public static final bsa<List<biy>> i = a("visible_villager_babies");
   public static final bsa<List<cbn>> j = a("nearest_players");
   public static final bsa<cbn> k = a("nearest_visible_player");
   public static final bsa<cbn> l = a("nearest_visible_targetable_player");
   public static final bsa<bsd> m = a("walk_target");
   public static final bsa<bmd> n = a("look_target");
   public static final bsa<biy> o = a("attack_target");
   public static final bsa<Boolean> p = a("attack_cooling_down");
   public static final bsa<biy> q = a("interaction_target");
   public static final bsa<bid> r = a("breed_target");
   public static final bsa<bii> s = a("ride_target");
   public static final bsa<eas> t = a("path");
   public static final bsa<List<hd>> u = a("interactable_doors");
   public static final bsa<Set<hd>> v = a("doors_to_close");
   public static final bsa<gu> w = a("nearest_bed");
   public static final bsa<bhg> x = a("hurt_by");
   public static final bsa<biy> y = a("hurt_by_entity");
   public static final bsa<biy> z = a("avoid_target");
   public static final bsa<biy> A = a("nearest_hostile");
   public static final bsa<biy> B = a("nearest_attackable");
   public static final bsa<hd> C = a("hiding_place");
   public static final bsa<Long> D = a("heard_bell_time");
   public static final bsa<Long> E = a("cant_reach_walk_target_since");
   public static final bsa<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bsa<Long> G = a("last_slept", Codec.LONG);
   public static final bsa<Long> H = a("last_woken", Codec.LONG);
   public static final bsa<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bsa<bid> J = a("nearest_visible_adult");
   public static final bsa<byg> K = a("nearest_visible_wanted_item");
   public static final bsa<bja> L = a("nearest_visible_nemesis");
   public static final bsa<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bsa<cbn> N = a("tempting_player");
   public static final bsa<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bsa<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final bsa<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final bsa<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final bsa<Boolean> S = a("long_jump_mid_jump");
   public static final bsa<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final bsa<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final bsa<ehe> V = a("ram_target");
   public static final bsa<asp> W = a("is_in_water", Codec.unit(asp.a));
   public static final bsa<asp> X = a("is_pregnant", Codec.unit(asp.a));
   public static final bsa<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final bsa<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final bsa<UUID> aa = a("angry_at", hy.a);
   public static final bsa<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final bsa<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final bsa<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final bsa<Boolean> ae = a("disable_walk_to_admire_item");
   public static final bsa<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final bsa<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final bsa<gu> ah = a("celebrate_location");
   public static final bsa<Boolean> ai = a("dancing");
   public static final bsa<bzx> aj = a("nearest_visible_huntable_hoglin");
   public static final bsa<bzx> ak = a("nearest_visible_baby_hoglin");
   public static final bsa<cbn> al = a("nearest_targetable_player_not_wearing_gold");
   public static final bsa<List<cac>> am = a("nearby_adult_piglins");
   public static final bsa<List<cac>> an = a("nearest_visible_adult_piglins");
   public static final bsa<List<bzx>> ao = a("nearest_visible_adult_hoglins");
   public static final bsa<cac> ap = a("nearest_visible_adult_piglin");
   public static final bsa<biy> aq = a("nearest_visible_zombified");
   public static final bsa<Integer> ar = a("visible_adult_piglin_count");
   public static final bsa<Integer> as = a("visible_adult_hoglin_count");
   public static final bsa<cbn> at = a("nearest_player_holding_wanted_item");
   public static final bsa<Boolean> au = a("ate_recently");
   public static final bsa<gu> av = a("nearest_repellent");
   public static final bsa<Boolean> aw = a("pacified");
   public static final bsa<biy> ax = a("roar_target");
   public static final bsa<gu> ay = a("disturbance_location");
   public static final bsa<asp> az = a("recent_projectile", Codec.unit(asp.a));
   public static final bsa<asp> aA = a("is_sniffing", Codec.unit(asp.a));
   public static final bsa<asp> aB = a("is_emerging", Codec.unit(asp.a));
   public static final bsa<asp> aC = a("roar_sound_delay", Codec.unit(asp.a));
   public static final bsa<asp> aD = a("dig_cooldown", Codec.unit(asp.a));
   public static final bsa<asp> aE = a("roar_sound_cooldown", Codec.unit(asp.a));
   public static final bsa<asp> aF = a("sniff_cooldown", Codec.unit(asp.a));
   public static final bsa<asp> aG = a("touch_cooldown", Codec.unit(asp.a));
   public static final bsa<asp> aH = a("vibration_cooldown", Codec.unit(asp.a));
   public static final bsa<asp> aI = a("sonic_boom_cooldown", Codec.unit(asp.a));
   public static final bsa<asp> aJ = a("sonic_boom_sound_cooldown", Codec.unit(asp.a));
   public static final bsa<asp> aK = a("sonic_boom_sound_delay", Codec.unit(asp.a));
   public static final bsa<UUID> aL = a("liked_player", hy.a);
   public static final bsa<hd> aM = a("liked_noteblock", hd.a);
   public static final bsa<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bsa<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bsa<List<hd>> aP = a("sniffer_explored_positions", Codec.list(hd.a));
   public static final bsa<gu> aQ = a("sniffer_sniffing_target");
   public static final bsa<Boolean> aR = a("sniffer_digging");
   public static final bsa<Boolean> aS = a("sniffer_happy");
   private final Optional<Codec<brz<U>>> aT;

   @VisibleForTesting
   public bsa(Optional<Codec<U>> $$0) {
      this.aT = $$0.map(brz::a);
   }

   @Override
   public String toString() {
      return jb.C.b(this).toString();
   }

   public Optional<Codec<brz<U>>> a() {
      return this.aT;
   }

   private static <U> bsa<U> a(String $$0, Codec<U> $$1) {
      return hr.a(jb.C, new aer($$0), new bsa<>(Optional.of($$1)));
   }

   private static <U> bsa<U> a(String $$0) {
      return hr.a(jb.C, new aer($$0), new bsa<>(Optional.empty()));
   }
}
