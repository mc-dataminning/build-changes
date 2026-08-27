import java.util.function.Supplier;

public class bzh<U extends bzg<?>> {
   public static final bzh<byq> a = a("dummy", byq::new);
   public static final bzh<byy> b = a("nearest_items", byy::new);
   public static final bzh<byz<box>> c = a("nearest_living_entities", byz::new);
   public static final bzh<bzd> d = a("nearest_players", bzd::new);
   public static final bzh<byx> e = a("nearest_bed", byx::new);
   public static final bzh<byu> f = a("hurt_by", byu::new);
   public static final bzh<bzk> g = a("villager_hostiles", bzk::new);
   public static final bzh<bzj> h = a("villager_babies", bzj::new);
   public static final bzh<bze> i = a("secondary_pois", bze::new);
   public static final bzh<bys> j = a("golem_detected", bys::new);
   public static final bzh<byw<cbt>> k = a("armadillo_scare_detected", () -> new byw<>(5, cbt::j, cbt::gu, bya.G, 60));
   public static final bzh<bzc> l = a("piglin_specific_sensor", bzc::new);
   public static final bzh<bzb> m = a("piglin_brute_specific_sensor", bzb::new);
   public static final bzh<byt> n = a("hoglin_specific_sensor", byt::new);
   public static final bzh<byn> o = a("nearest_adult", byn::new);
   public static final bzh<byo> p = a("axolotl_attackables", byo::new);
   public static final bzh<bzi> q = a("axolotl_temptations", () -> new bzi(cbx.a()));
   public static final bzh<bzi> r = a("goat_temptations", () -> new bzi(ccl.a()));
   public static final bzh<bzi> s = a("frog_temptations", () -> new bzi(ccf.a()));
   public static final bzh<bzi> t = a("camel_temptations", () -> new bzi(ccc.b()));
   public static final bzh<bzi> u = a("armadillo_temptations", () -> new bzi(cbu.b()));
   public static final bzh<byr> v = a("frog_attackables", byr::new);
   public static final bzh<byv> w = a("is_in_water", byv::new);
   public static final bzh<bzl> x = a("warden_entity_sensor", bzl::new);
   public static final bzh<bzi> y = a("sniffer_temptations", () -> new bzi(cdc.a()));
   public static final bzh<byp> z = a("breeze_attack_entity_sensor", byp::new);
   private final Supplier<U> A;

   private bzh(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends bzg<?>> bzh<U> a(String $$0, Supplier<U> $$1) {
      return ix.a(kh.C, new ajc($$0), new bzh<>($$1));
   }
}
