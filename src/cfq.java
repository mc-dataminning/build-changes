import java.util.function.Supplier;

public class cfq<U extends cfp<?>> {
   public static final cfq<cez> a = a("dummy", cez::new);
   public static final cfq<cfh> b = a("nearest_items", cfh::new);
   public static final cfq<cfi<bvf>> c = a("nearest_living_entities", cfi::new);
   public static final cfq<cfm> d = a("nearest_players", cfm::new);
   public static final cfq<cfg> e = a("nearest_bed", cfg::new);
   public static final cfq<cfd> f = a("hurt_by", cfd::new);
   public static final cfq<cft> g = a("villager_hostiles", cft::new);
   public static final cfq<cfs> h = a("villager_babies", cfs::new);
   public static final cfq<cfn> i = a("secondary_pois", cfn::new);
   public static final cfq<cfb> j = a("golem_detected", cfb::new);
   public static final cfq<cff<cif>> k = a("armadillo_scare_detected", () -> new cff<>(5, cif::j, cif::gB, cej.G, 80));
   public static final cfq<cfl> l = a("piglin_specific_sensor", cfl::new);
   public static final cfq<cfk> m = a("piglin_brute_specific_sensor", cfk::new);
   public static final cfq<cfc> n = a("hoglin_specific_sensor", cfc::new);
   public static final cfq<cew> o = a("nearest_adult", cew::new);
   public static final cfq<cex> p = a("axolotl_attackables", cex::new);
   public static final cfq<cfr> q = a("axolotl_temptations", () -> new cfr(cij.a()));
   public static final cfq<cfr> r = a("goat_temptations", () -> new cfr(cix.a()));
   public static final cfq<cfr> s = a("frog_temptations", () -> new cfr(cir.a()));
   public static final cfq<cfr> t = a("camel_temptations", () -> new cfr(cio.b()));
   public static final cfq<cfr> u = a("armadillo_temptations", () -> new cfr(cig.b()));
   public static final cfq<cfa> v = a("frog_attackables", cfa::new);
   public static final cfq<cfe> w = a("is_in_water", cfe::new);
   public static final cfq<cfu> x = a("warden_entity_sensor", cfu::new);
   public static final cfq<cfr> y = a("sniffer_temptations", () -> new cfr(cjo.a()));
   public static final cfq<cey> z = a("breeze_attack_entity_sensor", cey::new);
   private final Supplier<U> A;

   private cfq(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cfp<?>> cfq<U> a(String $$0, Supplier<U> $$1) {
      return ke.a(mb.A, aku.b($$0), new cfq<>($$1));
   }
}
