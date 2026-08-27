import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cbu<U> {
   public static final cbu<Void> a = a("dummy");
   public static final cbu<iw> b = a("home", iw.b);
   public static final cbu<iw> c = a("job_site", iw.b);
   public static final cbu<iw> d = a("potential_job_site", iw.b);
   public static final cbu<iw> e = a("meeting_point", iw.b);
   public static final cbu<List<iw>> f = a("secondary_job_site");
   public static final cbu<List<bsq>> g = a("mobs");
   public static final cbu<cbw> h = a("visible_mobs");
   public static final cbu<List<bsq>> i = a("visible_villager_babies");
   public static final cbu<List<cly>> j = a("nearest_players");
   public static final cbu<cly> k = a("nearest_visible_player");
   public static final cbu<cly> l = a("nearest_visible_targetable_player");
   public static final cbu<cbx> m = a("walk_target");
   public static final cbu<bvx> n = a("look_target");
   public static final cbu<bsq> o = a("attack_target");
   public static final cbu<Boolean> p = a("attack_cooling_down");
   public static final cbu<bsq> q = a("interaction_target");
   public static final cbu<brq> r = a("breed_target");
   public static final cbu<brw> s = a("ride_target");
   public static final cbu<enk> t = a("path");
   public static final cbu<List<iw>> u = a("interactable_doors");
   public static final cbu<Set<iw>> v = a("doors_to_close");
   public static final cbu<io> w = a("nearest_bed");
   public static final cbu<bqp> x = a("hurt_by");
   public static final cbu<bsq> y = a("hurt_by_entity");
   public static final cbu<bsq> z = a("avoid_target");
   public static final cbu<bsq> A = a("nearest_hostile");
   public static final cbu<bsq> B = a("nearest_attackable");
   public static final cbu<iw> C = a("hiding_place");
   public static final cbu<Long> D = a("heard_bell_time");
   public static final cbu<Long> E = a("cant_reach_walk_target_since");
   public static final cbu<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cbu<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cbu<Long> H = a("last_slept", Codec.LONG);
   public static final cbu<Long> I = a("last_woken", Codec.LONG);
   public static final cbu<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cbu<brq> K = a("nearest_visible_adult");
   public static final cbu<cii> L = a("nearest_visible_wanted_item");
   public static final cbu<bss> M = a("nearest_visible_nemesis");
   public static final cbu<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cbu<cly> O = a("tempting_player");
   public static final cbu<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cbu<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cbu<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cbu<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cbu<Boolean> T = a("long_jump_mid_jump");
   public static final cbu<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cbu<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cbu<eum> W = a("ram_target");
   public static final cbu<azh> X = a("is_in_water", Codec.unit(azh.a));
   public static final cbu<azh> Y = a("is_pregnant", Codec.unit(azh.a));
   public static final cbu<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cbu<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cbu<UUID> ab = a("angry_at", jr.a);
   public static final cbu<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cbu<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cbu<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cbu<Boolean> af = a("disable_walk_to_admire_item");
   public static final cbu<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cbu<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cbu<io> ai = a("celebrate_location");
   public static final cbu<Boolean> aj = a("dancing");
   public static final cbu<cki> ak = a("nearest_visible_huntable_hoglin");
   public static final cbu<cki> al = a("nearest_visible_baby_hoglin");
   public static final cbu<cly> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cbu<List<ckn>> an = a("nearby_adult_piglins");
   public static final cbu<List<ckn>> ao = a("nearest_visible_adult_piglins");
   public static final cbu<List<cki>> ap = a("nearest_visible_adult_hoglins");
   public static final cbu<ckn> aq = a("nearest_visible_adult_piglin");
   public static final cbu<bsq> ar = a("nearest_visible_zombified");
   public static final cbu<Integer> as = a("visible_adult_piglin_count");
   public static final cbu<Integer> at = a("visible_adult_hoglin_count");
   public static final cbu<cly> au = a("nearest_player_holding_wanted_item");
   public static final cbu<Boolean> av = a("ate_recently");
   public static final cbu<io> aw = a("nearest_repellent");
   public static final cbu<Boolean> ax = a("pacified");
   public static final cbu<bsq> ay = a("roar_target");
   public static final cbu<io> az = a("disturbance_location");
   public static final cbu<azh> aA = a("recent_projectile", Codec.unit(azh.a));
   public static final cbu<azh> aB = a("is_sniffing", Codec.unit(azh.a));
   public static final cbu<azh> aC = a("is_emerging", Codec.unit(azh.a));
   public static final cbu<azh> aD = a("roar_sound_delay", Codec.unit(azh.a));
   public static final cbu<azh> aE = a("dig_cooldown", Codec.unit(azh.a));
   public static final cbu<azh> aF = a("roar_sound_cooldown", Codec.unit(azh.a));
   public static final cbu<azh> aG = a("sniff_cooldown", Codec.unit(azh.a));
   public static final cbu<azh> aH = a("touch_cooldown", Codec.unit(azh.a));
   public static final cbu<azh> aI = a("vibration_cooldown", Codec.unit(azh.a));
   public static final cbu<azh> aJ = a("sonic_boom_cooldown", Codec.unit(azh.a));
   public static final cbu<azh> aK = a("sonic_boom_sound_cooldown", Codec.unit(azh.a));
   public static final cbu<azh> aL = a("sonic_boom_sound_delay", Codec.unit(azh.a));
   public static final cbu<UUID> aM = a("liked_player", jr.a);
   public static final cbu<iw> aN = a("liked_noteblock", iw.b);
   public static final cbu<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cbu<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cbu<List<iw>> aQ = a("sniffer_explored_positions", Codec.list(iw.b));
   public static final cbu<io> aR = a("sniffer_sniffing_target");
   public static final cbu<Boolean> aS = a("sniffer_digging");
   public static final cbu<Boolean> aT = a("sniffer_happy");
   public static final cbu<azh> aU = a("breeze_jump_cooldown", Codec.unit(azh.a));
   public static final cbu<azh> aV = a("breeze_shoot", Codec.unit(azh.a));
   public static final cbu<azh> aW = a("breeze_shoot_charging", Codec.unit(azh.a));
   public static final cbu<azh> aX = a("breeze_shoot_recover", Codec.unit(azh.a));
   public static final cbu<azh> aY = a("breeze_shoot_cooldown", Codec.unit(azh.a));
   public static final cbu<azh> aZ = a("breeze_jump_inhaling", Codec.unit(azh.a));
   public static final cbu<io> ba = a("breeze_jump_target", io.a);
   public static final cbu<azh> bb = a("breeze_leaving_water", Codec.unit(azh.a));
   private final Optional<Codec<cbt<U>>> bc;

   @VisibleForTesting
   public cbu(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cbt::a);
   }

   @Override
   public String toString() {
      return le.B.b(this).toString();
   }

   public Optional<Codec<cbt<U>>> a() {
      return this.bc;
   }

   private static <U> cbu<U> a(String $$0, Codec<U> $$1) {
      return jk.a(le.B, new akn($$0), new cbu<>(Optional.of($$1)));
   }

   private static <U> cbu<U> a(String $$0) {
      return jk.a(le.B, new akn($$0), new cbu<>(Optional.empty()));
   }
}
