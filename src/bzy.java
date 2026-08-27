import java.util.function.Supplier;

public class bzy<U extends bzx<?>> {
   public static final bzy<bzh> a = a("dummy", bzh::new);
   public static final bzy<bzp> b = a("nearest_items", bzp::new);
   public static final bzy<bzq<bpo>> c = a("nearest_living_entities", bzq::new);
   public static final bzy<bzu> d = a("nearest_players", bzu::new);
   public static final bzy<bzo> e = a("nearest_bed", bzo::new);
   public static final bzy<bzl> f = a("hurt_by", bzl::new);
   public static final bzy<cab> g = a("villager_hostiles", cab::new);
   public static final bzy<caa> h = a("villager_babies", caa::new);
   public static final bzy<bzv> i = a("secondary_pois", bzv::new);
   public static final bzy<bzj> j = a("golem_detected", bzj::new);
   public static final bzy<bzn<cck>> k = a("armadillo_scare_detected", () -> new bzn<>(5, cck::j, cck::gy, byr.G, 80));
   public static final bzy<bzt> l = a("piglin_specific_sensor", bzt::new);
   public static final bzy<bzs> m = a("piglin_brute_specific_sensor", bzs::new);
   public static final bzy<bzk> n = a("hoglin_specific_sensor", bzk::new);
   public static final bzy<bze> o = a("nearest_adult", bze::new);
   public static final bzy<bzf> p = a("axolotl_attackables", bzf::new);
   public static final bzy<bzz> q = a("axolotl_temptations", () -> new bzz(cco.a()));
   public static final bzy<bzz> r = a("goat_temptations", () -> new bzz(cdc.a()));
   public static final bzy<bzz> s = a("frog_temptations", () -> new bzz(ccw.a()));
   public static final bzy<bzz> t = a("camel_temptations", () -> new bzz(cct.b()));
   public static final bzy<bzz> u = a("armadillo_temptations", () -> new bzz(ccl.b()));
   public static final bzy<bzi> v = a("frog_attackables", bzi::new);
   public static final bzy<bzm> w = a("is_in_water", bzm::new);
   public static final bzy<cac> x = a("warden_entity_sensor", cac::new);
   public static final bzy<bzz> y = a("sniffer_temptations", () -> new bzz(cdt.a()));
   public static final bzy<bzg> z = a("breeze_attack_entity_sensor", bzg::new);
   private final Supplier<U> A;

   private bzy(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends bzx<?>> bzy<U> a(String $$0, Supplier<U> $$1) {
      return iy.a(ki.C, new ajh($$0), new bzy<>($$1));
   }
}
