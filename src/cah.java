import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cah<U> {
   public static final cah<Void> a = a("dummy");
   public static final cah<iu> b = a("home", iu.b);
   public static final cah<iu> c = a("job_site", iu.b);
   public static final cah<iu> d = a("potential_job_site", iu.b);
   public static final cah<iu> e = a("meeting_point", iu.b);
   public static final cah<List<iu>> f = a("secondary_job_site");
   public static final cah<List<bre>> g = a("mobs");
   public static final cah<caj> h = a("visible_mobs");
   public static final cah<List<bre>> i = a("visible_villager_babies");
   public static final cah<List<ckl>> j = a("nearest_players");
   public static final cah<ckl> k = a("nearest_visible_player");
   public static final cah<ckl> l = a("nearest_visible_targetable_player");
   public static final cah<cak> m = a("walk_target");
   public static final cah<buk> n = a("look_target");
   public static final cah<bre> o = a("attack_target");
   public static final cah<Boolean> p = a("attack_cooling_down");
   public static final cah<bre> q = a("interaction_target");
   public static final cah<bqf> r = a("breed_target");
   public static final cah<bql> s = a("ride_target");
   public static final cah<emf> t = a("path");
   public static final cah<List<iu>> u = a("interactable_doors");
   public static final cah<Set<iu>> v = a("doors_to_close");
   public static final cah<im> w = a("nearest_bed");
   public static final cah<bpj> x = a("hurt_by");
   public static final cah<bre> y = a("hurt_by_entity");
   public static final cah<bre> z = a("avoid_target");
   public static final cah<bre> A = a("nearest_hostile");
   public static final cah<bre> B = a("nearest_attackable");
   public static final cah<iu> C = a("hiding_place");
   public static final cah<Long> D = a("heard_bell_time");
   public static final cah<Long> E = a("cant_reach_walk_target_since");
   public static final cah<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cah<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cah<Long> H = a("last_slept", Codec.LONG);
   public static final cah<Long> I = a("last_woken", Codec.LONG);
   public static final cah<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cah<bqf> K = a("nearest_visible_adult");
   public static final cah<cgv> L = a("nearest_visible_wanted_item");
   public static final cah<brg> M = a("nearest_visible_nemesis");
   public static final cah<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cah<ckl> O = a("tempting_player");
   public static final cah<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cah<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cah<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cah<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cah<Boolean> T = a("long_jump_mid_jump");
   public static final cah<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cah<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cah<etf> W = a("ram_target");
   public static final cah<ayy> X = a("is_in_water", Codec.unit(ayy.a));
   public static final cah<ayy> Y = a("is_pregnant", Codec.unit(ayy.a));
   public static final cah<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cah<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cah<UUID> ab = a("angry_at", jp.a);
   public static final cah<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cah<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cah<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cah<Boolean> af = a("disable_walk_to_admire_item");
   public static final cah<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cah<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cah<im> ai = a("celebrate_location");
   public static final cah<Boolean> aj = a("dancing");
   public static final cah<civ> ak = a("nearest_visible_huntable_hoglin");
   public static final cah<civ> al = a("nearest_visible_baby_hoglin");
   public static final cah<ckl> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cah<List<cja>> an = a("nearby_adult_piglins");
   public static final cah<List<cja>> ao = a("nearest_visible_adult_piglins");
   public static final cah<List<civ>> ap = a("nearest_visible_adult_hoglins");
   public static final cah<cja> aq = a("nearest_visible_adult_piglin");
   public static final cah<bre> ar = a("nearest_visible_zombified");
   public static final cah<Integer> as = a("visible_adult_piglin_count");
   public static final cah<Integer> at = a("visible_adult_hoglin_count");
   public static final cah<ckl> au = a("nearest_player_holding_wanted_item");
   public static final cah<Boolean> av = a("ate_recently");
   public static final cah<im> aw = a("nearest_repellent");
   public static final cah<Boolean> ax = a("pacified");
   public static final cah<bre> ay = a("roar_target");
   public static final cah<im> az = a("disturbance_location");
   public static final cah<ayy> aA = a("recent_projectile", Codec.unit(ayy.a));
   public static final cah<ayy> aB = a("is_sniffing", Codec.unit(ayy.a));
   public static final cah<ayy> aC = a("is_emerging", Codec.unit(ayy.a));
   public static final cah<ayy> aD = a("roar_sound_delay", Codec.unit(ayy.a));
   public static final cah<ayy> aE = a("dig_cooldown", Codec.unit(ayy.a));
   public static final cah<ayy> aF = a("roar_sound_cooldown", Codec.unit(ayy.a));
   public static final cah<ayy> aG = a("sniff_cooldown", Codec.unit(ayy.a));
   public static final cah<ayy> aH = a("touch_cooldown", Codec.unit(ayy.a));
   public static final cah<ayy> aI = a("vibration_cooldown", Codec.unit(ayy.a));
   public static final cah<ayy> aJ = a("sonic_boom_cooldown", Codec.unit(ayy.a));
   public static final cah<ayy> aK = a("sonic_boom_sound_cooldown", Codec.unit(ayy.a));
   public static final cah<ayy> aL = a("sonic_boom_sound_delay", Codec.unit(ayy.a));
   public static final cah<UUID> aM = a("liked_player", jp.a);
   public static final cah<iu> aN = a("liked_noteblock", iu.b);
   public static final cah<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cah<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cah<List<iu>> aQ = a("sniffer_explored_positions", Codec.list(iu.b));
   public static final cah<im> aR = a("sniffer_sniffing_target");
   public static final cah<Boolean> aS = a("sniffer_digging");
   public static final cah<Boolean> aT = a("sniffer_happy");
   public static final cah<ayy> aU = a("breeze_jump_cooldown", Codec.unit(ayy.a));
   public static final cah<ayy> aV = a("breeze_shoot", Codec.unit(ayy.a));
   public static final cah<ayy> aW = a("breeze_shoot_charging", Codec.unit(ayy.a));
   public static final cah<ayy> aX = a("breeze_shoot_recover", Codec.unit(ayy.a));
   public static final cah<ayy> aY = a("breeze_shoot_cooldown", Codec.unit(ayy.a));
   public static final cah<ayy> aZ = a("breeze_jump_inhaling", Codec.unit(ayy.a));
   public static final cah<im> ba = a("breeze_jump_target", im.a);
   public static final cah<ayy> bb = a("breeze_leaving_water", Codec.unit(ayy.a));
   private final Optional<Codec<cag<U>>> bc;

   @VisibleForTesting
   public cah(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cag::a);
   }

   @Override
   public String toString() {
      return lc.B.b(this).toString();
   }

   public Optional<Codec<cag<U>>> a() {
      return this.bc;
   }

   private static <U> cah<U> a(String $$0, Codec<U> $$1) {
      return ji.a(lc.B, new akf($$0), new cah<>(Optional.of($$1)));
   }

   private static <U> cah<U> a(String $$0) {
      return ji.a(lc.B, new akf($$0), new cah<>(Optional.empty()));
   }
}
