import java.util.function.Supplier;

public class cck<U extends ccj<?>> {
   public static final cck<cbt> a = a("dummy", cbt::new);
   public static final cck<ccb> b = a("nearest_items", ccb::new);
   public static final cck<ccc<bsa>> c = a("nearest_living_entities", ccc::new);
   public static final cck<ccg> d = a("nearest_players", ccg::new);
   public static final cck<cca> e = a("nearest_bed", cca::new);
   public static final cck<cbx> f = a("hurt_by", cbx::new);
   public static final cck<ccn> g = a("villager_hostiles", ccn::new);
   public static final cck<ccm> h = a("villager_babies", ccm::new);
   public static final cck<cch> i = a("secondary_pois", cch::new);
   public static final cck<cbv> j = a("golem_detected", cbv::new);
   public static final cck<cbz<cey>> k = a("armadillo_scare_detected", () -> new cbz<>(5, cey::j, cey::gA, cbd.G, 80));
   public static final cck<ccf> l = a("piglin_specific_sensor", ccf::new);
   public static final cck<cce> m = a("piglin_brute_specific_sensor", cce::new);
   public static final cck<cbw> n = a("hoglin_specific_sensor", cbw::new);
   public static final cck<cbq> o = a("nearest_adult", cbq::new);
   public static final cck<cbr> p = a("axolotl_attackables", cbr::new);
   public static final cck<ccl> q = a("axolotl_temptations", () -> new ccl(cfc.a()));
   public static final cck<ccl> r = a("goat_temptations", () -> new ccl(cfq.a()));
   public static final cck<ccl> s = a("frog_temptations", () -> new ccl(cfk.a()));
   public static final cck<ccl> t = a("camel_temptations", () -> new ccl(cfh.b()));
   public static final cck<ccl> u = a("armadillo_temptations", () -> new ccl(cez.b()));
   public static final cck<cbu> v = a("frog_attackables", cbu::new);
   public static final cck<cby> w = a("is_in_water", cby::new);
   public static final cck<cco> x = a("warden_entity_sensor", cco::new);
   public static final cck<ccl> y = a("sniffer_temptations", () -> new ccl(cgh.a()));
   public static final cck<cbs> z = a("breeze_attack_entity_sensor", cbs::new);
   private final Supplier<U> A;

   private cck(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends ccj<?>> cck<U> a(String $$0, Supplier<U> $$1) {
      return jj.a(ld.C, new akh($$0), new cck<>($$1));
   }
}
