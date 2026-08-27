import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cbd<U> {
   public static final cbd<Void> a = a("dummy");
   public static final cbd<iv> b = a("home", iv.b);
   public static final cbd<iv> c = a("job_site", iv.b);
   public static final cbd<iv> d = a("potential_job_site", iv.b);
   public static final cbd<iv> e = a("meeting_point", iv.b);
   public static final cbd<List<iv>> f = a("secondary_job_site");
   public static final cbd<List<bsa>> g = a("mobs");
   public static final cbd<cbf> h = a("visible_mobs");
   public static final cbd<List<bsa>> i = a("visible_villager_babies");
   public static final cbd<List<clh>> j = a("nearest_players");
   public static final cbd<clh> k = a("nearest_visible_player");
   public static final cbd<clh> l = a("nearest_visible_targetable_player");
   public static final cbd<cbg> m = a("walk_target");
   public static final cbd<bvg> n = a("look_target");
   public static final cbd<bsa> o = a("attack_target");
   public static final cbd<Boolean> p = a("attack_cooling_down");
   public static final cbd<bsa> q = a("interaction_target");
   public static final cbd<brb> r = a("breed_target");
   public static final cbd<brh> s = a("ride_target");
   public static final cbd<emo> t = a("path");
   public static final cbd<List<iv>> u = a("interactable_doors");
   public static final cbd<Set<iv>> v = a("doors_to_close");
   public static final cbd<in> w = a("nearest_bed");
   public static final cbd<bqf> x = a("hurt_by");
   public static final cbd<bsa> y = a("hurt_by_entity");
   public static final cbd<bsa> z = a("avoid_target");
   public static final cbd<bsa> A = a("nearest_hostile");
   public static final cbd<bsa> B = a("nearest_attackable");
   public static final cbd<iv> C = a("hiding_place");
   public static final cbd<Long> D = a("heard_bell_time");
   public static final cbd<Long> E = a("cant_reach_walk_target_since");
   public static final cbd<Boolean> F = a("golem_detected_recently", Codec.BOOL);
   public static final cbd<Boolean> G = a("danger_detected_recently", Codec.BOOL);
   public static final cbd<Long> H = a("last_slept", Codec.LONG);
   public static final cbd<Long> I = a("last_woken", Codec.LONG);
   public static final cbd<Long> J = a("last_worked_at_poi", Codec.LONG);
   public static final cbd<brb> K = a("nearest_visible_adult");
   public static final cbd<chr> L = a("nearest_visible_wanted_item");
   public static final cbd<bsc> M = a("nearest_visible_nemesis");
   public static final cbd<Integer> N = a("play_dead_ticks", Codec.INT);
   public static final cbd<clh> O = a("tempting_player");
   public static final cbd<Integer> P = a("temptation_cooldown_ticks", Codec.INT);
   public static final cbd<Integer> Q = a("gaze_cooldown_ticks", Codec.INT);
   public static final cbd<Boolean> R = a("is_tempted", Codec.BOOL);
   public static final cbd<Integer> S = a("long_jump_cooling_down", Codec.INT);
   public static final cbd<Boolean> T = a("long_jump_mid_jump");
   public static final cbd<Boolean> U = a("has_hunting_cooldown", Codec.BOOL);
   public static final cbd<Integer> V = a("ram_cooldown_ticks", Codec.INT);
   public static final cbd<etp> W = a("ram_target");
   public static final cbd<azb> X = a("is_in_water", Codec.unit(azb.a));
   public static final cbd<azb> Y = a("is_pregnant", Codec.unit(azb.a));
   public static final cbd<Boolean> Z = a("is_panicking", Codec.BOOL);
   public static final cbd<List<UUID>> aa = a("unreachable_tongue_targets");
   public static final cbd<UUID> ab = a("angry_at", jq.a);
   public static final cbd<Boolean> ac = a("universal_anger", Codec.BOOL);
   public static final cbd<Boolean> ad = a("admiring_item", Codec.BOOL);
   public static final cbd<Integer> ae = a("time_trying_to_reach_admire_item");
   public static final cbd<Boolean> af = a("disable_walk_to_admire_item");
   public static final cbd<Boolean> ag = a("admiring_disabled", Codec.BOOL);
   public static final cbd<Boolean> ah = a("hunted_recently", Codec.BOOL);
   public static final cbd<in> ai = a("celebrate_location");
   public static final cbd<Boolean> aj = a("dancing");
   public static final cbd<cjr> ak = a("nearest_visible_huntable_hoglin");
   public static final cbd<cjr> al = a("nearest_visible_baby_hoglin");
   public static final cbd<clh> am = a("nearest_targetable_player_not_wearing_gold");
   public static final cbd<List<cjw>> an = a("nearby_adult_piglins");
   public static final cbd<List<cjw>> ao = a("nearest_visible_adult_piglins");
   public static final cbd<List<cjr>> ap = a("nearest_visible_adult_hoglins");
   public static final cbd<cjw> aq = a("nearest_visible_adult_piglin");
   public static final cbd<bsa> ar = a("nearest_visible_zombified");
   public static final cbd<Integer> as = a("visible_adult_piglin_count");
   public static final cbd<Integer> at = a("visible_adult_hoglin_count");
   public static final cbd<clh> au = a("nearest_player_holding_wanted_item");
   public static final cbd<Boolean> av = a("ate_recently");
   public static final cbd<in> aw = a("nearest_repellent");
   public static final cbd<Boolean> ax = a("pacified");
   public static final cbd<bsa> ay = a("roar_target");
   public static final cbd<in> az = a("disturbance_location");
   public static final cbd<azb> aA = a("recent_projectile", Codec.unit(azb.a));
   public static final cbd<azb> aB = a("is_sniffing", Codec.unit(azb.a));
   public static final cbd<azb> aC = a("is_emerging", Codec.unit(azb.a));
   public static final cbd<azb> aD = a("roar_sound_delay", Codec.unit(azb.a));
   public static final cbd<azb> aE = a("dig_cooldown", Codec.unit(azb.a));
   public static final cbd<azb> aF = a("roar_sound_cooldown", Codec.unit(azb.a));
   public static final cbd<azb> aG = a("sniff_cooldown", Codec.unit(azb.a));
   public static final cbd<azb> aH = a("touch_cooldown", Codec.unit(azb.a));
   public static final cbd<azb> aI = a("vibration_cooldown", Codec.unit(azb.a));
   public static final cbd<azb> aJ = a("sonic_boom_cooldown", Codec.unit(azb.a));
   public static final cbd<azb> aK = a("sonic_boom_sound_cooldown", Codec.unit(azb.a));
   public static final cbd<azb> aL = a("sonic_boom_sound_delay", Codec.unit(azb.a));
   public static final cbd<UUID> aM = a("liked_player", jq.a);
   public static final cbd<iv> aN = a("liked_noteblock", iv.b);
   public static final cbd<Integer> aO = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cbd<Integer> aP = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cbd<List<iv>> aQ = a("sniffer_explored_positions", Codec.list(iv.b));
   public static final cbd<in> aR = a("sniffer_sniffing_target");
   public static final cbd<Boolean> aS = a("sniffer_digging");
   public static final cbd<Boolean> aT = a("sniffer_happy");
   public static final cbd<azb> aU = a("breeze_jump_cooldown", Codec.unit(azb.a));
   public static final cbd<azb> aV = a("breeze_shoot", Codec.unit(azb.a));
   public static final cbd<azb> aW = a("breeze_shoot_charging", Codec.unit(azb.a));
   public static final cbd<azb> aX = a("breeze_shoot_recover", Codec.unit(azb.a));
   public static final cbd<azb> aY = a("breeze_shoot_cooldown", Codec.unit(azb.a));
   public static final cbd<azb> aZ = a("breeze_jump_inhaling", Codec.unit(azb.a));
   public static final cbd<in> ba = a("breeze_jump_target", in.a);
   public static final cbd<azb> bb = a("breeze_leaving_water", Codec.unit(azb.a));
   private final Optional<Codec<cbc<U>>> bc;

   @VisibleForTesting
   public cbd(Optional<Codec<U>> $$0) {
      this.bc = $$0.map(cbc::a);
   }

   @Override
   public String toString() {
      return ld.B.b(this).toString();
   }

   public Optional<Codec<cbc<U>>> a() {
      return this.bc;
   }

   private static <U> cbd<U> a(String $$0, Codec<U> $$1) {
      return jj.a(ld.B, new akh($$0), new cbd<>(Optional.of($$1)));
   }

   private static <U> cbd<U> a(String $$0) {
      return jj.a(ld.B, new akh($$0), new cbd<>(Optional.empty()));
   }
}
