import java.util.function.Supplier;

public class cdn<U extends cdm<?>> {
   public static final cdn<ccw> a = a("dummy", ccw::new);
   public static final cdn<cde> b = a("nearest_items", cde::new);
   public static final cdn<cdf<btc>> c = a("nearest_living_entities", cdf::new);
   public static final cdn<cdj> d = a("nearest_players", cdj::new);
   public static final cdn<cdd> e = a("nearest_bed", cdd::new);
   public static final cdn<cda> f = a("hurt_by", cda::new);
   public static final cdn<cdq> g = a("villager_hostiles", cdq::new);
   public static final cdn<cdp> h = a("villager_babies", cdp::new);
   public static final cdn<cdk> i = a("secondary_pois", cdk::new);
   public static final cdn<ccy> j = a("golem_detected", ccy::new);
   public static final cdn<cdc<cgb>> k = a("armadillo_scare_detected", () -> new cdc<>(5, cgb::j, cgb::gy, ccg.G, 80));
   public static final cdn<cdi> l = a("piglin_specific_sensor", cdi::new);
   public static final cdn<cdh> m = a("piglin_brute_specific_sensor", cdh::new);
   public static final cdn<ccz> n = a("hoglin_specific_sensor", ccz::new);
   public static final cdn<cct> o = a("nearest_adult", cct::new);
   public static final cdn<ccu> p = a("axolotl_attackables", ccu::new);
   public static final cdn<cdo> q = a("axolotl_temptations", () -> new cdo(cgf.a()));
   public static final cdn<cdo> r = a("goat_temptations", () -> new cdo(cgt.a()));
   public static final cdn<cdo> s = a("frog_temptations", () -> new cdo(cgn.a()));
   public static final cdn<cdo> t = a("camel_temptations", () -> new cdo(cgk.b()));
   public static final cdn<cdo> u = a("armadillo_temptations", () -> new cdo(cgc.b()));
   public static final cdn<ccx> v = a("frog_attackables", ccx::new);
   public static final cdn<cdb> w = a("is_in_water", cdb::new);
   public static final cdn<cdr> x = a("warden_entity_sensor", cdr::new);
   public static final cdn<cdo> y = a("sniffer_temptations", () -> new cdo(chk.a()));
   public static final cdn<ccv> z = a("breeze_attack_entity_sensor", ccv::new);
   private final Supplier<U> A;

   private cdn(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cdm<?>> cdn<U> a(String $$0, Supplier<U> $$1) {
      return jw.a(lq.A, new akk($$0), new cdn<>($$1));
   }
}
