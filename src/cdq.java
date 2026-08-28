import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cdq<U> {
   public static final cdq<Void> a = a("dummy");
   public static final cdq<jn> b = a("home", jn.b);
   public static final cdq<jn> c = a("job_site", jn.b);
   public static final cdq<jn> d = a("potential_job_site", jn.b);
   public static final cdq<jn> e = a("meeting_point", jn.b);
   public static final cdq<List<jn>> f = a("secondary_job_site");
   public static final cdq<List<bun>> g = a("mobs");
   public static final cdq<cds> h = a("visible_mobs");
   public static final cdq<List<bun>> i = a("visible_villager_babies");
   public static final cdq<List<cnx>> j = a("nearest_players");
   public static final cdq<cnx> k = a("nearest_visible_player");
   public static final cdq<cnx> l = a("nearest_visible_targetable_player");
   public static final cdq<cdt> m = a("walk_target");
   public static final cdq<bxt> n = a("look_target");
   public static final cdq<bun> o = a("attack_target");
   public static final cdq<Boolean> p = a("attack_cooling_down");
   public static final cdq<bun> q = a("interaction_target");
   public static final cdq<btk> r = a("breed_target");
   public static final cdq<btr> s = a("ride_target");
   public static final cdq<erh> t = a("path");
   public static final cdq<List<jn>> u = a("interactable_doors");
   public static final cdq<Set<jn>> v = a("doors_to_close");
   public static final cdq<jf> w = a("nearest_bed");
   public static final cdq<bsj> x = a("hurt_by");
   public static final cdq<bun> y = a("hurt_by_entity");
   public static final cdq<bun> z = a("avoid_target");
   public static final cdq<bun> A = a("nearest_hostile");
   public static final cdq<bun> B = a("nearest_attackable");
   public static final cdq<jn> C = a("hiding_place");
   public static final cdq<Long> D = a("heard_bell_time");
   public static final cdq<Long> E = a("cant_reach_walk_target_since");
   public static final cdq<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cdq<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cdq<Long> H = a("last_slept", Codec.LONG);
   public static final cdq<Long> I = a("last_woken", Codec.LONG);
   public static final cdq<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cdq<btk> K = a("nearest_visible_adult");
   public static final cdq<ckh> L = a("nearest_visible_wanted_item");
   public static final cdq<bup> M = a("nearest_visible_nemesis");
   public static final cdq<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cdq<cnx> O = a("tempting_player");
   public static final cdq<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cdq<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cdq<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cdq<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cdq<Boolean> T = a("long_jump_mid_jump");
   public static final cdq<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cdq<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cdq<eyw> W = a("ram_target");
   public static final cdq<bak> X = a("is_in_water", bak.b);
   public static final cdq<bak> Y = a("is_pregnant", bak.b);
   public static final cdq<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cdq<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cdq<UUID> ab = a("angry_at", ki.a);
   public static final cdq<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cdq<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cdq<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cdq<Boolean> af = a("disable_walk_to_admire_item");
   public static final cdq<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cdq<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cdq<jf> ai = a("celebrate_location");
   public static final cdq<Boolean> aj = a("dancing");
   public static final cdq<cmh> ak = a("nearest_visible_huntable_hoglin");
   public static final cdq<cmh> al = a("nearest_visible_baby_hoglin");
   public static final cdq<cnx> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cdq<List<cmm>> an = a("nearby_adult_piglins");
   public static final cdq<List<cmm>> ao = a("nearest_visible_adult_piglins");
   public static final cdq<List<cmh>> ap = a("nearest_visible_adult_hoglins");
   public static final cdq<cmm> aq = a("nearest_visible_adult_piglin");
   public static final cdq<bun> ar = a("nearest_visible_zombified");
   public static final cdq<Integer> as = a("visible_adult_piglin_count");
   public static final cdq<Integer> at = a("visible_adult_hoglin_count");
   public static final cdq<cnx> au = a("nearest_player_holding_wanted_item");
   public static final cdq<Boolean> av = a("ate_recently");
   public static final cdq<jf> aw = a("nearest_repellent");
   public static final cdq<Boolean> ax = a("pacified");
   public static final cdq<bun> ay = a("roar_target");
   public static final cdq<jf> az = a("disturbance_location");
   public static final cdq<bak> aA = a("recent_projectile", bak.b);
   public static final cdq<bak> aB = a("is_sniffing", bak.b);
   public static final cdq<bak> aC = a("is_emerging", bak.b);
   public static final cdq<bak> aD = a("roar_sound_delay", bak.b);
   public static final cdq<bak> aE = a("dig_cooldown", bak.b);
   public static final cdq<bak> aF = a("roar_sound_cooldown", bak.b);
   public static final cdq<bak> aG = a("sniff_cooldown", bak.b);
   public static final cdq<bak> aH = a("touch_cooldown", bak.b);
   public static final cdq<bak> aI = a("vibration_cooldown", bak.b);
   public static final cdq<bak> aJ = a("sonic_boom_cooldown", bak.b);
   public static final cdq<bak> aK = a("sonic_boom_sound_cooldown", bak.b);
   public static final cdq<bak> aL = a("sonic_boom_sound_delay", bak.b);
   public static final cdq<UUID> aM = a("liked_player", ki.a);
   public static final cdq<jn> aN = a("liked_noteblock", jn.b);
   public static final cdq<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cdq<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cdq<List<jn>> aQ = a("sniffer_explored_positions", Codec.list(jn.b));
   public static final cdq<jf> aR = a("sniffer_sniffing_target");
   public static final cdq<Boolean> aS = a("sniffer_digging");
   public static final cdq<Boolean> aT = a("sniffer_happy");
   public static final cdq<bak> aU = a("breeze_jump_cooldown", bak.b);
   public static final cdq<bak> aV = a("breeze_shoot", bak.b);
   public static final cdq<bak> aW = a("breeze_shoot_charging", bak.b);
   public static final cdq<bak> aX = a("breeze_shoot_recover", bak.b);
   public static final cdq<bak> aY = a("breeze_shoot_cooldown", bak.b);
   public static final cdq<bak> aZ = a("breeze_jump_inhaling", bak.b);
   public static final cdq<jf> ba = a("breeze_jump_target", jf.a);
   public static final cdq<bak> bb = a("breeze_leaving_water", bak.b);
   private final Optional<Codec<cdp<U>>> bc;

   @VisibleForTesting
   public cdq(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cdp::a);
   }

   @Override
   public String toString() {
      return lv.z.b(this).toString();
   }

   public Optional<Codec<cdp<U>>> a() {
      return this.bc;
   }

   private static <U> cdq<U> a(String $$0, Codec<U> $$1) {
      return kb.a(lv.z, ale.b($$0), new cdq<>(Optional.of($$1)));
   }

   private static <U> cdq<U> a(String $$0) {
      return kb.a(lv.z, ale.b($$0), new cdq<>(Optional.empty()));
   }
}
