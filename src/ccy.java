import java.util.function.Supplier;

public class ccy<U extends ccx<?>> {
   public static final ccy<cch> a = a("dummy", cch::new);
   public static final ccy<ccp> b = a("nearest_items", ccp::new);
   public static final ccy<ccq<bso>> c = a("nearest_living_entities", ccq::new);
   public static final ccy<ccu> d = a("nearest_players", ccu::new);
   public static final ccy<cco> e = a("nearest_bed", cco::new);
   public static final ccy<ccl> f = a("hurt_by", ccl::new);
   public static final ccy<cdb> g = a("villager_hostiles", cdb::new);
   public static final ccy<cda> h = a("villager_babies", cda::new);
   public static final ccy<ccv> i = a("secondary_pois", ccv::new);
   public static final ccy<ccj> j = a("golem_detected", ccj::new);
   public static final ccy<ccn<cfn>> k = a("armadillo_scare_detected", () -> new ccn<>(5, cfn::j, cfn::gJ, cbr.G, 80));
   public static final ccy<cct> l = a("piglin_specific_sensor", cct::new);
   public static final ccy<ccs> m = a("piglin_brute_specific_sensor", ccs::new);
   public static final ccy<cck> n = a("hoglin_specific_sensor", cck::new);
   public static final ccy<cce> o = a("nearest_adult", cce::new);
   public static final ccy<ccf> p = a("axolotl_attackables", ccf::new);
   public static final ccy<ccz> q = a("axolotl_temptations", () -> new ccz(cfr.a()));
   public static final ccy<ccz> r = a("goat_temptations", () -> new ccz(cgf.a()));
   public static final ccy<ccz> s = a("frog_temptations", () -> new ccz(cfz.a()));
   public static final ccy<ccz> t = a("camel_temptations", () -> new ccz(cfw.b()));
   public static final ccy<ccz> u = a("armadillo_temptations", () -> new ccz(cfo.b()));
   public static final ccy<cci> v = a("frog_attackables", cci::new);
   public static final ccy<ccm> w = a("is_in_water", ccm::new);
   public static final ccy<cdc> x = a("warden_entity_sensor", cdc::new);
   public static final ccy<ccz> y = a("sniffer_temptations", () -> new ccz(cgw.a()));
   public static final ccy<ccg> z = a("breeze_attack_entity_sensor", ccg::new);
   private final Supplier<U> A;

   private ccy(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends ccx<?>> ccy<U> a(String $$0, Supplier<U> $$1) {
      return jn.a(lh.C, new akt($$0), new ccy<>($$1));
   }
}
