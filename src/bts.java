import java.util.function.Supplier;

public class bts<U extends btr<?>> {
   public static final bts<btc> a = a("dummy", btc::new);
   public static final bts<btj> b = a("nearest_items", btj::new);
   public static final bts<btk<bjm>> c = a("nearest_living_entities", btk::new);
   public static final bts<bto> d = a("nearest_players", bto::new);
   public static final bts<bti> e = a("nearest_bed", bti::new);
   public static final bts<btg> f = a("hurt_by", btg::new);
   public static final bts<btv> g = a("villager_hostiles", btv::new);
   public static final bts<btu> h = a("villager_babies", btu::new);
   public static final bts<btp> i = a("secondary_pois", btp::new);
   public static final bts<bte> j = a("golem_detected", bte::new);
   public static final bts<btn> k = a("piglin_specific_sensor", btn::new);
   public static final bts<btm> l = a("piglin_brute_specific_sensor", btm::new);
   public static final bts<btf> m = a("hoglin_specific_sensor", btf::new);
   public static final bts<bta> n = a("nearest_adult", bta::new);
   public static final bts<btb> o = a("axolotl_attackables", btb::new);
   public static final bts<btt> p = a("axolotl_temptations", () -> new btt(bwf.a()));
   public static final bts<btt> q = a("goat_temptations", () -> new btt(bwt.a()));
   public static final bts<btt> r = a("frog_temptations", () -> new btt(bwn.a()));
   public static final bts<btt> s = a("camel_temptations", () -> new btt(bwk.b()));
   public static final bts<btd> t = a("frog_attackables", btd::new);
   public static final bts<bth> u = a("is_in_water", bth::new);
   public static final bts<btw> v = a("warden_entity_sensor", btw::new);
   public static final bts<btt> w = a("sniffer_temptations", () -> new btt(bxk.a()));
   private final Supplier<U> x;

   private bts(Supplier<U> $$0) {
      this.x = $$0;
   }

   public U a() {
      return this.x.get();
   }

   private static <U extends btr<?>> bts<U> a(String $$0, Supplier<U> $$1) {
      return hq.a(jb.D, new aez($$0), new bts<>($$1));
   }
}
