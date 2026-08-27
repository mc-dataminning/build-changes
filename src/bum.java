import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bum<U> {
   public static final bum<Void> a = a("dummy");
   public static final bum<ie> b = a("home", ie.a);
   public static final bum<ie> c = a("job_site", ie.a);
   public static final bum<ie> d = a("potential_job_site", ie.a);
   public static final bum<ie> e = a("meeting_point", ie.a);
   public static final bum<List<ie>> f = a("secondary_job_site");
   public static final bum<List<bll>> g = a("mobs");
   public static final bum<buo> h = a("visible_mobs");
   public static final bum<List<bll>> i = a("visible_villager_babies");
   public static final bum<List<cdz>> j = a("nearest_players");
   public static final bum<cdz> k = a("nearest_visible_player");
   public static final bum<cdz> l = a("nearest_visible_targetable_player");
   public static final bum<bup> m = a("walk_target");
   public static final bum<bop> n = a("look_target");
   public static final bum<bll> o = a("attack_target");
   public static final bum<Boolean> p = a("attack_cooling_down");
   public static final bum<bll> q = a("interaction_target");
   public static final bum<bkq> r = a("breed_target");
   public static final bum<bkv> s = a("ride_target");
   public static final bum<edm> t = a("path");
   public static final bum<List<ie>> u = a("interactable_doors");
   public static final bum<Set<ie>> v = a("doors_to_close");
   public static final bum<hx> w = a("nearest_bed");
   public static final bum<bjt> x = a("hurt_by");
   public static final bum<bll> y = a("hurt_by_entity");
   public static final bum<bll> z = a("avoid_target");
   public static final bum<bll> A = a("nearest_hostile");
   public static final bum<bll> B = a("nearest_attackable");
   public static final bum<ie> C = a("hiding_place");
   public static final bum<Long> D = a("heard_bell_time");
   public static final bum<Long> E = a("cant_reach_walk_target_since");
   public static final bum<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bum<Long> G = a("last_slept", Codec.LONG);
   public static final bum<Long> H = a("last_woken", Codec.LONG);
   public static final bum<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bum<bkq> J = a("nearest_visible_adult");
   public static final bum<cas> K = a("nearest_visible_wanted_item");
   public static final bum<bln> L = a("nearest_visible_nemesis");
   public static final bum<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bum<cdz> N = a("tempting_player");
   public static final bum<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bum<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final bum<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final bum<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final bum<Boolean> S = a("long_jump_mid_jump");
   public static final bum<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final bum<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final bum<ejz> V = a("ram_target");
   public static final bum<aus> W = a("is_in_water", Codec.unit(aus.a));
   public static final bum<aus> X = a("is_pregnant", Codec.unit(aus.a));
   public static final bum<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final bum<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final bum<UUID> aa = a("angry_at", iz.a);
   public static final bum<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final bum<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final bum<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final bum<Boolean> ae = a("disable_walk_to_admire_item");
   public static final bum<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final bum<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final bum<hx> ah = a("celebrate_location");
   public static final bum<Boolean> ai = a("dancing");
   public static final bum<ccj> aj = a("nearest_visible_huntable_hoglin");
   public static final bum<ccj> ak = a("nearest_visible_baby_hoglin");
   public static final bum<cdz> al = a("nearest_targetable_player_not_wearing_gold");
   public static final bum<List<cco>> am = a("nearby_adult_piglins");
   public static final bum<List<cco>> an = a("nearest_visible_adult_piglins");
   public static final bum<List<ccj>> ao = a("nearest_visible_adult_hoglins");
   public static final bum<cco> ap = a("nearest_visible_adult_piglin");
   public static final bum<bll> aq = a("nearest_visible_zombified");
   public static final bum<Integer> ar = a("visible_adult_piglin_count");
   public static final bum<Integer> as = a("visible_adult_hoglin_count");
   public static final bum<cdz> at = a("nearest_player_holding_wanted_item");
   public static final bum<Boolean> au = a("ate_recently");
   public static final bum<hx> av = a("nearest_repellent");
   public static final bum<Boolean> aw = a("pacified");
   public static final bum<bll> ax = a("roar_target");
   public static final bum<hx> ay = a("disturbance_location");
   public static final bum<aus> az = a("recent_projectile", Codec.unit(aus.a));
   public static final bum<aus> aA = a("is_sniffing", Codec.unit(aus.a));
   public static final bum<aus> aB = a("is_emerging", Codec.unit(aus.a));
   public static final bum<aus> aC = a("roar_sound_delay", Codec.unit(aus.a));
   public static final bum<aus> aD = a("dig_cooldown", Codec.unit(aus.a));
   public static final bum<aus> aE = a("roar_sound_cooldown", Codec.unit(aus.a));
   public static final bum<aus> aF = a("sniff_cooldown", Codec.unit(aus.a));
   public static final bum<aus> aG = a("touch_cooldown", Codec.unit(aus.a));
   public static final bum<aus> aH = a("vibration_cooldown", Codec.unit(aus.a));
   public static final bum<aus> aI = a("sonic_boom_cooldown", Codec.unit(aus.a));
   public static final bum<aus> aJ = a("sonic_boom_sound_cooldown", Codec.unit(aus.a));
   public static final bum<aus> aK = a("sonic_boom_sound_delay", Codec.unit(aus.a));
   public static final bum<UUID> aL = a("liked_player", iz.a);
   public static final bum<ie> aM = a("liked_noteblock", ie.a);
   public static final bum<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bum<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bum<List<ie>> aP = a("sniffer_explored_positions", Codec.list(ie.a));
   public static final bum<hx> aQ = a("sniffer_sniffing_target");
   public static final bum<Boolean> aR = a("sniffer_digging");
   public static final bum<Boolean> aS = a("sniffer_happy");
   private final Optional<Codec<bul<U>>> aT;

   @VisibleForTesting
   public bum(Optional<Codec<U>> $$0) {
      this.aT = $$0.map(bul::a);
   }

   @Override
   public String toString() {
      return kc.C.b(this).toString();
   }

   public Optional<Codec<bul<U>>> a() {
      return this.aT;
   }

   private static <U> bum<U> a(String $$0, Codec<U> $$1) {
      return is.a(kc.C, new agm($$0), new bum<>(Optional.of($$1)));
   }

   private static <U> bum<U> a(String $$0) {
      return is.a(kc.C, new agm($$0), new bum<>(Optional.empty()));
   }
}
