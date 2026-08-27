import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bya<U> {
   public static final bya<Void> a = a("dummy");
   public static final bya<ik> b = a("home", ik.a);
   public static final bya<ik> c = a("job_site", ik.a);
   public static final bya<ik> d = a("potential_job_site", ik.a);
   public static final bya<ik> e = a("meeting_point", ik.a);
   public static final bya<List<ik>> f = a("secondary_job_site");
   public static final bya<List<box>> g = a("mobs");
   public static final bya<byc> h = a("visible_mobs");
   public static final bya<List<box>> i = a("visible_villager_babies");
   public static final bya<List<cia>> j = a("nearest_players");
   public static final bya<cia> k = a("nearest_visible_player");
   public static final bya<cia> l = a("nearest_visible_targetable_player");
   public static final bya<byd> m = a("walk_target");
   public static final bya<bsd> n = a("look_target");
   public static final bya<box> o = a("attack_target");
   public static final bya<Boolean> p = a("attack_cooling_down");
   public static final bya<box> q = a("interaction_target");
   public static final bya<boa> r = a("breed_target");
   public static final bya<bof> s = a("ride_target");
   public static final bya<eig> t = a("path");
   public static final bya<List<ik>> u = a("interactable_doors");
   public static final bya<Set<ik>> v = a("doors_to_close");
   public static final bya<ib> w = a("nearest_bed");
   public static final bya<bne> x = a("hurt_by");
   public static final bya<box> y = a("hurt_by_entity");
   public static final bya<box> z = a("avoid_target");
   public static final bya<box> A = a("nearest_hostile");
   public static final bya<box> B = a("nearest_attackable");
   public static final bya<ik> C = a("hiding_place");
   public static final bya<Long> D = a("heard_bell_time");
   public static final bya<Long> E = a("cant_reach_walk_target_since");
   public static final bya<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bya<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final bya<Long> H = a("last_slept", Codec.LONG);
   public static final bya<Long> I = a("last_woken", Codec.LONG);
   public static final bya<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final bya<boa> K = a("nearest_visible_adult");
   public static final bya<cel> L = a("nearest_visible_wanted_item");
   public static final bya<boz> M = a("nearest_visible_nemesis");
   public static final bya<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final bya<cia> O = a("tempting_player");
   public static final bya<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final bya<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final bya<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final bya<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final bya<Boolean> T = a("long_jump_mid_jump");
   public static final bya<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final bya<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final bya<eov> W = a("ram_target");
   public static final bya<axo> X = a("is_in_water", Codec.unit(axo.a));
   public static final bya<axo> Y = a("is_pregnant", Codec.unit(axo.a));
   public static final bya<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final bya<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final bya<UUID> ab = a("angry_at", je.a);
   public static final bya<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final bya<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final bya<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final bya<Boolean> af = a("disable_walk_to_admire_item");
   public static final bya<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final bya<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final bya<ib> ai = a("celebrate_location");
   public static final bya<Boolean> aj = a("dancing");
   public static final bya<cgk> ak = a("nearest_visible_huntable_hoglin");
   public static final bya<cgk> al = a("nearest_visible_baby_hoglin");
   public static final bya<cia> am = a("nearest_targetable_player_not_wearing_gold");
   public static final bya<List<cgp>> an = a("nearby_adult_piglins");
   public static final bya<List<cgp>> ao = a("nearest_visible_adult_piglins");
   public static final bya<List<cgk>> ap = a("nearest_visible_adult_hoglins");
   public static final bya<cgp> aq = a("nearest_visible_adult_piglin");
   public static final bya<box> ar = a("nearest_visible_zombified");
   public static final bya<Integer> as = a("visible_adult_piglin_count");
   public static final bya<Integer> at = a("visible_adult_hoglin_count");
   public static final bya<cia> au = a("nearest_player_holding_wanted_item");
   public static final bya<Boolean> av = a("ate_recently");
   public static final bya<ib> aw = a("nearest_repellent");
   public static final bya<Boolean> ax = a("pacified");
   public static final bya<box> ay = a("roar_target");
   public static final bya<ib> az = a("disturbance_location");
   public static final bya<axo> aA = a("recent_projectile", Codec.unit(axo.a));
   public static final bya<axo> aB = a("is_sniffing", Codec.unit(axo.a));
   public static final bya<axo> aC = a("is_emerging", Codec.unit(axo.a));
   public static final bya<axo> aD = a("roar_sound_delay", Codec.unit(axo.a));
   public static final bya<axo> aE = a("dig_cooldown", Codec.unit(axo.a));
   public static final bya<axo> aF = a("roar_sound_cooldown", Codec.unit(axo.a));
   public static final bya<axo> aG = a("sniff_cooldown", Codec.unit(axo.a));
   public static final bya<axo> aH = a("touch_cooldown", Codec.unit(axo.a));
   public static final bya<axo> aI = a("vibration_cooldown", Codec.unit(axo.a));
   public static final bya<axo> aJ = a("sonic_boom_cooldown", Codec.unit(axo.a));
   public static final bya<axo> aK = a("sonic_boom_sound_cooldown", Codec.unit(axo.a));
   public static final bya<axo> aL = a("sonic_boom_sound_delay", Codec.unit(axo.a));
   public static final bya<UUID> aM = a("liked_player", je.a);
   public static final bya<ik> aN = a("liked_noteblock", ik.a);
   public static final bya<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bya<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bya<List<ik>> aQ = a("sniffer_explored_positions", Codec.list(ik.a));
   public static final bya<ib> aR = a("sniffer_sniffing_target");
   public static final bya<Boolean> aS = a("sniffer_digging");
   public static final bya<Boolean> aT = a("sniffer_happy");
   public static final bya<axo> aU = a("breeze_jump_cooldown", Codec.unit(axo.a));
   public static final bya<axo> aV = a("breeze_shoot", Codec.unit(axo.a));
   public static final bya<axo> aW = a("breeze_shoot_charging", Codec.unit(axo.a));
   public static final bya<axo> aX = a("breeze_shoot_recover", Codec.unit(axo.a));
   public static final bya<axo> aY = a("breeze_shoot_cooldown", Codec.unit(axo.a));
   public static final bya<axo> aZ = a("breeze_jump_inhaling", Codec.unit(axo.a));
   public static final bya<ib> ba = a("breeze_jump_target", ib.a);
   public static final bya<axo> bb = a("breeze_leaving_water", Codec.unit(axo.a));
   private final Optional<Codec<bxz<U>>> bc;

   @VisibleForTesting
   public bya(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(bxz::a);
   }

   @Override
   public String toString() {
      return kh.B.b(this).toString();
   }

   public Optional<Codec<bxz<U>>> a() {
      return this.bc;
   }

   private static <U> bya<U> a(String $$0, Codec<U> $$1) {
      return ix.a(kh.B, new ajc($$0), new bya<>(Optional.of($$1)));
   }

   private static <U> bya<U> a(String $$0) {
      return ix.a(kh.B, new ajc($$0), new bya<>(Optional.empty()));
   }
}
