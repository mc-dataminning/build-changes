import java.util.function.Supplier;

public class chl<U extends chk<?>> {
   public static final chl<cgu> a = a("dummy", cgu::new);
   public static final chl<chc> b = a("nearest_items", chc::new);
   public static final chl<chd<bxc>> c = a("nearest_living_entities", chd::new);
   public static final chl<chh> d = a("nearest_players", chh::new);
   public static final chl<chb> e = a("nearest_bed", chb::new);
   public static final chl<cgy> f = a("hurt_by", cgy::new);
   public static final chl<cho> g = a("villager_hostiles", cho::new);
   public static final chl<chn> h = a("villager_babies", chn::new);
   public static final chl<chi> i = a("secondary_pois", chi::new);
   public static final chl<cgw> j = a("golem_detected", cgw::new);
   public static final chl<cha<ckg>> k = a("armadillo_scare_detected", () -> new cha<>(5, ckg::i, ckg::gC, cge.H, 80));
   public static final chl<chg> l = a("piglin_specific_sensor", chg::new);
   public static final chl<chf> m = a("piglin_brute_specific_sensor", chf::new);
   public static final chl<cgx> n = a("hoglin_specific_sensor", cgx::new);
   public static final chl<cgr> o = a("nearest_adult", cgr::new);
   public static final chl<cgs> p = a("axolotl_attackables", cgs::new);
   public static final chl<chm> q = a("axolotl_temptations", () -> new chm(ckk.a()));
   public static final chl<chm> r = a("goat_temptations", () -> new chm(cla.a()));
   public static final chl<chm> s = a("frog_temptations", () -> new chm(cks.a()));
   public static final chl<chm> t = a("camel_temptations", () -> new chm(ckp.b()));
   public static final chl<chm> u = a("armadillo_temptations", () -> new chm(ckh.b()));
   public static final chl<cgv> v = a("frog_attackables", cgv::new);
   public static final chl<cgz> w = a("is_in_water", cgz::new);
   public static final chl<chp> x = a("warden_entity_sensor", chp::new);
   public static final chl<chm> y = a("sniffer_temptations", () -> new chm(clr.a()));
   public static final chl<cgt> z = a("breeze_attack_entity_sensor", cgt::new);
   private final Supplier<U> A;

   private chl(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends chk<?>> chl<U> a(String $$0, Supplier<U> $$1) {
      return jr.a(mf.A, alg.b($$0), new chl<>($$1));
   }
}
