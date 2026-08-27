import java.util.function.Supplier;

public class byo<U extends byn<?>> {
   public static final byo<bxx> a = a("dummy", bxx::new);
   public static final byo<byf> b = a("nearest_items", byf::new);
   public static final byo<byg<bog>> c = a("nearest_living_entities", byg::new);
   public static final byo<byk> d = a("nearest_players", byk::new);
   public static final byo<bye> e = a("nearest_bed", bye::new);
   public static final byo<byb> f = a("hurt_by", byb::new);
   public static final byo<byr> g = a("villager_hostiles", byr::new);
   public static final byo<byq> h = a("villager_babies", byq::new);
   public static final byo<byl> i = a("secondary_pois", byl::new);
   public static final byo<bxz> j = a("golem_detected", bxz::new);
   public static final byo<byd<cba>> k = a("armadillo_scare_detected", () -> new byd<>(5, cba::j, cba::gp, bxh.G, 60));
   public static final byo<byj> l = a("piglin_specific_sensor", byj::new);
   public static final byo<byi> m = a("piglin_brute_specific_sensor", byi::new);
   public static final byo<bya> n = a("hoglin_specific_sensor", bya::new);
   public static final byo<bxu> o = a("nearest_adult", bxu::new);
   public static final byo<bxv> p = a("axolotl_attackables", bxv::new);
   public static final byo<byp> q = a("axolotl_temptations", () -> new byp(cbe.a()));
   public static final byo<byp> r = a("goat_temptations", () -> new byp(cbs.a()));
   public static final byo<byp> s = a("frog_temptations", () -> new byp(cbm.a()));
   public static final byo<byp> t = a("camel_temptations", () -> new byp(cbj.b()));
   public static final byo<byp> u = a("armadillo_temptations", () -> new byp(cbb.b()));
   public static final byo<bxy> v = a("frog_attackables", bxy::new);
   public static final byo<byc> w = a("is_in_water", byc::new);
   public static final byo<bys> x = a("warden_entity_sensor", bys::new);
   public static final byo<byp> y = a("sniffer_temptations", () -> new byp(ccj.a()));
   public static final byo<bxw> z = a("breeze_attack_entity_sensor", bxw::new);
   private final Supplier<U> A;

   private byo(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends byn<?>> byo<U> a(String $$0, Supplier<U> $$1) {
      return iv.a(kf.C, new aiy($$0), new byo<>($$1));
   }
}
