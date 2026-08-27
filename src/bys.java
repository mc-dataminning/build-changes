import java.util.function.Supplier;

public class bys<U extends byr<?>> {
   public static final bys<byb> a = a("dummy", byb::new);
   public static final bys<byj> b = a("nearest_items", byj::new);
   public static final bys<byk<boi>> c = a("nearest_living_entities", byk::new);
   public static final bys<byo> d = a("nearest_players", byo::new);
   public static final bys<byi> e = a("nearest_bed", byi::new);
   public static final bys<byf> f = a("hurt_by", byf::new);
   public static final bys<byv> g = a("villager_hostiles", byv::new);
   public static final bys<byu> h = a("villager_babies", byu::new);
   public static final bys<byp> i = a("secondary_pois", byp::new);
   public static final bys<byd> j = a("golem_detected", byd::new);
   public static final bys<byh<cbe>> k = a("armadillo_scare_detected", () -> new byh<>(5, cbe::j, cbe::gp, bxl.G, 60));
   public static final bys<byn> l = a("piglin_specific_sensor", byn::new);
   public static final bys<bym> m = a("piglin_brute_specific_sensor", bym::new);
   public static final bys<bye> n = a("hoglin_specific_sensor", bye::new);
   public static final bys<bxy> o = a("nearest_adult", bxy::new);
   public static final bys<bxz> p = a("axolotl_attackables", bxz::new);
   public static final bys<byt> q = a("axolotl_temptations", () -> new byt(cbi.a()));
   public static final bys<byt> r = a("goat_temptations", () -> new byt(cbw.a()));
   public static final bys<byt> s = a("frog_temptations", () -> new byt(cbq.a()));
   public static final bys<byt> t = a("camel_temptations", () -> new byt(cbn.b()));
   public static final bys<byt> u = a("armadillo_temptations", () -> new byt(cbf.b()));
   public static final bys<byc> v = a("frog_attackables", byc::new);
   public static final bys<byg> w = a("is_in_water", byg::new);
   public static final bys<byw> x = a("warden_entity_sensor", byw::new);
   public static final bys<byt> y = a("sniffer_temptations", () -> new byt(ccn.a()));
   public static final bys<bya> z = a("breeze_attack_entity_sensor", bya::new);
   private final Supplier<U> A;

   private bys(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends byr<?>> bys<U> a(String $$0, Supplier<U> $$1) {
      return iv.a(kf.C, new aiy($$0), new bys<>($$1));
   }
}
