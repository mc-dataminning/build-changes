import java.util.function.Supplier;

public class cex<U extends cew<?>> {
   public static final cex<ceg> a = a("dummy", ceg::new);
   public static final cex<ceo> b = a("nearest_items", ceo::new);
   public static final cex<cep<bun>> c = a("nearest_living_entities", cep::new);
   public static final cex<cet> d = a("nearest_players", cet::new);
   public static final cex<cen> e = a("nearest_bed", cen::new);
   public static final cex<cek> f = a("hurt_by", cek::new);
   public static final cex<cfa> g = a("villager_hostiles", cfa::new);
   public static final cex<cez> h = a("villager_babies", cez::new);
   public static final cex<ceu> i = a("secondary_pois", ceu::new);
   public static final cex<cei> j = a("golem_detected", cei::new);
   public static final cex<cem<chm>> k = a("armadillo_scare_detected", () -> new cem<>(5, chm::j, chm::gA, cdq.G, 80));
   public static final cex<ces> l = a("piglin_specific_sensor", ces::new);
   public static final cex<cer> m = a("piglin_brute_specific_sensor", cer::new);
   public static final cex<cej> n = a("hoglin_specific_sensor", cej::new);
   public static final cex<ced> o = a("nearest_adult", ced::new);
   public static final cex<cee> p = a("axolotl_attackables", cee::new);
   public static final cex<cey> q = a("axolotl_temptations", () -> new cey(chq.a()));
   public static final cex<cey> r = a("goat_temptations", () -> new cey(cie.a()));
   public static final cex<cey> s = a("frog_temptations", () -> new cey(chy.a()));
   public static final cex<cey> t = a("camel_temptations", () -> new cey(chv.b()));
   public static final cex<cey> u = a("armadillo_temptations", () -> new cey(chn.b()));
   public static final cex<ceh> v = a("frog_attackables", ceh::new);
   public static final cex<cel> w = a("is_in_water", cel::new);
   public static final cex<cfb> x = a("warden_entity_sensor", cfb::new);
   public static final cex<cey> y = a("sniffer_temptations", () -> new cey(civ.a()));
   public static final cex<cef> z = a("breeze_attack_entity_sensor", cef::new);
   private final Supplier<U> A;

   private cex(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cew<?>> cex<U> a(String $$0, Supplier<U> $$1) {
      return kb.a(lv.A, ale.b($$0), new cex<>($$1));
   }
}
