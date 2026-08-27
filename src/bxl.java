import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bxl<U> {
   public static final bxl<Void> a = a("dummy");
   public static final bxl<ii> b = a("home", ii.a);
   public static final bxl<ii> c = a("job_site", ii.a);
   public static final bxl<ii> d = a("potential_job_site", ii.a);
   public static final bxl<ii> e = a("meeting_point", ii.a);
   public static final bxl<List<ii>> f = a("secondary_job_site");
   public static final bxl<List<boi>> g = a("mobs");
   public static final bxl<bxn> h = a("visible_mobs");
   public static final bxl<List<boi>> i = a("visible_villager_babies");
   public static final bxl<List<chl>> j = a("nearest_players");
   public static final bxl<chl> k = a("nearest_visible_player");
   public static final bxl<chl> l = a("nearest_visible_targetable_player");
   public static final bxl<bxo> m = a("walk_target");
   public static final bxl<bro> n = a("look_target");
   public static final bxl<boi> o = a("attack_target");
   public static final bxl<Boolean> p = a("attack_cooling_down");
   public static final bxl<boi> q = a("interaction_target");
   public static final bxl<bnl> r = a("breed_target");
   public static final bxl<bnq> s = a("ride_target");
   public static final bxl<ehl> t = a("path");
   public static final bxl<List<ii>> u = a("interactable_doors");
   public static final bxl<Set<ii>> v = a("doors_to_close");
   public static final bxl<hz> w = a("nearest_bed");
   public static final bxl<bmp> x = a("hurt_by");
   public static final bxl<boi> y = a("hurt_by_entity");
   public static final bxl<boi> z = a("avoid_target");
   public static final bxl<boi> A = a("nearest_hostile");
   public static final bxl<boi> B = a("nearest_attackable");
   public static final bxl<ii> C = a("hiding_place");
   public static final bxl<Long> D = a("heard_bell_time");
   public static final bxl<Long> E = a("cant_reach_walk_target_since");
   public static final bxl<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bxl<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final bxl<Long> H = a("last_slept", Codec.LONG);
   public static final bxl<Long> I = a("last_woken", Codec.LONG);
   public static final bxl<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final bxl<bnl> K = a("nearest_visible_adult");
   public static final bxl<cdw> L = a("nearest_visible_wanted_item");
   public static final bxl<bok> M = a("nearest_visible_nemesis");
   public static final bxl<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final bxl<chl> O = a("tempting_player");
   public static final bxl<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final bxl<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final bxl<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final bxl<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final bxl<Boolean> T = a("long_jump_mid_jump");
   public static final bxl<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final bxl<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final bxl<enz> W = a("ram_target");
   public static final bxl<axk> X = a("is_in_water", Codec.unit(axk.a));
   public static final bxl<axk> Y = a("is_pregnant", Codec.unit(axk.a));
   public static final bxl<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final bxl<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final bxl<UUID> ab = a("angry_at", jc.a);
   public static final bxl<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final bxl<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final bxl<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final bxl<Boolean> af = a("disable_walk_to_admire_item");
   public static final bxl<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final bxl<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final bxl<hz> ai = a("celebrate_location");
   public static final bxl<Boolean> aj = a("dancing");
   public static final bxl<cfv> ak = a("nearest_visible_huntable_hoglin");
   public static final bxl<cfv> al = a("nearest_visible_baby_hoglin");
   public static final bxl<chl> am = a("nearest_targetable_player_not_wearing_gold");
   public static final bxl<List<cga>> an = a("nearby_adult_piglins");
   public static final bxl<List<cga>> ao = a("nearest_visible_adult_piglins");
   public static final bxl<List<cfv>> ap = a("nearest_visible_adult_hoglins");
   public static final bxl<cga> aq = a("nearest_visible_adult_piglin");
   public static final bxl<boi> ar = a("nearest_visible_zombified");
   public static final bxl<Integer> as = a("visible_adult_piglin_count");
   public static final bxl<Integer> at = a("visible_adult_hoglin_count");
   public static final bxl<chl> au = a("nearest_player_holding_wanted_item");
   public static final bxl<Boolean> av = a("ate_recently");
   public static final bxl<hz> aw = a("nearest_repellent");
   public static final bxl<Boolean> ax = a("pacified");
   public static final bxl<boi> ay = a("roar_target");
   public static final bxl<hz> az = a("disturbance_location");
   public static final bxl<axk> aA = a("recent_projectile", Codec.unit(axk.a));
   public static final bxl<axk> aB = a("is_sniffing", Codec.unit(axk.a));
   public static final bxl<axk> aC = a("is_emerging", Codec.unit(axk.a));
   public static final bxl<axk> aD = a("roar_sound_delay", Codec.unit(axk.a));
   public static final bxl<axk> aE = a("dig_cooldown", Codec.unit(axk.a));
   public static final bxl<axk> aF = a("roar_sound_cooldown", Codec.unit(axk.a));
   public static final bxl<axk> aG = a("sniff_cooldown", Codec.unit(axk.a));
   public static final bxl<axk> aH = a("touch_cooldown", Codec.unit(axk.a));
   public static final bxl<axk> aI = a("vibration_cooldown", Codec.unit(axk.a));
   public static final bxl<axk> aJ = a("sonic_boom_cooldown", Codec.unit(axk.a));
   public static final bxl<axk> aK = a("sonic_boom_sound_cooldown", Codec.unit(axk.a));
   public static final bxl<axk> aL = a("sonic_boom_sound_delay", Codec.unit(axk.a));
   public static final bxl<UUID> aM = a("liked_player", jc.a);
   public static final bxl<ii> aN = a("liked_noteblock", ii.a);
   public static final bxl<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bxl<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bxl<List<ii>> aQ = a("sniffer_explored_positions", Codec.list(ii.a));
   public static final bxl<hz> aR = a("sniffer_sniffing_target");
   public static final bxl<Boolean> aS = a("sniffer_digging");
   public static final bxl<Boolean> aT = a("sniffer_happy");
   public static final bxl<axk> aU = a("breeze_jump_cooldown", Codec.unit(axk.a));
   public static final bxl<axk> aV = a("breeze_shoot", Codec.unit(axk.a));
   public static final bxl<axk> aW = a("breeze_shoot_charging", Codec.unit(axk.a));
   public static final bxl<axk> aX = a("breeze_shoot_recover", Codec.unit(axk.a));
   public static final bxl<axk> aY = a("breeze_shoot_cooldown", Codec.unit(axk.a));
   public static final bxl<axk> aZ = a("breeze_jump_inhaling", Codec.unit(axk.a));
   public static final bxl<hz> ba = a("breeze_jump_target", hz.a);
   public static final bxl<axk> bb = a("breeze_leaving_water", Codec.unit(axk.a));
   private final Optional<Codec<bxk<U>>> bc;

   @VisibleForTesting
   public bxl(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(bxk::a);
   }

   @Override
   public String toString() {
      return kf.B.b(this).toString();
   }

   public Optional<Codec<bxk<U>>> a() {
      return this.bc;
   }

   private static <U> bxl<U> a(String $$0, Codec<U> $$1) {
      return iv.a(kf.B, new aiy($$0), new bxl<>(Optional.of($$1)));
   }

   private static <U> bxl<U> a(String $$0) {
      return iv.a(kf.B, new aiy($$0), new bxl<>(Optional.empty()));
   }
}
