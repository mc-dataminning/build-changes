import java.util.function.Supplier;

public class bto<U extends btn<?>> {
   public static final bto<bsy> a = a("dummy", bsy::new);
   public static final bto<btf> b = a("nearest_items", btf::new);
   public static final bto<btg<bji>> c = a("nearest_living_entities", btg::new);
   public static final bto<btk> d = a("nearest_players", btk::new);
   public static final bto<bte> e = a("nearest_bed", bte::new);
   public static final bto<btc> f = a("hurt_by", btc::new);
   public static final bto<btr> g = a("villager_hostiles", btr::new);
   public static final bto<btq> h = a("villager_babies", btq::new);
   public static final bto<btl> i = a("secondary_pois", btl::new);
   public static final bto<bta> j = a("golem_detected", bta::new);
   public static final bto<btj> k = a("piglin_specific_sensor", btj::new);
   public static final bto<bti> l = a("piglin_brute_specific_sensor", bti::new);
   public static final bto<btb> m = a("hoglin_specific_sensor", btb::new);
   public static final bto<bsw> n = a("nearest_adult", bsw::new);
   public static final bto<bsx> o = a("axolotl_attackables", bsx::new);
   public static final bto<btp> p = a("axolotl_temptations", () -> new btp(bwb.a()));
   public static final bto<btp> q = a("goat_temptations", () -> new btp(bwp.a()));
   public static final bto<btp> r = a("frog_temptations", () -> new btp(bwj.a()));
   public static final bto<btp> s = a("camel_temptations", () -> new btp(bwg.b()));
   public static final bto<bsz> t = a("frog_attackables", bsz::new);
   public static final bto<btd> u = a("is_in_water", btd::new);
   public static final bto<bts> v = a("warden_entity_sensor", bts::new);
   public static final bto<btp> w = a("sniffer_temptations", () -> new btp(bxg.a()));
   private final Supplier<U> x;

   private bto(Supplier<U> $$0) {
      this.x = $$0;
   }

   public U a() {
      return this.x.get();
   }

   private static <U extends btn<?>> bto<U> a(String $$0, Supplier<U> $$1) {
      return ht.a(jd.D, new aey($$0), new bto<>($$1));
   }
}
