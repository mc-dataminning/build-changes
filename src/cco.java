import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cco<U> {
   public static final cco<Void> a = a("dummy");
   public static final cco<jh> b = a("home", jh.b);
   public static final cco<jh> c = a("job_site", jh.b);
   public static final cco<jh> d = a("potential_job_site", jh.b);
   public static final cco<jh> e = a("meeting_point", jh.b);
   public static final cco<List<jh>> f = a("secondary_job_site");
   public static final cco<List<btk>> g = a("mobs");
   public static final cco<ccq> h = a("visible_mobs");
   public static final cco<List<btk>> i = a("visible_villager_babies");
   public static final cco<List<cms>> j = a("nearest_players");
   public static final cco<cms> k = a("nearest_visible_player");
   public static final cco<cms> l = a("nearest_visible_targetable_player");
   public static final cco<ccr> m = a("walk_target");
   public static final cco<bwr> n = a("look_target");
   public static final cco<btk> o = a("attack_target");
   public static final cco<Boolean> p = a("attack_cooling_down");
   public static final cco<btk> q = a("interaction_target");
   public static final cco<bsj> r = a("breed_target");
   public static final cco<bsp> s = a("ride_target");
   public static final cco<eoe> t = a("path");
   public static final cco<List<jh>> u = a("interactable_doors");
   public static final cco<Set<jh>> v = a("doors_to_close");
   public static final cco<iz> w = a("nearest_bed");
   public static final cco<bri> x = a("hurt_by");
   public static final cco<btk> y = a("hurt_by_entity");
   public static final cco<btk> z = a("avoid_target");
   public static final cco<btk> A = a("nearest_hostile");
   public static final cco<btk> B = a("nearest_attackable");
   public static final cco<jh> C = a("hiding_place");
   public static final cco<Long> D = a("heard_bell_time");
   public static final cco<Long> E = a("cant_reach_walk_target_since");
   public static final cco<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cco<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cco<Long> H = a("last_slept", Codec.LONG);
   public static final cco<Long> I = a("last_woken", Codec.LONG);
   public static final cco<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cco<bsj> K = a("nearest_visible_adult");
   public static final cco<cjc> L = a("nearest_visible_wanted_item");
   public static final cco<btm> M = a("nearest_visible_nemesis");
   public static final cco<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cco<cms> O = a("tempting_player");
   public static final cco<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cco<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cco<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cco<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cco<Boolean> T = a("long_jump_mid_jump");
   public static final cco<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cco<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cco<evm> W = a("ram_target");
   public static final cco<azx> X = a("is_in_water", Codec.unit(azx.a));
   public static final cco<azx> Y = a("is_pregnant", Codec.unit(azx.a));
   public static final cco<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cco<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cco<UUID> ab = a("angry_at", kc.a);
   public static final cco<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cco<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cco<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cco<Boolean> af = a("disable_walk_to_admire_item");
   public static final cco<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cco<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cco<iz> ai = a("celebrate_location");
   public static final cco<Boolean> aj = a("dancing");
   public static final cco<clc> ak = a("nearest_visible_huntable_hoglin");
   public static final cco<clc> al = a("nearest_visible_baby_hoglin");
   public static final cco<cms> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cco<List<clh>> an = a("nearby_adult_piglins");
   public static final cco<List<clh>> ao = a("nearest_visible_adult_piglins");
   public static final cco<List<clc>> ap = a("nearest_visible_adult_hoglins");
   public static final cco<clh> aq = a("nearest_visible_adult_piglin");
   public static final cco<btk> ar = a("nearest_visible_zombified");
   public static final cco<Integer> as = a("visible_adult_piglin_count");
   public static final cco<Integer> at = a("visible_adult_hoglin_count");
   public static final cco<cms> au = a("nearest_player_holding_wanted_item");
   public static final cco<Boolean> av = a("ate_recently");
   public static final cco<iz> aw = a("nearest_repellent");
   public static final cco<Boolean> ax = a("pacified");
   public static final cco<btk> ay = a("roar_target");
   public static final cco<iz> az = a("disturbance_location");
   public static final cco<azx> aA = a("recent_projectile", Codec.unit(azx.a));
   public static final cco<azx> aB = a("is_sniffing", Codec.unit(azx.a));
   public static final cco<azx> aC = a("is_emerging", Codec.unit(azx.a));
   public static final cco<azx> aD = a("roar_sound_delay", Codec.unit(azx.a));
   public static final cco<azx> aE = a("dig_cooldown", Codec.unit(azx.a));
   public static final cco<azx> aF = a("roar_sound_cooldown", Codec.unit(azx.a));
   public static final cco<azx> aG = a("sniff_cooldown", Codec.unit(azx.a));
   public static final cco<azx> aH = a("touch_cooldown", Codec.unit(azx.a));
   public static final cco<azx> aI = a("vibration_cooldown", Codec.unit(azx.a));
   public static final cco<azx> aJ = a("sonic_boom_cooldown", Codec.unit(azx.a));
   public static final cco<azx> aK = a("sonic_boom_sound_cooldown", Codec.unit(azx.a));
   public static final cco<azx> aL = a("sonic_boom_sound_delay", Codec.unit(azx.a));
   public static final cco<UUID> aM = a("liked_player", kc.a);
   public static final cco<jh> aN = a("liked_noteblock", jh.b);
   public static final cco<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cco<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cco<List<jh>> aQ = a("sniffer_explored_positions", Codec.list(jh.b));
   public static final cco<iz> aR = a("sniffer_sniffing_target");
   public static final cco<Boolean> aS = a("sniffer_digging");
   public static final cco<Boolean> aT = a("sniffer_happy");
   public static final cco<azx> aU = a("breeze_jump_cooldown", Codec.unit(azx.a));
   public static final cco<azx> aV = a("breeze_shoot", Codec.unit(azx.a));
   public static final cco<azx> aW = a("breeze_shoot_charging", Codec.unit(azx.a));
   public static final cco<azx> aX = a("breeze_shoot_recover", Codec.unit(azx.a));
   public static final cco<azx> aY = a("breeze_shoot_cooldown", Codec.unit(azx.a));
   public static final cco<azx> aZ = a("breeze_jump_inhaling", Codec.unit(azx.a));
   public static final cco<iz> ba = a("breeze_jump_target", iz.a);
   public static final cco<azx> bb = a("breeze_leaving_water", Codec.unit(azx.a));
   private final Optional<Codec<ccn<U>>> bc;

   @VisibleForTesting
   public cco(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(ccn::a);
   }

   @Override
   public String toString() {
      return lp.B.b(this).toString();
   }

   public Optional<Codec<ccn<U>>> a() {
      return this.bc;
   }

   private static <U> cco<U> a(String $$0, Codec<U> $$1) {
      return jv.a(lp.B, new alb($$0), new cco<>(Optional.of($$1)));
   }

   private static <U> cco<U> a(String $$0) {
      return jv.a(lp.B, new alb($$0), new cco<>(Optional.empty()));
   }
}
