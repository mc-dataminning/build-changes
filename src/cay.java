import java.util.function.Supplier;

public class cay<U extends cax<?>> {
   public static final cay<cah> a = a("dummy", cah::new);
   public static final cay<cap> b = a("nearest_items", cap::new);
   public static final cay<caq<bqo>> c = a("nearest_living_entities", caq::new);
   public static final cay<cau> d = a("nearest_players", cau::new);
   public static final cay<cao> e = a("nearest_bed", cao::new);
   public static final cay<cal> f = a("hurt_by", cal::new);
   public static final cay<cbb> g = a("villager_hostiles", cbb::new);
   public static final cay<cba> h = a("villager_babies", cba::new);
   public static final cay<cav> i = a("secondary_pois", cav::new);
   public static final cay<caj> j = a("golem_detected", caj::new);
   public static final cay<can<cdk>> k = a("armadillo_scare_detected", () -> new can<>(5, cdk::j, cdk::gy, bzr.G, 80));
   public static final cay<cat> l = a("piglin_specific_sensor", cat::new);
   public static final cay<cas> m = a("piglin_brute_specific_sensor", cas::new);
   public static final cay<cak> n = a("hoglin_specific_sensor", cak::new);
   public static final cay<cae> o = a("nearest_adult", cae::new);
   public static final cay<caf> p = a("axolotl_attackables", caf::new);
   public static final cay<caz> q = a("axolotl_temptations", () -> new caz(cdo.a()));
   public static final cay<caz> r = a("goat_temptations", () -> new caz(cec.a()));
   public static final cay<caz> s = a("frog_temptations", () -> new caz(cdw.a()));
   public static final cay<caz> t = a("camel_temptations", () -> new caz(cdt.b()));
   public static final cay<caz> u = a("armadillo_temptations", () -> new caz(cdl.b()));
   public static final cay<cai> v = a("frog_attackables", cai::new);
   public static final cay<cam> w = a("is_in_water", cam::new);
   public static final cay<cbc> x = a("warden_entity_sensor", cbc::new);
   public static final cay<caz> y = a("sniffer_temptations", () -> new caz(cet.a()));
   public static final cay<cag> z = a("breeze_attack_entity_sensor", cag::new);
   private final Supplier<U> A;

   private cay(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cax<?>> cay<U> a(String $$0, Supplier<U> $$1) {
      return iy.a(kr.C, new ajt($$0), new cay<>($$1));
   }
}
