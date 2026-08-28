import java.util.function.Supplier;

public class cea<U extends cdz<?>> {
   public static final cea<cdj> a = a("dummy", cdj::new);
   public static final cea<cdr> b = a("nearest_items", cdr::new);
   public static final cea<cds<btp>> c = a("nearest_living_entities", cds::new);
   public static final cea<cdw> d = a("nearest_players", cdw::new);
   public static final cea<cdq> e = a("nearest_bed", cdq::new);
   public static final cea<cdn> f = a("hurt_by", cdn::new);
   public static final cea<ced> g = a("villager_hostiles", ced::new);
   public static final cea<cec> h = a("villager_babies", cec::new);
   public static final cea<cdx> i = a("secondary_pois", cdx::new);
   public static final cea<cdl> j = a("golem_detected", cdl::new);
   public static final cea<cdp<cgo>> k = a("armadillo_scare_detected", () -> new cdp<>(5, cgo::j, cgo::gB, cct.G, 80));
   public static final cea<cdv> l = a("piglin_specific_sensor", cdv::new);
   public static final cea<cdu> m = a("piglin_brute_specific_sensor", cdu::new);
   public static final cea<cdm> n = a("hoglin_specific_sensor", cdm::new);
   public static final cea<cdg> o = a("nearest_adult", cdg::new);
   public static final cea<cdh> p = a("axolotl_attackables", cdh::new);
   public static final cea<ceb> q = a("axolotl_temptations", () -> new ceb(cgs.a()));
   public static final cea<ceb> r = a("goat_temptations", () -> new ceb(chg.a()));
   public static final cea<ceb> s = a("frog_temptations", () -> new ceb(cha.a()));
   public static final cea<ceb> t = a("camel_temptations", () -> new ceb(cgx.b()));
   public static final cea<ceb> u = a("armadillo_temptations", () -> new ceb(cgp.b()));
   public static final cea<cdk> v = a("frog_attackables", cdk::new);
   public static final cea<cdo> w = a("is_in_water", cdo::new);
   public static final cea<cee> x = a("warden_entity_sensor", cee::new);
   public static final cea<ceb> y = a("sniffer_temptations", () -> new ceb(chx.a()));
   public static final cea<cdi> z = a("breeze_attack_entity_sensor", cdi::new);
   private final Supplier<U> A;

   private cea(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cdz<?>> cea<U> a(String $$0, Supplier<U> $$1) {
      return jv.a(lp.C, new alf($$0), new cea<>($$1));
   }
}
