import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class ccr<U> {
   public static final ccr<Void> a = a("dummy");
   public static final ccr<jh> b = a("home", jh.b);
   public static final ccr<jh> c = a("job_site", jh.b);
   public static final ccr<jh> d = a("potential_job_site", jh.b);
   public static final ccr<jh> e = a("meeting_point", jh.b);
   public static final ccr<List<jh>> f = a("secondary_job_site");
   public static final ccr<List<btn>> g = a("mobs");
   public static final ccr<cct> h = a("visible_mobs");
   public static final ccr<List<btn>> i = a("visible_villager_babies");
   public static final ccr<List<cmv>> j = a("nearest_players");
   public static final ccr<cmv> k = a("nearest_visible_player");
   public static final ccr<cmv> l = a("nearest_visible_targetable_player");
   public static final ccr<ccu> m = a("walk_target");
   public static final ccr<bwu> n = a("look_target");
   public static final ccr<btn> o = a("attack_target");
   public static final ccr<Boolean> p = a("attack_cooling_down");
   public static final ccr<btn> q = a("interaction_target");
   public static final ccr<bsm> r = a("breed_target");
   public static final ccr<bss> s = a("ride_target");
   public static final ccr<eoh> t = a("path");
   public static final ccr<List<jh>> u = a("interactable_doors");
   public static final ccr<Set<jh>> v = a("doors_to_close");
   public static final ccr<iz> w = a("nearest_bed");
   public static final ccr<brl> x = a("hurt_by");
   public static final ccr<btn> y = a("hurt_by_entity");
   public static final ccr<btn> z = a("avoid_target");
   public static final ccr<btn> A = a("nearest_hostile");
   public static final ccr<btn> B = a("nearest_attackable");
   public static final ccr<jh> C = a("hiding_place");
   public static final ccr<Long> D = a("heard_bell_time");
   public static final ccr<Long> E = a("cant_reach_walk_target_since");
   public static final ccr<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final ccr<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final ccr<Long> H = a("last_slept", Codec.LONG);
   public static final ccr<Long> I = a("last_woken", Codec.LONG);
   public static final ccr<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final ccr<bsm> K = a("nearest_visible_adult");
   public static final ccr<cjf> L = a("nearest_visible_wanted_item");
   public static final ccr<btp> M = a("nearest_visible_nemesis");
   public static final ccr<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final ccr<cmv> O = a("tempting_player");
   public static final ccr<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final ccr<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final ccr<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final ccr<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final ccr<Boolean> T = a("long_jump_mid_jump");
   public static final ccr<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final ccr<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final ccr<evp> W = a("ram_target");
   public static final ccr<baa> X = a("is_in_water", Codec.unit(baa.a));
   public static final ccr<baa> Y = a("is_pregnant", Codec.unit(baa.a));
   public static final ccr<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final ccr<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final ccr<UUID> ab = a("angry_at", kc.a);
   public static final ccr<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final ccr<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final ccr<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final ccr<Boolean> af = a("disable_walk_to_admire_item");
   public static final ccr<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final ccr<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final ccr<iz> ai = a("celebrate_location");
   public static final ccr<Boolean> aj = a("dancing");
   public static final ccr<clf> ak = a("nearest_visible_huntable_hoglin");
   public static final ccr<clf> al = a("nearest_visible_baby_hoglin");
   public static final ccr<cmv> am = a("nearest_targetable_player_not_wearing_gold");
   public static final ccr<List<clk>> an = a("nearby_adult_piglins");
   public static final ccr<List<clk>> ao = a("nearest_visible_adult_piglins");
   public static final ccr<List<clf>> ap = a("nearest_visible_adult_hoglins");
   public static final ccr<clk> aq = a("nearest_visible_adult_piglin");
   public static final ccr<btn> ar = a("nearest_visible_zombified");
   public static final ccr<Integer> as = a("visible_adult_piglin_count");
   public static final ccr<Integer> at = a("visible_adult_hoglin_count");
   public static final ccr<cmv> au = a("nearest_player_holding_wanted_item");
   public static final ccr<Boolean> av = a("ate_recently");
   public static final ccr<iz> aw = a("nearest_repellent");
   public static final ccr<Boolean> ax = a("pacified");
   public static final ccr<btn> ay = a("roar_target");
   public static final ccr<iz> az = a("disturbance_location");
   public static final ccr<baa> aA = a("recent_projectile", Codec.unit(baa.a));
   public static final ccr<baa> aB = a("is_sniffing", Codec.unit(baa.a));
   public static final ccr<baa> aC = a("is_emerging", Codec.unit(baa.a));
   public static final ccr<baa> aD = a("roar_sound_delay", Codec.unit(baa.a));
   public static final ccr<baa> aE = a("dig_cooldown", Codec.unit(baa.a));
   public static final ccr<baa> aF = a("roar_sound_cooldown", Codec.unit(baa.a));
   public static final ccr<baa> aG = a("sniff_cooldown", Codec.unit(baa.a));
   public static final ccr<baa> aH = a("touch_cooldown", Codec.unit(baa.a));
   public static final ccr<baa> aI = a("vibration_cooldown", Codec.unit(baa.a));
   public static final ccr<baa> aJ = a("sonic_boom_cooldown", Codec.unit(baa.a));
   public static final ccr<baa> aK = a("sonic_boom_sound_cooldown", Codec.unit(baa.a));
   public static final ccr<baa> aL = a("sonic_boom_sound_delay", Codec.unit(baa.a));
   public static final ccr<UUID> aM = a("liked_player", kc.a);
   public static final ccr<jh> aN = a("liked_noteblock", jh.b);
   public static final ccr<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final ccr<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final ccr<List<jh>> aQ = a("sniffer_explored_positions", Codec.list(jh.b));
   public static final ccr<iz> aR = a("sniffer_sniffing_target");
   public static final ccr<Boolean> aS = a("sniffer_digging");
   public static final ccr<Boolean> aT = a("sniffer_happy");
   public static final ccr<baa> aU = a("breeze_jump_cooldown", Codec.unit(baa.a));
   public static final ccr<baa> aV = a("breeze_shoot", Codec.unit(baa.a));
   public static final ccr<baa> aW = a("breeze_shoot_charging", Codec.unit(baa.a));
   public static final ccr<baa> aX = a("breeze_shoot_recover", Codec.unit(baa.a));
   public static final ccr<baa> aY = a("breeze_shoot_cooldown", Codec.unit(baa.a));
   public static final ccr<baa> aZ = a("breeze_jump_inhaling", Codec.unit(baa.a));
   public static final ccr<iz> ba = a("breeze_jump_target", iz.a);
   public static final ccr<baa> bb = a("breeze_leaving_water", Codec.unit(baa.a));
   private final Optional<Codec<ccq<U>>> bc;

   @VisibleForTesting
   public ccr(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(ccq::a);
   }

   @Override
   public String toString() {
      return lp.B.b(this).toString();
   }

   public Optional<Codec<ccq<U>>> a() {
      return this.bc;
   }

   private static <U> ccr<U> a(String $$0, Codec<U> $$1) {
      return jv.a(lp.B, new ale($$0), new ccr<>(Optional.of($$1)));
   }

   private static <U> ccr<U> a(String $$0) {
      return jv.a(lp.B, new ale($$0), new ccr<>(Optional.empty()));
   }
}
