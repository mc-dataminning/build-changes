import java.util.function.Supplier;

public class cgr<U extends cgq<?>> {
   public static final cgr<cga> a = a("dummy", cga::new);
   public static final cgr<cgi> b = a("nearest_items", cgi::new);
   public static final cgr<cgj<bwg>> c = a("nearest_living_entities", cgj::new);
   public static final cgr<cgn> d = a("nearest_players", cgn::new);
   public static final cgr<cgh> e = a("nearest_bed", cgh::new);
   public static final cgr<cge> f = a("hurt_by", cge::new);
   public static final cgr<cgu> g = a("villager_hostiles", cgu::new);
   public static final cgr<cgt> h = a("villager_babies", cgt::new);
   public static final cgr<cgo> i = a("secondary_pois", cgo::new);
   public static final cgr<cgc> j = a("golem_detected", cgc::new);
   public static final cgr<cgg<cjg>> k = a("armadillo_scare_detected", () -> new cgg<>(5, cjg::j, cjg::gA, cfk.G, 80));
   public static final cgr<cgm> l = a("piglin_specific_sensor", cgm::new);
   public static final cgr<cgl> m = a("piglin_brute_specific_sensor", cgl::new);
   public static final cgr<cgd> n = a("hoglin_specific_sensor", cgd::new);
   public static final cgr<cfx> o = a("nearest_adult", cfx::new);
   public static final cgr<cfy> p = a("axolotl_attackables", cfy::new);
   public static final cgr<cgs> q = a("axolotl_temptations", () -> new cgs(cjk.a()));
   public static final cgr<cgs> r = a("goat_temptations", () -> new cgs(cjy.a()));
   public static final cgr<cgs> s = a("frog_temptations", () -> new cgs(cjs.a()));
   public static final cgr<cgs> t = a("camel_temptations", () -> new cgs(cjp.b()));
   public static final cgr<cgs> u = a("armadillo_temptations", () -> new cgs(cjh.b()));
   public static final cgr<cgb> v = a("frog_attackables", cgb::new);
   public static final cgr<cgf> w = a("is_in_water", cgf::new);
   public static final cgr<cgv> x = a("warden_entity_sensor", cgv::new);
   public static final cgr<cgs> y = a("sniffer_temptations", () -> new cgs(ckp.a()));
   public static final cgr<cfz> z = a("breeze_attack_entity_sensor", cfz::new);
   private final Supplier<U> A;

   private cgr(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cgq<?>> cgr<U> a(String $$0, Supplier<U> $$1) {
      return kd.a(ma.A, alz.b($$0), new cgr<>($$1));
   }
}
