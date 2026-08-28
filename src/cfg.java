import java.util.function.Supplier;

public class cfg<U extends cff<?>> {
   public static final cfg<cep> a = a("dummy", cep::new);
   public static final cfg<cex> b = a("nearest_items", cex::new);
   public static final cfg<cey<buv>> c = a("nearest_living_entities", cey::new);
   public static final cfg<cfc> d = a("nearest_players", cfc::new);
   public static final cfg<cew> e = a("nearest_bed", cew::new);
   public static final cfg<cet> f = a("hurt_by", cet::new);
   public static final cfg<cfj> g = a("villager_hostiles", cfj::new);
   public static final cfg<cfi> h = a("villager_babies", cfi::new);
   public static final cfg<cfd> i = a("secondary_pois", cfd::new);
   public static final cfg<cer> j = a("golem_detected", cer::new);
   public static final cfg<cev<chv>> k = a("armadillo_scare_detected", () -> new cev<>(5, chv::j, chv::gH, cdz.G, 80));
   public static final cfg<cfb> l = a("piglin_specific_sensor", cfb::new);
   public static final cfg<cfa> m = a("piglin_brute_specific_sensor", cfa::new);
   public static final cfg<ces> n = a("hoglin_specific_sensor", ces::new);
   public static final cfg<cem> o = a("nearest_adult", cem::new);
   public static final cfg<cen> p = a("axolotl_attackables", cen::new);
   public static final cfg<cfh> q = a("axolotl_temptations", () -> new cfh(chz.a()));
   public static final cfg<cfh> r = a("goat_temptations", () -> new cfh(cin.a()));
   public static final cfg<cfh> s = a("frog_temptations", () -> new cfh(cih.a()));
   public static final cfg<cfh> t = a("camel_temptations", () -> new cfh(cie.b()));
   public static final cfg<cfh> u = a("armadillo_temptations", () -> new cfh(chw.b()));
   public static final cfg<ceq> v = a("frog_attackables", ceq::new);
   public static final cfg<ceu> w = a("is_in_water", ceu::new);
   public static final cfg<cfk> x = a("warden_entity_sensor", cfk::new);
   public static final cfg<cfh> y = a("sniffer_temptations", () -> new cfh(cje.a()));
   public static final cfg<ceo> z = a("breeze_attack_entity_sensor", ceo::new);
   private final Supplier<U> A;

   private cfg(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cff<?>> cfg<U> a(String $$0, Supplier<U> $$1) {
      return kc.a(lx.A, alh.b($$0), new cfg<>($$1));
   }
}
