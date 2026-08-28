import java.util.function.Supplier;

public class chi<U extends chh<?>> {
   public static final chi<cgr> a = a("dummy", cgr::new);
   public static final chi<cgz> b = a("nearest_items", cgz::new);
   public static final chi<cha<bwz>> c = a("nearest_living_entities", cha::new);
   public static final chi<che> d = a("nearest_players", che::new);
   public static final chi<cgy> e = a("nearest_bed", cgy::new);
   public static final chi<cgv> f = a("hurt_by", cgv::new);
   public static final chi<chl> g = a("villager_hostiles", chl::new);
   public static final chi<chk> h = a("villager_babies", chk::new);
   public static final chi<chf> i = a("secondary_pois", chf::new);
   public static final chi<cgt> j = a("golem_detected", cgt::new);
   public static final chi<cgx<cka>> k = a("armadillo_scare_detected", () -> new cgx<>(5, cka::i, cka::gC, cgb.H, 80));
   public static final chi<chd> l = a("piglin_specific_sensor", chd::new);
   public static final chi<chc> m = a("piglin_brute_specific_sensor", chc::new);
   public static final chi<cgu> n = a("hoglin_specific_sensor", cgu::new);
   public static final chi<cgo> o = a("nearest_adult", cgo::new);
   public static final chi<cgp> p = a("axolotl_attackables", cgp::new);
   public static final chi<chj> q = a("axolotl_temptations", () -> new chj(cke.a()));
   public static final chi<chj> r = a("goat_temptations", () -> new chj(cku.a()));
   public static final chi<chj> s = a("frog_temptations", () -> new chj(ckm.a()));
   public static final chi<chj> t = a("camel_temptations", () -> new chj(ckj.b()));
   public static final chi<chj> u = a("armadillo_temptations", () -> new chj(ckb.b()));
   public static final chi<cgs> v = a("frog_attackables", cgs::new);
   public static final chi<cgw> w = a("is_in_water", cgw::new);
   public static final chi<chm> x = a("warden_entity_sensor", chm::new);
   public static final chi<chj> y = a("sniffer_temptations", () -> new chj(cll.a()));
   public static final chi<cgq> z = a("breeze_attack_entity_sensor", cgq::new);
   private final Supplier<U> A;

   private chi(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends chh<?>> chi<U> a(String $$0, Supplier<U> $$1) {
      return jr.a(mf.A, ale.b($$0), new chi<>($$1));
   }
}
