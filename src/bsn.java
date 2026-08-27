import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bsn<U> {
   public static final bsn<Void> a = a("dummy");
   public static final bsn<hd> b = a("home", hd.a);
   public static final bsn<hd> c = a("job_site", hd.a);
   public static final bsn<hd> d = a("potential_job_site", hd.a);
   public static final bsn<hd> e = a("meeting_point", hd.a);
   public static final bsn<List<hd>> f = a("secondary_job_site");
   public static final bsn<List<bjm>> g = a("mobs");
   public static final bsn<bsp> h = a("visible_mobs");
   public static final bsn<List<bjm>> i = a("visible_villager_babies");
   public static final bsn<List<cca>> j = a("nearest_players");
   public static final bsn<cca> k = a("nearest_visible_player");
   public static final bsn<cca> l = a("nearest_visible_targetable_player");
   public static final bsn<bsq> m = a("walk_target");
   public static final bsn<bmq> n = a("look_target");
   public static final bsn<bjm> o = a("attack_target");
   public static final bsn<Boolean> p = a("attack_cooling_down");
   public static final bsn<bjm> q = a("interaction_target");
   public static final bsn<bir> r = a("breed_target");
   public static final bsn<biw> s = a("ride_target");
   public static final bsn<eav> t = a("path");
   public static final bsn<List<hd>> u = a("interactable_doors");
   public static final bsn<Set<hd>> v = a("doors_to_close");
   public static final bsn<gw> w = a("nearest_bed");
   public static final bsn<bhu> x = a("hurt_by");
   public static final bsn<bjm> y = a("hurt_by_entity");
   public static final bsn<bjm> z = a("avoid_target");
   public static final bsn<bjm> A = a("nearest_hostile");
   public static final bsn<bjm> B = a("nearest_attackable");
   public static final bsn<hd> C = a("hiding_place");
   public static final bsn<Long> D = a("heard_bell_time");
   public static final bsn<Long> E = a("cant_reach_walk_target_since");
   public static final bsn<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bsn<Long> G = a("last_slept", Codec.LONG);
   public static final bsn<Long> H = a("last_woken", Codec.LONG);
   public static final bsn<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bsn<bir> J = a("nearest_visible_adult");
   public static final bsn<byt> K = a("nearest_visible_wanted_item");
   public static final bsn<bjo> L = a("nearest_visible_nemesis");
   public static final bsn<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bsn<cca> N = a("tempting_player");
   public static final bsn<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bsn<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final bsn<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final bsn<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final bsn<Boolean> S = a("long_jump_mid_jump");
   public static final bsn<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final bsn<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final bsn<ehh> V = a("ram_target");
   public static final bsn<atc> W = a("is_in_water", Codec.unit(atc.a));
   public static final bsn<atc> X = a("is_pregnant", Codec.unit(atc.a));
   public static final bsn<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final bsn<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final bsn<UUID> aa = a("angry_at", hx.a);
   public static final bsn<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final bsn<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final bsn<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final bsn<Boolean> ae = a("disable_walk_to_admire_item");
   public static final bsn<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final bsn<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final bsn<gw> ah = a("celebrate_location");
   public static final bsn<Boolean> ai = a("dancing");
   public static final bsn<cak> aj = a("nearest_visible_huntable_hoglin");
   public static final bsn<cak> ak = a("nearest_visible_baby_hoglin");
   public static final bsn<cca> al = a("nearest_targetable_player_not_wearing_gold");
   public static final bsn<List<cap>> am = a("nearby_adult_piglins");
   public static final bsn<List<cap>> an = a("nearest_visible_adult_piglins");
   public static final bsn<List<cak>> ao = a("nearest_visible_adult_hoglins");
   public static final bsn<cap> ap = a("nearest_visible_adult_piglin");
   public static final bsn<bjm> aq = a("nearest_visible_zombified");
   public static final bsn<Integer> ar = a("visible_adult_piglin_count");
   public static final bsn<Integer> as = a("visible_adult_hoglin_count");
   public static final bsn<cca> at = a("nearest_player_holding_wanted_item");
   public static final bsn<Boolean> au = a("ate_recently");
   public static final bsn<gw> av = a("nearest_repellent");
   public static final bsn<Boolean> aw = a("pacified");
   public static final bsn<bjm> ax = a("roar_target");
   public static final bsn<gw> ay = a("disturbance_location");
   public static final bsn<atc> az = a("recent_projectile", Codec.unit(atc.a));
   public static final bsn<atc> aA = a("is_sniffing", Codec.unit(atc.a));
   public static final bsn<atc> aB = a("is_emerging", Codec.unit(atc.a));
   public static final bsn<atc> aC = a("roar_sound_delay", Codec.unit(atc.a));
   public static final bsn<atc> aD = a("dig_cooldown", Codec.unit(atc.a));
   public static final bsn<atc> aE = a("roar_sound_cooldown", Codec.unit(atc.a));
   public static final bsn<atc> aF = a("sniff_cooldown", Codec.unit(atc.a));
   public static final bsn<atc> aG = a("touch_cooldown", Codec.unit(atc.a));
   public static final bsn<atc> aH = a("vibration_cooldown", Codec.unit(atc.a));
   public static final bsn<atc> aI = a("sonic_boom_cooldown", Codec.unit(atc.a));
   public static final bsn<atc> aJ = a("sonic_boom_sound_cooldown", Codec.unit(atc.a));
   public static final bsn<atc> aK = a("sonic_boom_sound_delay", Codec.unit(atc.a));
   public static final bsn<UUID> aL = a("liked_player", hx.a);
   public static final bsn<hd> aM = a("liked_noteblock", hd.a);
   public static final bsn<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bsn<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bsn<List<hd>> aP = a("sniffer_explored_positions", Codec.list(hd.a));
   public static final bsn<gw> aQ = a("sniffer_sniffing_target");
   public static final bsn<Boolean> aR = a("sniffer_digging");
   public static final bsn<Boolean> aS = a("sniffer_happy");
   private final Optional<Codec<bsm<U>>> aT;

   @VisibleForTesting
   public bsn(Optional<Codec<U>> $$0) {
      this.aT = $$0.map(bsm::a);
   }

   @Override
   public String toString() {
      return jb.C.b(this).toString();
   }

   public Optional<Codec<bsm<U>>> a() {
      return this.aT;
   }

   private static <U> bsn<U> a(String $$0, Codec<U> $$1) {
      return hq.a(jb.C, new aez($$0), new bsn<>(Optional.of($$1)));
   }

   private static <U> bsn<U> a(String $$0) {
      return hq.a(jb.C, new aez($$0), new bsn<>(Optional.empty()));
   }
}
