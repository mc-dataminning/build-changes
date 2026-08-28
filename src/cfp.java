import java.util.function.Supplier;

public class cfp<U extends cfo<?>> {
   public static final cfp<cey> a = a("dummy", cey::new);
   public static final cfp<cfg> b = a("nearest_items", cfg::new);
   public static final cfp<cfh<bve>> c = a("nearest_living_entities", cfh::new);
   public static final cfp<cfl> d = a("nearest_players", cfl::new);
   public static final cfp<cff> e = a("nearest_bed", cff::new);
   public static final cfp<cfc> f = a("hurt_by", cfc::new);
   public static final cfp<cfs> g = a("villager_hostiles", cfs::new);
   public static final cfp<cfr> h = a("villager_babies", cfr::new);
   public static final cfp<cfm> i = a("secondary_pois", cfm::new);
   public static final cfp<cfa> j = a("golem_detected", cfa::new);
   public static final cfp<cfe<cie>> k = a("armadillo_scare_detected", () -> new cfe<>(5, cie::j, cie::gH, cei.G, 80));
   public static final cfp<cfk> l = a("piglin_specific_sensor", cfk::new);
   public static final cfp<cfj> m = a("piglin_brute_specific_sensor", cfj::new);
   public static final cfp<cfb> n = a("hoglin_specific_sensor", cfb::new);
   public static final cfp<cev> o = a("nearest_adult", cev::new);
   public static final cfp<cew> p = a("axolotl_attackables", cew::new);
   public static final cfp<cfq> q = a("axolotl_temptations", () -> new cfq(cii.a()));
   public static final cfp<cfq> r = a("goat_temptations", () -> new cfq(ciw.a()));
   public static final cfp<cfq> s = a("frog_temptations", () -> new cfq(ciq.a()));
   public static final cfp<cfq> t = a("camel_temptations", () -> new cfq(cin.b()));
   public static final cfp<cfq> u = a("armadillo_temptations", () -> new cfq(cif.b()));
   public static final cfp<cez> v = a("frog_attackables", cez::new);
   public static final cfp<cfd> w = a("is_in_water", cfd::new);
   public static final cfp<cft> x = a("warden_entity_sensor", cft::new);
   public static final cfp<cfq> y = a("sniffer_temptations", () -> new cfq(cjn.a()));
   public static final cfp<cex> z = a("breeze_attack_entity_sensor", cex::new);
   private final Supplier<U> A;

   private cfp(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cfo<?>> cfp<U> a(String $$0, Supplier<U> $$1) {
      return kd.a(lz.A, all.b($$0), new cfp<>($$1));
   }
}
