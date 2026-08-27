import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bvq<U> {
   public static final bvq<Void> a = a("dummy");
   public static final bvq<ig> b = a("home", ig.a);
   public static final bvq<ig> c = a("job_site", ig.a);
   public static final bvq<ig> d = a("potential_job_site", ig.a);
   public static final bvq<ig> e = a("meeting_point", ig.a);
   public static final bvq<List<ig>> f = a("secondary_job_site");
   public static final bvq<List<bmo>> g = a("mobs");
   public static final bvq<bvs> h = a("visible_mobs");
   public static final bvq<List<bmo>> i = a("visible_villager_babies");
   public static final bvq<List<cfq>> j = a("nearest_players");
   public static final bvq<cfq> k = a("nearest_visible_player");
   public static final bvq<cfq> l = a("nearest_visible_targetable_player");
   public static final bvq<bvt> m = a("walk_target");
   public static final bvq<bpt> n = a("look_target");
   public static final bvq<bmo> o = a("attack_target");
   public static final bvq<Boolean> p = a("attack_cooling_down");
   public static final bvq<bmo> q = a("interaction_target");
   public static final bvq<blr> r = a("breed_target");
   public static final bvq<blw> s = a("ride_target");
   public static final bvq<efo> t = a("path");
   public static final bvq<List<ig>> u = a("interactable_doors");
   public static final bvq<Set<ig>> v = a("doors_to_close");
   public static final bvq<hx> w = a("nearest_bed");
   public static final bvq<bkv> x = a("hurt_by");
   public static final bvq<bmo> y = a("hurt_by_entity");
   public static final bvq<bmo> z = a("avoid_target");
   public static final bvq<bmo> A = a("nearest_hostile");
   public static final bvq<bmo> B = a("nearest_attackable");
   public static final bvq<ig> C = a("hiding_place");
   public static final bvq<Long> D = a("heard_bell_time");
   public static final bvq<Long> E = a("cant_reach_walk_target_since");
   public static final bvq<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bvq<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final bvq<Long> H = a("last_slept", Codec.LONG);
   public static final bvq<Long> I = a("last_woken", Codec.LONG);
   public static final bvq<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final bvq<blr> K = a("nearest_visible_adult");
   public static final bvq<ccb> L = a("nearest_visible_wanted_item");
   public static final bvq<bmq> M = a("nearest_visible_nemesis");
   public static final bvq<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final bvq<cfq> O = a("tempting_player");
   public static final bvq<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final bvq<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final bvq<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final bvq<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final bvq<Boolean> T = a("long_jump_mid_jump");
   public static final bvq<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final bvq<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final bvq<emc> W = a("ram_target");
   public static final bvq<avt> X = a("is_in_water", Codec.unit(avt.a));
   public static final bvq<avt> Y = a("is_pregnant", Codec.unit(avt.a));
   public static final bvq<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final bvq<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final bvq<UUID> ab = a("angry_at", ja.a);
   public static final bvq<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final bvq<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final bvq<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final bvq<Boolean> af = a("disable_walk_to_admire_item");
   public static final bvq<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final bvq<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final bvq<hx> ai = a("celebrate_location");
   public static final bvq<Boolean> aj = a("dancing");
   public static final bvq<cea> ak = a("nearest_visible_huntable_hoglin");
   public static final bvq<cea> al = a("nearest_visible_baby_hoglin");
   public static final bvq<cfq> am = a("nearest_targetable_player_not_wearing_gold");
   public static final bvq<List<cef>> an = a("nearby_adult_piglins");
   public static final bvq<List<cef>> ao = a("nearest_visible_adult_piglins");
   public static final bvq<List<cea>> ap = a("nearest_visible_adult_hoglins");
   public static final bvq<cef> aq = a("nearest_visible_adult_piglin");
   public static final bvq<bmo> ar = a("nearest_visible_zombified");
   public static final bvq<Integer> as = a("visible_adult_piglin_count");
   public static final bvq<Integer> at = a("visible_adult_hoglin_count");
   public static final bvq<cfq> au = a("nearest_player_holding_wanted_item");
   public static final bvq<Boolean> av = a("ate_recently");
   public static final bvq<hx> aw = a("nearest_repellent");
   public static final bvq<Boolean> ax = a("pacified");
   public static final bvq<bmo> ay = a("roar_target");
   public static final bvq<hx> az = a("disturbance_location");
   public static final bvq<avt> aA = a("recent_projectile", Codec.unit(avt.a));
   public static final bvq<avt> aB = a("is_sniffing", Codec.unit(avt.a));
   public static final bvq<avt> aC = a("is_emerging", Codec.unit(avt.a));
   public static final bvq<avt> aD = a("roar_sound_delay", Codec.unit(avt.a));
   public static final bvq<avt> aE = a("dig_cooldown", Codec.unit(avt.a));
   public static final bvq<avt> aF = a("roar_sound_cooldown", Codec.unit(avt.a));
   public static final bvq<avt> aG = a("sniff_cooldown", Codec.unit(avt.a));
   public static final bvq<avt> aH = a("touch_cooldown", Codec.unit(avt.a));
   public static final bvq<avt> aI = a("vibration_cooldown", Codec.unit(avt.a));
   public static final bvq<avt> aJ = a("sonic_boom_cooldown", Codec.unit(avt.a));
   public static final bvq<avt> aK = a("sonic_boom_sound_cooldown", Codec.unit(avt.a));
   public static final bvq<avt> aL = a("sonic_boom_sound_delay", Codec.unit(avt.a));
   public static final bvq<UUID> aM = a("liked_player", ja.a);
   public static final bvq<ig> aN = a("liked_noteblock", ig.a);
   public static final bvq<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bvq<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bvq<List<ig>> aQ = a("sniffer_explored_positions", Codec.list(ig.a));
   public static final bvq<hx> aR = a("sniffer_sniffing_target");
   public static final bvq<Boolean> aS = a("sniffer_digging");
   public static final bvq<Boolean> aT = a("sniffer_happy");
   public static final bvq<avt> aU = a("breeze_jump_cooldown", Codec.unit(avt.a));
   public static final bvq<avt> aV = a("breeze_shoot", Codec.unit(avt.a));
   public static final bvq<avt> aW = a("breeze_shoot_charging", Codec.unit(avt.a));
   public static final bvq<avt> aX = a("breeze_shoot_recover", Codec.unit(avt.a));
   public static final bvq<avt> aY = a("breeze_shoot_cooldown", Codec.unit(avt.a));
   public static final bvq<avt> aZ = a("breeze_jump_inhaling", Codec.unit(avt.a));
   public static final bvq<hx> ba = a("breeze_jump_target", hx.a);
   public static final bvq<avt> bb = a("breeze_leaving_water", Codec.unit(avt.a));
   private final Optional<Codec<bvp<U>>> bc;

   @VisibleForTesting
   public bvq(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(bvp::a);
   }

   @Override
   public String toString() {
      return kd.B.b(this).toString();
   }

   public Optional<Codec<bvp<U>>> a() {
      return this.bc;
   }

   private static <U> bvq<U> a(String $$0, Codec<U> $$1) {
      return it.a(kd.B, new ahh($$0), new bvq<>(Optional.of($$1)));
   }

   private static <U> bvq<U> a(String $$0) {
      return it.a(kd.B, new ahh($$0), new bvq<>(Optional.empty()));
   }
}
