import java.util.function.Supplier;

public class cid<U extends cic<?>> {
   public static final cid<chm> a = a("dummy", chm::new);
   public static final cid<chu> b = a("nearest_items", chu::new);
   public static final cid<chv<bxu>> c = a("nearest_living_entities", chv::new);
   public static final cid<chz> d = a("nearest_players", chz::new);
   public static final cid<cht> e = a("nearest_bed", cht::new);
   public static final cid<chq> f = a("hurt_by", chq::new);
   public static final cid<cig> g = a("villager_hostiles", cig::new);
   public static final cid<cif> h = a("villager_babies", cif::new);
   public static final cid<cia> i = a("secondary_pois", cia::new);
   public static final cid<cho> j = a("golem_detected", cho::new);
   public static final cid<chs<ckw>> k = a("armadillo_scare_detected", () -> new chs<>(5, ckw::i, ckw::gG, cgw.H, 80));
   public static final cid<chy> l = a("piglin_specific_sensor", chy::new);
   public static final cid<chx> m = a("piglin_brute_specific_sensor", chx::new);
   public static final cid<chp> n = a("hoglin_specific_sensor", chp::new);
   public static final cid<chj> o = a("nearest_adult", chj::new);
   public static final cid<chk> p = a("axolotl_attackables", chk::new);
   public static final cid<cie> q = a("axolotl_temptations", () -> new cie(cla.a()));
   public static final cid<cie> r = a("goat_temptations", () -> new cie(clq.a()));
   public static final cid<cie> s = a("frog_temptations", () -> new cie(cli.a()));
   public static final cid<cie> t = a("camel_temptations", () -> new cie(clf.b()));
   public static final cid<cie> u = a("armadillo_temptations", () -> new cie(ckx.b()));
   public static final cid<chn> v = a("frog_attackables", chn::new);
   public static final cid<chr> w = a("is_in_water", chr::new);
   public static final cid<cih> x = a("warden_entity_sensor", cih::new);
   public static final cid<cie> y = a("sniffer_temptations", () -> new cie(cmk.a()));
   public static final cid<chl> z = a("breeze_attack_entity_sensor", chl::new);
   private final Supplier<U> A;

   private cid(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cic<?>> cid<U> a(String $$0, Supplier<U> $$1) {
      return js.a(mg.A, ali.b($$0), new cid<>($$1));
   }
}
