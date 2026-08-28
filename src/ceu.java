import java.util.function.Supplier;

public class ceu<U extends cet<?>> {
   public static final ceu<ced> a = a("dummy", ced::new);
   public static final ceu<cel> b = a("nearest_items", cel::new);
   public static final ceu<cem<buk>> c = a("nearest_living_entities", cem::new);
   public static final ceu<ceq> d = a("nearest_players", ceq::new);
   public static final ceu<cek> e = a("nearest_bed", cek::new);
   public static final ceu<ceh> f = a("hurt_by", ceh::new);
   public static final ceu<cex> g = a("villager_hostiles", cex::new);
   public static final ceu<cew> h = a("villager_babies", cew::new);
   public static final ceu<cer> i = a("secondary_pois", cer::new);
   public static final ceu<cef> j = a("golem_detected", cef::new);
   public static final ceu<cej<chj>> k = a("armadillo_scare_detected", () -> new cej<>(5, chj::j, chj::gB, cdn.G, 80));
   public static final ceu<cep> l = a("piglin_specific_sensor", cep::new);
   public static final ceu<ceo> m = a("piglin_brute_specific_sensor", ceo::new);
   public static final ceu<ceg> n = a("hoglin_specific_sensor", ceg::new);
   public static final ceu<cea> o = a("nearest_adult", cea::new);
   public static final ceu<ceb> p = a("axolotl_attackables", ceb::new);
   public static final ceu<cev> q = a("axolotl_temptations", () -> new cev(chn.a()));
   public static final ceu<cev> r = a("goat_temptations", () -> new cev(cib.a()));
   public static final ceu<cev> s = a("frog_temptations", () -> new cev(chv.a()));
   public static final ceu<cev> t = a("camel_temptations", () -> new cev(chs.b()));
   public static final ceu<cev> u = a("armadillo_temptations", () -> new cev(chk.b()));
   public static final ceu<cee> v = a("frog_attackables", cee::new);
   public static final ceu<cei> w = a("is_in_water", cei::new);
   public static final ceu<cey> x = a("warden_entity_sensor", cey::new);
   public static final ceu<cev> y = a("sniffer_temptations", () -> new cev(cis.a()));
   public static final ceu<cec> z = a("breeze_attack_entity_sensor", cec::new);
   private final Supplier<U> A;

   private ceu(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cet<?>> ceu<U> a(String $$0, Supplier<U> $$1) {
      return ka.a(lu.A, alc.b($$0), new ceu<>($$1));
   }
}
