import java.util.function.Supplier;

public class cdy<U extends cdx<?>> {
   public static final cdy<cdh> a = a("dummy", cdh::new);
   public static final cdy<cdp> b = a("nearest_items", cdp::new);
   public static final cdy<cdq<btn>> c = a("nearest_living_entities", cdq::new);
   public static final cdy<cdu> d = a("nearest_players", cdu::new);
   public static final cdy<cdo> e = a("nearest_bed", cdo::new);
   public static final cdy<cdl> f = a("hurt_by", cdl::new);
   public static final cdy<ceb> g = a("villager_hostiles", ceb::new);
   public static final cdy<cea> h = a("villager_babies", cea::new);
   public static final cdy<cdv> i = a("secondary_pois", cdv::new);
   public static final cdy<cdj> j = a("golem_detected", cdj::new);
   public static final cdy<cdn<cgm>> k = a("armadillo_scare_detected", () -> new cdn<>(5, cgm::j, cgm::gB, ccr.G, 80));
   public static final cdy<cdt> l = a("piglin_specific_sensor", cdt::new);
   public static final cdy<cds> m = a("piglin_brute_specific_sensor", cds::new);
   public static final cdy<cdk> n = a("hoglin_specific_sensor", cdk::new);
   public static final cdy<cde> o = a("nearest_adult", cde::new);
   public static final cdy<cdf> p = a("axolotl_attackables", cdf::new);
   public static final cdy<cdz> q = a("axolotl_temptations", () -> new cdz(cgq.a()));
   public static final cdy<cdz> r = a("goat_temptations", () -> new cdz(che.a()));
   public static final cdy<cdz> s = a("frog_temptations", () -> new cdz(cgy.a()));
   public static final cdy<cdz> t = a("camel_temptations", () -> new cdz(cgv.b()));
   public static final cdy<cdz> u = a("armadillo_temptations", () -> new cdz(cgn.b()));
   public static final cdy<cdi> v = a("frog_attackables", cdi::new);
   public static final cdy<cdm> w = a("is_in_water", cdm::new);
   public static final cdy<cec> x = a("warden_entity_sensor", cec::new);
   public static final cdy<cdz> y = a("sniffer_temptations", () -> new cdz(chv.a()));
   public static final cdy<cdg> z = a("breeze_attack_entity_sensor", cdg::new);
   private final Supplier<U> A;

   private cdy(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cdx<?>> cdy<U> a(String $$0, Supplier<U> $$1) {
      return jv.a(lp.C, new ale($$0), new cdy<>($$1));
   }
}
