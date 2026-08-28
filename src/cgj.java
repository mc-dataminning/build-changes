import java.util.function.Supplier;

public class cgj<U extends cgi<?>> {
   public static final cgj<cfs> a = a("dummy", cfs::new);
   public static final cgj<cga> b = a("nearest_items", cga::new);
   public static final cgj<cgb<bvy>> c = a("nearest_living_entities", cgb::new);
   public static final cgj<cgf> d = a("nearest_players", cgf::new);
   public static final cgj<cfz> e = a("nearest_bed", cfz::new);
   public static final cgj<cfw> f = a("hurt_by", cfw::new);
   public static final cgj<cgm> g = a("villager_hostiles", cgm::new);
   public static final cgj<cgl> h = a("villager_babies", cgl::new);
   public static final cgj<cgg> i = a("secondary_pois", cgg::new);
   public static final cgj<cfu> j = a("golem_detected", cfu::new);
   public static final cgj<cfy<cjb>> k = a("armadillo_scare_detected", () -> new cfy<>(5, cjb::j, cjb::gE, cfc.G, 80));
   public static final cgj<cge> l = a("piglin_specific_sensor", cge::new);
   public static final cgj<cgd> m = a("piglin_brute_specific_sensor", cgd::new);
   public static final cgj<cfv> n = a("hoglin_specific_sensor", cfv::new);
   public static final cgj<cfp> o = a("nearest_adult", cfp::new);
   public static final cgj<cfq> p = a("axolotl_attackables", cfq::new);
   public static final cgj<cgk> q = a("axolotl_temptations", () -> new cgk(cjf.a()));
   public static final cgj<cgk> r = a("goat_temptations", () -> new cgk(cjt.a()));
   public static final cgj<cgk> s = a("frog_temptations", () -> new cgk(cjn.a()));
   public static final cgj<cgk> t = a("camel_temptations", () -> new cgk(cjk.b()));
   public static final cgj<cgk> u = a("armadillo_temptations", () -> new cgk(cjc.b()));
   public static final cgj<cft> v = a("frog_attackables", cft::new);
   public static final cgj<cfx> w = a("is_in_water", cfx::new);
   public static final cgj<cgn> x = a("warden_entity_sensor", cgn::new);
   public static final cgj<cgk> y = a("sniffer_temptations", () -> new cgk(ckk.a()));
   public static final cgj<cfr> z = a("breeze_attack_entity_sensor", cfr::new);
   private final Supplier<U> A;

   private cgj(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cgi<?>> cgj<U> a(String $$0, Supplier<U> $$1) {
      return ke.a(mb.A, aku.b($$0), new cgj<>($$1));
   }
}
