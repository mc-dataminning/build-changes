import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cgw<U> {
   public static final cgw<Void> a = a("dummy");
   public static final cgw<je> b = a("home", je.b);
   public static final cgw<je> c = a("job_site", je.b);
   public static final cgw<je> d = a("potential_job_site", je.b);
   public static final cgw<je> e = a("meeting_point", je.b);
   public static final cgw<List<je>> f = a("secondary_job_site");
   public static final cgw<List<bxu>> g = a("mobs");
   public static final cgw<cgy> h = a("visible_mobs");
   public static final cgw<List<bxu>> i = a("visible_villager_babies");
   public static final cgw<List<crx>> j = a("nearest_players");
   public static final cgw<crx> k = a("nearest_visible_player");
   public static final cgw<crx> l = a("nearest_visible_targetable_player");
   public static final cgw<List<crx>> m = a("nearest_visible_targetable_players");
   public static final cgw<cgz> n = a("walk_target");
   public static final cgw<caz> o = a("look_target");
   public static final cgw<bxu> p = a("attack_target");
   public static final cgw<Boolean> q = a("attack_cooling_down");
   public static final cgw<bxu> r = a("interaction_target");
   public static final cgw<bwj> s = a("breed_target");
   public static final cgw<bwt> t = a("ride_target");
   public static final cgw<eyc> u = a("path");
   public static final cgw<List<je>> v = a("interactable_doors");
   public static final cgw<Set<je>> w = a("doors_to_close");
   public static final cgw<iv> x = a("nearest_bed");
   public static final cgw<bvi> y = a("hurt_by");
   public static final cgw<bxu> z = a("hurt_by_entity");
   public static final cgw<bxu> A = a("avoid_target");
   public static final cgw<bxu> B = a("nearest_hostile");
   public static final cgw<bxu> C = a("nearest_attackable");
   public static final cgw<je> D = a("hiding_place");
   public static final cgw<Long> E = a("heard_bell_time");
   public static final cgw<Long> F = a("cant_reach_walk_target_since");
   public static final cgw<Boolean> G = a("golem_detected_recently", Codec.BOOL);
   public static final cgw<Boolean> H = a("danger_detected_recently", Codec.BOOL);
   public static final cgw<Long> I = a("last_slept", Codec.LONG);
   public static final cgw<Long> J = a("last_woken", Codec.LONG);
   public static final cgw<Long> K = a("last_worked_at_poi", Codec.LONG);
   public static final cgw<bwj> L = a("nearest_visible_adult");
   public static final cgw<coc> M = a("nearest_visible_wanted_item");
   public static final cgw<bxw> N = a("nearest_visible_nemesis");
   public static final cgw<Integer> O = a("play_dead_ticks", Codec.INT);
   public static final cgw<crx> P = a("tempting_player");
   public static final cgw<Integer> Q = a("temptation_cooldown_ticks", Codec.INT);
   public static final cgw<Integer> R = a("gaze_cooldown_ticks", Codec.INT);
   public static final cgw<Boolean> S = a("is_tempted", Codec.BOOL);
   public static final cgw<Integer> T = a("long_jump_cooling_down", Codec.INT);
   public static final cgw<Boolean> U = a("long_jump_mid_jump");
   public static final cgw<Boolean> V = a("has_hunting_cooldown", Codec.BOOL);
   public static final cgw<Integer> W = a("ram_cooldown_ticks", Codec.INT);
   public static final cgw<ffq> X = a("ram_target");
   public static final cgw<baw> Y = a("is_in_water", baw.b);
   public static final cgw<baw> Z = a("is_pregnant", baw.b);
   public static final cgw<Boolean> aa = a("is_panicking", Codec.BOOL);
   public static final cgw<List<UUID>> ab = a("unreachable_tongue_targets");
   public static final cgw<UUID> ac = a("angry_at", jz.a);
   public static final cgw<Boolean> ad = a("universal_anger", Codec.BOOL);
   public static final cgw<Boolean> ae = a("admiring_item", Codec.BOOL);
   public static final cgw<Integer> af = a("time_trying_to_reach_admire_item");
   public static final cgw<Boolean> ag = a("disable_walk_to_admire_item");
   public static final cgw<Boolean> ah = a("admiring_disabled", Codec.BOOL);
   public static final cgw<Boolean> ai = a("hunted_recently", Codec.BOOL);
   public static final cgw<iv> aj = a("celebrate_location");
   public static final cgw<Boolean> ak = a("dancing");
   public static final cgw<cqg> al = a("nearest_visible_huntable_hoglin");
   public static final cgw<cqg> am = a("nearest_visible_baby_hoglin");
   public static final cgw<crx> an = a("nearest_targetable_player_not_wearing_gold");
   public static final cgw<List<cql>> ao = a("nearby_adult_piglins");
   public static final cgw<List<cql>> ap = a("nearest_visible_adult_piglins");
   public static final cgw<List<cqg>> aq = a("nearest_visible_adult_hoglins");
   public static final cgw<cql> ar = a("nearest_visible_adult_piglin");
   public static final cgw<bxu> as = a("nearest_visible_zombified");
   public static final cgw<Integer> at = a("visible_adult_piglin_count");
   public static final cgw<Integer> au = a("visible_adult_hoglin_count");
   public static final cgw<crx> av = a("nearest_player_holding_wanted_item");
   public static final cgw<Boolean> aw = a("ate_recently");
   public static final cgw<iv> ax = a("nearest_repellent");
   public static final cgw<Boolean> ay = a("pacified");
   public static final cgw<bxu> az = a("roar_target");
   public static final cgw<iv> aA = a("disturbance_location");
   public static final cgw<baw> aB = a("recent_projectile", baw.b);
   public static final cgw<baw> aC = a("is_sniffing", baw.b);
   public static final cgw<baw> aD = a("is_emerging", baw.b);
   public static final cgw<baw> aE = a("roar_sound_delay", baw.b);
   public static final cgw<baw> aF = a("dig_cooldown", baw.b);
   public static final cgw<baw> aG = a("roar_sound_cooldown", baw.b);
   public static final cgw<baw> aH = a("sniff_cooldown", baw.b);
   public static final cgw<baw> aI = a("touch_cooldown", baw.b);
   public static final cgw<baw> aJ = a("vibration_cooldown", baw.b);
   public static final cgw<baw> aK = a("sonic_boom_cooldown", baw.b);
   public static final cgw<baw> aL = a("sonic_boom_sound_cooldown", baw.b);
   public static final cgw<baw> aM = a("sonic_boom_sound_delay", baw.b);
   public static final cgw<UUID> aN = a("liked_player", jz.a);
   public static final cgw<je> aO = a("liked_noteblock", je.b);
   public static final cgw<Integer> aP = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cgw<Integer> aQ = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cgw<List<je>> aR = a("sniffer_explored_positions", Codec.list(je.b));
   public static final cgw<iv> aS = a("sniffer_sniffing_target");
   public static final cgw<Boolean> aT = a("sniffer_digging");
   public static final cgw<Boolean> aU = a("sniffer_happy");
   public static final cgw<baw> aV = a("breeze_jump_cooldown", baw.b);
   public static final cgw<baw> aW = a("breeze_shoot", baw.b);
   public static final cgw<baw> aX = a("breeze_shoot_charging", baw.b);
   public static final cgw<baw> aY = a("breeze_shoot_recover", baw.b);
   public static final cgw<baw> aZ = a("breeze_shoot_cooldown", baw.b);
   public static final cgw<baw> ba = a("breeze_jump_inhaling", baw.b);
   public static final cgw<iv> bb = a("breeze_jump_target", iv.a);
   public static final cgw<baw> bc = a("breeze_leaving_water", baw.b);
   private final Optional<Codec<cgv<U>>> bd;

   @VisibleForTesting
   public cgw(Optional<Codec<U>> $$0) {
      this.bd = $$0.map(cgv::a);
   }

   @Override
   public String toString() {
      return mg.z.b(this).toString();
   }

   public Optional<Codec<cgv<U>>> a() {
      return this.bd;
   }

   private static <U> cgw<U> a(String $$0, Codec<U> $$1) {
      return js.a(mg.z, ali.b($$0), new cgw<>(Optional.of($$1)));
   }

   private static <U> cgw<U> a(String $$0) {
      return js.a(mg.z, ali.b($$0), new cgw<>(Optional.empty()));
   }
}
