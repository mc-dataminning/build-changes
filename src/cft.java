import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cft<U> {
   public static final cft<Void> a = a("dummy");
   public static final cft<jr> b = a("home", jr.b);
   public static final cft<jr> c = a("job_site", jr.b);
   public static final cft<jr> d = a("potential_job_site", jr.b);
   public static final cft<jr> e = a("meeting_point", jr.b);
   public static final cft<List<jr>> f = a("secondary_job_site");
   public static final cft<List<bwr>> g = a("mobs");
   public static final cft<cfv> h = a("visible_mobs");
   public static final cft<List<bwr>> i = a("visible_villager_babies");
   public static final cft<List<cqi>> j = a("nearest_players");
   public static final cft<cqi> k = a("nearest_visible_player");
   public static final cft<cqi> l = a("nearest_visible_targetable_player");
   public static final cft<List<cqi>> m = a("nearest_visible_targetable_players");
   public static final cft<cfw> n = a("walk_target");
   public static final cft<bzw> o = a("look_target");
   public static final cft<bwr> p = a("attack_target");
   public static final cft<Boolean> q = a("attack_cooling_down");
   public static final cft<bwr> r = a("interaction_target");
   public static final cft<bvi> s = a("breed_target");
   public static final cft<bvs> t = a("ride_target");
   public static final cft<evh> u = a("path");
   public static final cft<List<jr>> v = a("interactable_doors");
   public static final cft<Set<jr>> w = a("doors_to_close");
   public static final cft<jj> x = a("nearest_bed");
   public static final cft<buh> y = a("hurt_by");
   public static final cft<bwr> z = a("hurt_by_entity");
   public static final cft<bwr> A = a("avoid_target");
   public static final cft<bwr> B = a("nearest_hostile");
   public static final cft<bwr> C = a("nearest_attackable");
   public static final cft<jr> D = a("hiding_place");
   public static final cft<Long> E = a("heard_bell_time");
   public static final cft<Long> F = a("cant_reach_walk_target_since");
   public static final cft<Boolean> G = a("golem_detected_recently", Codec.BOOL);
   public static final cft<Boolean> H = a("danger_detected_recently", Codec.BOOL);
   public static final cft<Long> I = a("last_slept", Codec.LONG);
   public static final cft<Long> J = a("last_woken", Codec.LONG);
   public static final cft<Long> K = a("last_worked_at_poi", Codec.LONG);
   public static final cft<bvi> L = a("nearest_visible_adult");
   public static final cft<cmn> M = a("nearest_visible_wanted_item");
   public static final cft<bwt> N = a("nearest_visible_nemesis");
   public static final cft<Integer> O = a("play_dead_ticks", Codec.INT);
   public static final cft<cqi> P = a("tempting_player");
   public static final cft<Integer> Q = a("temptation_cooldown_ticks", Codec.INT);
   public static final cft<Integer> R = a("gaze_cooldown_ticks", Codec.INT);
   public static final cft<Boolean> S = a("is_tempted", Codec.BOOL);
   public static final cft<Integer> T = a("long_jump_cooling_down", Codec.INT);
   public static final cft<Boolean> U = a("long_jump_mid_jump");
   public static final cft<Boolean> V = a("has_hunting_cooldown", Codec.BOOL);
   public static final cft<Integer> W = a("ram_cooldown_ticks", Codec.INT);
   public static final cft<fcu> X = a("ram_target");
   public static final cft<baq> Y = a("is_in_water", baq.b);
   public static final cft<baq> Z = a("is_pregnant", baq.b);
   public static final cft<Boolean> aa = a("is_panicking", Codec.BOOL);
   public static final cft<List<UUID>> ab = a("unreachable_tongue_targets");
   public static final cft<UUID> ac = a("angry_at", km.a);
   public static final cft<Boolean> ad = a("universal_anger", Codec.BOOL);
   public static final cft<Boolean> ae = a("admiring_item", Codec.BOOL);
   public static final cft<Integer> af = a("time_trying_to_reach_admire_item");
   public static final cft<Boolean> ag = a("disable_walk_to_admire_item");
   public static final cft<Boolean> ah = a("admiring_disabled", Codec.BOOL);
   public static final cft<Boolean> ai = a("hunted_recently", Codec.BOOL);
   public static final cft<jj> aj = a("celebrate_location");
   public static final cft<Boolean> ak = a("dancing");
   public static final cft<cor> al = a("nearest_visible_huntable_hoglin");
   public static final cft<cor> am = a("nearest_visible_baby_hoglin");
   public static final cft<cqi> an = a("nearest_targetable_player_not_wearing_gold");
   public static final cft<List<cow>> ao = a("nearby_adult_piglins");
   public static final cft<List<cow>> ap = a("nearest_visible_adult_piglins");
   public static final cft<List<cor>> aq = a("nearest_visible_adult_hoglins");
   public static final cft<cow> ar = a("nearest_visible_adult_piglin");
   public static final cft<bwr> as = a("nearest_visible_zombified");
   public static final cft<Integer> at = a("visible_adult_piglin_count");
   public static final cft<Integer> au = a("visible_adult_hoglin_count");
   public static final cft<cqi> av = a("nearest_player_holding_wanted_item");
   public static final cft<Boolean> aw = a("ate_recently");
   public static final cft<jj> ax = a("nearest_repellent");
   public static final cft<Boolean> ay = a("pacified");
   public static final cft<bwr> az = a("roar_target");
   public static final cft<jj> aA = a("disturbance_location");
   public static final cft<baq> aB = a("recent_projectile", baq.b);
   public static final cft<baq> aC = a("is_sniffing", baq.b);
   public static final cft<baq> aD = a("is_emerging", baq.b);
   public static final cft<baq> aE = a("roar_sound_delay", baq.b);
   public static final cft<baq> aF = a("dig_cooldown", baq.b);
   public static final cft<baq> aG = a("roar_sound_cooldown", baq.b);
   public static final cft<baq> aH = a("sniff_cooldown", baq.b);
   public static final cft<baq> aI = a("touch_cooldown", baq.b);
   public static final cft<baq> aJ = a("vibration_cooldown", baq.b);
   public static final cft<baq> aK = a("sonic_boom_cooldown", baq.b);
   public static final cft<baq> aL = a("sonic_boom_sound_cooldown", baq.b);
   public static final cft<baq> aM = a("sonic_boom_sound_delay", baq.b);
   public static final cft<UUID> aN = a("liked_player", km.a);
   public static final cft<jr> aO = a("liked_noteblock", jr.b);
   public static final cft<Integer> aP = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cft<Integer> aQ = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cft<List<jr>> aR = a("sniffer_explored_positions", Codec.list(jr.b));
   public static final cft<jj> aS = a("sniffer_sniffing_target");
   public static final cft<Boolean> aT = a("sniffer_digging");
   public static final cft<Boolean> aU = a("sniffer_happy");
   public static final cft<baq> aV = a("breeze_jump_cooldown", baq.b);
   public static final cft<baq> aW = a("breeze_shoot", baq.b);
   public static final cft<baq> aX = a("breeze_shoot_charging", baq.b);
   public static final cft<baq> aY = a("breeze_shoot_recover", baq.b);
   public static final cft<baq> aZ = a("breeze_shoot_cooldown", baq.b);
   public static final cft<baq> ba = a("breeze_jump_inhaling", baq.b);
   public static final cft<jj> bb = a("breeze_jump_target", jj.a);
   public static final cft<baq> bc = a("breeze_leaving_water", baq.b);
   private final Optional<Codec<cfs<U>>> bd;

   @VisibleForTesting
   public cft(Optional<Codec<U>> $$0) {
      this.bd = $$0.map(cfs::a);
   }

   @Override
   public String toString() {
      return md.z.b(this).toString();
   }

   public Optional<Codec<cfs<U>>> a() {
      return this.bd;
   }

   private static <U> cft<U> a(String $$0, Codec<U> $$1) {
      return kf.a(md.z, ald.b($$0), new cft<>(Optional.of($$1)));
   }

   private static <U> cft<U> a(String $$0) {
      return kf.a(md.z, ald.b($$0), new cft<>(Optional.empty()));
   }
}
