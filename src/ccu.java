import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class ccu<U> {
   public static final ccu<Void> a = a("dummy");
   public static final ccu<jh> b = a("home", jh.b);
   public static final ccu<jh> c = a("job_site", jh.b);
   public static final ccu<jh> d = a("potential_job_site", jh.b);
   public static final ccu<jh> e = a("meeting_point", jh.b);
   public static final ccu<List<jh>> f = a("secondary_job_site");
   public static final ccu<List<btq>> g = a("mobs");
   public static final ccu<ccw> h = a("visible_mobs");
   public static final ccu<List<btq>> i = a("visible_villager_babies");
   public static final ccu<List<cmy>> j = a("nearest_players");
   public static final ccu<cmy> k = a("nearest_visible_player");
   public static final ccu<cmy> l = a("nearest_visible_targetable_player");
   public static final ccu<ccx> m = a("walk_target");
   public static final ccu<bwx> n = a("look_target");
   public static final ccu<btq> o = a("attack_target");
   public static final ccu<Boolean> p = a("attack_cooling_down");
   public static final ccu<btq> q = a("interaction_target");
   public static final ccu<bsp> r = a("breed_target");
   public static final ccu<bsv> s = a("ride_target");
   public static final ccu<eok> t = a("path");
   public static final ccu<List<jh>> u = a("interactable_doors");
   public static final ccu<Set<jh>> v = a("doors_to_close");
   public static final ccu<iz> w = a("nearest_bed");
   public static final ccu<bro> x = a("hurt_by");
   public static final ccu<btq> y = a("hurt_by_entity");
   public static final ccu<btq> z = a("avoid_target");
   public static final ccu<btq> A = a("nearest_hostile");
   public static final ccu<btq> B = a("nearest_attackable");
   public static final ccu<jh> C = a("hiding_place");
   public static final ccu<Long> D = a("heard_bell_time");
   public static final ccu<Long> E = a("cant_reach_walk_target_since");
   public static final ccu<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final ccu<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final ccu<Long> H = a("last_slept", Codec.LONG);
   public static final ccu<Long> I = a("last_woken", Codec.LONG);
   public static final ccu<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final ccu<bsp> K = a("nearest_visible_adult");
   public static final ccu<cji> L = a("nearest_visible_wanted_item");
   public static final ccu<bts> M = a("nearest_visible_nemesis");
   public static final ccu<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final ccu<cmy> O = a("tempting_player");
   public static final ccu<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final ccu<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final ccu<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final ccu<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final ccu<Boolean> T = a("long_jump_mid_jump");
   public static final ccu<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final ccu<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final ccu<evs> W = a("ram_target");
   public static final ccu<bac> X = a("is_in_water", Codec.unit(bac.a));
   public static final ccu<bac> Y = a("is_pregnant", Codec.unit(bac.a));
   public static final ccu<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final ccu<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final ccu<UUID> ab = a("angry_at", kc.a);
   public static final ccu<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final ccu<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final ccu<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final ccu<Boolean> af = a("disable_walk_to_admire_item");
   public static final ccu<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final ccu<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final ccu<iz> ai = a("celebrate_location");
   public static final ccu<Boolean> aj = a("dancing");
   public static final ccu<cli> ak = a("nearest_visible_huntable_hoglin");
   public static final ccu<cli> al = a("nearest_visible_baby_hoglin");
   public static final ccu<cmy> am = a("nearest_targetable_player_not_wearing_gold");
   public static final ccu<List<cln>> an = a("nearby_adult_piglins");
   public static final ccu<List<cln>> ao = a("nearest_visible_adult_piglins");
   public static final ccu<List<cli>> ap = a("nearest_visible_adult_hoglins");
   public static final ccu<cln> aq = a("nearest_visible_adult_piglin");
   public static final ccu<btq> ar = a("nearest_visible_zombified");
   public static final ccu<Integer> as = a("visible_adult_piglin_count");
   public static final ccu<Integer> at = a("visible_adult_hoglin_count");
   public static final ccu<cmy> au = a("nearest_player_holding_wanted_item");
   public static final ccu<Boolean> av = a("ate_recently");
   public static final ccu<iz> aw = a("nearest_repellent");
   public static final ccu<Boolean> ax = a("pacified");
   public static final ccu<btq> ay = a("roar_target");
   public static final ccu<iz> az = a("disturbance_location");
   public static final ccu<bac> aA = a("recent_projectile", Codec.unit(bac.a));
   public static final ccu<bac> aB = a("is_sniffing", Codec.unit(bac.a));
   public static final ccu<bac> aC = a("is_emerging", Codec.unit(bac.a));
   public static final ccu<bac> aD = a("roar_sound_delay", Codec.unit(bac.a));
   public static final ccu<bac> aE = a("dig_cooldown", Codec.unit(bac.a));
   public static final ccu<bac> aF = a("roar_sound_cooldown", Codec.unit(bac.a));
   public static final ccu<bac> aG = a("sniff_cooldown", Codec.unit(bac.a));
   public static final ccu<bac> aH = a("touch_cooldown", Codec.unit(bac.a));
   public static final ccu<bac> aI = a("vibration_cooldown", Codec.unit(bac.a));
   public static final ccu<bac> aJ = a("sonic_boom_cooldown", Codec.unit(bac.a));
   public static final ccu<bac> aK = a("sonic_boom_sound_cooldown", Codec.unit(bac.a));
   public static final ccu<bac> aL = a("sonic_boom_sound_delay", Codec.unit(bac.a));
   public static final ccu<UUID> aM = a("liked_player", kc.a);
   public static final ccu<jh> aN = a("liked_noteblock", jh.b);
   public static final ccu<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final ccu<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final ccu<List<jh>> aQ = a("sniffer_explored_positions", Codec.list(jh.b));
   public static final ccu<iz> aR = a("sniffer_sniffing_target");
   public static final ccu<Boolean> aS = a("sniffer_digging");
   public static final ccu<Boolean> aT = a("sniffer_happy");
   public static final ccu<bac> aU = a("breeze_jump_cooldown", Codec.unit(bac.a));
   public static final ccu<bac> aV = a("breeze_shoot", Codec.unit(bac.a));
   public static final ccu<bac> aW = a("breeze_shoot_charging", Codec.unit(bac.a));
   public static final ccu<bac> aX = a("breeze_shoot_recover", Codec.unit(bac.a));
   public static final ccu<bac> aY = a("breeze_shoot_cooldown", Codec.unit(bac.a));
   public static final ccu<bac> aZ = a("breeze_jump_inhaling", Codec.unit(bac.a));
   public static final ccu<iz> ba = a("breeze_jump_target", iz.a);
   public static final ccu<bac> bb = a("breeze_leaving_water", Codec.unit(bac.a));
   private final Optional<Codec<cct<U>>> bc;

   @VisibleForTesting
   public ccu(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cct::a);
   }

   @Override
   public String toString() {
      return lp.B.b(this).toString();
   }

   public Optional<Codec<cct<U>>> a() {
      return this.bc;
   }

   private static <U> ccu<U> a(String $$0, Codec<U> $$1) {
      return jv.a(lp.B, new alf($$0), new ccu<>(Optional.of($$1)));
   }

   private static <U> ccu<U> a(String $$0) {
      return jv.a(lp.B, new alf($$0), new ccu<>(Optional.empty()));
   }
}
