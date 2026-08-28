import java.util.function.Supplier;

public class cdz<U extends cdy<?>> {
   public static final cdz<cdi> a = a("dummy", cdi::new);
   public static final cdz<cdq> b = a("nearest_items", cdq::new);
   public static final cdz<cdr<bto>> c = a("nearest_living_entities", cdr::new);
   public static final cdz<cdv> d = a("nearest_players", cdv::new);
   public static final cdz<cdp> e = a("nearest_bed", cdp::new);
   public static final cdz<cdm> f = a("hurt_by", cdm::new);
   public static final cdz<cec> g = a("villager_hostiles", cec::new);
   public static final cdz<ceb> h = a("villager_babies", ceb::new);
   public static final cdz<cdw> i = a("secondary_pois", cdw::new);
   public static final cdz<cdk> j = a("golem_detected", cdk::new);
   public static final cdz<cdo<cgn>> k = a("armadillo_scare_detected", () -> new cdo<>(5, cgn::j, cgn::gB, ccs.G, 80));
   public static final cdz<cdu> l = a("piglin_specific_sensor", cdu::new);
   public static final cdz<cdt> m = a("piglin_brute_specific_sensor", cdt::new);
   public static final cdz<cdl> n = a("hoglin_specific_sensor", cdl::new);
   public static final cdz<cdf> o = a("nearest_adult", cdf::new);
   public static final cdz<cdg> p = a("axolotl_attackables", cdg::new);
   public static final cdz<cea> q = a("axolotl_temptations", () -> new cea(cgr.a()));
   public static final cdz<cea> r = a("goat_temptations", () -> new cea(chf.a()));
   public static final cdz<cea> s = a("frog_temptations", () -> new cea(cgz.a()));
   public static final cdz<cea> t = a("camel_temptations", () -> new cea(cgw.b()));
   public static final cdz<cea> u = a("armadillo_temptations", () -> new cea(cgo.b()));
   public static final cdz<cdj> v = a("frog_attackables", cdj::new);
   public static final cdz<cdn> w = a("is_in_water", cdn::new);
   public static final cdz<ced> x = a("warden_entity_sensor", ced::new);
   public static final cdz<cea> y = a("sniffer_temptations", () -> new cea(chw.a()));
   public static final cdz<cdh> z = a("breeze_attack_entity_sensor", cdh::new);
   private final Supplier<U> A;

   private cdz(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cdy<?>> cdz<U> a(String $$0, Supplier<U> $$1) {
      return jv.a(lp.C, new ale($$0), new cdz<>($$1));
   }
}
