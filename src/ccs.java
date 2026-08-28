import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class ccs<U> {
   public static final ccs<Void> a = a("dummy");
   public static final ccs<jh> b = a("home", jh.b);
   public static final ccs<jh> c = a("job_site", jh.b);
   public static final ccs<jh> d = a("potential_job_site", jh.b);
   public static final ccs<jh> e = a("meeting_point", jh.b);
   public static final ccs<List<jh>> f = a("secondary_job_site");
   public static final ccs<List<bto>> g = a("mobs");
   public static final ccs<ccu> h = a("visible_mobs");
   public static final ccs<List<bto>> i = a("visible_villager_babies");
   public static final ccs<List<cmw>> j = a("nearest_players");
   public static final ccs<cmw> k = a("nearest_visible_player");
   public static final ccs<cmw> l = a("nearest_visible_targetable_player");
   public static final ccs<ccv> m = a("walk_target");
   public static final ccs<bwv> n = a("look_target");
   public static final ccs<bto> o = a("attack_target");
   public static final ccs<Boolean> p = a("attack_cooling_down");
   public static final ccs<bto> q = a("interaction_target");
   public static final ccs<bsn> r = a("breed_target");
   public static final ccs<bst> s = a("ride_target");
   public static final ccs<eoi> t = a("path");
   public static final ccs<List<jh>> u = a("interactable_doors");
   public static final ccs<Set<jh>> v = a("doors_to_close");
   public static final ccs<iz> w = a("nearest_bed");
   public static final ccs<brm> x = a("hurt_by");
   public static final ccs<bto> y = a("hurt_by_entity");
   public static final ccs<bto> z = a("avoid_target");
   public static final ccs<bto> A = a("nearest_hostile");
   public static final ccs<bto> B = a("nearest_attackable");
   public static final ccs<jh> C = a("hiding_place");
   public static final ccs<Long> D = a("heard_bell_time");
   public static final ccs<Long> E = a("cant_reach_walk_target_since");
   public static final ccs<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final ccs<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final ccs<Long> H = a("last_slept", Codec.LONG);
   public static final ccs<Long> I = a("last_woken", Codec.LONG);
   public static final ccs<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final ccs<bsn> K = a("nearest_visible_adult");
   public static final ccs<cjg> L = a("nearest_visible_wanted_item");
   public static final ccs<btq> M = a("nearest_visible_nemesis");
   public static final ccs<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final ccs<cmw> O = a("tempting_player");
   public static final ccs<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final ccs<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final ccs<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final ccs<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final ccs<Boolean> T = a("long_jump_mid_jump");
   public static final ccs<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final ccs<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final ccs<evq> W = a("ram_target");
   public static final ccs<bab> X = a("is_in_water", Codec.unit(bab.a));
   public static final ccs<bab> Y = a("is_pregnant", Codec.unit(bab.a));
   public static final ccs<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final ccs<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final ccs<UUID> ab = a("angry_at", kc.a);
   public static final ccs<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final ccs<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final ccs<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final ccs<Boolean> af = a("disable_walk_to_admire_item");
   public static final ccs<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final ccs<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final ccs<iz> ai = a("celebrate_location");
   public static final ccs<Boolean> aj = a("dancing");
   public static final ccs<clg> ak = a("nearest_visible_huntable_hoglin");
   public static final ccs<clg> al = a("nearest_visible_baby_hoglin");
   public static final ccs<cmw> am = a("nearest_targetable_player_not_wearing_gold");
   public static final ccs<List<cll>> an = a("nearby_adult_piglins");
   public static final ccs<List<cll>> ao = a("nearest_visible_adult_piglins");
   public static final ccs<List<clg>> ap = a("nearest_visible_adult_hoglins");
   public static final ccs<cll> aq = a("nearest_visible_adult_piglin");
   public static final ccs<bto> ar = a("nearest_visible_zombified");
   public static final ccs<Integer> as = a("visible_adult_piglin_count");
   public static final ccs<Integer> at = a("visible_adult_hoglin_count");
   public static final ccs<cmw> au = a("nearest_player_holding_wanted_item");
   public static final ccs<Boolean> av = a("ate_recently");
   public static final ccs<iz> aw = a("nearest_repellent");
   public static final ccs<Boolean> ax = a("pacified");
   public static final ccs<bto> ay = a("roar_target");
   public static final ccs<iz> az = a("disturbance_location");
   public static final ccs<bab> aA = a("recent_projectile", Codec.unit(bab.a));
   public static final ccs<bab> aB = a("is_sniffing", Codec.unit(bab.a));
   public static final ccs<bab> aC = a("is_emerging", Codec.unit(bab.a));
   public static final ccs<bab> aD = a("roar_sound_delay", Codec.unit(bab.a));
   public static final ccs<bab> aE = a("dig_cooldown", Codec.unit(bab.a));
   public static final ccs<bab> aF = a("roar_sound_cooldown", Codec.unit(bab.a));
   public static final ccs<bab> aG = a("sniff_cooldown", Codec.unit(bab.a));
   public static final ccs<bab> aH = a("touch_cooldown", Codec.unit(bab.a));
   public static final ccs<bab> aI = a("vibration_cooldown", Codec.unit(bab.a));
   public static final ccs<bab> aJ = a("sonic_boom_cooldown", Codec.unit(bab.a));
   public static final ccs<bab> aK = a("sonic_boom_sound_cooldown", Codec.unit(bab.a));
   public static final ccs<bab> aL = a("sonic_boom_sound_delay", Codec.unit(bab.a));
   public static final ccs<UUID> aM = a("liked_player", kc.a);
   public static final ccs<jh> aN = a("liked_noteblock", jh.b);
   public static final ccs<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final ccs<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final ccs<List<jh>> aQ = a("sniffer_explored_positions", Codec.list(jh.b));
   public static final ccs<iz> aR = a("sniffer_sniffing_target");
   public static final ccs<Boolean> aS = a("sniffer_digging");
   public static final ccs<Boolean> aT = a("sniffer_happy");
   public static final ccs<bab> aU = a("breeze_jump_cooldown", Codec.unit(bab.a));
   public static final ccs<bab> aV = a("breeze_shoot", Codec.unit(bab.a));
   public static final ccs<bab> aW = a("breeze_shoot_charging", Codec.unit(bab.a));
   public static final ccs<bab> aX = a("breeze_shoot_recover", Codec.unit(bab.a));
   public static final ccs<bab> aY = a("breeze_shoot_cooldown", Codec.unit(bab.a));
   public static final ccs<bab> aZ = a("breeze_jump_inhaling", Codec.unit(bab.a));
   public static final ccs<iz> ba = a("breeze_jump_target", iz.a);
   public static final ccs<bab> bb = a("breeze_leaving_water", Codec.unit(bab.a));
   private final Optional<Codec<ccr<U>>> bc;

   @VisibleForTesting
   public ccs(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(ccr::a);
   }

   @Override
   public String toString() {
      return lp.B.b(this).toString();
   }

   public Optional<Codec<ccr<U>>> a() {
      return this.bc;
   }

   private static <U> ccs<U> a(String $$0, Codec<U> $$1) {
      return jv.a(lp.B, new ale($$0), new ccs<>(Optional.of($$1)));
   }

   private static <U> ccs<U> a(String $$0) {
      return jv.a(lp.B, new ale($$0), new ccs<>(Optional.empty()));
   }
}
