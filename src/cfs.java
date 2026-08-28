import java.util.function.Supplier;

public class cfs<U extends cfr<?>> {
   public static final cfs<cfb> a = a("dummy", cfb::new);
   public static final cfs<cfj> b = a("nearest_items", cfj::new);
   public static final cfs<cfk<bvh>> c = a("nearest_living_entities", cfk::new);
   public static final cfs<cfo> d = a("nearest_players", cfo::new);
   public static final cfs<cfi> e = a("nearest_bed", cfi::new);
   public static final cfs<cff> f = a("hurt_by", cff::new);
   public static final cfs<cfv> g = a("villager_hostiles", cfv::new);
   public static final cfs<cfu> h = a("villager_babies", cfu::new);
   public static final cfs<cfp> i = a("secondary_pois", cfp::new);
   public static final cfs<cfd> j = a("golem_detected", cfd::new);
   public static final cfs<cfh<cih>> k = a("armadillo_scare_detected", () -> new cfh<>(5, cih::j, cih::gE, cel.G, 80));
   public static final cfs<cfn> l = a("piglin_specific_sensor", cfn::new);
   public static final cfs<cfm> m = a("piglin_brute_specific_sensor", cfm::new);
   public static final cfs<cfe> n = a("hoglin_specific_sensor", cfe::new);
   public static final cfs<cey> o = a("nearest_adult", cey::new);
   public static final cfs<cez> p = a("axolotl_attackables", cez::new);
   public static final cfs<cft> q = a("axolotl_temptations", () -> new cft(cil.a()));
   public static final cfs<cft> r = a("goat_temptations", () -> new cft(ciz.a()));
   public static final cfs<cft> s = a("frog_temptations", () -> new cft(cit.a()));
   public static final cfs<cft> t = a("camel_temptations", () -> new cft(ciq.b()));
   public static final cfs<cft> u = a("armadillo_temptations", () -> new cft(cii.b()));
   public static final cfs<cfc> v = a("frog_attackables", cfc::new);
   public static final cfs<cfg> w = a("is_in_water", cfg::new);
   public static final cfs<cfw> x = a("warden_entity_sensor", cfw::new);
   public static final cfs<cft> y = a("sniffer_temptations", () -> new cft(cjq.a()));
   public static final cfs<cfa> z = a("breeze_attack_entity_sensor", cfa::new);
   private final Supplier<U> A;

   private cfs(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cfr<?>> cfs<U> a(String $$0, Supplier<U> $$1) {
      return ke.a(mb.A, akv.b($$0), new cfs<>($$1));
   }
}
