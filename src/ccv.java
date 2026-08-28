import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class ccv<U> {
   public static final ccv<Void> a = a("dummy");
   public static final ccv<jh> b = a("home", jh.b);
   public static final ccv<jh> c = a("job_site", jh.b);
   public static final ccv<jh> d = a("potential_job_site", jh.b);
   public static final ccv<jh> e = a("meeting_point", jh.b);
   public static final ccv<List<jh>> f = a("secondary_job_site");
   public static final ccv<List<btr>> g = a("mobs");
   public static final ccv<ccx> h = a("visible_mobs");
   public static final ccv<List<btr>> i = a("visible_villager_babies");
   public static final ccv<List<cmz>> j = a("nearest_players");
   public static final ccv<cmz> k = a("nearest_visible_player");
   public static final ccv<cmz> l = a("nearest_visible_targetable_player");
   public static final ccv<ccy> m = a("walk_target");
   public static final ccv<bwy> n = a("look_target");
   public static final ccv<btr> o = a("attack_target");
   public static final ccv<Boolean> p = a("attack_cooling_down");
   public static final ccv<btr> q = a("interaction_target");
   public static final ccv<bsq> r = a("breed_target");
   public static final ccv<bsw> s = a("ride_target");
   public static final ccv<eol> t = a("path");
   public static final ccv<List<jh>> u = a("interactable_doors");
   public static final ccv<Set<jh>> v = a("doors_to_close");
   public static final ccv<iz> w = a("nearest_bed");
   public static final ccv<brp> x = a("hurt_by");
   public static final ccv<btr> y = a("hurt_by_entity");
   public static final ccv<btr> z = a("avoid_target");
   public static final ccv<btr> A = a("nearest_hostile");
   public static final ccv<btr> B = a("nearest_attackable");
   public static final ccv<jh> C = a("hiding_place");
   public static final ccv<Long> D = a("heard_bell_time");
   public static final ccv<Long> E = a("cant_reach_walk_target_since");
   public static final ccv<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final ccv<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final ccv<Long> H = a("last_slept", Codec.LONG);
   public static final ccv<Long> I = a("last_woken", Codec.LONG);
   public static final ccv<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final ccv<bsq> K = a("nearest_visible_adult");
   public static final ccv<cjj> L = a("nearest_visible_wanted_item");
   public static final ccv<btt> M = a("nearest_visible_nemesis");
   public static final ccv<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final ccv<cmz> O = a("tempting_player");
   public static final ccv<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final ccv<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final ccv<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final ccv<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final ccv<Boolean> T = a("long_jump_mid_jump");
   public static final ccv<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final ccv<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final ccv<evt> W = a("ram_target");
   public static final ccv<bac> X = a("is_in_water", Codec.unit(bac.a));
   public static final ccv<bac> Y = a("is_pregnant", Codec.unit(bac.a));
   public static final ccv<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final ccv<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final ccv<UUID> ab = a("angry_at", kc.a);
   public static final ccv<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final ccv<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final ccv<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final ccv<Boolean> af = a("disable_walk_to_admire_item");
   public static final ccv<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final ccv<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final ccv<iz> ai = a("celebrate_location");
   public static final ccv<Boolean> aj = a("dancing");
   public static final ccv<clj> ak = a("nearest_visible_huntable_hoglin");
   public static final ccv<clj> al = a("nearest_visible_baby_hoglin");
   public static final ccv<cmz> am = a("nearest_targetable_player_not_wearing_gold");
   public static final ccv<List<clo>> an = a("nearby_adult_piglins");
   public static final ccv<List<clo>> ao = a("nearest_visible_adult_piglins");
   public static final ccv<List<clj>> ap = a("nearest_visible_adult_hoglins");
   public static final ccv<clo> aq = a("nearest_visible_adult_piglin");
   public static final ccv<btr> ar = a("nearest_visible_zombified");
   public static final ccv<Integer> as = a("visible_adult_piglin_count");
   public static final ccv<Integer> at = a("visible_adult_hoglin_count");
   public static final ccv<cmz> au = a("nearest_player_holding_wanted_item");
   public static final ccv<Boolean> av = a("ate_recently");
   public static final ccv<iz> aw = a("nearest_repellent");
   public static final ccv<Boolean> ax = a("pacified");
   public static final ccv<btr> ay = a("roar_target");
   public static final ccv<iz> az = a("disturbance_location");
   public static final ccv<bac> aA = a("recent_projectile", Codec.unit(bac.a));
   public static final ccv<bac> aB = a("is_sniffing", Codec.unit(bac.a));
   public static final ccv<bac> aC = a("is_emerging", Codec.unit(bac.a));
   public static final ccv<bac> aD = a("roar_sound_delay", Codec.unit(bac.a));
   public static final ccv<bac> aE = a("dig_cooldown", Codec.unit(bac.a));
   public static final ccv<bac> aF = a("roar_sound_cooldown", Codec.unit(bac.a));
   public static final ccv<bac> aG = a("sniff_cooldown", Codec.unit(bac.a));
   public static final ccv<bac> aH = a("touch_cooldown", Codec.unit(bac.a));
   public static final ccv<bac> aI = a("vibration_cooldown", Codec.unit(bac.a));
   public static final ccv<bac> aJ = a("sonic_boom_cooldown", Codec.unit(bac.a));
   public static final ccv<bac> aK = a("sonic_boom_sound_cooldown", Codec.unit(bac.a));
   public static final ccv<bac> aL = a("sonic_boom_sound_delay", Codec.unit(bac.a));
   public static final ccv<UUID> aM = a("liked_player", kc.a);
   public static final ccv<jh> aN = a("liked_noteblock", jh.b);
   public static final ccv<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final ccv<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final ccv<List<jh>> aQ = a("sniffer_explored_positions", Codec.list(jh.b));
   public static final ccv<iz> aR = a("sniffer_sniffing_target");
   public static final ccv<Boolean> aS = a("sniffer_digging");
   public static final ccv<Boolean> aT = a("sniffer_happy");
   public static final ccv<bac> aU = a("breeze_jump_cooldown", Codec.unit(bac.a));
   public static final ccv<bac> aV = a("breeze_shoot", Codec.unit(bac.a));
   public static final ccv<bac> aW = a("breeze_shoot_charging", Codec.unit(bac.a));
   public static final ccv<bac> aX = a("breeze_shoot_recover", Codec.unit(bac.a));
   public static final ccv<bac> aY = a("breeze_shoot_cooldown", Codec.unit(bac.a));
   public static final ccv<bac> aZ = a("breeze_jump_inhaling", Codec.unit(bac.a));
   public static final ccv<iz> ba = a("breeze_jump_target", iz.a);
   public static final ccv<bac> bb = a("breeze_leaving_water", Codec.unit(bac.a));
   private final Optional<Codec<ccu<U>>> bc;

   @VisibleForTesting
   public ccv(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(ccu::a);
   }

   @Override
   public String toString() {
      return lp.B.b(this).toString();
   }

   public Optional<Codec<ccu<U>>> a() {
      return this.bc;
   }

   private static <U> ccv<U> a(String $$0, Codec<U> $$1) {
      return jv.a(lp.B, new alf($$0), new ccv<>(Optional.of($$1)));
   }

   private static <U> ccv<U> a(String $$0) {
      return jv.a(lp.B, new alf($$0), new ccv<>(Optional.empty()));
   }
}
