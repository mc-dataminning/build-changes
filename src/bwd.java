import java.util.function.Supplier;

public class bwd<U extends bwc<?>> {
   public static final bwd<bvn> a = a("dummy", bvn::new);
   public static final bwd<bvu> b = a("nearest_items", bvu::new);
   public static final bwd<bvv<blv>> c = a("nearest_living_entities", bvv::new);
   public static final bwd<bvz> d = a("nearest_players", bvz::new);
   public static final bwd<bvt> e = a("nearest_bed", bvt::new);
   public static final bwd<bvr> f = a("hurt_by", bvr::new);
   public static final bwd<bwg> g = a("villager_hostiles", bwg::new);
   public static final bwd<bwf> h = a("villager_babies", bwf::new);
   public static final bwd<bwa> i = a("secondary_pois", bwa::new);
   public static final bwd<bvp> j = a("golem_detected", bvp::new);
   public static final bwd<bvy> k = a("piglin_specific_sensor", bvy::new);
   public static final bwd<bvx> l = a("piglin_brute_specific_sensor", bvx::new);
   public static final bwd<bvq> m = a("hoglin_specific_sensor", bvq::new);
   public static final bwd<bvk> n = a("nearest_adult", bvk::new);
   public static final bwd<bvl> o = a("axolotl_attackables", bvl::new);
   public static final bwd<bwe> p = a("axolotl_temptations", () -> new bwe(byq.a()));
   public static final bwd<bwe> q = a("goat_temptations", () -> new bwe(bze.a()));
   public static final bwd<bwe> r = a("frog_temptations", () -> new bwe(byy.a()));
   public static final bwd<bwe> s = a("camel_temptations", () -> new bwe(byv.b()));
   public static final bwd<bvo> t = a("frog_attackables", bvo::new);
   public static final bwd<bvs> u = a("is_in_water", bvs::new);
   public static final bwd<bwh> v = a("warden_entity_sensor", bwh::new);
   public static final bwd<bwe> w = a("sniffer_temptations", () -> new bwe(bzv.a()));
   public static final bwd<bvm> x = a("breeze_attack_entity_sensor", bvm::new);
   private final Supplier<U> y;

   private bwd(Supplier<U> $$0) {
      this.y = $$0;
   }

   public U a() {
      return this.y.get();
   }

   private static <U extends bwc<?>> bwd<U> a(String $$0, Supplier<U> $$1) {
      return ir.a(kb.C, new agt($$0), new bwd<>($$1));
   }
}
