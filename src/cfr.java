import java.util.function.Supplier;

public class cfr<U extends cfq<?>> {
   public static final cfr<cfa> a = a("dummy", cfa::new);
   public static final cfr<cfi> b = a("nearest_items", cfi::new);
   public static final cfr<cfj<bvg>> c = a("nearest_living_entities", cfj::new);
   public static final cfr<cfn> d = a("nearest_players", cfn::new);
   public static final cfr<cfh> e = a("nearest_bed", cfh::new);
   public static final cfr<cfe> f = a("hurt_by", cfe::new);
   public static final cfr<cfu> g = a("villager_hostiles", cfu::new);
   public static final cfr<cft> h = a("villager_babies", cft::new);
   public static final cfr<cfo> i = a("secondary_pois", cfo::new);
   public static final cfr<cfc> j = a("golem_detected", cfc::new);
   public static final cfr<cfg<cig>> k = a("armadillo_scare_detected", () -> new cfg<>(5, cig::j, cig::gE, cek.G, 80));
   public static final cfr<cfm> l = a("piglin_specific_sensor", cfm::new);
   public static final cfr<cfl> m = a("piglin_brute_specific_sensor", cfl::new);
   public static final cfr<cfd> n = a("hoglin_specific_sensor", cfd::new);
   public static final cfr<cex> o = a("nearest_adult", cex::new);
   public static final cfr<cey> p = a("axolotl_attackables", cey::new);
   public static final cfr<cfs> q = a("axolotl_temptations", () -> new cfs(cik.a()));
   public static final cfr<cfs> r = a("goat_temptations", () -> new cfs(ciy.a()));
   public static final cfr<cfs> s = a("frog_temptations", () -> new cfs(cis.a()));
   public static final cfr<cfs> t = a("camel_temptations", () -> new cfs(cip.b()));
   public static final cfr<cfs> u = a("armadillo_temptations", () -> new cfs(cih.b()));
   public static final cfr<cfb> v = a("frog_attackables", cfb::new);
   public static final cfr<cff> w = a("is_in_water", cff::new);
   public static final cfr<cfv> x = a("warden_entity_sensor", cfv::new);
   public static final cfr<cfs> y = a("sniffer_temptations", () -> new cfs(cjp.a()));
   public static final cfr<cez> z = a("breeze_attack_entity_sensor", cez::new);
   private final Supplier<U> A;

   private cfr(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cfq<?>> cfr<U> a(String $$0, Supplier<U> $$1) {
      return ke.a(mb.A, akv.b($$0), new cfr<>($$1));
   }
}
