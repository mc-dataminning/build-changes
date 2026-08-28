import java.util.function.Supplier;

public class ceb<U extends cea<?>> {
   public static final ceb<cdk> a = a("dummy", cdk::new);
   public static final ceb<cds> b = a("nearest_items", cds::new);
   public static final ceb<cdt<btq>> c = a("nearest_living_entities", cdt::new);
   public static final ceb<cdx> d = a("nearest_players", cdx::new);
   public static final ceb<cdr> e = a("nearest_bed", cdr::new);
   public static final ceb<cdo> f = a("hurt_by", cdo::new);
   public static final ceb<cee> g = a("villager_hostiles", cee::new);
   public static final ceb<ced> h = a("villager_babies", ced::new);
   public static final ceb<cdy> i = a("secondary_pois", cdy::new);
   public static final ceb<cdm> j = a("golem_detected", cdm::new);
   public static final ceb<cdq<cgp>> k = a("armadillo_scare_detected", () -> new cdq<>(5, cgp::j, cgp::gB, ccu.G, 80));
   public static final ceb<cdw> l = a("piglin_specific_sensor", cdw::new);
   public static final ceb<cdv> m = a("piglin_brute_specific_sensor", cdv::new);
   public static final ceb<cdn> n = a("hoglin_specific_sensor", cdn::new);
   public static final ceb<cdh> o = a("nearest_adult", cdh::new);
   public static final ceb<cdi> p = a("axolotl_attackables", cdi::new);
   public static final ceb<cec> q = a("axolotl_temptations", () -> new cec(cgt.a()));
   public static final ceb<cec> r = a("goat_temptations", () -> new cec(chh.a()));
   public static final ceb<cec> s = a("frog_temptations", () -> new cec(chb.a()));
   public static final ceb<cec> t = a("camel_temptations", () -> new cec(cgy.b()));
   public static final ceb<cec> u = a("armadillo_temptations", () -> new cec(cgq.b()));
   public static final ceb<cdl> v = a("frog_attackables", cdl::new);
   public static final ceb<cdp> w = a("is_in_water", cdp::new);
   public static final ceb<cef> x = a("warden_entity_sensor", cef::new);
   public static final ceb<cec> y = a("sniffer_temptations", () -> new cec(chy.a()));
   public static final ceb<cdj> z = a("breeze_attack_entity_sensor", cdj::new);
   private final Supplier<U> A;

   private ceb(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cea<?>> ceb<U> a(String $$0, Supplier<U> $$1) {
      return jv.a(lp.C, new alf($$0), new ceb<>($$1));
   }
}
