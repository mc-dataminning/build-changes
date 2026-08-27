import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bvm<U> {
   public static final bvm<Void> a = a("dummy");
   public static final bvm<ig> b = a("home", ig.a);
   public static final bvm<ig> c = a("job_site", ig.a);
   public static final bvm<ig> d = a("potential_job_site", ig.a);
   public static final bvm<ig> e = a("meeting_point", ig.a);
   public static final bvm<List<ig>> f = a("secondary_job_site");
   public static final bvm<List<bmk>> g = a("mobs");
   public static final bvm<bvo> h = a("visible_mobs");
   public static final bvm<List<bmk>> i = a("visible_villager_babies");
   public static final bvm<List<cfh>> j = a("nearest_players");
   public static final bvm<cfh> k = a("nearest_visible_player");
   public static final bvm<cfh> l = a("nearest_visible_targetable_player");
   public static final bvm<bvp> m = a("walk_target");
   public static final bvm<bpp> n = a("look_target");
   public static final bvm<bmk> o = a("attack_target");
   public static final bvm<Boolean> p = a("attack_cooling_down");
   public static final bvm<bmk> q = a("interaction_target");
   public static final bvm<blp> r = a("breed_target");
   public static final bvm<blu> s = a("ride_target");
   public static final bvm<eff> t = a("path");
   public static final bvm<List<ig>> u = a("interactable_doors");
   public static final bvm<Set<ig>> v = a("doors_to_close");
   public static final bvm<hx> w = a("nearest_bed");
   public static final bvm<bks> x = a("hurt_by");
   public static final bvm<bmk> y = a("hurt_by_entity");
   public static final bvm<bmk> z = a("avoid_target");
   public static final bvm<bmk> A = a("nearest_hostile");
   public static final bvm<bmk> B = a("nearest_attackable");
   public static final bvm<ig> C = a("hiding_place");
   public static final bvm<Long> D = a("heard_bell_time");
   public static final bvm<Long> E = a("cant_reach_walk_target_since");
   public static final bvm<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bvm<Long> G = a("last_slept", Codec.LONG);
   public static final bvm<Long> H = a("last_woken", Codec.LONG);
   public static final bvm<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bvm<blp> J = a("nearest_visible_adult");
   public static final bvm<cbt> K = a("nearest_visible_wanted_item");
   public static final bvm<bmm> L = a("nearest_visible_nemesis");
   public static final bvm<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bvm<cfh> N = a("tempting_player");
   public static final bvm<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bvm<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final bvm<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final bvm<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final bvm<Boolean> S = a("long_jump_mid_jump");
   public static final bvm<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final bvm<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final bvm<els> V = a("ram_target");
   public static final bvm<avr> W = a("is_in_water", Codec.unit(avr.a));
   public static final bvm<avr> X = a("is_pregnant", Codec.unit(avr.a));
   public static final bvm<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final bvm<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final bvm<UUID> aa = a("angry_at", ja.a);
   public static final bvm<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final bvm<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final bvm<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final bvm<Boolean> ae = a("disable_walk_to_admire_item");
   public static final bvm<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final bvm<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final bvm<hx> ah = a("celebrate_location");
   public static final bvm<Boolean> ai = a("dancing");
   public static final bvm<cdr> aj = a("nearest_visible_huntable_hoglin");
   public static final bvm<cdr> ak = a("nearest_visible_baby_hoglin");
   public static final bvm<cfh> al = a("nearest_targetable_player_not_wearing_gold");
   public static final bvm<List<cdw>> am = a("nearby_adult_piglins");
   public static final bvm<List<cdw>> an = a("nearest_visible_adult_piglins");
   public static final bvm<List<cdr>> ao = a("nearest_visible_adult_hoglins");
   public static final bvm<cdw> ap = a("nearest_visible_adult_piglin");
   public static final bvm<bmk> aq = a("nearest_visible_zombified");
   public static final bvm<Integer> ar = a("visible_adult_piglin_count");
   public static final bvm<Integer> as = a("visible_adult_hoglin_count");
   public static final bvm<cfh> at = a("nearest_player_holding_wanted_item");
   public static final bvm<Boolean> au = a("ate_recently");
   public static final bvm<hx> av = a("nearest_repellent");
   public static final bvm<Boolean> aw = a("pacified");
   public static final bvm<bmk> ax = a("roar_target");
   public static final bvm<hx> ay = a("disturbance_location");
   public static final bvm<avr> az = a("recent_projectile", Codec.unit(avr.a));
   public static final bvm<avr> aA = a("is_sniffing", Codec.unit(avr.a));
   public static final bvm<avr> aB = a("is_emerging", Codec.unit(avr.a));
   public static final bvm<avr> aC = a("roar_sound_delay", Codec.unit(avr.a));
   public static final bvm<avr> aD = a("dig_cooldown", Codec.unit(avr.a));
   public static final bvm<avr> aE = a("roar_sound_cooldown", Codec.unit(avr.a));
   public static final bvm<avr> aF = a("sniff_cooldown", Codec.unit(avr.a));
   public static final bvm<avr> aG = a("touch_cooldown", Codec.unit(avr.a));
   public static final bvm<avr> aH = a("vibration_cooldown", Codec.unit(avr.a));
   public static final bvm<avr> aI = a("sonic_boom_cooldown", Codec.unit(avr.a));
   public static final bvm<avr> aJ = a("sonic_boom_sound_cooldown", Codec.unit(avr.a));
   public static final bvm<avr> aK = a("sonic_boom_sound_delay", Codec.unit(avr.a));
   public static final bvm<UUID> aL = a("liked_player", ja.a);
   public static final bvm<ig> aM = a("liked_noteblock", ig.a);
   public static final bvm<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bvm<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bvm<List<ig>> aP = a("sniffer_explored_positions", Codec.list(ig.a));
   public static final bvm<hx> aQ = a("sniffer_sniffing_target");
   public static final bvm<Boolean> aR = a("sniffer_digging");
   public static final bvm<Boolean> aS = a("sniffer_happy");
   public static final bvm<avr> aT = a("breeze_jump_cooldown", Codec.unit(avr.a));
   public static final bvm<avr> aU = a("breeze_shoot", Codec.unit(avr.a));
   public static final bvm<avr> aV = a("breeze_shoot_charging", Codec.unit(avr.a));
   public static final bvm<avr> aW = a("breeze_shoot_recover", Codec.unit(avr.a));
   public static final bvm<avr> aX = a("breeze_shoot_cooldown", Codec.unit(avr.a));
   public static final bvm<avr> aY = a("breeze_jump_inhaling", Codec.unit(avr.a));
   public static final bvm<hx> aZ = a("breeze_jump_target", hx.a);
   private final Optional<Codec<bvl<U>>> ba;

   @VisibleForTesting
   public bvm(Optional<Codec<U>> $$0) {
      this.ba = $$0.map(bvl::a);
   }

   @Override
   public String toString() {
      return kd.B.b(this).toString();
   }

   public Optional<Codec<bvl<U>>> a() {
      return this.ba;
   }

   private static <U> bvm<U> a(String $$0, Codec<U> $$1) {
      return it.a(kd.B, new ahg($$0), new bvm<>(Optional.of($$1)));
   }

   private static <U> bvm<U> a(String $$0) {
      return it.a(kd.B, new ahg($$0), new bvm<>(Optional.empty()));
   }
}
