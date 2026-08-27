import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bvh<U> {
   public static final bvh<Void> a = a("dummy");
   public static final bvh<ig> b = a("home", ig.a);
   public static final bvh<ig> c = a("job_site", ig.a);
   public static final bvh<ig> d = a("potential_job_site", ig.a);
   public static final bvh<ig> e = a("meeting_point", ig.a);
   public static final bvh<List<ig>> f = a("secondary_job_site");
   public static final bvh<List<bmf>> g = a("mobs");
   public static final bvh<bvj> h = a("visible_mobs");
   public static final bvh<List<bmf>> i = a("visible_villager_babies");
   public static final bvh<List<cfb>> j = a("nearest_players");
   public static final bvh<cfb> k = a("nearest_visible_player");
   public static final bvh<cfb> l = a("nearest_visible_targetable_player");
   public static final bvh<bvk> m = a("walk_target");
   public static final bvh<bpk> n = a("look_target");
   public static final bvh<bmf> o = a("attack_target");
   public static final bvh<Boolean> p = a("attack_cooling_down");
   public static final bvh<bmf> q = a("interaction_target");
   public static final bvh<blk> r = a("breed_target");
   public static final bvh<blp> s = a("ride_target");
   public static final bvh<eez> t = a("path");
   public static final bvh<List<ig>> u = a("interactable_doors");
   public static final bvh<Set<ig>> v = a("doors_to_close");
   public static final bvh<hx> w = a("nearest_bed");
   public static final bvh<bkn> x = a("hurt_by");
   public static final bvh<bmf> y = a("hurt_by_entity");
   public static final bvh<bmf> z = a("avoid_target");
   public static final bvh<bmf> A = a("nearest_hostile");
   public static final bvh<bmf> B = a("nearest_attackable");
   public static final bvh<ig> C = a("hiding_place");
   public static final bvh<Long> D = a("heard_bell_time");
   public static final bvh<Long> E = a("cant_reach_walk_target_since");
   public static final bvh<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bvh<Long> G = a("last_slept", Codec.LONG);
   public static final bvh<Long> H = a("last_woken", Codec.LONG);
   public static final bvh<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bvh<blk> J = a("nearest_visible_adult");
   public static final bvh<cbo> K = a("nearest_visible_wanted_item");
   public static final bvh<bmh> L = a("nearest_visible_nemesis");
   public static final bvh<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bvh<cfb> N = a("tempting_player");
   public static final bvh<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bvh<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final bvh<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final bvh<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final bvh<Boolean> S = a("long_jump_mid_jump");
   public static final bvh<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final bvh<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final bvh<elm> V = a("ram_target");
   public static final bvh<avm> W = a("is_in_water", Codec.unit(avm.a));
   public static final bvh<avm> X = a("is_pregnant", Codec.unit(avm.a));
   public static final bvh<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final bvh<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final bvh<UUID> aa = a("angry_at", ja.a);
   public static final bvh<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final bvh<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final bvh<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final bvh<Boolean> ae = a("disable_walk_to_admire_item");
   public static final bvh<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final bvh<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final bvh<hx> ah = a("celebrate_location");
   public static final bvh<Boolean> ai = a("dancing");
   public static final bvh<cdl> aj = a("nearest_visible_huntable_hoglin");
   public static final bvh<cdl> ak = a("nearest_visible_baby_hoglin");
   public static final bvh<cfb> al = a("nearest_targetable_player_not_wearing_gold");
   public static final bvh<List<cdq>> am = a("nearby_adult_piglins");
   public static final bvh<List<cdq>> an = a("nearest_visible_adult_piglins");
   public static final bvh<List<cdl>> ao = a("nearest_visible_adult_hoglins");
   public static final bvh<cdq> ap = a("nearest_visible_adult_piglin");
   public static final bvh<bmf> aq = a("nearest_visible_zombified");
   public static final bvh<Integer> ar = a("visible_adult_piglin_count");
   public static final bvh<Integer> as = a("visible_adult_hoglin_count");
   public static final bvh<cfb> at = a("nearest_player_holding_wanted_item");
   public static final bvh<Boolean> au = a("ate_recently");
   public static final bvh<hx> av = a("nearest_repellent");
   public static final bvh<Boolean> aw = a("pacified");
   public static final bvh<bmf> ax = a("roar_target");
   public static final bvh<hx> ay = a("disturbance_location");
   public static final bvh<avm> az = a("recent_projectile", Codec.unit(avm.a));
   public static final bvh<avm> aA = a("is_sniffing", Codec.unit(avm.a));
   public static final bvh<avm> aB = a("is_emerging", Codec.unit(avm.a));
   public static final bvh<avm> aC = a("roar_sound_delay", Codec.unit(avm.a));
   public static final bvh<avm> aD = a("dig_cooldown", Codec.unit(avm.a));
   public static final bvh<avm> aE = a("roar_sound_cooldown", Codec.unit(avm.a));
   public static final bvh<avm> aF = a("sniff_cooldown", Codec.unit(avm.a));
   public static final bvh<avm> aG = a("touch_cooldown", Codec.unit(avm.a));
   public static final bvh<avm> aH = a("vibration_cooldown", Codec.unit(avm.a));
   public static final bvh<avm> aI = a("sonic_boom_cooldown", Codec.unit(avm.a));
   public static final bvh<avm> aJ = a("sonic_boom_sound_cooldown", Codec.unit(avm.a));
   public static final bvh<avm> aK = a("sonic_boom_sound_delay", Codec.unit(avm.a));
   public static final bvh<UUID> aL = a("liked_player", ja.a);
   public static final bvh<ig> aM = a("liked_noteblock", ig.a);
   public static final bvh<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bvh<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bvh<List<ig>> aP = a("sniffer_explored_positions", Codec.list(ig.a));
   public static final bvh<hx> aQ = a("sniffer_sniffing_target");
   public static final bvh<Boolean> aR = a("sniffer_digging");
   public static final bvh<Boolean> aS = a("sniffer_happy");
   public static final bvh<avm> aT = a("breeze_jump_cooldown", Codec.unit(avm.a));
   public static final bvh<avm> aU = a("breeze_shoot", Codec.unit(avm.a));
   public static final bvh<avm> aV = a("breeze_shoot_charging", Codec.unit(avm.a));
   public static final bvh<avm> aW = a("breeze_shoot_recover", Codec.unit(avm.a));
   public static final bvh<avm> aX = a("breeze_shoot_cooldown", Codec.unit(avm.a));
   public static final bvh<avm> aY = a("breeze_jump_inhaling", Codec.unit(avm.a));
   public static final bvh<hx> aZ = a("breeze_jump_target", hx.a);
   private final Optional<Codec<bvg<U>>> ba;

   @VisibleForTesting
   public bvh(Optional<Codec<U>> $$0) {
      this.ba = $$0.map(bvg::a);
   }

   @Override
   public String toString() {
      return kd.B.b(this).toString();
   }

   public Optional<Codec<bvg<U>>> a() {
      return this.ba;
   }

   private static <U> bvh<U> a(String $$0, Codec<U> $$1) {
      return it.a(kd.B, new ahd($$0), new bvh<>(Optional.of($$1)));
   }

   private static <U> bvh<U> a(String $$0) {
      return it.a(kd.B, new ahd($$0), new bvh<>(Optional.empty()));
   }
}
