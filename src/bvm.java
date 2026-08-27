import java.util.function.Supplier;

public class bvm<U extends bvl<?>> {
   public static final bvm<buw> a = a("dummy", buw::new);
   public static final bvm<bvd> b = a("nearest_items", bvd::new);
   public static final bvm<bve<blg>> c = a("nearest_living_entities", bve::new);
   public static final bvm<bvi> d = a("nearest_players", bvi::new);
   public static final bvm<bvc> e = a("nearest_bed", bvc::new);
   public static final bvm<bva> f = a("hurt_by", bva::new);
   public static final bvm<bvp> g = a("villager_hostiles", bvp::new);
   public static final bvm<bvo> h = a("villager_babies", bvo::new);
   public static final bvm<bvj> i = a("secondary_pois", bvj::new);
   public static final bvm<buy> j = a("golem_detected", buy::new);
   public static final bvm<bvh> k = a("piglin_specific_sensor", bvh::new);
   public static final bvm<bvg> l = a("piglin_brute_specific_sensor", bvg::new);
   public static final bvm<buz> m = a("hoglin_specific_sensor", buz::new);
   public static final bvm<buu> n = a("nearest_adult", buu::new);
   public static final bvm<buv> o = a("axolotl_attackables", buv::new);
   public static final bvm<bvn> p = a("axolotl_temptations", () -> new bvn(bxz.a()));
   public static final bvm<bvn> q = a("goat_temptations", () -> new bvn(byn.a()));
   public static final bvm<bvn> r = a("frog_temptations", () -> new bvn(byh.a()));
   public static final bvm<bvn> s = a("camel_temptations", () -> new bvn(bye.b()));
   public static final bvm<bux> t = a("frog_attackables", bux::new);
   public static final bvm<bvb> u = a("is_in_water", bvb::new);
   public static final bvm<bvq> v = a("warden_entity_sensor", bvq::new);
   public static final bvm<bvn> w = a("sniffer_temptations", () -> new bvn(bze.a()));
   private final Supplier<U> x;

   private bvm(Supplier<U> $$0) {
      this.x = $$0;
   }

   public U a() {
      return this.x.get();
   }

   private static <U extends bvl<?>> bvm<U> a(String $$0, Supplier<U> $$1) {
      return io.a(jy.D, new agi($$0), new bvm<>($$1));
   }
}
