import java.util.function.Supplier;

public class bvr<U extends bvq<?>> {
   public static final bvr<bvb> a = a("dummy", bvb::new);
   public static final bvr<bvi> b = a("nearest_items", bvi::new);
   public static final bvr<bvj<bll>> c = a("nearest_living_entities", bvj::new);
   public static final bvr<bvn> d = a("nearest_players", bvn::new);
   public static final bvr<bvh> e = a("nearest_bed", bvh::new);
   public static final bvr<bvf> f = a("hurt_by", bvf::new);
   public static final bvr<bvu> g = a("villager_hostiles", bvu::new);
   public static final bvr<bvt> h = a("villager_babies", bvt::new);
   public static final bvr<bvo> i = a("secondary_pois", bvo::new);
   public static final bvr<bvd> j = a("golem_detected", bvd::new);
   public static final bvr<bvm> k = a("piglin_specific_sensor", bvm::new);
   public static final bvr<bvl> l = a("piglin_brute_specific_sensor", bvl::new);
   public static final bvr<bve> m = a("hoglin_specific_sensor", bve::new);
   public static final bvr<buz> n = a("nearest_adult", buz::new);
   public static final bvr<bva> o = a("axolotl_attackables", bva::new);
   public static final bvr<bvs> p = a("axolotl_temptations", () -> new bvs(bye.a()));
   public static final bvr<bvs> q = a("goat_temptations", () -> new bvs(bys.a()));
   public static final bvr<bvs> r = a("frog_temptations", () -> new bvs(bym.a()));
   public static final bvr<bvs> s = a("camel_temptations", () -> new bvs(byj.b()));
   public static final bvr<bvc> t = a("frog_attackables", bvc::new);
   public static final bvr<bvg> u = a("is_in_water", bvg::new);
   public static final bvr<bvv> v = a("warden_entity_sensor", bvv::new);
   public static final bvr<bvs> w = a("sniffer_temptations", () -> new bvs(bzj.a()));
   private final Supplier<U> x;

   private bvr(Supplier<U> $$0) {
      this.x = $$0;
   }

   public U a() {
      return this.x.get();
   }

   private static <U extends bvq<?>> bvr<U> a(String $$0, Supplier<U> $$1) {
      return is.a(kc.D, new agm($$0), new bvr<>($$1));
   }
}
