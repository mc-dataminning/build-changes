import java.util.function.Supplier;

public class cft<U extends cfs<?>> {
   public static final cft<cfc> a = a("dummy", cfc::new);
   public static final cft<cfk> b = a("nearest_items", cfk::new);
   public static final cft<cfl<bvi>> c = a("nearest_living_entities", cfl::new);
   public static final cft<cfp> d = a("nearest_players", cfp::new);
   public static final cft<cfj> e = a("nearest_bed", cfj::new);
   public static final cft<cfg> f = a("hurt_by", cfg::new);
   public static final cft<cfw> g = a("villager_hostiles", cfw::new);
   public static final cft<cfv> h = a("villager_babies", cfv::new);
   public static final cft<cfq> i = a("secondary_pois", cfq::new);
   public static final cft<cfe> j = a("golem_detected", cfe::new);
   public static final cft<cfi<cii>> k = a("armadillo_scare_detected", () -> new cfi<>(5, cii::j, cii::gE, cem.G, 80));
   public static final cft<cfo> l = a("piglin_specific_sensor", cfo::new);
   public static final cft<cfn> m = a("piglin_brute_specific_sensor", cfn::new);
   public static final cft<cff> n = a("hoglin_specific_sensor", cff::new);
   public static final cft<cez> o = a("nearest_adult", cez::new);
   public static final cft<cfa> p = a("axolotl_attackables", cfa::new);
   public static final cft<cfu> q = a("axolotl_temptations", () -> new cfu(cim.a()));
   public static final cft<cfu> r = a("goat_temptations", () -> new cfu(cja.a()));
   public static final cft<cfu> s = a("frog_temptations", () -> new cfu(ciu.a()));
   public static final cft<cfu> t = a("camel_temptations", () -> new cfu(cir.b()));
   public static final cft<cfu> u = a("armadillo_temptations", () -> new cfu(cij.b()));
   public static final cft<cfd> v = a("frog_attackables", cfd::new);
   public static final cft<cfh> w = a("is_in_water", cfh::new);
   public static final cft<cfx> x = a("warden_entity_sensor", cfx::new);
   public static final cft<cfu> y = a("sniffer_temptations", () -> new cfu(cjr.a()));
   public static final cft<cfb> z = a("breeze_attack_entity_sensor", cfb::new);
   private final Supplier<U> A;

   private cft(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cfs<?>> cft<U> a(String $$0, Supplier<U> $$1) {
      return ke.a(mb.A, akv.b($$0), new cft<>($$1));
   }
}
