import java.util.function.Supplier;

public class cdm<U extends cdl<?>> {
   public static final cdm<ccv> a = a("dummy", ccv::new);
   public static final cdm<cdd> b = a("nearest_items", cdd::new);
   public static final cdm<cde<btb>> c = a("nearest_living_entities", cde::new);
   public static final cdm<cdi> d = a("nearest_players", cdi::new);
   public static final cdm<cdc> e = a("nearest_bed", cdc::new);
   public static final cdm<ccz> f = a("hurt_by", ccz::new);
   public static final cdm<cdp> g = a("villager_hostiles", cdp::new);
   public static final cdm<cdo> h = a("villager_babies", cdo::new);
   public static final cdm<cdj> i = a("secondary_pois", cdj::new);
   public static final cdm<ccx> j = a("golem_detected", ccx::new);
   public static final cdm<cdb<cga>> k = a("armadillo_scare_detected", () -> new cdb<>(5, cga::j, cga::gz, ccf.G, 80));
   public static final cdm<cdh> l = a("piglin_specific_sensor", cdh::new);
   public static final cdm<cdg> m = a("piglin_brute_specific_sensor", cdg::new);
   public static final cdm<ccy> n = a("hoglin_specific_sensor", ccy::new);
   public static final cdm<ccs> o = a("nearest_adult", ccs::new);
   public static final cdm<cct> p = a("axolotl_attackables", cct::new);
   public static final cdm<cdn> q = a("axolotl_temptations", () -> new cdn(cge.a()));
   public static final cdm<cdn> r = a("goat_temptations", () -> new cdn(cgs.a()));
   public static final cdm<cdn> s = a("frog_temptations", () -> new cdn(cgm.a()));
   public static final cdm<cdn> t = a("camel_temptations", () -> new cdn(cgj.b()));
   public static final cdm<cdn> u = a("armadillo_temptations", () -> new cdn(cgb.b()));
   public static final cdm<ccw> v = a("frog_attackables", ccw::new);
   public static final cdm<cda> w = a("is_in_water", cda::new);
   public static final cdm<cdq> x = a("warden_entity_sensor", cdq::new);
   public static final cdm<cdn> y = a("sniffer_temptations", () -> new cdn(chj.a()));
   public static final cdm<ccu> z = a("breeze_attack_entity_sensor", ccu::new);
   private final Supplier<U> A;

   private cdm(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cdl<?>> cdm<U> a(String $$0, Supplier<U> $$1) {
      return jw.a(lq.A, new akk($$0), new cdm<>($$1));
   }
}
