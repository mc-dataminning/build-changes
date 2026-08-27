import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cbs<U> {
   public static final cbs<Void> a = a("dummy");
   public static final cbs<iw> b = a("home", iw.b);
   public static final cbs<iw> c = a("job_site", iw.b);
   public static final cbs<iw> d = a("potential_job_site", iw.b);
   public static final cbs<iw> e = a("meeting_point", iw.b);
   public static final cbs<List<iw>> f = a("secondary_job_site");
   public static final cbs<List<bso>> g = a("mobs");
   public static final cbs<cbu> h = a("visible_mobs");
   public static final cbs<List<bso>> i = a("visible_villager_babies");
   public static final cbs<List<clw>> j = a("nearest_players");
   public static final cbs<clw> k = a("nearest_visible_player");
   public static final cbs<clw> l = a("nearest_visible_targetable_player");
   public static final cbs<cbv> m = a("walk_target");
   public static final cbs<bvv> n = a("look_target");
   public static final cbs<bso> o = a("attack_target");
   public static final cbs<Boolean> p = a("attack_cooling_down");
   public static final cbs<bso> q = a("interaction_target");
   public static final cbs<bro> r = a("breed_target");
   public static final cbs<bru> s = a("ride_target");
   public static final cbs<eni> t = a("path");
   public static final cbs<List<iw>> u = a("interactable_doors");
   public static final cbs<Set<iw>> v = a("doors_to_close");
   public static final cbs<io> w = a("nearest_bed");
   public static final cbs<bqn> x = a("hurt_by");
   public static final cbs<bso> y = a("hurt_by_entity");
   public static final cbs<bso> z = a("avoid_target");
   public static final cbs<bso> A = a("nearest_hostile");
   public static final cbs<bso> B = a("nearest_attackable");
   public static final cbs<iw> C = a("hiding_place");
   public static final cbs<Long> D = a("heard_bell_time");
   public static final cbs<Long> E = a("cant_reach_walk_target_since");
   public static final cbs<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cbs<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cbs<Long> H = a("last_slept", Codec.LONG);
   public static final cbs<Long> I = a("last_woken", Codec.LONG);
   public static final cbs<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cbs<bro> K = a("nearest_visible_adult");
   public static final cbs<cig> L = a("nearest_visible_wanted_item");
   public static final cbs<bsq> M = a("nearest_visible_nemesis");
   public static final cbs<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cbs<clw> O = a("tempting_player");
   public static final cbs<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cbs<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cbs<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cbs<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cbs<Boolean> T = a("long_jump_mid_jump");
   public static final cbs<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cbs<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cbs<euk> W = a("ram_target");
   public static final cbs<azf> X = a("is_in_water", Codec.unit(azf.a));
   public static final cbs<azf> Y = a("is_pregnant", Codec.unit(azf.a));
   public static final cbs<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cbs<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cbs<UUID> ab = a("angry_at", jr.a);
   public static final cbs<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cbs<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cbs<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cbs<Boolean> af = a("disable_walk_to_admire_item");
   public static final cbs<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cbs<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cbs<io> ai = a("celebrate_location");
   public static final cbs<Boolean> aj = a("dancing");
   public static final cbs<ckg> ak = a("nearest_visible_huntable_hoglin");
   public static final cbs<ckg> al = a("nearest_visible_baby_hoglin");
   public static final cbs<clw> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cbs<List<ckl>> an = a("nearby_adult_piglins");
   public static final cbs<List<ckl>> ao = a("nearest_visible_adult_piglins");
   public static final cbs<List<ckg>> ap = a("nearest_visible_adult_hoglins");
   public static final cbs<ckl> aq = a("nearest_visible_adult_piglin");
   public static final cbs<bso> ar = a("nearest_visible_zombified");
   public static final cbs<Integer> as = a("visible_adult_piglin_count");
   public static final cbs<Integer> at = a("visible_adult_hoglin_count");
   public static final cbs<clw> au = a("nearest_player_holding_wanted_item");
   public static final cbs<Boolean> av = a("ate_recently");
   public static final cbs<io> aw = a("nearest_repellent");
   public static final cbs<Boolean> ax = a("pacified");
   public static final cbs<bso> ay = a("roar_target");
   public static final cbs<io> az = a("disturbance_location");
   public static final cbs<azf> aA = a("recent_projectile", Codec.unit(azf.a));
   public static final cbs<azf> aB = a("is_sniffing", Codec.unit(azf.a));
   public static final cbs<azf> aC = a("is_emerging", Codec.unit(azf.a));
   public static final cbs<azf> aD = a("roar_sound_delay", Codec.unit(azf.a));
   public static final cbs<azf> aE = a("dig_cooldown", Codec.unit(azf.a));
   public static final cbs<azf> aF = a("roar_sound_cooldown", Codec.unit(azf.a));
   public static final cbs<azf> aG = a("sniff_cooldown", Codec.unit(azf.a));
   public static final cbs<azf> aH = a("touch_cooldown", Codec.unit(azf.a));
   public static final cbs<azf> aI = a("vibration_cooldown", Codec.unit(azf.a));
   public static final cbs<azf> aJ = a("sonic_boom_cooldown", Codec.unit(azf.a));
   public static final cbs<azf> aK = a("sonic_boom_sound_cooldown", Codec.unit(azf.a));
   public static final cbs<azf> aL = a("sonic_boom_sound_delay", Codec.unit(azf.a));
   public static final cbs<UUID> aM = a("liked_player", jr.a);
   public static final cbs<iw> aN = a("liked_noteblock", iw.b);
   public static final cbs<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cbs<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cbs<List<iw>> aQ = a("sniffer_explored_positions", Codec.list(iw.b));
   public static final cbs<io> aR = a("sniffer_sniffing_target");
   public static final cbs<Boolean> aS = a("sniffer_digging");
   public static final cbs<Boolean> aT = a("sniffer_happy");
   public static final cbs<azf> aU = a("breeze_jump_cooldown", Codec.unit(azf.a));
   public static final cbs<azf> aV = a("breeze_shoot", Codec.unit(azf.a));
   public static final cbs<azf> aW = a("breeze_shoot_charging", Codec.unit(azf.a));
   public static final cbs<azf> aX = a("breeze_shoot_recover", Codec.unit(azf.a));
   public static final cbs<azf> aY = a("breeze_shoot_cooldown", Codec.unit(azf.a));
   public static final cbs<azf> aZ = a("breeze_jump_inhaling", Codec.unit(azf.a));
   public static final cbs<io> ba = a("breeze_jump_target", io.a);
   public static final cbs<azf> bb = a("breeze_leaving_water", Codec.unit(azf.a));
   private final Optional<Codec<cbr<U>>> bc;

   @VisibleForTesting
   public cbs(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cbr::a);
   }

   @Override
   public String toString() {
      return le.B.b(this).toString();
   }

   public Optional<Codec<cbr<U>>> a() {
      return this.bc;
   }

   private static <U> cbs<U> a(String $$0, Codec<U> $$1) {
      return jk.a(le.B, new akm($$0), new cbs<>(Optional.of($$1)));
   }

   private static <U> cbs<U> a(String $$0) {
      return jk.a(le.B, new akm($$0), new cbs<>(Optional.empty()));
   }
}
