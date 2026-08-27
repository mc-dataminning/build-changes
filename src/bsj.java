import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class bsj<U> {
   public static final bsj<Void> a = a("dummy");
   public static final bsj<hf> b = a("home", hf.a);
   public static final bsj<hf> c = a("job_site", hf.a);
   public static final bsj<hf> d = a("potential_job_site", hf.a);
   public static final bsj<hf> e = a("meeting_point", hf.a);
   public static final bsj<List<hf>> f = a("secondary_job_site");
   public static final bsj<List<bji>> g = a("mobs");
   public static final bsj<bsl> h = a("visible_mobs");
   public static final bsj<List<bji>> i = a("visible_villager_babies");
   public static final bsj<List<cbw>> j = a("nearest_players");
   public static final bsj<cbw> k = a("nearest_visible_player");
   public static final bsj<cbw> l = a("nearest_visible_targetable_player");
   public static final bsj<bsm> m = a("walk_target");
   public static final bsj<bmm> n = a("look_target");
   public static final bsj<bji> o = a("attack_target");
   public static final bsj<Boolean> p = a("attack_cooling_down");
   public static final bsj<bji> q = a("interaction_target");
   public static final bsj<bin> r = a("breed_target");
   public static final bsj<bis> s = a("ride_target");
   public static final bsj<ebd> t = a("path");
   public static final bsj<List<hf>> u = a("interactable_doors");
   public static final bsj<Set<hf>> v = a("doors_to_close");
   public static final bsj<gw> w = a("nearest_bed");
   public static final bsj<bhq> x = a("hurt_by");
   public static final bsj<bji> y = a("hurt_by_entity");
   public static final bsj<bji> z = a("avoid_target");
   public static final bsj<bji> A = a("nearest_hostile");
   public static final bsj<bji> B = a("nearest_attackable");
   public static final bsj<hf> C = a("hiding_place");
   public static final bsj<Long> D = a("heard_bell_time");
   public static final bsj<Long> E = a("cant_reach_walk_target_since");
   public static final bsj<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final bsj<Long> G = a("last_slept", Codec.LONG);
   public static final bsj<Long> H = a("last_woken", Codec.LONG);
   public static final bsj<Long> I = a("last_worked_at_poi", Codec.LONG);
   public static final bsj<bin> J = a("nearest_visible_adult");
   public static final bsj<byp> K = a("nearest_visible_wanted_item");
   public static final bsj<bjk> L = a("nearest_visible_nemesis");
   public static final bsj<Integer> M = a("play_dead_ticks", Codec.INT);
   public static final bsj<cbw> N = a("tempting_player");
   public static final bsj<Integer> O = a("temptation_cooldown_ticks", Codec.INT);
   public static final bsj<Integer> P = a("gaze_cooldown_ticks", Codec.INT);
   public static final bsj<Boolean> Q = a("is_tempted", Codec.BOOL);
   public static final bsj<Integer> R = a("long_jump_cooling_down", Codec.INT);
   public static final bsj<Boolean> S = a("long_jump_mid_jump");
   public static final bsj<Boolean> T = a("has_hunting_cooldown", Codec.BOOL);
   public static final bsj<Integer> U = a("ram_cooldown_ticks", Codec.INT);
   public static final bsj<ehp> V = a("ram_target");
   public static final bsj<asz> W = a("is_in_water", Codec.unit(asz.a));
   public static final bsj<asz> X = a("is_pregnant", Codec.unit(asz.a));
   public static final bsj<Boolean> Y = a("is_panicking", Codec.BOOL);
   public static final bsj<List<UUID>> Z = a("unreachable_tongue_targets");
   public static final bsj<UUID> aa = a("angry_at", ia.a);
   public static final bsj<Boolean> ab = a("universal_anger", Codec.BOOL);
   public static final bsj<Boolean> ac = a("admiring_item", Codec.BOOL);
   public static final bsj<Integer> ad = a("time_trying_to_reach_admire_item");
   public static final bsj<Boolean> ae = a("disable_walk_to_admire_item");
   public static final bsj<Boolean> af = a("admiring_disabled", Codec.BOOL);
   public static final bsj<Boolean> ag = a("hunted_recently", Codec.BOOL);
   public static final bsj<gw> ah = a("celebrate_location");
   public static final bsj<Boolean> ai = a("dancing");
   public static final bsj<cag> aj = a("nearest_visible_huntable_hoglin");
   public static final bsj<cag> ak = a("nearest_visible_baby_hoglin");
   public static final bsj<cbw> al = a("nearest_targetable_player_not_wearing_gold");
   public static final bsj<List<cal>> am = a("nearby_adult_piglins");
   public static final bsj<List<cal>> an = a("nearest_visible_adult_piglins");
   public static final bsj<List<cag>> ao = a("nearest_visible_adult_hoglins");
   public static final bsj<cal> ap = a("nearest_visible_adult_piglin");
   public static final bsj<bji> aq = a("nearest_visible_zombified");
   public static final bsj<Integer> ar = a("visible_adult_piglin_count");
   public static final bsj<Integer> as = a("visible_adult_hoglin_count");
   public static final bsj<cbw> at = a("nearest_player_holding_wanted_item");
   public static final bsj<Boolean> au = a("ate_recently");
   public static final bsj<gw> av = a("nearest_repellent");
   public static final bsj<Boolean> aw = a("pacified");
   public static final bsj<bji> ax = a("roar_target");
   public static final bsj<gw> ay = a("disturbance_location");
   public static final bsj<asz> az = a("recent_projectile", Codec.unit(asz.a));
   public static final bsj<asz> aA = a("is_sniffing", Codec.unit(asz.a));
   public static final bsj<asz> aB = a("is_emerging", Codec.unit(asz.a));
   public static final bsj<asz> aC = a("roar_sound_delay", Codec.unit(asz.a));
   public static final bsj<asz> aD = a("dig_cooldown", Codec.unit(asz.a));
   public static final bsj<asz> aE = a("roar_sound_cooldown", Codec.unit(asz.a));
   public static final bsj<asz> aF = a("sniff_cooldown", Codec.unit(asz.a));
   public static final bsj<asz> aG = a("touch_cooldown", Codec.unit(asz.a));
   public static final bsj<asz> aH = a("vibration_cooldown", Codec.unit(asz.a));
   public static final bsj<asz> aI = a("sonic_boom_cooldown", Codec.unit(asz.a));
   public static final bsj<asz> aJ = a("sonic_boom_sound_cooldown", Codec.unit(asz.a));
   public static final bsj<asz> aK = a("sonic_boom_sound_delay", Codec.unit(asz.a));
   public static final bsj<UUID> aL = a("liked_player", ia.a);
   public static final bsj<hf> aM = a("liked_noteblock", hf.a);
   public static final bsj<Integer> aN = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final bsj<Integer> aO = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final bsj<List<hf>> aP = a("sniffer_explored_positions", Codec.list(hf.a));
   public static final bsj<gw> aQ = a("sniffer_sniffing_target");
   public static final bsj<Boolean> aR = a("sniffer_digging");
   public static final bsj<Boolean> aS = a("sniffer_happy");
   private final Optional<Codec<bsi<U>>> aT;

   @VisibleForTesting
   public bsj(Optional<Codec<U>> $$0) {
      this.aT = $$0.map(bsi::a);
   }

   @Override
   public String toString() {
      return jd.C.b(this).toString();
   }

   public Optional<Codec<bsi<U>>> a() {
      return this.aT;
   }

   private static <U> bsj<U> a(String $$0, Codec<U> $$1) {
      return ht.a(jd.C, new aey($$0), new bsj<>(Optional.of($$1)));
   }

   private static <U> bsj<U> a(String $$0) {
      return ht.a(jd.C, new aey($$0), new bsj<>(Optional.empty()));
   }
}
