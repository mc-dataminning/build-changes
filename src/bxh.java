import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bxh<U> {
   public static final bxh<Void> a = a("dummy");
   public static final bxh<ii> b = a("home", ii.a);
   public static final bxh<ii> c = a("job_site", ii.a);
   public static final bxh<ii> d = a("potential_job_site", ii.a);
   public static final bxh<ii> e = a("meeting_point", ii.a);
   public static final bxh<List<ii>> f = a("secondary_job_site");
   public static final bxh<List<bog>> g = a("mobs");
   public static final bxh<bxj> h = a("visible_mobs");
   public static final bxh<List<bog>> i = a("visible_villager_babies");
   public static final bxh<List<chh>> j = a("nearest_players");
   public static final bxh<chh> k = a("nearest_visible_player");
   public static final bxh<chh> l = a("nearest_visible_targetable_player");
   public static final bxh<bxk> m = a("walk_target");
   public static final bxh<brk> n = a("look_target");
   public static final bxh<bog> o = a("attack_target");
   public static final bxh<Boolean> p = a("attack_cooling_down");
   public static final bxh<bog> q = a("interaction_target");
   public static final bxh<bnj> r = a("breed_target");
   public static final bxh<bno> s = a("ride_target");
   public static final bxh<ehe> t = a("path");
   public static final bxh<List<ii>> u = a("interactable_doors");
   public static final bxh<Set<ii>> v = a("doors_to_close");
   public static final bxh<hz> w = a("nearest_bed");
   public static final bxh<bmn> x = a("hurt_by");
   public static final bxh<bog> y = a("hurt_by_entity");
   public static final bxh<bog> z = a("avoid_target");
   public static final bxh<bog> A = a("nearest_hostile");
   public static final bxh<bog> B = a("nearest_attackable");
   public static final bxh<ii> C = a("hiding_place");
   public static final bxh<Long> D = a("heard_bell_time");
   public static final bxh<Long> E = a("cant_reach_walk_target_since");
   public static final bxh<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bxh<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final bxh<Long> H = a("last_slept", Codec.LONG);
   public static final bxh<Long> I = a("last_woken", Codec.LONG);
   public static final bxh<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final bxh<bnj> K = a("nearest_visible_adult");
   public static final bxh<cds> L = a("nearest_visible_wanted_item");
   public static final bxh<boi> M = a("nearest_visible_nemesis");
   public static final bxh<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final bxh<chh> O = a("tempting_player");
   public static final bxh<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final bxh<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final bxh<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final bxh<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final bxh<Boolean> T = a("long_jump_mid_jump");
   public static final bxh<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final bxh<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final bxh<ens> W = a("ram_target");
   public static final bxh<axk> X = a("is_in_water", Codec.unit(axk.a));
   public static final bxh<axk> Y = a("is_pregnant", Codec.unit(axk.a));
   public static final bxh<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final bxh<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final bxh<UUID> ab = a("angry_at", jc.a);
   public static final bxh<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final bxh<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final bxh<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final bxh<Boolean> af = a("disable_walk_to_admire_item");
   public static final bxh<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final bxh<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final bxh<hz> ai = a("celebrate_location");
   public static final bxh<Boolean> aj = a("dancing");
   public static final bxh<cfr> ak = a("nearest_visible_huntable_hoglin");
   public static final bxh<cfr> al = a("nearest_visible_baby_hoglin");
   public static final bxh<chh> am = a("nearest_targetable_player_not_wearing_gold");
   public static final bxh<List<cfw>> an = a("nearby_adult_piglins");
   public static final bxh<List<cfw>> ao = a("nearest_visible_adult_piglins");
   public static final bxh<List<cfr>> ap = a("nearest_visible_adult_hoglins");
   public static final bxh<cfw> aq = a("nearest_visible_adult_piglin");
   public static final bxh<bog> ar = a("nearest_visible_zombified");
   public static final bxh<Integer> as = a("visible_adult_piglin_count");
   public static final bxh<Integer> at = a("visible_adult_hoglin_count");
   public static final bxh<chh> au = a("nearest_player_holding_wanted_item");
   public static final bxh<Boolean> av = a("ate_recently");
   public static final bxh<hz> aw = a("nearest_repellent");
   public static final bxh<Boolean> ax = a("pacified");
   public static final bxh<bog> ay = a("roar_target");
   public static final bxh<hz> az = a("disturbance_location");
   public static final bxh<axk> aA = a("recent_projectile", Codec.unit(axk.a));
   public static final bxh<axk> aB = a("is_sniffing", Codec.unit(axk.a));
   public static final bxh<axk> aC = a("is_emerging", Codec.unit(axk.a));
   public static final bxh<axk> aD = a("roar_sound_delay", Codec.unit(axk.a));
   public static final bxh<axk> aE = a("dig_cooldown", Codec.unit(axk.a));
   public static final bxh<axk> aF = a("roar_sound_cooldown", Codec.unit(axk.a));
   public static final bxh<axk> aG = a("sniff_cooldown", Codec.unit(axk.a));
   public static final bxh<axk> aH = a("touch_cooldown", Codec.unit(axk.a));
   public static final bxh<axk> aI = a("vibration_cooldown", Codec.unit(axk.a));
   public static final bxh<axk> aJ = a("sonic_boom_cooldown", Codec.unit(axk.a));
   public static final bxh<axk> aK = a("sonic_boom_sound_cooldown", Codec.unit(axk.a));
   public static final bxh<axk> aL = a("sonic_boom_sound_delay", Codec.unit(axk.a));
   public static final bxh<UUID> aM = a("liked_player", jc.a);
   public static final bxh<ii> aN = a("liked_noteblock", ii.a);
   public static final bxh<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bxh<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bxh<List<ii>> aQ = a("sniffer_explored_positions", Codec.list(ii.a));
   public static final bxh<hz> aR = a("sniffer_sniffing_target");
   public static final bxh<Boolean> aS = a("sniffer_digging");
   public static final bxh<Boolean> aT = a("sniffer_happy");
   public static final bxh<axk> aU = a("breeze_jump_cooldown", Codec.unit(axk.a));
   public static final bxh<axk> aV = a("breeze_shoot", Codec.unit(axk.a));
   public static final bxh<axk> aW = a("breeze_shoot_charging", Codec.unit(axk.a));
   public static final bxh<axk> aX = a("breeze_shoot_recover", Codec.unit(axk.a));
   public static final bxh<axk> aY = a("breeze_shoot_cooldown", Codec.unit(axk.a));
   public static final bxh<axk> aZ = a("breeze_jump_inhaling", Codec.unit(axk.a));
   public static final bxh<hz> ba = a("breeze_jump_target", hz.a);
   public static final bxh<axk> bb = a("breeze_leaving_water", Codec.unit(axk.a));
   private final Optional<Codec<bxg<U>>> bc;

   @VisibleForTesting
   public bxh(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(bxg::a);
   }

   @Override
   public String toString() {
      return kf.B.b(this).toString();
   }

   public Optional<Codec<bxg<U>>> a() {
      return this.bc;
   }

   private static <U> bxh<U> a(String $$0, Codec<U> $$1) {
      return iv.a(kf.B, new aiy($$0), new bxh<>(Optional.of($$1)));
   }

   private static <U> bxh<U> a(String $$0) {
      return iv.a(kf.B, new aiy($$0), new bxh<>(Optional.empty()));
   }
}
