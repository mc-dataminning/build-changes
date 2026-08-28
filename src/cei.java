import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cei<U> {
   public static final cei<Void> a = a("dummy");
   public static final cei<jp> b = a("home", jp.b);
   public static final cei<jp> c = a("job_site", jp.b);
   public static final cei<jp> d = a("potential_job_site", jp.b);
   public static final cei<jp> e = a("meeting_point", jp.b);
   public static final cei<List<jp>> f = a("secondary_job_site");
   public static final cei<List<bve>> g = a("mobs");
   public static final cei<cek> h = a("visible_mobs");
   public static final cei<List<bve>> i = a("visible_villager_babies");
   public static final cei<List<cor>> j = a("nearest_players");
   public static final cei<cor> k = a("nearest_visible_player");
   public static final cei<cor> l = a("nearest_visible_targetable_player");
   public static final cei<cel> m = a("walk_target");
   public static final cei<byl> n = a("look_target");
   public static final cei<bve> o = a("attack_target");
   public static final cei<Boolean> p = a("attack_cooling_down");
   public static final cei<bve> q = a("interaction_target");
   public static final cei<btz> r = a("breed_target");
   public static final cei<bui> s = a("ride_target");
   public static final cei<esc> t = a("path");
   public static final cei<List<jp>> u = a("interactable_doors");
   public static final cei<Set<jp>> v = a("doors_to_close");
   public static final cei<jh> w = a("nearest_bed");
   public static final cei<bsy> x = a("hurt_by");
   public static final cei<bve> y = a("hurt_by_entity");
   public static final cei<bve> z = a("avoid_target");
   public static final cei<bve> A = a("nearest_hostile");
   public static final cei<bve> B = a("nearest_attackable");
   public static final cei<jp> C = a("hiding_place");
   public static final cei<Long> D = a("heard_bell_time");
   public static final cei<Long> E = a("cant_reach_walk_target_since");
   public static final cei<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cei<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cei<Long> H = a("last_slept", Codec.LONG);
   public static final cei<Long> I = a("last_woken", Codec.LONG);
   public static final cei<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cei<btz> K = a("nearest_visible_adult");
   public static final cei<ckz> L = a("nearest_visible_wanted_item");
   public static final cei<bvg> M = a("nearest_visible_nemesis");
   public static final cei<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cei<cor> O = a("tempting_player");
   public static final cei<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cei<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cei<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cei<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cei<Boolean> T = a("long_jump_mid_jump");
   public static final cei<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cei<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cei<ezr> W = a("ram_target");
   public static final cei<bat> X = a("is_in_water", bat.b);
   public static final cei<bat> Y = a("is_pregnant", bat.b);
   public static final cei<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cei<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cei<UUID> ab = a("angry_at", kk.a);
   public static final cei<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cei<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cei<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cei<Boolean> af = a("disable_walk_to_admire_item");
   public static final cei<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cei<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cei<jh> ai = a("celebrate_location");
   public static final cei<Boolean> aj = a("dancing");
   public static final cei<cmz> ak = a("nearest_visible_huntable_hoglin");
   public static final cei<cmz> al = a("nearest_visible_baby_hoglin");
   public static final cei<cor> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cei<List<cne>> an = a("nearby_adult_piglins");
   public static final cei<List<cne>> ao = a("nearest_visible_adult_piglins");
   public static final cei<List<cmz>> ap = a("nearest_visible_adult_hoglins");
   public static final cei<cne> aq = a("nearest_visible_adult_piglin");
   public static final cei<bve> ar = a("nearest_visible_zombified");
   public static final cei<Integer> as = a("visible_adult_piglin_count");
   public static final cei<Integer> at = a("visible_adult_hoglin_count");
   public static final cei<cor> au = a("nearest_player_holding_wanted_item");
   public static final cei<Boolean> av = a("ate_recently");
   public static final cei<jh> aw = a("nearest_repellent");
   public static final cei<Boolean> ax = a("pacified");
   public static final cei<bve> ay = a("roar_target");
   public static final cei<jh> az = a("disturbance_location");
   public static final cei<bat> aA = a("recent_projectile", bat.b);
   public static final cei<bat> aB = a("is_sniffing", bat.b);
   public static final cei<bat> aC = a("is_emerging", bat.b);
   public static final cei<bat> aD = a("roar_sound_delay", bat.b);
   public static final cei<bat> aE = a("dig_cooldown", bat.b);
   public static final cei<bat> aF = a("roar_sound_cooldown", bat.b);
   public static final cei<bat> aG = a("sniff_cooldown", bat.b);
   public static final cei<bat> aH = a("touch_cooldown", bat.b);
   public static final cei<bat> aI = a("vibration_cooldown", bat.b);
   public static final cei<bat> aJ = a("sonic_boom_cooldown", bat.b);
   public static final cei<bat> aK = a("sonic_boom_sound_cooldown", bat.b);
   public static final cei<bat> aL = a("sonic_boom_sound_delay", bat.b);
   public static final cei<UUID> aM = a("liked_player", kk.a);
   public static final cei<jp> aN = a("liked_noteblock", jp.b);
   public static final cei<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cei<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cei<List<jp>> aQ = a("sniffer_explored_positions", Codec.list(jp.b));
   public static final cei<jh> aR = a("sniffer_sniffing_target");
   public static final cei<Boolean> aS = a("sniffer_digging");
   public static final cei<Boolean> aT = a("sniffer_happy");
   public static final cei<bat> aU = a("breeze_jump_cooldown", bat.b);
   public static final cei<bat> aV = a("breeze_shoot", bat.b);
   public static final cei<bat> aW = a("breeze_shoot_charging", bat.b);
   public static final cei<bat> aX = a("breeze_shoot_recover", bat.b);
   public static final cei<bat> aY = a("breeze_shoot_cooldown", bat.b);
   public static final cei<bat> aZ = a("breeze_jump_inhaling", bat.b);
   public static final cei<jh> ba = a("breeze_jump_target", jh.a);
   public static final cei<bat> bb = a("breeze_leaving_water", bat.b);
   private final Optional<Codec<ceh<U>>> bc;

   @VisibleForTesting
   public cei(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(ceh::a);
   }

   @Override
   public String toString() {
      return lz.z.b(this).toString();
   }

   public Optional<Codec<ceh<U>>> a() {
      return this.bc;
   }

   private static <U> cei<U> a(String $$0, Codec<U> $$1) {
      return kd.a(lz.z, all.b($$0), new cei<>(Optional.of($$1)));
   }

   private static <U> cei<U> a(String $$0) {
      return kd.a(lz.z, all.b($$0), new cei<>(Optional.empty()));
   }
}
