import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bzw<U> {
   public static final bzw<Void> a = a("dummy");
   public static final bzw<im> b = a("home", im.b);
   public static final bzw<im> c = a("job_site", im.b);
   public static final bzw<im> d = a("potential_job_site", im.b);
   public static final bzw<im> e = a("meeting_point", im.b);
   public static final bzw<List<im>> f = a("secondary_job_site");
   public static final bzw<List<bqt>> g = a("mobs");
   public static final bzw<bzy> h = a("visible_mobs");
   public static final bzw<List<bqt>> i = a("visible_villager_babies");
   public static final bzw<List<cka>> j = a("nearest_players");
   public static final bzw<cka> k = a("nearest_visible_player");
   public static final bzw<cka> l = a("nearest_visible_targetable_player");
   public static final bzw<bzz> m = a("walk_target");
   public static final bzw<btz> n = a("look_target");
   public static final bzw<bqt> o = a("attack_target");
   public static final bzw<Boolean> p = a("attack_cooling_down");
   public static final bzw<bqt> q = a("interaction_target");
   public static final bzw<bpu> r = a("breed_target");
   public static final bzw<bqa> s = a("ride_target");
   public static final bzw<elp> t = a("path");
   public static final bzw<List<im>> u = a("interactable_doors");
   public static final bzw<Set<im>> v = a("doors_to_close");
   public static final bzw<id> w = a("nearest_bed");
   public static final bzw<boy> x = a("hurt_by");
   public static final bzw<bqt> y = a("hurt_by_entity");
   public static final bzw<bqt> z = a("avoid_target");
   public static final bzw<bqt> A = a("nearest_hostile");
   public static final bzw<bqt> B = a("nearest_attackable");
   public static final bzw<im> C = a("hiding_place");
   public static final bzw<Long> D = a("heard_bell_time");
   public static final bzw<Long> E = a("cant_reach_walk_target_since");
   public static final bzw<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bzw<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final bzw<Long> H = a("last_slept", Codec.LONG);
   public static final bzw<Long> I = a("last_woken", Codec.LONG);
   public static final bzw<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final bzw<bpu> K = a("nearest_visible_adult");
   public static final bzw<cgk> L = a("nearest_visible_wanted_item");
   public static final bzw<bqv> M = a("nearest_visible_nemesis");
   public static final bzw<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final bzw<cka> O = a("tempting_player");
   public static final bzw<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final bzw<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final bzw<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final bzw<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final bzw<Boolean> T = a("long_jump_mid_jump");
   public static final bzw<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final bzw<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final bzw<esj> W = a("ram_target");
   public static final bzw<ayo> X = a("is_in_water", Codec.unit(ayo.a));
   public static final bzw<ayo> Y = a("is_pregnant", Codec.unit(ayo.a));
   public static final bzw<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final bzw<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final bzw<UUID> ab = a("angry_at", jh.a);
   public static final bzw<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final bzw<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final bzw<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final bzw<Boolean> af = a("disable_walk_to_admire_item");
   public static final bzw<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final bzw<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final bzw<id> ai = a("celebrate_location");
   public static final bzw<Boolean> aj = a("dancing");
   public static final bzw<cik> ak = a("nearest_visible_huntable_hoglin");
   public static final bzw<cik> al = a("nearest_visible_baby_hoglin");
   public static final bzw<cka> am = a("nearest_targetable_player_not_wearing_gold");
   public static final bzw<List<cip>> an = a("nearby_adult_piglins");
   public static final bzw<List<cip>> ao = a("nearest_visible_adult_piglins");
   public static final bzw<List<cik>> ap = a("nearest_visible_adult_hoglins");
   public static final bzw<cip> aq = a("nearest_visible_adult_piglin");
   public static final bzw<bqt> ar = a("nearest_visible_zombified");
   public static final bzw<Integer> as = a("visible_adult_piglin_count");
   public static final bzw<Integer> at = a("visible_adult_hoglin_count");
   public static final bzw<cka> au = a("nearest_player_holding_wanted_item");
   public static final bzw<Boolean> av = a("ate_recently");
   public static final bzw<id> aw = a("nearest_repellent");
   public static final bzw<Boolean> ax = a("pacified");
   public static final bzw<bqt> ay = a("roar_target");
   public static final bzw<id> az = a("disturbance_location");
   public static final bzw<ayo> aA = a("recent_projectile", Codec.unit(ayo.a));
   public static final bzw<ayo> aB = a("is_sniffing", Codec.unit(ayo.a));
   public static final bzw<ayo> aC = a("is_emerging", Codec.unit(ayo.a));
   public static final bzw<ayo> aD = a("roar_sound_delay", Codec.unit(ayo.a));
   public static final bzw<ayo> aE = a("dig_cooldown", Codec.unit(ayo.a));
   public static final bzw<ayo> aF = a("roar_sound_cooldown", Codec.unit(ayo.a));
   public static final bzw<ayo> aG = a("sniff_cooldown", Codec.unit(ayo.a));
   public static final bzw<ayo> aH = a("touch_cooldown", Codec.unit(ayo.a));
   public static final bzw<ayo> aI = a("vibration_cooldown", Codec.unit(ayo.a));
   public static final bzw<ayo> aJ = a("sonic_boom_cooldown", Codec.unit(ayo.a));
   public static final bzw<ayo> aK = a("sonic_boom_sound_cooldown", Codec.unit(ayo.a));
   public static final bzw<ayo> aL = a("sonic_boom_sound_delay", Codec.unit(ayo.a));
   public static final bzw<UUID> aM = a("liked_player", jh.a);
   public static final bzw<im> aN = a("liked_noteblock", im.b);
   public static final bzw<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bzw<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bzw<List<im>> aQ = a("sniffer_explored_positions", Codec.list(im.b));
   public static final bzw<id> aR = a("sniffer_sniffing_target");
   public static final bzw<Boolean> aS = a("sniffer_digging");
   public static final bzw<Boolean> aT = a("sniffer_happy");
   public static final bzw<ayo> aU = a("breeze_jump_cooldown", Codec.unit(ayo.a));
   public static final bzw<ayo> aV = a("breeze_shoot", Codec.unit(ayo.a));
   public static final bzw<ayo> aW = a("breeze_shoot_charging", Codec.unit(ayo.a));
   public static final bzw<ayo> aX = a("breeze_shoot_recover", Codec.unit(ayo.a));
   public static final bzw<ayo> aY = a("breeze_shoot_cooldown", Codec.unit(ayo.a));
   public static final bzw<ayo> aZ = a("breeze_jump_inhaling", Codec.unit(ayo.a));
   public static final bzw<id> ba = a("breeze_jump_target", id.a);
   public static final bzw<ayo> bb = a("breeze_leaving_water", Codec.unit(ayo.a));
   private final Optional<Codec<bzv<U>>> bc;

   @VisibleForTesting
   public bzw(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(bzv::a);
   }

   @Override
   public String toString() {
      return kt.B.b(this).toString();
   }

   public Optional<Codec<bzv<U>>> a() {
      return this.bc;
   }

   private static <U> bzw<U> a(String $$0, Codec<U> $$1) {
      return ja.a(kt.B, new ajv($$0), new bzw<>(Optional.of($$1)));
   }

   private static <U> bzw<U> a(String $$0) {
      return ja.a(kt.B, new ajv($$0), new bzw<>(Optional.empty()));
   }
}
