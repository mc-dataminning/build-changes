import java.util.function.Supplier;

public class bqg<U extends bqf<?>> {
   public static final bqg<bpq> a = a("dummy", bpq::new);
   public static final bqg<bpx> b = a("nearest_items", bpx::new);
   public static final bqg<bpy<bfz>> c = a("nearest_living_entities", bpy::new);
   public static final bqg<bqc> d = a("nearest_players", bqc::new);
   public static final bqg<bpw> e = a("nearest_bed", bpw::new);
   public static final bqg<bpu> f = a("hurt_by", bpu::new);
   public static final bqg<bqj> g = a("villager_hostiles", bqj::new);
   public static final bqg<bqi> h = a("villager_babies", bqi::new);
   public static final bqg<bqd> i = a("secondary_pois", bqd::new);
   public static final bqg<bps> j = a("golem_detected", bps::new);
   public static final bqg<bqb> k = a("piglin_specific_sensor", bqb::new);
   public static final bqg<bqa> l = a("piglin_brute_specific_sensor", bqa::new);
   public static final bqg<bpt> m = a("hoglin_specific_sensor", bpt::new);
   public static final bqg<bpo> n = a("nearest_adult", bpo::new);
   public static final bqg<bpp> o = a("axolotl_attackables", bpp::new);
   public static final bqg<bqh> p = a("axolotl_temptations", () -> new bqh(bst.a()));
   public static final bqg<bqh> q = a("goat_temptations", () -> new bqh(bth.a()));
   public static final bqg<bqh> r = a("frog_temptations", () -> new bqh(btb.a()));
   public static final bqg<bqh> s = a("camel_temptations", () -> new bqh(bsy.b()));
   public static final bqg<bpr> t = a("frog_attackables", bpr::new);
   public static final bqg<bpv> u = a("is_in_water", bpv::new);
   public static final bqg<bqk> v = a("warden_entity_sensor", bqk::new);
   public static final bqg<bqh> w = a("sniffer_temptations", () -> new bqh(bty.a()));
   private final Supplier<U> x;

   private bqg(Supplier<U> $$0) {
      this.x = $$0;
   }

   public U a() {
      return this.x.get();
   }

   private static <U extends bqf<?>> bqg<U> a(String $$0, Supplier<U> $$1) {
      return hr.a(jb.D, new acq($$0), new bqg<>($$1));
   }
}
