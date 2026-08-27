import java.util.function.Supplier;

public class bwt<U extends bws<?>> {
   public static final bwt<bwd> a = a("dummy", bwd::new);
   public static final bwt<bwk> b = a("nearest_items", bwk::new);
   public static final bwt<bwl<bml>> c = a("nearest_living_entities", bwl::new);
   public static final bwt<bwp> d = a("nearest_players", bwp::new);
   public static final bwt<bwj> e = a("nearest_bed", bwj::new);
   public static final bwt<bwh> f = a("hurt_by", bwh::new);
   public static final bwt<bww> g = a("villager_hostiles", bww::new);
   public static final bwt<bwv> h = a("villager_babies", bwv::new);
   public static final bwt<bwq> i = a("secondary_pois", bwq::new);
   public static final bwt<bwf> j = a("golem_detected", bwf::new);
   public static final bwt<bwo> k = a("piglin_specific_sensor", bwo::new);
   public static final bwt<bwn> l = a("piglin_brute_specific_sensor", bwn::new);
   public static final bwt<bwg> m = a("hoglin_specific_sensor", bwg::new);
   public static final bwt<bwa> n = a("nearest_adult", bwa::new);
   public static final bwt<bwb> o = a("axolotl_attackables", bwb::new);
   public static final bwt<bwu> p = a("axolotl_temptations", () -> new bwu(bzg.a()));
   public static final bwt<bwu> q = a("goat_temptations", () -> new bwu(bzu.a()));
   public static final bwt<bwu> r = a("frog_temptations", () -> new bwu(bzo.a()));
   public static final bwt<bwu> s = a("camel_temptations", () -> new bwu(bzl.b()));
   public static final bwt<bwe> t = a("frog_attackables", bwe::new);
   public static final bwt<bwi> u = a("is_in_water", bwi::new);
   public static final bwt<bwx> v = a("warden_entity_sensor", bwx::new);
   public static final bwt<bwu> w = a("sniffer_temptations", () -> new bwu(cal.a()));
   public static final bwt<bwc> x = a("breeze_attack_entity_sensor", bwc::new);
   private final Supplier<U> y;

   private bwt(Supplier<U> $$0) {
      this.y = $$0;
   }

   public U a() {
      return this.y.get();
   }

   private static <U extends bws<?>> bwt<U> a(String $$0, Supplier<U> $$1) {
      return it.a(kd.C, new ahg($$0), new bwt<>($$1));
   }
}
