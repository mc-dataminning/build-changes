import java.util.function.Supplier;

public class cgi<U extends cgh<?>> {
   public static final cgi<cfr> a = a("dummy", cfr::new);
   public static final cgi<cfz> b = a("nearest_items", cfz::new);
   public static final cgi<cga<bvx>> c = a("nearest_living_entities", cga::new);
   public static final cgi<cge> d = a("nearest_players", cge::new);
   public static final cgi<cfy> e = a("nearest_bed", cfy::new);
   public static final cgi<cfv> f = a("hurt_by", cfv::new);
   public static final cgi<cgl> g = a("villager_hostiles", cgl::new);
   public static final cgi<cgk> h = a("villager_babies", cgk::new);
   public static final cgi<cgf> i = a("secondary_pois", cgf::new);
   public static final cgi<cft> j = a("golem_detected", cft::new);
   public static final cgi<cfx<cix>> k = a("armadillo_scare_detected", () -> new cfx<>(5, cix::j, cix::gA, cfb.G, 80));
   public static final cgi<cgd> l = a("piglin_specific_sensor", cgd::new);
   public static final cgi<cgc> m = a("piglin_brute_specific_sensor", cgc::new);
   public static final cgi<cfu> n = a("hoglin_specific_sensor", cfu::new);
   public static final cgi<cfo> o = a("nearest_adult", cfo::new);
   public static final cgi<cfp> p = a("axolotl_attackables", cfp::new);
   public static final cgi<cgj> q = a("axolotl_temptations", () -> new cgj(cjb.a()));
   public static final cgi<cgj> r = a("goat_temptations", () -> new cgj(cjp.a()));
   public static final cgi<cgj> s = a("frog_temptations", () -> new cgj(cjj.a()));
   public static final cgi<cgj> t = a("camel_temptations", () -> new cgj(cjg.b()));
   public static final cgi<cgj> u = a("armadillo_temptations", () -> new cgj(ciy.b()));
   public static final cgi<cfs> v = a("frog_attackables", cfs::new);
   public static final cgi<cfw> w = a("is_in_water", cfw::new);
   public static final cgi<cgm> x = a("warden_entity_sensor", cgm::new);
   public static final cgi<cgj> y = a("sniffer_temptations", () -> new cgj(ckg.a()));
   public static final cgi<cfq> z = a("breeze_attack_entity_sensor", cfq::new);
   private final Supplier<U> A;

   private cgi(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cgh<?>> cgi<U> a(String $$0, Supplier<U> $$1) {
      return kd.a(ma.A, alp.b($$0), new cgi<>($$1));
   }
}
