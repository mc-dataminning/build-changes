import java.util.function.Supplier;

public class cdb<U extends cda<?>> {
   public static final cdb<cck> a = a("dummy", cck::new);
   public static final cdb<ccs> b = a("nearest_items", ccs::new);
   public static final cdb<cct<bsq>> c = a("nearest_living_entities", cct::new);
   public static final cdb<ccx> d = a("nearest_players", ccx::new);
   public static final cdb<ccr> e = a("nearest_bed", ccr::new);
   public static final cdb<cco> f = a("hurt_by", cco::new);
   public static final cdb<cde> g = a("villager_hostiles", cde::new);
   public static final cdb<cdd> h = a("villager_babies", cdd::new);
   public static final cdb<ccy> i = a("secondary_pois", ccy::new);
   public static final cdb<ccm> j = a("golem_detected", ccm::new);
   public static final cdb<ccq<cfp>> k = a("armadillo_scare_detected", () -> new ccq<>(5, cfp::j, cfp::gA, cbu.G, 80));
   public static final cdb<ccw> l = a("piglin_specific_sensor", ccw::new);
   public static final cdb<ccv> m = a("piglin_brute_specific_sensor", ccv::new);
   public static final cdb<ccn> n = a("hoglin_specific_sensor", ccn::new);
   public static final cdb<cch> o = a("nearest_adult", cch::new);
   public static final cdb<cci> p = a("axolotl_attackables", cci::new);
   public static final cdb<cdc> q = a("axolotl_temptations", () -> new cdc(cft.a()));
   public static final cdb<cdc> r = a("goat_temptations", () -> new cdc(cgh.a()));
   public static final cdb<cdc> s = a("frog_temptations", () -> new cdc(cgb.a()));
   public static final cdb<cdc> t = a("camel_temptations", () -> new cdc(cfy.b()));
   public static final cdb<cdc> u = a("armadillo_temptations", () -> new cdc(cfq.b()));
   public static final cdb<ccl> v = a("frog_attackables", ccl::new);
   public static final cdb<ccp> w = a("is_in_water", ccp::new);
   public static final cdb<cdf> x = a("warden_entity_sensor", cdf::new);
   public static final cdb<cdc> y = a("sniffer_temptations", () -> new cdc(cgy.a()));
   public static final cdb<ccj> z = a("breeze_attack_entity_sensor", ccj::new);
   private final Supplier<U> A;

   private cdb(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cda<?>> cdb<U> a(String $$0, Supplier<U> $$1) {
      return jk.a(le.C, new akn($$0), new cdb<>($$1));
   }
}
