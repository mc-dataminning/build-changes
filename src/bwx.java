import java.util.function.Supplier;

public class bwx<U extends bww<?>> {
   public static final bwx<bwg> a = a("dummy", bwg::new);
   public static final bwx<bwo> b = a("nearest_items", bwo::new);
   public static final bwx<bwp<bmo>> c = a("nearest_living_entities", bwp::new);
   public static final bwx<bwt> d = a("nearest_players", bwt::new);
   public static final bwx<bwn> e = a("nearest_bed", bwn::new);
   public static final bwx<bwk> f = a("hurt_by", bwk::new);
   public static final bwx<bxa> g = a("villager_hostiles", bxa::new);
   public static final bwx<bwz> h = a("villager_babies", bwz::new);
   public static final bwx<bwu> i = a("secondary_pois", bwu::new);
   public static final bwx<bwi> j = a("golem_detected", bwi::new);
   public static final bwx<bwm<bzj>> k = a("armadillo_scare_detected", () -> new bwm<>(5, bzj::j, bzj::gn, bvq.G, 60));
   public static final bwx<bws> l = a("piglin_specific_sensor", bws::new);
   public static final bwx<bwr> m = a("piglin_brute_specific_sensor", bwr::new);
   public static final bwx<bwj> n = a("hoglin_specific_sensor", bwj::new);
   public static final bwx<bwd> o = a("nearest_adult", bwd::new);
   public static final bwx<bwe> p = a("axolotl_attackables", bwe::new);
   public static final bwx<bwy> q = a("axolotl_temptations", () -> new bwy(bzn.a()));
   public static final bwx<bwy> r = a("goat_temptations", () -> new bwy(cab.a()));
   public static final bwx<bwy> s = a("frog_temptations", () -> new bwy(bzv.a()));
   public static final bwx<bwy> t = a("camel_temptations", () -> new bwy(bzs.b()));
   public static final bwx<bwy> u = a("armadillo_temptations", () -> new bwy(bzk.b()));
   public static final bwx<bwh> v = a("frog_attackables", bwh::new);
   public static final bwx<bwl> w = a("is_in_water", bwl::new);
   public static final bwx<bxb> x = a("warden_entity_sensor", bxb::new);
   public static final bwx<bwy> y = a("sniffer_temptations", () -> new bwy(cas.a()));
   public static final bwx<bwf> z = a("breeze_attack_entity_sensor", bwf::new);
   private final Supplier<U> A;

   private bwx(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends bww<?>> bwx<U> a(String $$0, Supplier<U> $$1) {
      return it.a(kd.C, new ahh($$0), new bwx<>($$1));
   }
}
