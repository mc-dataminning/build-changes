import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class brz<U> {
   public static final brz<Void> a = a("dummy");
   public static final brz<hd> b = a("home", hd.a);
   public static final brz<hd> c = a("job_site", hd.a);
   public static final brz<hd> d = a("potential_job_site", hd.a);
   public static final brz<hd> e = a("meeting_point", hd.a);
   public static final brz<List<hd>> f = a("secondary_job_site");
   public static final brz<List<biy>> g = a("mobs");
   public static final brz<bsb> h = a("visible_mobs");
   public static final brz<List<biy>> i = a("visible_villager_babies");
   public static final brz<List<cbm>> j = a("nearest_players");
   public static final brz<cbm> k = a("nearest_visible_player");
   public static final brz<cbm> l = a("nearest_visible_targetable_player");
   public static final brz<bsc> m = a("walk_target");
   public static final brz<bmc> n = a("look_target");
   public static final brz<biy> o = a("attack_target");
   public static final brz<Boolean> p = a("attack_cooling_down");
   public static final brz<biy> q = a("interaction_target");
   public static final brz<bid> r = a("breed_target");
   public static final brz<bii> s = a("ride_target");
   public static final brz<ear> t = a("path");
   public static final brz<List<hd>> u = a("interactable_doors");
   public static final brz<Set<hd>> v = a("doors_to_close");
   public static final brz<gu> w = a("nearest_bed");
   public static final brz<bhg> x = a("hurt_by");
   public static final brz<biy> y = a("hurt_by_entity");
   public static final brz<biy> z = a("avoid_target");
   public static final brz<biy> A = a("nearest_hostile");
   public static final brz<biy> B = a("nearest_attackable");
   public static final brz<hd> C = a("hiding_place");
   public static final brz<Long> D = a("heard_bell_time");
   public static final brz<Long> E = a("cant_reach_walk_target_since");
   public static final brz<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final brz<Long> G = a("last_slept", Codec.LONG);
   public static final brz<Long> H = a("last_woken", Codec.LONG);
   public static final brz<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final brz<bid> J = a("nearest_visible_adult");
   public static final brz<byf> K = a("nearest_visible_wanted_item");
   public static final brz<bja> L = a("nearest_visible_nemesis");
   public static final brz<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final brz<cbm> N = a("tempting_player");
   public static final brz<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final brz<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final brz<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final brz<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final brz<Boolean> S = a("long_jump_mid_jump");
   public static final brz<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final brz<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final brz<ehd> V = a("ram_target");
   public static final brz<asp> W = a("is_in_water", Codec.unit(asp.a));
   public static final brz<asp> X = a("is_pregnant", Codec.unit(asp.a));
   public static final brz<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final brz<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final brz<UUID> aa = a("angry_at", hy.a);
   public static final brz<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final brz<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final brz<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final brz<Boolean> ae = a("disable_walk_to_admire_item");
   public static final brz<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final brz<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final brz<gu> ah = a("celebrate_location");
   public static final brz<Boolean> ai = a("dancing");
   public static final brz<bzw> aj = a("nearest_visible_huntable_hoglin");
   public static final brz<bzw> ak = a("nearest_visible_baby_hoglin");
   public static final brz<cbm> al = a("nearest_targetable_player_not_wearing_gold");
   public static final brz<List<cab>> am = a("nearby_adult_piglins");
   public static final brz<List<cab>> an = a("nearest_visible_adult_piglins");
   public static final brz<List<bzw>> ao = a("nearest_visible_adult_hoglins");
   public static final brz<cab> ap = a("nearest_visible_adult_piglin");
   public static final brz<biy> aq = a("nearest_visible_zombified");
   public static final brz<Integer> ar = a("visible_adult_piglin_count");
   public static final brz<Integer> as = a("visible_adult_hoglin_count");
   public static final brz<cbm> at = a("nearest_player_holding_wanted_item");
   public static final brz<Boolean> au = a("ate_recently");
   public static final brz<gu> av = a("nearest_repellent");
   public static final brz<Boolean> aw = a("pacified");
   public static final brz<biy> ax = a("roar_target");
   public static final brz<gu> ay = a("disturbance_location");
   public static final brz<asp> az = a("recent_projectile", Codec.unit(asp.a));
   public static final brz<asp> aA = a("is_sniffing", Codec.unit(asp.a));
   public static final brz<asp> aB = a("is_emerging", Codec.unit(asp.a));
   public static final brz<asp> aC = a("roar_sound_delay", Codec.unit(asp.a));
   public static final brz<asp> aD = a("dig_cooldown", Codec.unit(asp.a));
   public static final brz<asp> aE = a("roar_sound_cooldown", Codec.unit(asp.a));
   public static final brz<asp> aF = a("sniff_cooldown", Codec.unit(asp.a));
   public static final brz<asp> aG = a("touch_cooldown", Codec.unit(asp.a));
   public static final brz<asp> aH = a("vibration_cooldown", Codec.unit(asp.a));
   public static final brz<asp> aI = a("sonic_boom_cooldown", Codec.unit(asp.a));
   public static final brz<asp> aJ = a("sonic_boom_sound_cooldown", Codec.unit(asp.a));
   public static final brz<asp> aK = a("sonic_boom_sound_delay", Codec.unit(asp.a));
   public static final brz<UUID> aL = a("liked_player", hy.a);
   public static final brz<hd> aM = a("liked_noteblock", hd.a);
   public static final brz<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final brz<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final brz<List<hd>> aP = a("sniffer_explored_positions", Codec.list(hd.a));
   public static final brz<gu> aQ = a("sniffer_sniffing_target");
   public static final brz<Boolean> aR = a("sniffer_digging");
   public static final brz<Boolean> aS = a("sniffer_happy");
   private final Optional<Codec<bry<U>>> aT;

   @VisibleForTesting
   public brz(Optional<Codec<U>> $$0) {
      this.aT = $$0.map(bry::a);
   }

   @Override
   public String toString() {
      return jb.C.b(this).toString();
   }

   public Optional<Codec<bry<U>>> a() {
      return this.aT;
   }

   private static <U> brz<U> a(String $$0, Codec<U> $$1) {
      return hr.a(jb.C, new aer($$0), new brz<>(Optional.of($$1)));
   }

   private static <U> brz<U> a(String $$0) {
      return hr.a(jb.C, new aer($$0), new brz<>(Optional.empty()));
   }
}
