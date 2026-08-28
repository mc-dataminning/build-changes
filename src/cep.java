import java.util.function.Supplier;

public class cep<U extends ceo<?>> {
   public static final cep<cdy> a = a("dummy", cdy::new);
   public static final cep<ceg> b = a("nearest_items", ceg::new);
   public static final cep<ceh<buf>> c = a("nearest_living_entities", ceh::new);
   public static final cep<cel> d = a("nearest_players", cel::new);
   public static final cep<cef> e = a("nearest_bed", cef::new);
   public static final cep<cec> f = a("hurt_by", cec::new);
   public static final cep<ces> g = a("villager_hostiles", ces::new);
   public static final cep<cer> h = a("villager_babies", cer::new);
   public static final cep<cem> i = a("secondary_pois", cem::new);
   public static final cep<cea> j = a("golem_detected", cea::new);
   public static final cep<cee<che>> k = a("armadillo_scare_detected", () -> new cee<>(5, che::j, che::gA, cdi.G, 80));
   public static final cep<cek> l = a("piglin_specific_sensor", cek::new);
   public static final cep<cej> m = a("piglin_brute_specific_sensor", cej::new);
   public static final cep<ceb> n = a("hoglin_specific_sensor", ceb::new);
   public static final cep<cdv> o = a("nearest_adult", cdv::new);
   public static final cep<cdw> p = a("axolotl_attackables", cdw::new);
   public static final cep<ceq> q = a("axolotl_temptations", () -> new ceq(chi.a()));
   public static final cep<ceq> r = a("goat_temptations", () -> new ceq(chw.a()));
   public static final cep<ceq> s = a("frog_temptations", () -> new ceq(chq.a()));
   public static final cep<ceq> t = a("camel_temptations", () -> new ceq(chn.b()));
   public static final cep<ceq> u = a("armadillo_temptations", () -> new ceq(chf.b()));
   public static final cep<cdz> v = a("frog_attackables", cdz::new);
   public static final cep<ced> w = a("is_in_water", ced::new);
   public static final cep<cet> x = a("warden_entity_sensor", cet::new);
   public static final cep<ceq> y = a("sniffer_temptations", () -> new ceq(cin.a()));
   public static final cep<cdx> z = a("breeze_attack_entity_sensor", cdx::new);
   private final Supplier<U> A;

   private cep(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends ceo<?>> cep<U> a(String $$0, Supplier<U> $$1) {
      return ka.a(lu.A, alb.b($$0), new cep<>($$1));
   }
}
