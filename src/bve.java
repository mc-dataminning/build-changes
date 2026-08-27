import java.util.function.Supplier;

public class bve<U extends bvd<?>> {
   public static final bve<buo> a = a("dummy", buo::new);
   public static final bve<buv> b = a("nearest_items", buv::new);
   public static final bve<buw<bky>> c = a("nearest_living_entities", buw::new);
   public static final bve<bva> d = a("nearest_players", bva::new);
   public static final bve<buu> e = a("nearest_bed", buu::new);
   public static final bve<bus> f = a("hurt_by", bus::new);
   public static final bve<bvh> g = a("villager_hostiles", bvh::new);
   public static final bve<bvg> h = a("villager_babies", bvg::new);
   public static final bve<bvb> i = a("secondary_pois", bvb::new);
   public static final bve<buq> j = a("golem_detected", buq::new);
   public static final bve<buz> k = a("piglin_specific_sensor", buz::new);
   public static final bve<buy> l = a("piglin_brute_specific_sensor", buy::new);
   public static final bve<bur> m = a("hoglin_specific_sensor", bur::new);
   public static final bve<bum> n = a("nearest_adult", bum::new);
   public static final bve<bun> o = a("axolotl_attackables", bun::new);
   public static final bve<bvf> p = a("axolotl_temptations", () -> new bvf(bxr.a()));
   public static final bve<bvf> q = a("goat_temptations", () -> new bvf(byf.a()));
   public static final bve<bvf> r = a("frog_temptations", () -> new bvf(bxz.a()));
   public static final bve<bvf> s = a("camel_temptations", () -> new bvf(bxw.b()));
   public static final bve<bup> t = a("frog_attackables", bup::new);
   public static final bve<but> u = a("is_in_water", but::new);
   public static final bve<bvi> v = a("warden_entity_sensor", bvi::new);
   public static final bve<bvf> w = a("sniffer_temptations", () -> new bvf(byw.a()));
   private final Supplier<U> x;

   private bve(Supplier<U> $$0) {
      this.x = $$0;
   }

   public U a() {
      return this.x.get();
   }

   private static <U extends bvd<?>> bve<U> a(String $$0, Supplier<U> $$1) {
      return io.a(jy.D, new agg($$0), new bve<>($$1));
   }
}
