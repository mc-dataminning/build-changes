import java.util.function.Supplier;

public class cha<U extends cgz<?>> {
   public static final cha<cgj> a = a("dummy", cgj::new);
   public static final cha<cgr> b = a("nearest_items", cgr::new);
   public static final cha<cgs<bwr>> c = a("nearest_living_entities", cgs::new);
   public static final cha<cgw> d = a("nearest_players", cgw::new);
   public static final cha<cgq> e = a("nearest_bed", cgq::new);
   public static final cha<cgn> f = a("hurt_by", cgn::new);
   public static final cha<chd> g = a("villager_hostiles", chd::new);
   public static final cha<chc> h = a("villager_babies", chc::new);
   public static final cha<cgx> i = a("secondary_pois", cgx::new);
   public static final cha<cgl> j = a("golem_detected", cgl::new);
   public static final cha<cgp<cjs>> k = a("armadillo_scare_detected", () -> new cgp<>(5, cjs::j, cjs::gC, cft.H, 80));
   public static final cha<cgv> l = a("piglin_specific_sensor", cgv::new);
   public static final cha<cgu> m = a("piglin_brute_specific_sensor", cgu::new);
   public static final cha<cgm> n = a("hoglin_specific_sensor", cgm::new);
   public static final cha<cgg> o = a("nearest_adult", cgg::new);
   public static final cha<cgh> p = a("axolotl_attackables", cgh::new);
   public static final cha<chb> q = a("axolotl_temptations", () -> new chb(cjw.a()));
   public static final cha<chb> r = a("goat_temptations", () -> new chb(ckk.a()));
   public static final cha<chb> s = a("frog_temptations", () -> new chb(cke.a()));
   public static final cha<chb> t = a("camel_temptations", () -> new chb(ckb.b()));
   public static final cha<chb> u = a("armadillo_temptations", () -> new chb(cjt.b()));
   public static final cha<cgk> v = a("frog_attackables", cgk::new);
   public static final cha<cgo> w = a("is_in_water", cgo::new);
   public static final cha<che> x = a("warden_entity_sensor", che::new);
   public static final cha<chb> y = a("sniffer_temptations", () -> new chb(clb.a()));
   public static final cha<cgi> z = a("breeze_attack_entity_sensor", cgi::new);
   private final Supplier<U> A;

   private cha(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cgz<?>> cha<U> a(String $$0, Supplier<U> $$1) {
      return kf.a(md.A, ald.b($$0), new cha<>($$1));
   }
}
