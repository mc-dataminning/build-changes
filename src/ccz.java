import java.util.function.Supplier;

public class ccz<U extends ccy<?>> {
   public static final ccz<cci> a = a("dummy", cci::new);
   public static final ccz<ccq> b = a("nearest_items", ccq::new);
   public static final ccz<ccr<bso>> c = a("nearest_living_entities", ccr::new);
   public static final ccz<ccv> d = a("nearest_players", ccv::new);
   public static final ccz<ccp> e = a("nearest_bed", ccp::new);
   public static final ccz<ccm> f = a("hurt_by", ccm::new);
   public static final ccz<cdc> g = a("villager_hostiles", cdc::new);
   public static final ccz<cdb> h = a("villager_babies", cdb::new);
   public static final ccz<ccw> i = a("secondary_pois", ccw::new);
   public static final ccz<cck> j = a("golem_detected", cck::new);
   public static final ccz<cco<cfn>> k = a("armadillo_scare_detected", () -> new cco<>(5, cfn::j, cfn::gA, cbs.G, 80));
   public static final ccz<ccu> l = a("piglin_specific_sensor", ccu::new);
   public static final ccz<cct> m = a("piglin_brute_specific_sensor", cct::new);
   public static final ccz<ccl> n = a("hoglin_specific_sensor", ccl::new);
   public static final ccz<ccf> o = a("nearest_adult", ccf::new);
   public static final ccz<ccg> p = a("axolotl_attackables", ccg::new);
   public static final ccz<cda> q = a("axolotl_temptations", () -> new cda(cfr.a()));
   public static final ccz<cda> r = a("goat_temptations", () -> new cda(cgf.a()));
   public static final ccz<cda> s = a("frog_temptations", () -> new cda(cfz.a()));
   public static final ccz<cda> t = a("camel_temptations", () -> new cda(cfw.b()));
   public static final ccz<cda> u = a("armadillo_temptations", () -> new cda(cfo.b()));
   public static final ccz<ccj> v = a("frog_attackables", ccj::new);
   public static final ccz<ccn> w = a("is_in_water", ccn::new);
   public static final ccz<cdd> x = a("warden_entity_sensor", cdd::new);
   public static final ccz<cda> y = a("sniffer_temptations", () -> new cda(cgw.a()));
   public static final ccz<cch> z = a("breeze_attack_entity_sensor", cch::new);
   private final Supplier<U> A;

   private ccz(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends ccy<?>> ccz<U> a(String $$0, Supplier<U> $$1) {
      return jk.a(le.C, new akm($$0), new ccz<>($$1));
   }
}
