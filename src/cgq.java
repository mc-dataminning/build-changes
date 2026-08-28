import java.util.function.Supplier;

public class cgq<U extends cgp<?>> {
   public static final cgq<cfz> a = a("dummy", cfz::new);
   public static final cgq<cgh> b = a("nearest_items", cgh::new);
   public static final cgq<cgi<bwf>> c = a("nearest_living_entities", cgi::new);
   public static final cgq<cgm> d = a("nearest_players", cgm::new);
   public static final cgq<cgg> e = a("nearest_bed", cgg::new);
   public static final cgq<cgd> f = a("hurt_by", cgd::new);
   public static final cgq<cgt> g = a("villager_hostiles", cgt::new);
   public static final cgq<cgs> h = a("villager_babies", cgs::new);
   public static final cgq<cgn> i = a("secondary_pois", cgn::new);
   public static final cgq<cgb> j = a("golem_detected", cgb::new);
   public static final cgq<cgf<cjf>> k = a("armadillo_scare_detected", () -> new cgf<>(5, cjf::j, cjf::gy, cfj.G, 80));
   public static final cgq<cgl> l = a("piglin_specific_sensor", cgl::new);
   public static final cgq<cgk> m = a("piglin_brute_specific_sensor", cgk::new);
   public static final cgq<cgc> n = a("hoglin_specific_sensor", cgc::new);
   public static final cgq<cfw> o = a("nearest_adult", cfw::new);
   public static final cgq<cfx> p = a("axolotl_attackables", cfx::new);
   public static final cgq<cgr> q = a("axolotl_temptations", () -> new cgr(cjj.a()));
   public static final cgq<cgr> r = a("goat_temptations", () -> new cgr(cjx.a()));
   public static final cgq<cgr> s = a("frog_temptations", () -> new cgr(cjr.a()));
   public static final cgq<cgr> t = a("camel_temptations", () -> new cgr(cjo.b()));
   public static final cgq<cgr> u = a("armadillo_temptations", () -> new cgr(cjg.b()));
   public static final cgq<cga> v = a("frog_attackables", cga::new);
   public static final cgq<cge> w = a("is_in_water", cge::new);
   public static final cgq<cgu> x = a("warden_entity_sensor", cgu::new);
   public static final cgq<cgr> y = a("sniffer_temptations", () -> new cgr(cko.a()));
   public static final cgq<cfy> z = a("breeze_attack_entity_sensor", cfy::new);
   private final Supplier<U> A;

   private cgq(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cgp<?>> cgq<U> a(String $$0, Supplier<U> $$1) {
      return kd.a(ma.A, alz.b($$0), new cgq<>($$1));
   }
}
