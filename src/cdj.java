import java.util.function.Supplier;

public class cdj<U extends cdi<?>> {
   public static final cdj<ccs> a = a("dummy", ccs::new);
   public static final cdj<cda> b = a("nearest_items", cda::new);
   public static final cdj<cdb<bsy>> c = a("nearest_living_entities", cdb::new);
   public static final cdj<cdf> d = a("nearest_players", cdf::new);
   public static final cdj<ccz> e = a("nearest_bed", ccz::new);
   public static final cdj<ccw> f = a("hurt_by", ccw::new);
   public static final cdj<cdm> g = a("villager_hostiles", cdm::new);
   public static final cdj<cdl> h = a("villager_babies", cdl::new);
   public static final cdj<cdg> i = a("secondary_pois", cdg::new);
   public static final cdj<ccu> j = a("golem_detected", ccu::new);
   public static final cdj<ccy<cfx>> k = a("armadillo_scare_detected", () -> new ccy<>(5, cfx::j, cfx::gy, ccc.G, 80));
   public static final cdj<cde> l = a("piglin_specific_sensor", cde::new);
   public static final cdj<cdd> m = a("piglin_brute_specific_sensor", cdd::new);
   public static final cdj<ccv> n = a("hoglin_specific_sensor", ccv::new);
   public static final cdj<ccp> o = a("nearest_adult", ccp::new);
   public static final cdj<ccq> p = a("axolotl_attackables", ccq::new);
   public static final cdj<cdk> q = a("axolotl_temptations", () -> new cdk(cgb.a()));
   public static final cdj<cdk> r = a("goat_temptations", () -> new cdk(cgp.a()));
   public static final cdj<cdk> s = a("frog_temptations", () -> new cdk(cgj.a()));
   public static final cdj<cdk> t = a("camel_temptations", () -> new cdk(cgg.b()));
   public static final cdj<cdk> u = a("armadillo_temptations", () -> new cdk(cfy.b()));
   public static final cdj<cct> v = a("frog_attackables", cct::new);
   public static final cdj<ccx> w = a("is_in_water", ccx::new);
   public static final cdj<cdn> x = a("warden_entity_sensor", cdn::new);
   public static final cdj<cdk> y = a("sniffer_temptations", () -> new cdk(chg.a()));
   public static final cdj<ccr> z = a("breeze_attack_entity_sensor", ccr::new);
   private final Supplier<U> A;

   private cdj(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cdi<?>> cdj<U> a(String $$0, Supplier<U> $$1) {
      return jw.a(lq.A, new akk($$0), new cdj<>($$1));
   }
}
