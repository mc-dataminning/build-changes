import java.util.function.Supplier;

public class cdv<U extends cdu<?>> {
   public static final cdv<cde> a = a("dummy", cde::new);
   public static final cdv<cdm> b = a("nearest_items", cdm::new);
   public static final cdv<cdn<btk>> c = a("nearest_living_entities", cdn::new);
   public static final cdv<cdr> d = a("nearest_players", cdr::new);
   public static final cdv<cdl> e = a("nearest_bed", cdl::new);
   public static final cdv<cdi> f = a("hurt_by", cdi::new);
   public static final cdv<cdy> g = a("villager_hostiles", cdy::new);
   public static final cdv<cdx> h = a("villager_babies", cdx::new);
   public static final cdv<cds> i = a("secondary_pois", cds::new);
   public static final cdv<cdg> j = a("golem_detected", cdg::new);
   public static final cdv<cdk<cgj>> k = a("armadillo_scare_detected", () -> new cdk<>(5, cgj::j, cgj::gB, cco.G, 80));
   public static final cdv<cdq> l = a("piglin_specific_sensor", cdq::new);
   public static final cdv<cdp> m = a("piglin_brute_specific_sensor", cdp::new);
   public static final cdv<cdh> n = a("hoglin_specific_sensor", cdh::new);
   public static final cdv<cdb> o = a("nearest_adult", cdb::new);
   public static final cdv<cdc> p = a("axolotl_attackables", cdc::new);
   public static final cdv<cdw> q = a("axolotl_temptations", () -> new cdw(cgn.a()));
   public static final cdv<cdw> r = a("goat_temptations", () -> new cdw(chb.a()));
   public static final cdv<cdw> s = a("frog_temptations", () -> new cdw(cgv.a()));
   public static final cdv<cdw> t = a("camel_temptations", () -> new cdw(cgs.b()));
   public static final cdv<cdw> u = a("armadillo_temptations", () -> new cdw(cgk.b()));
   public static final cdv<cdf> v = a("frog_attackables", cdf::new);
   public static final cdv<cdj> w = a("is_in_water", cdj::new);
   public static final cdv<cdz> x = a("warden_entity_sensor", cdz::new);
   public static final cdv<cdw> y = a("sniffer_temptations", () -> new cdw(chs.a()));
   public static final cdv<cdd> z = a("breeze_attack_entity_sensor", cdd::new);
   private final Supplier<U> A;

   private cdv(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cdu<?>> cdv<U> a(String $$0, Supplier<U> $$1) {
      return jv.a(lp.C, new alb($$0), new cdv<>($$1));
   }
}
