import java.util.function.Supplier;

public class cbo<U extends cbn<?>> {
   public static final cbo<cax> a = a("dummy", cax::new);
   public static final cbo<cbf> b = a("nearest_items", cbf::new);
   public static final cbo<cbg<bre>> c = a("nearest_living_entities", cbg::new);
   public static final cbo<cbk> d = a("nearest_players", cbk::new);
   public static final cbo<cbe> e = a("nearest_bed", cbe::new);
   public static final cbo<cbb> f = a("hurt_by", cbb::new);
   public static final cbo<cbr> g = a("villager_hostiles", cbr::new);
   public static final cbo<cbq> h = a("villager_babies", cbq::new);
   public static final cbo<cbl> i = a("secondary_pois", cbl::new);
   public static final cbo<caz> j = a("golem_detected", caz::new);
   public static final cbo<cbd<cec>> k = a("armadillo_scare_detected", () -> new cbd<>(5, cec::j, cec::gA, cah.G, 80));
   public static final cbo<cbj> l = a("piglin_specific_sensor", cbj::new);
   public static final cbo<cbi> m = a("piglin_brute_specific_sensor", cbi::new);
   public static final cbo<cba> n = a("hoglin_specific_sensor", cba::new);
   public static final cbo<cau> o = a("nearest_adult", cau::new);
   public static final cbo<cav> p = a("axolotl_attackables", cav::new);
   public static final cbo<cbp> q = a("axolotl_temptations", () -> new cbp(ceg.a()));
   public static final cbo<cbp> r = a("goat_temptations", () -> new cbp(ceu.a()));
   public static final cbo<cbp> s = a("frog_temptations", () -> new cbp(ceo.a()));
   public static final cbo<cbp> t = a("camel_temptations", () -> new cbp(cel.b()));
   public static final cbo<cbp> u = a("armadillo_temptations", () -> new cbp(ced.b()));
   public static final cbo<cay> v = a("frog_attackables", cay::new);
   public static final cbo<cbc> w = a("is_in_water", cbc::new);
   public static final cbo<cbs> x = a("warden_entity_sensor", cbs::new);
   public static final cbo<cbp> y = a("sniffer_temptations", () -> new cbp(cfl.a()));
   public static final cbo<caw> z = a("breeze_attack_entity_sensor", caw::new);
   private final Supplier<U> A;

   private cbo(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cbn<?>> cbo<U> a(String $$0, Supplier<U> $$1) {
      return ji.a(lc.C, new akf($$0), new cbo<>($$1));
   }
}
