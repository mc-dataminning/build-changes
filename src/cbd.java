import java.util.function.Supplier;

public class cbd<U extends cbc<?>> {
   public static final cbd<cam> a = a("dummy", cam::new);
   public static final cbd<cau> b = a("nearest_items", cau::new);
   public static final cbd<cav<bqt>> c = a("nearest_living_entities", cav::new);
   public static final cbd<caz> d = a("nearest_players", caz::new);
   public static final cbd<cat> e = a("nearest_bed", cat::new);
   public static final cbd<caq> f = a("hurt_by", caq::new);
   public static final cbd<cbg> g = a("villager_hostiles", cbg::new);
   public static final cbd<cbf> h = a("villager_babies", cbf::new);
   public static final cbd<cba> i = a("secondary_pois", cba::new);
   public static final cbd<cao> j = a("golem_detected", cao::new);
   public static final cbd<cas<cdr>> k = a("armadillo_scare_detected", () -> new cas<>(5, cdr::j, cdr::gy, bzw.G, 80));
   public static final cbd<cay> l = a("piglin_specific_sensor", cay::new);
   public static final cbd<cax> m = a("piglin_brute_specific_sensor", cax::new);
   public static final cbd<cap> n = a("hoglin_specific_sensor", cap::new);
   public static final cbd<caj> o = a("nearest_adult", caj::new);
   public static final cbd<cak> p = a("axolotl_attackables", cak::new);
   public static final cbd<cbe> q = a("axolotl_temptations", () -> new cbe(cdv.a()));
   public static final cbd<cbe> r = a("goat_temptations", () -> new cbe(cej.a()));
   public static final cbd<cbe> s = a("frog_temptations", () -> new cbe(ced.a()));
   public static final cbd<cbe> t = a("camel_temptations", () -> new cbe(cea.b()));
   public static final cbd<cbe> u = a("armadillo_temptations", () -> new cbe(cds.b()));
   public static final cbd<can> v = a("frog_attackables", can::new);
   public static final cbd<car> w = a("is_in_water", car::new);
   public static final cbd<cbh> x = a("warden_entity_sensor", cbh::new);
   public static final cbd<cbe> y = a("sniffer_temptations", () -> new cbe(cfa.a()));
   public static final cbd<cal> z = a("breeze_attack_entity_sensor", cal::new);
   private final Supplier<U> A;

   private cbd(Supplier<U> $$0) {
      this.A = $$0;
   }

   public U a() {
      return this.A.get();
   }

   private static <U extends cbc<?>> cbd<U> a(String $$0, Supplier<U> $$1) {
      return ja.a(kt.C, new ajv($$0), new cbd<>($$1));
   }
}
