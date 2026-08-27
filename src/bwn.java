import java.util.function.Supplier;

public class bwn<U extends bwm<?>> {
   public static final bwn<bvx> a = a("dummy", bvx::new);
   public static final bwn<bwe> b = a("nearest_items", bwe::new);
   public static final bwn<bwf<bmf>> c = a("nearest_living_entities", bwf::new);
   public static final bwn<bwj> d = a("nearest_players", bwj::new);
   public static final bwn<bwd> e = a("nearest_bed", bwd::new);
   public static final bwn<bwb> f = a("hurt_by", bwb::new);
   public static final bwn<bwq> g = a("villager_hostiles", bwq::new);
   public static final bwn<bwp> h = a("villager_babies", bwp::new);
   public static final bwn<bwk> i = a("secondary_pois", bwk::new);
   public static final bwn<bvz> j = a("golem_detected", bvz::new);
   public static final bwn<bwi> k = a("piglin_specific_sensor", bwi::new);
   public static final bwn<bwh> l = a("piglin_brute_specific_sensor", bwh::new);
   public static final bwn<bwa> m = a("hoglin_specific_sensor", bwa::new);
   public static final bwn<bvu> n = a("nearest_adult", bvu::new);
   public static final bwn<bvv> o = a("axolotl_attackables", bvv::new);
   public static final bwn<bwo> p = a("axolotl_temptations", () -> new bwo(bza.a()));
   public static final bwn<bwo> q = a("goat_temptations", () -> new bwo(bzo.a()));
   public static final bwn<bwo> r = a("frog_temptations", () -> new bwo(bzi.a()));
   public static final bwn<bwo> s = a("camel_temptations", () -> new bwo(bzf.b()));
   public static final bwn<bvy> t = a("frog_attackables", bvy::new);
   public static final bwn<bwc> u = a("is_in_water", bwc::new);
   public static final bwn<bwr> v = a("warden_entity_sensor", bwr::new);
   public static final bwn<bwo> w = a("sniffer_temptations", () -> new bwo(caf.a()));
   public static final bwn<bvw> x = a("breeze_attack_entity_sensor", bvw::new);
   private final Supplier<U> y;

   private bwn(Supplier<U> $$0) {
      this.y = $$0;
   }

   public U a() {
      return this.y.get();
   }

   private static <U extends bwm<?>> bwn<U> a(String $$0, Supplier<U> $$1) {
      return it.a(kd.C, new ahd($$0), new bwn<>($$1));
   }
}
