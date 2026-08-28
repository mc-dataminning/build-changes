import java.util.function.Supplier;

public class cgm<U extends cgl<?>> {
   public static final cgm<cfv> a = a("dummy", cfv::new);
   public static final cgm<cgd> b = a("nearest_items", cgd::new);
   public static final cgm<cge<bwb>> c = a("nearest_living_entities", cge::new);
   public static final cgm<cgi> d = a("nearest_players", cgi::new);
   public static final cgm<cgc> e = a("nearest_bed", cgc::new);
   public static final cgm<cfz> f = a("hurt_by", cfz::new);
   public static final cgm<cgp> g = a("villager_hostiles", cgp::new);
   public static final cgm<cgo> h = a("villager_babies", cgo::new);
   public static final cgm<cgj> i = a("secondary_pois", cgj::new);
   public static final cgm<cfx> j = a("golem_detected", cfx::new);
   public static final cgm<cgb<cjb>> k = a("armadillo_scare_detected", () -> new cgb<>(5, cjb::j, cjb::gy, cff.G, 80));
   public static final cgm<cgh> l = a("piglin_specific_sensor", cgh::new);
   public static final cgm<cgg> m = a("piglin_brute_specific_sensor", cgg::new);
   public static final cgm<cfy> n = a("hoglin_specific_sensor", cfy::new);
   public static final cgm<cfs> o = a("nearest_adult", cfs::new);
   public static final cgm<cft> p = a("axolotl_attackables", cft::new);
   public static final cgm<cgn> q = a("axolotl_temptations", () -> new cgn(cjf.a()));
   public static final cgm<cgn> r = a("goat_temptations", () -> new cgn(cjt.a()));
   public static final cgm<cgn> s = a("frog_temptations", () -> new cgn(cjn.a()));
   public static final cgm<cgn> t = a("camel_temptations", () -> new cgn(cjk.b()));
   public static final cgm<cgn> u = a("armadillo_temptations", () -> new cgn(cjc.b()));
   public static final cgm<cfw> v = a("frog_attackables", cfw::new);
   public static final cgm<cga> w = a("is_in_water", cga::new);
   public static final cgm<cgq> x = a("warden_entity_sensor", cgq::new);
   public static final cgm<cgn> y = a("sniffer_temptations", () -> new cgn(ckk.a()));
   public static final cgm<cfu> z = a("breeze_attack_entity_sensor", cfu::new);
   private final Supplier<U> A;

   private cgm(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cgl<?>> cgm<U> a(String $$0, Supplier<U> $$1) {
      return kd.a(ma.A, alz.b($$0), new cgm<>($$1));
   }
}
