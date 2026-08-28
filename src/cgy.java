import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cgy<U> {
   public static final cgy<Void> a = a("dummy");
   public static final cgy<jf> b = a("home", jf.b);
   public static final cgy<jf> c = a("job_site", jf.b);
   public static final cgy<jf> d = a("potential_job_site", jf.b);
   public static final cgy<jf> e = a("meeting_point", jf.b);
   public static final cgy<List<jf>> f = a("secondary_job_site");
   public static final cgy<List<bxw>> g = a("mobs");
   public static final cgy<cha> h = a("visible_mobs");
   public static final cgy<List<bxw>> i = a("visible_villager_babies");
   public static final cgy<List<crz>> j = a("nearest_players");
   public static final cgy<crz> k = a("nearest_visible_player");
   public static final cgy<crz> l = a("nearest_visible_targetable_player");
   public static final cgy<List<crz>> m = a("nearest_visible_targetable_players");
   public static final cgy<chb> n = a("walk_target");
   public static final cgy<cbb> o = a("look_target");
   public static final cgy<bxw> p = a("attack_target");
   public static final cgy<Boolean> q = a("attack_cooling_down");
   public static final cgy<bxw> r = a("interaction_target");
   public static final cgy<bwl> s = a("breed_target");
   public static final cgy<bwv> t = a("ride_target");
   public static final cgy<eye> u = a("path");
   public static final cgy<List<jf>> v = a("interactable_doors");
   public static final cgy<Set<jf>> w = a("doors_to_close");
   public static final cgy<iw> x = a("nearest_bed");
   public static final cgy<bvk> y = a("hurt_by");
   public static final cgy<bxw> z = a("hurt_by_entity");
   public static final cgy<bxw> A = a("avoid_target");
   public static final cgy<bxw> B = a("nearest_hostile");
   public static final cgy<bxw> C = a("nearest_attackable");
   public static final cgy<jf> D = a("hiding_place");
   public static final cgy<Long> E = a("heard_bell_time");
   public static final cgy<Long> F = a("cant_reach_walk_target_since");
   public static final cgy<Boolean> G = a("golem_detected_recently", Codec.BOOL);
   public static final cgy<Boolean> H = a("danger_detected_recently", Codec.BOOL);
   public static final cgy<Long> I = a("last_slept", Codec.LONG);
   public static final cgy<Long> J = a("last_woken", Codec.LONG);
   public static final cgy<Long> K = a("last_worked_at_poi", Codec.LONG);
   public static final cgy<bwl> L = a("nearest_visible_adult");
   public static final cgy<coe> M = a("nearest_visible_wanted_item");
   public static final cgy<bxy> N = a("nearest_visible_nemesis");
   public static final cgy<Integer> O = a("play_dead_ticks", Codec.INT);
   public static final cgy<crz> P = a("tempting_player");
   public static final cgy<Integer> Q = a("temptation_cooldown_ticks", Codec.INT);
   public static final cgy<Integer> R = a("gaze_cooldown_ticks", Codec.INT);
   public static final cgy<Boolean> S = a("is_tempted", Codec.BOOL);
   public static final cgy<Integer> T = a("long_jump_cooling_down", Codec.INT);
   public static final cgy<Boolean> U = a("long_jump_mid_jump");
   public static final cgy<Boolean> V = a("has_hunting_cooldown", Codec.BOOL);
   public static final cgy<Integer> W = a("ram_cooldown_ticks", Codec.INT);
   public static final cgy<ffs> X = a("ram_target");
   public static final cgy<bay> Y = a("is_in_water", bay.b);
   public static final cgy<bay> Z = a("is_pregnant", bay.b);
   public static final cgy<Boolean> aa = a("is_panicking", Codec.BOOL);
   public static final cgy<List<UUID>> ab = a("unreachable_tongue_targets");
   public static final cgy<UUID> ac = a("angry_at", ka.a);
   public static final cgy<Boolean> ad = a("universal_anger", Codec.BOOL);
   public static final cgy<Boolean> ae = a("admiring_item", Codec.BOOL);
   public static final cgy<Integer> af = a("time_trying_to_reach_admire_item");
   public static final cgy<Boolean> ag = a("disable_walk_to_admire_item");
   public static final cgy<Boolean> ah = a("admiring_disabled", Codec.BOOL);
   public static final cgy<Boolean> ai = a("hunted_recently", Codec.BOOL);
   public static final cgy<iw> aj = a("celebrate_location");
   public static final cgy<Boolean> ak = a("dancing");
   public static final cgy<cqi> al = a("nearest_visible_huntable_hoglin");
   public static final cgy<cqi> am = a("nearest_visible_baby_hoglin");
   public static final cgy<crz> an = a("nearest_targetable_player_not_wearing_gold");
   public static final cgy<List<cqn>> ao = a("nearby_adult_piglins");
   public static final cgy<List<cqn>> ap = a("nearest_visible_adult_piglins");
   public static final cgy<List<cqi>> aq = a("nearest_visible_adult_hoglins");
   public static final cgy<cqn> ar = a("nearest_visible_adult_piglin");
   public static final cgy<bxw> as = a("nearest_visible_zombified");
   public static final cgy<Integer> at = a("visible_adult_piglin_count");
   public static final cgy<Integer> au = a("visible_adult_hoglin_count");
   public static final cgy<crz> av = a("nearest_player_holding_wanted_item");
   public static final cgy<Boolean> aw = a("ate_recently");
   public static final cgy<iw> ax = a("nearest_repellent");
   public static final cgy<Boolean> ay = a("pacified");
   public static final cgy<bxw> az = a("roar_target");
   public static final cgy<iw> aA = a("disturbance_location");
   public static final cgy<bay> aB = a("recent_projectile", bay.b);
   public static final cgy<bay> aC = a("is_sniffing", bay.b);
   public static final cgy<bay> aD = a("is_emerging", bay.b);
   public static final cgy<bay> aE = a("roar_sound_delay", bay.b);
   public static final cgy<bay> aF = a("dig_cooldown", bay.b);
   public static final cgy<bay> aG = a("roar_sound_cooldown", bay.b);
   public static final cgy<bay> aH = a("sniff_cooldown", bay.b);
   public static final cgy<bay> aI = a("touch_cooldown", bay.b);
   public static final cgy<bay> aJ = a("vibration_cooldown", bay.b);
   public static final cgy<bay> aK = a("sonic_boom_cooldown", bay.b);
   public static final cgy<bay> aL = a("sonic_boom_sound_cooldown", bay.b);
   public static final cgy<bay> aM = a("sonic_boom_sound_delay", bay.b);
   public static final cgy<UUID> aN = a("liked_player", ka.a);
   public static final cgy<jf> aO = a("liked_noteblock", jf.b);
   public static final cgy<Integer> aP = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cgy<Integer> aQ = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cgy<List<jf>> aR = a("sniffer_explored_positions", Codec.list(jf.b));
   public static final cgy<iw> aS = a("sniffer_sniffing_target");
   public static final cgy<Boolean> aT = a("sniffer_digging");
   public static final cgy<Boolean> aU = a("sniffer_happy");
   public static final cgy<bay> aV = a("breeze_jump_cooldown", bay.b);
   public static final cgy<bay> aW = a("breeze_shoot", bay.b);
   public static final cgy<bay> aX = a("breeze_shoot_charging", bay.b);
   public static final cgy<bay> aY = a("breeze_shoot_recover", bay.b);
   public static final cgy<bay> aZ = a("breeze_shoot_cooldown", bay.b);
   public static final cgy<bay> ba = a("breeze_jump_inhaling", bay.b);
   public static final cgy<iw> bb = a("breeze_jump_target", iw.a);
   public static final cgy<bay> bc = a("breeze_leaving_water", bay.b);
   private final Optional<Codec<cgx<U>>> bd;

   @VisibleForTesting
   public cgy(Optional<Codec<U>> $$0) {
      this.bd = $$0.map(cgx::a);
   }

   @Override
   public String toString() {
      return mh.z.b(this).toString();
   }

   public Optional<Codec<cgx<U>>> a() {
      return this.bd;
   }

   private static <U> cgy<U> a(String $$0, Codec<U> $$1) {
      return jt.a(mh.z, alk.b($$0), new cgy<>(Optional.of($$1)));
   }

   private static <U> cgy<U> a(String $$0) {
      return jt.a(mh.z, alk.b($$0), new cgy<>(Optional.empty()));
   }
}
