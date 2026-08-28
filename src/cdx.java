import java.util.function.Supplier;

public class cdx<U extends cdw<?>> {
   public static final cdx<cdg> a = a("dummy", cdg::new);
   public static final cdx<cdo> b = a("nearest_items", cdo::new);
   public static final cdx<cdp<btl>> c = a("nearest_living_entities", cdp::new);
   public static final cdx<cdt> d = a("nearest_players", cdt::new);
   public static final cdx<cdn> e = a("nearest_bed", cdn::new);
   public static final cdx<cdk> f = a("hurt_by", cdk::new);
   public static final cdx<cea> g = a("villager_hostiles", cea::new);
   public static final cdx<cdz> h = a("villager_babies", cdz::new);
   public static final cdx<cdu> i = a("secondary_pois", cdu::new);
   public static final cdx<cdi> j = a("golem_detected", cdi::new);
   public static final cdx<cdm<cgl>> k = a("armadillo_scare_detected", () -> new cdm<>(5, cgl::j, cgl::gw, ccq.G, 80));
   public static final cdx<cds> l = a("piglin_specific_sensor", cds::new);
   public static final cdx<cdr> m = a("piglin_brute_specific_sensor", cdr::new);
   public static final cdx<cdj> n = a("hoglin_specific_sensor", cdj::new);
   public static final cdx<cdd> o = a("nearest_adult", cdd::new);
   public static final cdx<cde> p = a("axolotl_attackables", cde::new);
   public static final cdx<cdy> q = a("axolotl_temptations", () -> new cdy(cgp.a()));
   public static final cdx<cdy> r = a("goat_temptations", () -> new cdy(chd.a()));
   public static final cdx<cdy> s = a("frog_temptations", () -> new cdy(cgx.a()));
   public static final cdx<cdy> t = a("camel_temptations", () -> new cdy(cgu.b()));
   public static final cdx<cdy> u = a("armadillo_temptations", () -> new cdy(cgm.b()));
   public static final cdx<cdh> v = a("frog_attackables", cdh::new);
   public static final cdx<cdl> w = a("is_in_water", cdl::new);
   public static final cdx<ceb> x = a("warden_entity_sensor", ceb::new);
   public static final cdx<cdy> y = a("sniffer_temptations", () -> new cdy(chu.a()));
   public static final cdx<cdf> z = a("breeze_attack_entity_sensor", cdf::new);
   private final Supplier<U> A;

   private cdx(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cdw<?>> cdx<U> a(String $$0, Supplier<U> $$1) {
      return jz.a(lt.A, akq.b($$0), new cdx<>($$1));
   }
}
