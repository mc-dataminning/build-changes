import java.util.function.Supplier;

public class cfl<U extends cfk<?>> {
   public static final cfl<ceu> a = a("dummy", ceu::new);
   public static final cfl<cfc> b = a("nearest_items", cfc::new);
   public static final cfl<cfd<bva>> c = a("nearest_living_entities", cfd::new);
   public static final cfl<cfh> d = a("nearest_players", cfh::new);
   public static final cfl<cfb> e = a("nearest_bed", cfb::new);
   public static final cfl<cey> f = a("hurt_by", cey::new);
   public static final cfl<cfo> g = a("villager_hostiles", cfo::new);
   public static final cfl<cfn> h = a("villager_babies", cfn::new);
   public static final cfl<cfi> i = a("secondary_pois", cfi::new);
   public static final cfl<cew> j = a("golem_detected", cew::new);
   public static final cfl<cfa<cia>> k = a("armadillo_scare_detected", () -> new cfa<>(5, cia::j, cia::gG, cee.G, 80));
   public static final cfl<cfg> l = a("piglin_specific_sensor", cfg::new);
   public static final cfl<cff> m = a("piglin_brute_specific_sensor", cff::new);
   public static final cfl<cex> n = a("hoglin_specific_sensor", cex::new);
   public static final cfl<cer> o = a("nearest_adult", cer::new);
   public static final cfl<ces> p = a("axolotl_attackables", ces::new);
   public static final cfl<cfm> q = a("axolotl_temptations", () -> new cfm(cie.a()));
   public static final cfl<cfm> r = a("goat_temptations", () -> new cfm(cis.a()));
   public static final cfl<cfm> s = a("frog_temptations", () -> new cfm(cim.a()));
   public static final cfl<cfm> t = a("camel_temptations", () -> new cfm(cij.b()));
   public static final cfl<cfm> u = a("armadillo_temptations", () -> new cfm(cib.b()));
   public static final cfl<cev> v = a("frog_attackables", cev::new);
   public static final cfl<cez> w = a("is_in_water", cez::new);
   public static final cfl<cfp> x = a("warden_entity_sensor", cfp::new);
   public static final cfl<cfm> y = a("sniffer_temptations", () -> new cfm(cjj.a()));
   public static final cfl<cet> z = a("breeze_attack_entity_sensor", cet::new);
   private final Supplier<U> A;

   private cfl(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cfk<?>> cfl<U> a(String $$0, Supplier<U> $$1) {
      return kd.a(ly.A, ali.b($$0), new cfl<>($$1));
   }
}
