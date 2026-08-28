import java.util.function.Supplier;

public class chs<U extends chr<?>> {
   public static final chs<chb> a = a("dummy", chb::new);
   public static final chs<chj> b = a("nearest_items", chj::new);
   public static final chs<chk<bxj>> c = a("nearest_living_entities", chk::new);
   public static final chs<cho> d = a("nearest_players", cho::new);
   public static final chs<chi> e = a("nearest_bed", chi::new);
   public static final chs<chf> f = a("hurt_by", chf::new);
   public static final chs<chv> g = a("villager_hostiles", chv::new);
   public static final chs<chu> h = a("villager_babies", chu::new);
   public static final chs<chp> i = a("secondary_pois", chp::new);
   public static final chs<chd> j = a("golem_detected", chd::new);
   public static final chs<chh<ckl>> k = a("armadillo_scare_detected", () -> new chh<>(5, ckl::i, ckl::gF, cgl.H, 80));
   public static final chs<chn> l = a("piglin_specific_sensor", chn::new);
   public static final chs<chm> m = a("piglin_brute_specific_sensor", chm::new);
   public static final chs<che> n = a("hoglin_specific_sensor", che::new);
   public static final chs<cgy> o = a("nearest_adult", cgy::new);
   public static final chs<cgz> p = a("axolotl_attackables", cgz::new);
   public static final chs<cht> q = a("axolotl_temptations", () -> new cht(ckp.a()));
   public static final chs<cht> r = a("goat_temptations", () -> new cht(clf.a()));
   public static final chs<cht> s = a("frog_temptations", () -> new cht(ckx.a()));
   public static final chs<cht> t = a("camel_temptations", () -> new cht(cku.b()));
   public static final chs<cht> u = a("armadillo_temptations", () -> new cht(ckm.b()));
   public static final chs<chc> v = a("frog_attackables", chc::new);
   public static final chs<chg> w = a("is_in_water", chg::new);
   public static final chs<chw> x = a("warden_entity_sensor", chw::new);
   public static final chs<cht> y = a("sniffer_temptations", () -> new cht(clz.a()));
   public static final chs<cha> z = a("breeze_attack_entity_sensor", cha::new);
   private final Supplier<U> A;

   private chs(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends chr<?>> chs<U> a(String $$0, Supplier<U> $$1) {
      return js.a(mg.A, alg.b($$0), new chs<>($$1));
   }
}
