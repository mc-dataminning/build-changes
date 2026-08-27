import java.util.function.Supplier;

public class bws<U extends bwr<?>> {
   public static final bws<bwc> a = a("dummy", bwc::new);
   public static final bws<bwj> b = a("nearest_items", bwj::new);
   public static final bws<bwk<bmk>> c = a("nearest_living_entities", bwk::new);
   public static final bws<bwo> d = a("nearest_players", bwo::new);
   public static final bws<bwi> e = a("nearest_bed", bwi::new);
   public static final bws<bwg> f = a("hurt_by", bwg::new);
   public static final bws<bwv> g = a("villager_hostiles", bwv::new);
   public static final bws<bwu> h = a("villager_babies", bwu::new);
   public static final bws<bwp> i = a("secondary_pois", bwp::new);
   public static final bws<bwe> j = a("golem_detected", bwe::new);
   public static final bws<bwn> k = a("piglin_specific_sensor", bwn::new);
   public static final bws<bwm> l = a("piglin_brute_specific_sensor", bwm::new);
   public static final bws<bwf> m = a("hoglin_specific_sensor", bwf::new);
   public static final bws<bvz> n = a("nearest_adult", bvz::new);
   public static final bws<bwa> o = a("axolotl_attackables", bwa::new);
   public static final bws<bwt> p = a("axolotl_temptations", () -> new bwt(bzf.a()));
   public static final bws<bwt> q = a("goat_temptations", () -> new bwt(bzt.a()));
   public static final bws<bwt> r = a("frog_temptations", () -> new bwt(bzn.a()));
   public static final bws<bwt> s = a("camel_temptations", () -> new bwt(bzk.b()));
   public static final bws<bwd> t = a("frog_attackables", bwd::new);
   public static final bws<bwh> u = a("is_in_water", bwh::new);
   public static final bws<bww> v = a("warden_entity_sensor", bww::new);
   public static final bws<bwt> w = a("sniffer_temptations", () -> new bwt(cak.a()));
   public static final bws<bwb> x = a("breeze_attack_entity_sensor", bwb::new);
   private final Supplier<U> y;

   private bws(Supplier<U> $$0) {
      this.y = $$0;
   }

   public U a() {
      return this.y.get();
   }

   private static <U extends bwr<?>> bws<U> a(String $$0, Supplier<U> $$1) {
      return it.a(kd.C, new ahg($$0), new bws<>($$1));
   }
}
