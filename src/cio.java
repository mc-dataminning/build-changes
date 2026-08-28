import java.util.function.Supplier;

public class cio<U extends cin<?>> {
   public static final cio<chx> a = a("dummy", chx::new);
   public static final cio<cif> b = a("nearest_items", cif::new);
   public static final cio<cig<byf>> c = a("nearest_living_entities", cig::new);
   public static final cio<cik> d = a("nearest_players", cik::new);
   public static final cio<cie> e = a("nearest_bed", cie::new);
   public static final cio<cib> f = a("hurt_by", cib::new);
   public static final cio<cir> g = a("villager_hostiles", cir::new);
   public static final cio<ciq> h = a("villager_babies", ciq::new);
   public static final cio<cil> i = a("secondary_pois", cil::new);
   public static final cio<chz> j = a("golem_detected", chz::new);
   public static final cio<cid<clh>> k = a("armadillo_scare_detected", () -> new cid<>(5, clh::i, clh::gG, chh.H, 80));
   public static final cio<cij> l = a("piglin_specific_sensor", cij::new);
   public static final cio<cii> m = a("piglin_brute_specific_sensor", cii::new);
   public static final cio<cia> n = a("hoglin_specific_sensor", cia::new);
   public static final cio<chu> o = a("nearest_adult", chu::new);
   public static final cio<chv> p = a("axolotl_attackables", chv::new);
   public static final cio<cip> q = a("axolotl_temptations", () -> new cip(cll.a()));
   public static final cio<cip> r = a("goat_temptations", () -> new cip(cmb.a()));
   public static final cio<cip> s = a("frog_temptations", () -> new cip(clt.a()));
   public static final cio<cip> t = a("camel_temptations", () -> new cip(clq.b()));
   public static final cio<cip> u = a("armadillo_temptations", () -> new cip(cli.b()));
   public static final cio<chy> v = a("frog_attackables", chy::new);
   public static final cio<cic> w = a("is_in_water", cic::new);
   public static final cio<cis> x = a("warden_entity_sensor", cis::new);
   public static final cio<cip> y = a("sniffer_temptations", () -> new cip(cmv.a()));
   public static final cio<chw> z = a("breeze_attack_entity_sensor", chw::new);
   private final Supplier<U> A;

   private cio(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cin<?>> cio<U> a(String $$0, Supplier<U> $$1) {
      return jt.a(mh.A, alr.b($$0), new cio<>($$1));
   }
}
