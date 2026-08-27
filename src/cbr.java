import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cbr<U> {
   public static final cbr<Void> a = a("dummy");
   public static final cbr<iz> b = a("home", iz.b);
   public static final cbr<iz> c = a("job_site", iz.b);
   public static final cbr<iz> d = a("potential_job_site", iz.b);
   public static final cbr<iz> e = a("meeting_point", iz.b);
   public static final cbr<List<iz>> f = a("secondary_job_site");
   public static final cbr<List<bso>> g = a("mobs");
   public static final cbr<cbt> h = a("visible_mobs");
   public static final cbr<List<bso>> i = a("visible_villager_babies");
   public static final cbr<List<cly>> j = a("nearest_players");
   public static final cbr<cly> k = a("nearest_visible_player");
   public static final cbr<cly> l = a("nearest_visible_targetable_player");
   public static final cbr<cbu> m = a("walk_target");
   public static final cbr<bvu> n = a("look_target");
   public static final cbr<bso> o = a("attack_target");
   public static final cbr<Boolean> p = a("attack_cooling_down");
   public static final cbr<bso> q = a("interaction_target");
   public static final cbr<brp> r = a("breed_target");
   public static final cbr<brv> s = a("ride_target");
   public static final cbr<eps> t = a("path");
   public static final cbr<List<iz>> u = a("interactable_doors");
   public static final cbr<Set<iz>> v = a("doors_to_close");
   public static final cbr<ir> w = a("nearest_bed");
   public static final cbr<bqt> x = a("hurt_by");
   public static final cbr<bso> y = a("hurt_by_entity");
   public static final cbr<bso> z = a("avoid_target");
   public static final cbr<bso> A = a("nearest_hostile");
   public static final cbr<bso> B = a("nearest_attackable");
   public static final cbr<iz> C = a("hiding_place");
   public static final cbr<Long> D = a("heard_bell_time");
   public static final cbr<Long> E = a("cant_reach_walk_target_since");
   public static final cbr<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cbr<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cbr<Long> H = a("last_slept", Codec.LONG);
   public static final cbr<Long> I = a("last_woken", Codec.LONG);
   public static final cbr<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cbr<brp> K = a("nearest_visible_adult");
   public static final cbr<cig> L = a("nearest_visible_wanted_item");
   public static final cbr<bsq> M = a("nearest_visible_nemesis");
   public static final cbr<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cbr<cly> O = a("tempting_player");
   public static final cbr<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cbr<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cbr<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cbr<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cbr<Boolean> T = a("long_jump_mid_jump");
   public static final cbr<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cbr<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cbr<ewu> W = a("ram_target");
   public static final cbr<azo> X = a("is_in_water", Codec.unit(azo.a));
   public static final cbr<azo> Y = a("is_pregnant", Codec.unit(azo.a));
   public static final cbr<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cbr<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cbr<UUID> ab = a("angry_at", ju.a);
   public static final cbr<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cbr<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cbr<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cbr<Boolean> af = a("disable_walk_to_admire_item");
   public static final cbr<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cbr<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cbr<ir> ai = a("celebrate_location");
   public static final cbr<Boolean> aj = a("dancing");
   public static final cbr<cki> ak = a("nearest_visible_huntable_hoglin");
   public static final cbr<cki> al = a("nearest_visible_baby_hoglin");
   public static final cbr<cly> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cbr<List<ckn>> an = a("nearby_adult_piglins");
   public static final cbr<List<ckn>> ao = a("nearest_visible_adult_piglins");
   public static final cbr<List<cki>> ap = a("nearest_visible_adult_hoglins");
   public static final cbr<ckn> aq = a("nearest_visible_adult_piglin");
   public static final cbr<bso> ar = a("nearest_visible_zombified");
   public static final cbr<Integer> as = a("visible_adult_piglin_count");
   public static final cbr<Integer> at = a("visible_adult_hoglin_count");
   public static final cbr<cly> au = a("nearest_player_holding_wanted_item");
   public static final cbr<Boolean> av = a("ate_recently");
   public static final cbr<ir> aw = a("nearest_repellent");
   public static final cbr<Boolean> ax = a("pacified");
   public static final cbr<bso> ay = a("roar_target");
   public static final cbr<ir> az = a("disturbance_location");
   public static final cbr<azo> aA = a("recent_projectile", Codec.unit(azo.a));
   public static final cbr<azo> aB = a("is_sniffing", Codec.unit(azo.a));
   public static final cbr<azo> aC = a("is_emerging", Codec.unit(azo.a));
   public static final cbr<azo> aD = a("roar_sound_delay", Codec.unit(azo.a));
   public static final cbr<azo> aE = a("dig_cooldown", Codec.unit(azo.a));
   public static final cbr<azo> aF = a("roar_sound_cooldown", Codec.unit(azo.a));
   public static final cbr<azo> aG = a("sniff_cooldown", Codec.unit(azo.a));
   public static final cbr<azo> aH = a("touch_cooldown", Codec.unit(azo.a));
   public static final cbr<azo> aI = a("vibration_cooldown", Codec.unit(azo.a));
   public static final cbr<azo> aJ = a("sonic_boom_cooldown", Codec.unit(azo.a));
   public static final cbr<azo> aK = a("sonic_boom_sound_cooldown", Codec.unit(azo.a));
   public static final cbr<azo> aL = a("sonic_boom_sound_delay", Codec.unit(azo.a));
   public static final cbr<UUID> aM = a("liked_player", ju.a);
   public static final cbr<iz> aN = a("liked_noteblock", iz.b);
   public static final cbr<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cbr<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cbr<List<iz>> aQ = a("sniffer_explored_positions", Codec.list(iz.b));
   public static final cbr<ir> aR = a("sniffer_sniffing_target");
   public static final cbr<Boolean> aS = a("sniffer_digging");
   public static final cbr<Boolean> aT = a("sniffer_happy");
   public static final cbr<azo> aU = a("breeze_jump_cooldown", Codec.unit(azo.a));
   public static final cbr<azo> aV = a("breeze_shoot", Codec.unit(azo.a));
   public static final cbr<azo> aW = a("breeze_shoot_charging", Codec.unit(azo.a));
   public static final cbr<azo> aX = a("breeze_shoot_recover", Codec.unit(azo.a));
   public static final cbr<azo> aY = a("breeze_shoot_cooldown", Codec.unit(azo.a));
   public static final cbr<azo> aZ = a("breeze_jump_inhaling", Codec.unit(azo.a));
   public static final cbr<ir> ba = a("breeze_jump_target", ir.a);
   public static final cbr<azo> bb = a("breeze_leaving_water", Codec.unit(azo.a));
   private final Optional<Codec<cbq<U>>> bc;

   @VisibleForTesting
   public cbr(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cbq::a);
   }

   @Override
   public String toString() {
      return lh.B.b(this).toString();
   }

   public Optional<Codec<cbq<U>>> a() {
      return this.bc;
   }

   private static <U> cbr<U> a(String $$0, Codec<U> $$1) {
      return jn.a(lh.B, new akt($$0), new cbr<>(Optional.of($$1)));
   }

   private static <U> cbr<U> a(String $$0) {
      return jn.a(lh.B, new akt($$0), new cbr<>(Optional.empty()));
   }
}
