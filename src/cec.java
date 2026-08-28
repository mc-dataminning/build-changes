import java.util.function.Supplier;

public class cec<U extends ceb<?>> {
   public static final cec<cdl> a = a("dummy", cdl::new);
   public static final cec<cdt> b = a("nearest_items", cdt::new);
   public static final cec<cdu<btr>> c = a("nearest_living_entities", cdu::new);
   public static final cec<cdy> d = a("nearest_players", cdy::new);
   public static final cec<cds> e = a("nearest_bed", cds::new);
   public static final cec<cdp> f = a("hurt_by", cdp::new);
   public static final cec<cef> g = a("villager_hostiles", cef::new);
   public static final cec<cee> h = a("villager_babies", cee::new);
   public static final cec<cdz> i = a("secondary_pois", cdz::new);
   public static final cec<cdn> j = a("golem_detected", cdn::new);
   public static final cec<cdr<cgq>> k = a("armadillo_scare_detected", () -> new cdr<>(5, cgq::j, cgq::gB, ccv.G, 80));
   public static final cec<cdx> l = a("piglin_specific_sensor", cdx::new);
   public static final cec<cdw> m = a("piglin_brute_specific_sensor", cdw::new);
   public static final cec<cdo> n = a("hoglin_specific_sensor", cdo::new);
   public static final cec<cdi> o = a("nearest_adult", cdi::new);
   public static final cec<cdj> p = a("axolotl_attackables", cdj::new);
   public static final cec<ced> q = a("axolotl_temptations", () -> new ced(cgu.a()));
   public static final cec<ced> r = a("goat_temptations", () -> new ced(chi.a()));
   public static final cec<ced> s = a("frog_temptations", () -> new ced(chc.a()));
   public static final cec<ced> t = a("camel_temptations", () -> new ced(cgz.b()));
   public static final cec<ced> u = a("armadillo_temptations", () -> new ced(cgr.b()));
   public static final cec<cdm> v = a("frog_attackables", cdm::new);
   public static final cec<cdq> w = a("is_in_water", cdq::new);
   public static final cec<ceg> x = a("warden_entity_sensor", ceg::new);
   public static final cec<ced> y = a("sniffer_temptations", () -> new ced(chz.a()));
   public static final cec<cdk> z = a("breeze_attack_entity_sensor", cdk::new);
   private final Supplier<U> A;

   private cec(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends ceb<?>> cec<U> a(String $$0, Supplier<U> $$1) {
      return jv.a(lp.C, new alf($$0), new cec<>($$1));
   }
}
