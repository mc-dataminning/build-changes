import java.util.function.Supplier;

public class cif<U extends cie<?>> {
   public static final cif<cho> a = a("dummy", cho::new);
   public static final cif<chw> b = a("nearest_items", chw::new);
   public static final cif<chx<bxw>> c = a("nearest_living_entities", chx::new);
   public static final cif<cib> d = a("nearest_players", cib::new);
   public static final cif<chv> e = a("nearest_bed", chv::new);
   public static final cif<chs> f = a("hurt_by", chs::new);
   public static final cif<cii> g = a("villager_hostiles", cii::new);
   public static final cif<cih> h = a("villager_babies", cih::new);
   public static final cif<cic> i = a("secondary_pois", cic::new);
   public static final cif<chq> j = a("golem_detected", chq::new);
   public static final cif<chu<cky>> k = a("armadillo_scare_detected", () -> new chu<>(5, cky::i, cky::gG, cgy.H, 80));
   public static final cif<cia> l = a("piglin_specific_sensor", cia::new);
   public static final cif<chz> m = a("piglin_brute_specific_sensor", chz::new);
   public static final cif<chr> n = a("hoglin_specific_sensor", chr::new);
   public static final cif<chl> o = a("nearest_adult", chl::new);
   public static final cif<chm> p = a("axolotl_attackables", chm::new);
   public static final cif<cig> q = a("axolotl_temptations", () -> new cig(clc.a()));
   public static final cif<cig> r = a("goat_temptations", () -> new cig(cls.a()));
   public static final cif<cig> s = a("frog_temptations", () -> new cig(clk.a()));
   public static final cif<cig> t = a("camel_temptations", () -> new cig(clh.b()));
   public static final cif<cig> u = a("armadillo_temptations", () -> new cig(ckz.b()));
   public static final cif<chp> v = a("frog_attackables", chp::new);
   public static final cif<cht> w = a("is_in_water", cht::new);
   public static final cif<cij> x = a("warden_entity_sensor", cij::new);
   public static final cif<cig> y = a("sniffer_temptations", () -> new cig(cmm.a()));
   public static final cif<chn> z = a("breeze_attack_entity_sensor", chn::new);
   private final Supplier<U> A;

   private cif(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cie<?>> cif<U> a(String $$0, Supplier<U> $$1) {
      return jt.a(mh.A, alk.b($$0), new cif<>($$1));
   }
}
