import java.util.function.Supplier;

public class bzz<U extends bzy<?>> {
   public static final bzz<bzi> a = a("dummy", bzi::new);
   public static final bzz<bzq> b = a("nearest_items", bzq::new);
   public static final bzz<bzr<bpp>> c = a("nearest_living_entities", bzr::new);
   public static final bzz<bzv> d = a("nearest_players", bzv::new);
   public static final bzz<bzp> e = a("nearest_bed", bzp::new);
   public static final bzz<bzm> f = a("hurt_by", bzm::new);
   public static final bzz<cac> g = a("villager_hostiles", cac::new);
   public static final bzz<cab> h = a("villager_babies", cab::new);
   public static final bzz<bzw> i = a("secondary_pois", bzw::new);
   public static final bzz<bzk> j = a("golem_detected", bzk::new);
   public static final bzz<bzo<ccl>> k = a("armadillo_scare_detected", () -> new bzo<>(5, ccl::j, ccl::gy, bys.G, 80));
   public static final bzz<bzu> l = a("piglin_specific_sensor", bzu::new);
   public static final bzz<bzt> m = a("piglin_brute_specific_sensor", bzt::new);
   public static final bzz<bzl> n = a("hoglin_specific_sensor", bzl::new);
   public static final bzz<bzf> o = a("nearest_adult", bzf::new);
   public static final bzz<bzg> p = a("axolotl_attackables", bzg::new);
   public static final bzz<caa> q = a("axolotl_temptations", () -> new caa(ccp.a()));
   public static final bzz<caa> r = a("goat_temptations", () -> new caa(cdd.a()));
   public static final bzz<caa> s = a("frog_temptations", () -> new caa(ccx.a()));
   public static final bzz<caa> t = a("camel_temptations", () -> new caa(ccu.b()));
   public static final bzz<caa> u = a("armadillo_temptations", () -> new caa(ccm.b()));
   public static final bzz<bzj> v = a("frog_attackables", bzj::new);
   public static final bzz<bzn> w = a("is_in_water", bzn::new);
   public static final bzz<cad> x = a("warden_entity_sensor", cad::new);
   public static final bzz<caa> y = a("sniffer_temptations", () -> new caa(cdu.a()));
   public static final bzz<bzh> z = a("breeze_attack_entity_sensor", bzh::new);
   private final Supplier<U> A;

   private bzz(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends bzy<?>> bzz<U> a(String $$0, Supplier<U> $$1) {
      return iy.a(ki.C, new ajh($$0), new bzz<>($$1));
   }
}
