import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cct<U> {
   public static final cct<Void> a = a("dummy");
   public static final cct<jh> b = a("home", jh.b);
   public static final cct<jh> c = a("job_site", jh.b);
   public static final cct<jh> d = a("potential_job_site", jh.b);
   public static final cct<jh> e = a("meeting_point", jh.b);
   public static final cct<List<jh>> f = a("secondary_job_site");
   public static final cct<List<btp>> g = a("mobs");
   public static final cct<ccv> h = a("visible_mobs");
   public static final cct<List<btp>> i = a("visible_villager_babies");
   public static final cct<List<cmx>> j = a("nearest_players");
   public static final cct<cmx> k = a("nearest_visible_player");
   public static final cct<cmx> l = a("nearest_visible_targetable_player");
   public static final cct<ccw> m = a("walk_target");
   public static final cct<bww> n = a("look_target");
   public static final cct<btp> o = a("attack_target");
   public static final cct<Boolean> p = a("attack_cooling_down");
   public static final cct<btp> q = a("interaction_target");
   public static final cct<bso> r = a("breed_target");
   public static final cct<bsu> s = a("ride_target");
   public static final cct<eoj> t = a("path");
   public static final cct<List<jh>> u = a("interactable_doors");
   public static final cct<Set<jh>> v = a("doors_to_close");
   public static final cct<iz> w = a("nearest_bed");
   public static final cct<brn> x = a("hurt_by");
   public static final cct<btp> y = a("hurt_by_entity");
   public static final cct<btp> z = a("avoid_target");
   public static final cct<btp> A = a("nearest_hostile");
   public static final cct<btp> B = a("nearest_attackable");
   public static final cct<jh> C = a("hiding_place");
   public static final cct<Long> D = a("heard_bell_time");
   public static final cct<Long> E = a("cant_reach_walk_target_since");
   public static final cct<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cct<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cct<Long> H = a("last_slept", Codec.LONG);
   public static final cct<Long> I = a("last_woken", Codec.LONG);
   public static final cct<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cct<bso> K = a("nearest_visible_adult");
   public static final cct<cjh> L = a("nearest_visible_wanted_item");
   public static final cct<btr> M = a("nearest_visible_nemesis");
   public static final cct<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cct<cmx> O = a("tempting_player");
   public static final cct<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cct<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cct<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cct<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cct<Boolean> T = a("long_jump_mid_jump");
   public static final cct<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cct<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cct<evr> W = a("ram_target");
   public static final cct<bac> X = a("is_in_water", Codec.unit(bac.a));
   public static final cct<bac> Y = a("is_pregnant", Codec.unit(bac.a));
   public static final cct<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cct<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cct<UUID> ab = a("angry_at", kc.a);
   public static final cct<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cct<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cct<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cct<Boolean> af = a("disable_walk_to_admire_item");
   public static final cct<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cct<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cct<iz> ai = a("celebrate_location");
   public static final cct<Boolean> aj = a("dancing");
   public static final cct<clh> ak = a("nearest_visible_huntable_hoglin");
   public static final cct<clh> al = a("nearest_visible_baby_hoglin");
   public static final cct<cmx> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cct<List<clm>> an = a("nearby_adult_piglins");
   public static final cct<List<clm>> ao = a("nearest_visible_adult_piglins");
   public static final cct<List<clh>> ap = a("nearest_visible_adult_hoglins");
   public static final cct<clm> aq = a("nearest_visible_adult_piglin");
   public static final cct<btp> ar = a("nearest_visible_zombified");
   public static final cct<Integer> as = a("visible_adult_piglin_count");
   public static final cct<Integer> at = a("visible_adult_hoglin_count");
   public static final cct<cmx> au = a("nearest_player_holding_wanted_item");
   public static final cct<Boolean> av = a("ate_recently");
   public static final cct<iz> aw = a("nearest_repellent");
   public static final cct<Boolean> ax = a("pacified");
   public static final cct<btp> ay = a("roar_target");
   public static final cct<iz> az = a("disturbance_location");
   public static final cct<bac> aA = a("recent_projectile", Codec.unit(bac.a));
   public static final cct<bac> aB = a("is_sniffing", Codec.unit(bac.a));
   public static final cct<bac> aC = a("is_emerging", Codec.unit(bac.a));
   public static final cct<bac> aD = a("roar_sound_delay", Codec.unit(bac.a));
   public static final cct<bac> aE = a("dig_cooldown", Codec.unit(bac.a));
   public static final cct<bac> aF = a("roar_sound_cooldown", Codec.unit(bac.a));
   public static final cct<bac> aG = a("sniff_cooldown", Codec.unit(bac.a));
   public static final cct<bac> aH = a("touch_cooldown", Codec.unit(bac.a));
   public static final cct<bac> aI = a("vibration_cooldown", Codec.unit(bac.a));
   public static final cct<bac> aJ = a("sonic_boom_cooldown", Codec.unit(bac.a));
   public static final cct<bac> aK = a("sonic_boom_sound_cooldown", Codec.unit(bac.a));
   public static final cct<bac> aL = a("sonic_boom_sound_delay", Codec.unit(bac.a));
   public static final cct<UUID> aM = a("liked_player", kc.a);
   public static final cct<jh> aN = a("liked_noteblock", jh.b);
   public static final cct<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cct<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cct<List<jh>> aQ = a("sniffer_explored_positions", Codec.list(jh.b));
   public static final cct<iz> aR = a("sniffer_sniffing_target");
   public static final cct<Boolean> aS = a("sniffer_digging");
   public static final cct<Boolean> aT = a("sniffer_happy");
   public static final cct<bac> aU = a("breeze_jump_cooldown", Codec.unit(bac.a));
   public static final cct<bac> aV = a("breeze_shoot", Codec.unit(bac.a));
   public static final cct<bac> aW = a("breeze_shoot_charging", Codec.unit(bac.a));
   public static final cct<bac> aX = a("breeze_shoot_recover", Codec.unit(bac.a));
   public static final cct<bac> aY = a("breeze_shoot_cooldown", Codec.unit(bac.a));
   public static final cct<bac> aZ = a("breeze_jump_inhaling", Codec.unit(bac.a));
   public static final cct<iz> ba = a("breeze_jump_target", iz.a);
   public static final cct<bac> bb = a("breeze_leaving_water", Codec.unit(bac.a));
   private final Optional<Codec<ccs<U>>> bc;

   @VisibleForTesting
   public cct(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(ccs::a);
   }

   @Override
   public String toString() {
      return lp.B.b(this).toString();
   }

   public Optional<Codec<ccs<U>>> a() {
      return this.bc;
   }

   private static <U> cct<U> a(String $$0, Codec<U> $$1) {
      return jv.a(lp.B, new alf($$0), new cct<>(Optional.of($$1)));
   }

   private static <U> cct<U> a(String $$0) {
      return jv.a(lp.B, new alf($$0), new cct<>(Optional.empty()));
   }
}
