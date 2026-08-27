import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bux<U> {
   public static final bux<Void> a = a("dummy");
   public static final bux<id> b = a("home", id.a);
   public static final bux<id> c = a("job_site", id.a);
   public static final bux<id> d = a("potential_job_site", id.a);
   public static final bux<id> e = a("meeting_point", id.a);
   public static final bux<List<id>> f = a("secondary_job_site");
   public static final bux<List<blv>> g = a("mobs");
   public static final bux<buz> h = a("visible_mobs");
   public static final bux<List<blv>> i = a("visible_villager_babies");
   public static final bux<List<cer>> j = a("nearest_players");
   public static final bux<cer> k = a("nearest_visible_player");
   public static final bux<cer> l = a("nearest_visible_targetable_player");
   public static final bux<bva> m = a("walk_target");
   public static final bux<bpa> n = a("look_target");
   public static final bux<blv> o = a("attack_target");
   public static final bux<Boolean> p = a("attack_cooling_down");
   public static final bux<blv> q = a("interaction_target");
   public static final bux<bla> r = a("breed_target");
   public static final bux<blf> s = a("ride_target");
   public static final bux<eeo> t = a("path");
   public static final bux<List<id>> u = a("interactable_doors");
   public static final bux<Set<id>> v = a("doors_to_close");
   public static final bux<hv> w = a("nearest_bed");
   public static final bux<bkd> x = a("hurt_by");
   public static final bux<blv> y = a("hurt_by_entity");
   public static final bux<blv> z = a("avoid_target");
   public static final bux<blv> A = a("nearest_hostile");
   public static final bux<blv> B = a("nearest_attackable");
   public static final bux<id> C = a("hiding_place");
   public static final bux<Long> D = a("heard_bell_time");
   public static final bux<Long> E = a("cant_reach_walk_target_since");
   public static final bux<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bux<Long> G = a("last_slept", Codec.LONG);
   public static final bux<Long> H = a("last_woken", Codec.LONG);
   public static final bux<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bux<bla> J = a("nearest_visible_adult");
   public static final bux<cbe> K = a("nearest_visible_wanted_item");
   public static final bux<blx> L = a("nearest_visible_nemesis");
   public static final bux<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bux<cer> N = a("tempting_player");
   public static final bux<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bux<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final bux<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final bux<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final bux<Boolean> S = a("long_jump_mid_jump");
   public static final bux<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final bux<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final bux<elb> V = a("ram_target");
   public static final bux<avc> W = a("is_in_water", Codec.unit(avc.a));
   public static final bux<avc> X = a("is_pregnant", Codec.unit(avc.a));
   public static final bux<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final bux<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final bux<UUID> aa = a("angry_at", iy.a);
   public static final bux<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final bux<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final bux<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final bux<Boolean> ae = a("disable_walk_to_admire_item");
   public static final bux<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final bux<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final bux<hv> ah = a("celebrate_location");
   public static final bux<Boolean> ai = a("dancing");
   public static final bux<cdb> aj = a("nearest_visible_huntable_hoglin");
   public static final bux<cdb> ak = a("nearest_visible_baby_hoglin");
   public static final bux<cer> al = a("nearest_targetable_player_not_wearing_gold");
   public static final bux<List<cdg>> am = a("nearby_adult_piglins");
   public static final bux<List<cdg>> an = a("nearest_visible_adult_piglins");
   public static final bux<List<cdb>> ao = a("nearest_visible_adult_hoglins");
   public static final bux<cdg> ap = a("nearest_visible_adult_piglin");
   public static final bux<blv> aq = a("nearest_visible_zombified");
   public static final bux<Integer> ar = a("visible_adult_piglin_count");
   public static final bux<Integer> as = a("visible_adult_hoglin_count");
   public static final bux<cer> at = a("nearest_player_holding_wanted_item");
   public static final bux<Boolean> au = a("ate_recently");
   public static final bux<hv> av = a("nearest_repellent");
   public static final bux<Boolean> aw = a("pacified");
   public static final bux<blv> ax = a("roar_target");
   public static final bux<hv> ay = a("disturbance_location");
   public static final bux<avc> az = a("recent_projectile", Codec.unit(avc.a));
   public static final bux<avc> aA = a("is_sniffing", Codec.unit(avc.a));
   public static final bux<avc> aB = a("is_emerging", Codec.unit(avc.a));
   public static final bux<avc> aC = a("roar_sound_delay", Codec.unit(avc.a));
   public static final bux<avc> aD = a("dig_cooldown", Codec.unit(avc.a));
   public static final bux<avc> aE = a("roar_sound_cooldown", Codec.unit(avc.a));
   public static final bux<avc> aF = a("sniff_cooldown", Codec.unit(avc.a));
   public static final bux<avc> aG = a("touch_cooldown", Codec.unit(avc.a));
   public static final bux<avc> aH = a("vibration_cooldown", Codec.unit(avc.a));
   public static final bux<avc> aI = a("sonic_boom_cooldown", Codec.unit(avc.a));
   public static final bux<avc> aJ = a("sonic_boom_sound_cooldown", Codec.unit(avc.a));
   public static final bux<avc> aK = a("sonic_boom_sound_delay", Codec.unit(avc.a));
   public static final bux<UUID> aL = a("liked_player", iy.a);
   public static final bux<id> aM = a("liked_noteblock", id.a);
   public static final bux<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bux<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bux<List<id>> aP = a("sniffer_explored_positions", Codec.list(id.a));
   public static final bux<hv> aQ = a("sniffer_sniffing_target");
   public static final bux<Boolean> aR = a("sniffer_digging");
   public static final bux<Boolean> aS = a("sniffer_happy");
   public static final bux<avc> aT = a("breeze_jump_cooldown", Codec.unit(avc.a));
   public static final bux<avc> aU = a("breeze_shoot", Codec.unit(avc.a));
   public static final bux<avc> aV = a("breeze_shoot_charging", Codec.unit(avc.a));
   public static final bux<avc> aW = a("breeze_shoot_recover", Codec.unit(avc.a));
   public static final bux<avc> aX = a("breeze_shoot_cooldown", Codec.unit(avc.a));
   public static final bux<avc> aY = a("breeze_jump_inhaling", Codec.unit(avc.a));
   public static final bux<hv> aZ = a("breeze_jump_target", hv.a);
   private final Optional<Codec<buw<U>>> ba;

   @VisibleForTesting
   public bux(Optional<Codec<U>> $$0) {
      this.ba = $$0.map(buw::a);
   }

   @Override
   public String toString() {
      return kb.B.b(this).toString();
   }

   public Optional<Codec<buw<U>>> a() {
      return this.ba;
   }

   private static <U> bux<U> a(String $$0, Codec<U> $$1) {
      return ir.a(kb.B, new agt($$0), new bux<>(Optional.of($$1)));
   }

   private static <U> bux<U> a(String $$0) {
      return ir.a(kb.B, new agt($$0), new bux<>(Optional.empty()));
   }
}
