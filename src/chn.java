import java.util.function.Supplier;

public class chn<U extends chm<?>> {
   public static final chn<cgw> a = a("dummy", cgw::new);
   public static final chn<che> b = a("nearest_items", che::new);
   public static final chn<chf<bxe>> c = a("nearest_living_entities", chf::new);
   public static final chn<chj> d = a("nearest_players", chj::new);
   public static final chn<chd> e = a("nearest_bed", chd::new);
   public static final chn<cha> f = a("hurt_by", cha::new);
   public static final chn<chq> g = a("villager_hostiles", chq::new);
   public static final chn<chp> h = a("villager_babies", chp::new);
   public static final chn<chk> i = a("secondary_pois", chk::new);
   public static final chn<cgy> j = a("golem_detected", cgy::new);
   public static final chn<chc<ckk>> k = a("armadillo_scare_detected", () -> new chc<>(5, ckk::i, ckk::gD, cgg.H, 80));
   public static final chn<chi> l = a("piglin_specific_sensor", chi::new);
   public static final chn<chh> m = a("piglin_brute_specific_sensor", chh::new);
   public static final chn<cgz> n = a("hoglin_specific_sensor", cgz::new);
   public static final chn<cgt> o = a("nearest_adult", cgt::new);
   public static final chn<cgu> p = a("axolotl_attackables", cgu::new);
   public static final chn<cho> q = a("axolotl_temptations", () -> new cho(cko.a()));
   public static final chn<cho> r = a("goat_temptations", () -> new cho(cle.a()));
   public static final chn<cho> s = a("frog_temptations", () -> new cho(ckw.a()));
   public static final chn<cho> t = a("camel_temptations", () -> new cho(ckt.b()));
   public static final chn<cho> u = a("armadillo_temptations", () -> new cho(ckl.b()));
   public static final chn<cgx> v = a("frog_attackables", cgx::new);
   public static final chn<chb> w = a("is_in_water", chb::new);
   public static final chn<chr> x = a("warden_entity_sensor", chr::new);
   public static final chn<cho> y = a("sniffer_temptations", () -> new cho(clv.a()));
   public static final chn<cgv> z = a("breeze_attack_entity_sensor", cgv::new);
   private final Supplier<U> A;

   private chn(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends chm<?>> chn<U> a(String $$0, Supplier<U> $$1) {
      return jr.a(mf.A, alg.b($$0), new chn<>($$1));
   }
}
